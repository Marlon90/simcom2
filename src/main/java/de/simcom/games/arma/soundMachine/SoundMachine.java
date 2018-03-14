package de.simcom.games.arma.soundMachine;

import java.io.File;
import java.io.SequenceInputStream;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class SoundMachine {

	public SoundMachine() {

	}

	public void mergeSound() {
		try {
			AudioInputStream clip1 = AudioSystem.getAudioInputStream(new File("sounds/us/uav/1.wav"));
			AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File("sounds/us/uav/2.wav"));
			AudioInputStream appendedFiles = new AudioInputStream(new SequenceInputStream(clip1, clip2),
					clip1.getFormat(), clip1.getFrameLength() + clip2.getFrameLength());
			
			
			AudioSystem.write(appendedFiles, AudioFileFormat.Type.WAVE, new File("wavAppended.wav"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
