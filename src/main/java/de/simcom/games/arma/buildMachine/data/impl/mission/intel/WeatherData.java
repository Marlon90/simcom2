package de.simcom.games.arma.buildMachine.data.impl.mission.intel;

import de.simcom.games.arma.buildMachine.enums.WeatherSelector;

public class WeatherData {

	private String timeOfChanges;
	private String startWeather;
	private String startWind;
	private String startWaves;
	private String wavesForced;
	private String windForced;
	private String startFogDecay;

	private String forecastWeather;
	private String forecastWind;
	private String forecastWaves;
	private String forecastFogDecay;

	public WeatherData() {

	}

	public WeatherData(WeatherSelector weatherSelector, WeatherSelector forecastSelector, String timeOfChanges) {
		setWeatherData(timeOfChanges, weatherSelector, forecastSelector);
	}
	
	public void setWeatherData(String timeOfChanges, WeatherSelector weatherSelector, WeatherSelector forecastSelector) {
		this.timeOfChanges = timeOfChanges;
		switch (weatherSelector) {
		case GOOD:
			this.startWeather = "0.8";
			this.startWind = "0.1";
			this.startWaves = "0.1";
			this.wavesForced = "0.1";
			this.windForced = "0.1";
			this.startFogDecay = "0";
			break;
		case NORMAL:
			this.startWeather = "0.8";
			this.startWind = "0.2";
			this.startWaves = "0.2";
			this.wavesForced = "0.2";
			this.windForced = "0.2";
			this.startFogDecay = "0.2";
			break;
		case RAIN:
			this.startWeather = "0.4";
			this.startWind = "0.4";
			this.startWaves = "0.4";
			this.wavesForced = "0.4";
			this.windForced = "0.4";
			this.startFogDecay = "0.4";
			break;
		case STORM:
			this.startWeather = "0";
			this.startWind = "1";
			this.startWaves = "1";
			this.wavesForced = "1";
			this.windForced = "1";
			this.startFogDecay = "0.6";
			break;
		case SUPER:
			this.startWeather = "1";
			this.startWind = "0";
			this.startWaves = "0";
			this.wavesForced = "0";
			this.windForced = "0";
			this.startFogDecay = "0";
			break;
		case THUNDER:
			this.startWeather = "1";
			this.startWind = "0";
			this.startWaves = "0";
			this.wavesForced = "0";
			this.windForced = "0";
			this.startFogDecay = "0";
			break;
		default:
			this.startWeather = "0.8";
			this.startWind = "0.2";
			this.startWaves = "0.2";
			this.wavesForced = "0.2";
			this.windForced = "0.2";
			this.startFogDecay = "0.2";
			break;
		}

		switch (forecastSelector) {
		case GOOD:
			this.forecastWeather = "0.8";
			this.forecastWind = "0.1";
			this.forecastWaves = "0.1";
			this.wavesForced = "0.1";
			this.forecastFogDecay = "0";
			break;
		case NORMAL:
			this.forecastWeather = "0.8";
			this.forecastWind = "0.1";
			this.forecastWaves = "0.1";
			this.wavesForced = "0.1";
			this.forecastFogDecay = "0";
			break;
		case RAIN:
			this.forecastWeather = "0.8";
			this.forecastWind = "0.1";
			this.forecastWaves = "0.1";
			this.wavesForced = "0.1";
			this.forecastFogDecay = "0";
			break;
		case STORM:
			this.forecastWeather = "0.8";
			this.forecastWind = "0.1";
			this.forecastWaves = "0.1";
			this.wavesForced = "0.1";
			this.forecastFogDecay = "0";
			break;
		case SUPER:
			this.forecastWeather = "0.8";
			this.forecastWind = "0.1";
			this.forecastWaves = "0.1";
			this.wavesForced = "0.1";
			this.forecastFogDecay = "0";
			break;
		case THUNDER:
			this.forecastWeather = "0.8";
			this.forecastWind = "0.1";
			this.forecastWaves = "0.1";
			this.wavesForced = "0.1";
			this.forecastFogDecay = "0";
			break;
		default:
			this.forecastWeather = "0.8";
			this.forecastWind = "0.1";
			this.forecastWaves = "0.1";
			this.wavesForced = "0.1";
			this.forecastFogDecay = "0";
			break;
		}
	}
	
	public String getTimeOfChanges() {
		return timeOfChanges;
	}

	public void setTimeOfChanges(String timeOfChanges) {
		this.timeOfChanges = timeOfChanges;
	}

	public String getStartWeather() {
		return startWeather;
	}

	public void setStartWeather(String startWeather) {
		this.startWeather = startWeather;
	}

	public String getStartWind() {
		return startWind;
	}

	public void setStartWind(String startWind) {
		this.startWind = startWind;
	}

	public String getStartWaves() {
		return startWaves;
	}

	public void setStartWaves(String startWaves) {
		this.startWaves = startWaves;
	}

	public String getForecastWeather() {
		return forecastWeather;
	}

	public void setForecastWeather(String forecastWeather) {
		this.forecastWeather = forecastWeather;
	}

	public String getForecastWind() {
		return forecastWind;
	}

	public void setForecastWind(String forecastWind) {
		this.forecastWind = forecastWind;
	}

	public String getForecastWaves() {
		return forecastWaves;
	}

	public void setForecastWaves(String forecastWaves) {
		this.forecastWaves = forecastWaves;
	}

	public String getWavesForced() {
		return wavesForced;
	}

	public void setWavesForced(String wavesForced) {
		this.wavesForced = wavesForced;
	}

	public String getWindForced() {
		return windForced;
	}

	public void setWindForced(String windForced) {
		this.windForced = windForced;
	}

	public String getStartFogDecay() {
		return startFogDecay;
	}

	public void setStartFogDecay(String startFogDecay) {
		this.startFogDecay = startFogDecay;
	}

	public String getForecastFogDecay() {
		return forecastFogDecay;
	}

	public void setForecastFogDecay(String forecastFogDecay) {
		this.forecastFogDecay = forecastFogDecay;
	}

	@Override
	public String toString() {
		return "weatherData";
	}
}
