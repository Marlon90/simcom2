package de.simcom.games.arma.dc.buildMachine.data.impl;

import java.util.HashMap;
import java.util.Map;

import de.simcom.games.arma.dc.buildMachine.data.Data;
import de.simcom.games.arma.dc.buildMachine.enums.TemplateType;

public class ControlStructuresData implements Data {

	private String condition;
	private String statement;
	private TemplateType templateType;
	private Map<String, Object> data;

	public ControlStructuresData(TemplateType templateType, String condition, String statement) {
		this.condition = condition;
		this.statement = statement;
		this.templateType = templateType;
	}

	public ControlStructuresData(TemplateType cst, Map<String, Object> data) {
		this.templateType = cst;
		this.data = data;
	}
	
	@Override
	public Map<String, Object> getMappedData(String id) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(id, this);
		return dataMap;
	}

	public String getCondition() {
		return condition;
	}

	public String getStatement() {
		return statement;
	}

	public TemplateType getControlStructurType() {
		return templateType;
	}

	@Override
	public TemplateType getTemplateType() {
		return templateType;
	}

	@Override
	public void setTemplateType(TemplateType templateType) {
		this.templateType = templateType;
	}

	@Override
	public Map<String, Object> getMappedData() {
		// TODO Auto-generated method stub
		return null;
	}

}
