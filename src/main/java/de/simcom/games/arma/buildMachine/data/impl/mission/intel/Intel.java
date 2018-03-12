package de.simcom.games.arma.buildMachine.data.impl.mission.intel;

import de.simcom.games.arma.buildMachine.enums.TimeSelector;
import de.simcom.games.arma.buildMachine.enums.WeatherSelector;

public class Intel {

	private TimeData timeData;
	private WeatherData weatherData;

	public Intel() {

	}

	public Intel(WeatherSelector weatherSelector, WeatherSelector forecastSelector, TimeSelector timeSelector,
			String timeOfChanges) {
		this.timeData = new TimeData(timeSelector);
		this.weatherData = new WeatherData(weatherSelector, forecastSelector, timeOfChanges);
	}

	public TimeData getTimeData() {
		return timeData;
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}
	
	@Override 
	public String toString() {
		return "intel";
	}
	
}
