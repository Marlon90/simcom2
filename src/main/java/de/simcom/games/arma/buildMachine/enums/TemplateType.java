package de.simcom.games.arma.buildMachine.enums;

public enum TemplateType {

	IF("if.ftlh"), IFELSE("ifelse.ftlh"), WHILE("while.ftlh"), FOR("for.ftlh"), FOREACH("foreach.ftlh"), MISSION(
			"mission.ftlh"), TEST("test.ftlh");

	private String template;

	TemplateType(String template) {
		this.template = template;
	}

	public String getType() {
		return template.split(".")[0];
	}

	public String getPath() {
		return template;
	}
}
