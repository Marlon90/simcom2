package de.simcom.games.arma.dc.soundMachine;

import javazoom.jlgui.basicplayer.BasicPlayerException;

public class AudioRunner implements Runnable {

	public void doit() throws BasicPlayerException {
		BasicPlayerTest test = new BasicPlayerTest();
		(new Thread(new AudioRunner())).start();
	}

	@Override
	public void run() {
		BasicPlayerTest test = new BasicPlayerTest();
		test.play("wavAppended.wav",  1);

	}

}