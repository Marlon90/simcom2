package de.simcom.games.arma.buildMachine.data.impl.mission.entities;

public class PositionInfo {

	private double[] position = new double[3];

	public PositionInfo(double[] position) {
		super();
		this.position = position;
	}

	public String getPosition() {
		String returner = "";
		for (int i = 0; i < position.length; i++) {
			returner += String.valueOf(position[i]);
		}
		return returner;
	}

	public void setPosition(double[] position) {
		this.position = position;
	}
}
