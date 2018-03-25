package de.simcom.games.arma.dc.buildMachine.data;

import java.util.HashMap;
import java.util.Map;

import de.simcom.games.arma.dc.buildMachine.enums.TemplateType;

public interface Data {

	/**
	 * Creates a new Map<String, Object>.
	 * <p>
	 * Loads the given data object into the map with String id as the identifier for
	 * the template.
	 * <p>
	 * 
	 * @return Map<String,Object> dataMap
	 */
	default Map<String, Object> getMappedData(String id) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(id, this);
		return dataMap;
	};

	Map<String, Object> getMappedData();

	TemplateType getTemplateType();

	void setTemplateType(TemplateType templateType);
}
