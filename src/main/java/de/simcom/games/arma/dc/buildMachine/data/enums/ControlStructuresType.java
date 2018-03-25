package de.simcom.games.arma.dc.buildMachine.data.enums;

public enum ControlStructuresType {

	IF("if.ftlh"), IFELSE("ifelse.ftlh"), WHILE("while.ftlh"), FOR("for.ftlh"), FOREACH("foreach.ftlh");

	private String type;

	ControlStructuresType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
