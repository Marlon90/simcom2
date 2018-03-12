package de.simcom.games.arma.buildMachine.data.impl.mission.entities;

public class PositionInfo {

	private double[] position = new double[3];

	public PositionInfo(double[] position) {
		super();
		this.position = position;
	}

	public double[] getPosition() {
		return position;
	}

	public void setPosition(double[] position) {
		this.position = position;
	}
}
