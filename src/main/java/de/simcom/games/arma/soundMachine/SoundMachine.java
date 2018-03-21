package de.simcom.games.arma.soundMachine;

import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundMachine {

	private int preNumber;

	public SoundMachine() {

	}

	public double getLength() {
		try {

			AudioInputStream clip1 = AudioSystem.getAudioInputStream(new File("wavAppended.wav"));
			System.out.println((clip1.getFrameLength() + 0.0) / clip1.getFormat().getFrameRate() * 1000);
			return (clip1.getFrameLength() + 0.0) / clip1.getFormat().getFrameRate() * 1000 + 1500;

		} catch (UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
			return 0;
		}

	}

	private AudioInputStream getInput(AudioInputStream audioBuild, String path)
			throws UnsupportedAudioFileException, IOException {

		AudioInputStream clip1 = AudioSystem.getAudioInputStream(new File(path));
		return new AudioInputStream(
				new SequenceInputStream(audioBuild, AudioSystem.getAudioInputStream(new File(path))), clip1.getFormat(),
				clip1.getFrameLength() + audioBuild.getFrameLength());

	}

	private AudioInputStream getInit(String path) throws UnsupportedAudioFileException, IOException {

		AudioInputStream clip1 = AudioSystem.getAudioInputStream(new File(path));
		return new AudioInputStream(clip1, clip1.getFormat(), clip1.getFrameLength());

	}

	public void contact(Map<String, Object> data) {
		try {
			AudioInputStream audioBuild = null;
			switch ((String) data.get("where")) {
			case "N": {
				audioBuild = getInit("sounds/us/direction/north.wav");
				break;
			}
			case "W": {
				audioBuild = getInit("sounds/us/direction/west.wav");
				break;
			}
			case "S": {
				audioBuild = getInit("sounds/us/direction/south.wav");
				break;
			}
			case "E": {
				audioBuild = getInit("sounds/us/direction/east.wav");
				break;
			}
			default: {
				audioBuild = getInit("sounds/us/direction/unknown.wav");
				break;
			}
			}

			switch ((String) data.get("what")) {
			case "enemy": {
				audioBuild = getInput(audioBuild, "sounds/us/direction/enemy.wav");
				break;
			}
			case "civilian": {
				audioBuild = getInput(audioBuild, "sounds/us/direction/civilian.wav");
				break;
			}
			case "friendly": {
				audioBuild = getInput(audioBuild, "sounds/us/direction/friendly.wav");
				break;
			}
			case "unknown": {
				audioBuild = getInput(audioBuild, "sounds/us/direction/unknown.wav");
				break;
			}
			default: {
				audioBuild = getInput(audioBuild, "sounds/sounds/us/direction/unknown.wav");
				break;
			}
			}

			switch ((String) data.get("specific")) {
			case "rpg": {
				audioBuild = getInput(audioBuild, "sounds/us/direction/rpgteam.wav");
				break;
			}
			case "tank": {
				audioBuild = getInput(audioBuild, "sounds/us/direction/tank.wav");
				break;
			}
			case "rifle": {
				audioBuild = getInput(audioBuild, "sounds/us/direction/rifle.wav");
				break;
			}
			case "unknown": {
				audioBuild = getInput(audioBuild, "sounds/us/direction/unknown.wav");
				break;
			}
			default: {
				audioBuild = getInput(audioBuild, "sounds/us/direction/unknown.wav");
				break;
			}
			}
			AudioSystem.write(audioBuild, AudioFileFormat.Type.WAVE, new File("wavAppended.wav"));

			audioBuild.close();

			AudioRunner a = new AudioRunner();
			a.doit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void coords(List<String> data) {
		try {

			AudioInputStream audioBuild = getInit("sounds/us/npa/misc/sendingGrid.wav");
			audioBuild = getInput(audioBuild, "sounds/us/npa/pa/XC.wav");

			int line = 0;
			int counter = 0;
			int counter2 = 0;
			String[] folders = new String[] { "start", "2", "3", "end" };
			preNumber = Integer.valueOf(data.get(0));

			for (String file : data) {
				counter = (counter > 3) ? 0 : counter;
				counter2 = (counter2 > 3) ? 0 : counter2;
				line = line + 1;
				counter2 = counter2 + 1;
				int actualNumber = Integer.valueOf(file);

				audioBuild = addEnd(actualNumber, audioBuild, counter2);
				if (!validationStart(file, counter2).equals("")) {
					audioBuild = getInput(audioBuild, "sounds/us/npa/numeric/vcal/" + validationStart(file, counter2));
				}

				audioBuild = getInput(audioBuild, "sounds/us/npa/numeric/" + folders[counter] + "\\" + file + ".wav");
				counter++;

				if (line == 4) {
					audioBuild = getInput(audioBuild, "sounds/us/npa/pa/YE.wav");
				}
				// audioBuild = getInput(audioBuild, "sounds/us/npa/fx2.wav");
				preNumber = actualNumber;
				System.out.println(counter);
			}
			audioBuild = getInput(audioBuild, "sounds/us/npa/misc/outC.wav");
			audioBuild = getInput(audioBuild, "sounds/us/npa/fx/end1.wav");
			AudioSystem.write(audioBuild, AudioFileFormat.Type.WAVE, new File("wavAppended.wav"));

			audioBuild.close();

			AudioRunner a = new AudioRunner();
			a.doit();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	private String validationStart(String number, int counter) {
		int actualNumber = Integer.valueOf(number);

		switch (actualNumber) {
		case 5:
			return "f3.wav";
		case 6:
		case 7:
			return "s3.wav";
		case 9:
			switch (counter) {
			case 1:
				return "";

			case 2:
				return "n2.wav";

			case 3:
				return "n3.wav";

			case 4:
				return "n4.wav";

			default:
				return "";
			}

		default:
			return "";
		}
	}

	private AudioInputStream addEnd(int actualNumber, AudioInputStream audioBuild, int counter) {
		if ((actualNumber != preNumber) && (preNumber != 7)) {
			try {
				return getInput(audioBuild,
						"sounds/us/npa/numeric/vcal/" + validationStart(String.valueOf(preNumber), counter));
			} catch (UnsupportedAudioFileException | IOException e) {
				e.printStackTrace();
			}
		}
		return audioBuild;
	}

}