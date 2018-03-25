package de.simcom.games.arma.dc.buildMachine.data.impl.mission.intel;

import java.util.Calendar;

import de.simcom.games.arma.dc.buildMachine.enums.TimeSelector;

public class TimeData {

	private String year;
	private String month;
	private String day;
	private String hour;

	public TimeData(String year, String month, String day, String hour) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
	}

	public TimeData(TimeSelector timeSelector) {
		setTimeSelector(timeSelector);
	}

	public void setTimeSelector(TimeSelector timeSelector) {
		switch (timeSelector) {
		case DATEOFCPU: {
			this.year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
			this.month = String.valueOf(Calendar.getInstance().get(Calendar.MONTH) + 1);
			this.day = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
			this.hour = String.valueOf(Calendar.getInstance().get(Calendar.HOUR));
			break;
		}
		case RANDOM:
			this.year = String.valueOf((int) Math.random() * 2100);
			this.month = String.valueOf((int) Math.random() * 12);
			this.day = String.valueOf((int) Math.random() * 7);
			this.hour = String.valueOf((int) Math.random() * 24);
			break;
		default:
			this.year = String.valueOf(Calendar.YEAR);
			this.month = String.valueOf(Calendar.MONTH);
			this.day = String.valueOf(Calendar.DAY_OF_MONTH);
			this.hour = String.valueOf(Calendar.HOUR_OF_DAY);
			break;
		}
	}
	
	/**
	 * Returns the year
	 * 
	 * @return String year
	 */
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "timeData";
	}

}
