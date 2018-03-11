package de.simcom.games.arma.buildMachine.data.impl.mission;

import java.util.HashMap;
import java.util.Map;

import de.simcom.games.arma.buildMachine.data.Data;
import de.simcom.games.arma.buildMachine.enums.TemplateType;

public class MissionData implements Data {

	private TimeData timeData;
	private WeatherData weatherData;
	private ItemData itemData;
	private TemplateType templateType;

	@Override
	public Map<String, Object> getMappedData(String id) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(id, this);
		return dataMap;
	}

	public Map<String, Object> getMappedData() {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(timeData.toString(), timeData);
		dataMap.put(weatherData.toString(), weatherData);
		dataMap.put(itemData.toString(), itemData);
		return dataMap;
	}

	public TimeData getTimeData() {
		return timeData;
	}

	public void setTimeData(TimeData timeData) {
		this.timeData = timeData;
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	public ItemData getItemData() {
		return itemData;
	}

	public void setItemData(ItemData itemData) {
		this.itemData = itemData;
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
