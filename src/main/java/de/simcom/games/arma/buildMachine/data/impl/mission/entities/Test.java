package de.simcom.games.arma.buildMachine.data.impl.mission.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.simcom.games.arma.buildMachine.data.Data;
import de.simcom.games.arma.buildMachine.enums.TemplateType;

public class Test implements Data {

	private List<Test> list;
	private TemplateType templateType;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Test> getList() {
		return list;
	}

	public void setList(List<Test> list) {
		this.list = list;
	}
	
	@Override
	public Map<String, Object> getMappedData() {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("list", this.list);
		return dataMap;
	}

	@Override
	public TemplateType getTemplateType() {
		return templateType;
	}

	@Override
	public void setTemplateType(TemplateType templateType) {
		this.templateType = templateType;
		
	}
}
