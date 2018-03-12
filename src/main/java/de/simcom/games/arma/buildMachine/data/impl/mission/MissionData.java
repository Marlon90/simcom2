package de.simcom.games.arma.buildMachine.data.impl.mission;

import java.util.HashMap;
import java.util.Map;

import de.simcom.games.arma.buildMachine.data.Data;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Entities;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Item;
import de.simcom.games.arma.buildMachine.data.impl.mission.intel.Intel;
import de.simcom.games.arma.buildMachine.enums.TemplateType;

public class MissionData implements Data {

	private Intel intel;
	private Entities entities;
	private TemplateType templateType;

	public MissionData() {

	}

	public MissionData(Intel intel, Entities entities) {
		this.intel = intel;
		this.entities = entities;
	}

	@Override
	public Map<String, Object> getMappedData() {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(intel.toString(), intel);
		dataMap.put(entities.toString(), entities);
		for (Item item : entities.getItems()) {
			dataMap.put(item.getId(), item);
		}
		
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
