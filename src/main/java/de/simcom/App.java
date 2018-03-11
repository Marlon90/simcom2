package de.simcom;

import java.io.IOException;
import java.sql.SQLException;

import de.simcom.games.arma.buildMachine.constructor.impl.ConstructorImpl;
import de.simcom.games.arma.buildMachine.data.Data;
import de.simcom.games.arma.buildMachine.data.impl.ControlStructuresData;
import de.simcom.games.arma.buildMachine.data.impl.mission.ItemData;
import de.simcom.games.arma.buildMachine.data.impl.mission.MissionData;
import de.simcom.games.arma.buildMachine.data.impl.mission.TimeData;
import de.simcom.games.arma.buildMachine.data.impl.mission.WeatherData;
import de.simcom.games.arma.buildMachine.enums.TemplateType;
import de.simcom.games.arma.buildMachine.enums.TimeSelector;
import de.simcom.games.arma.buildMachine.enums.WeatherSelector;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class App {

	public static void main(String[] args) throws SQLException, TemplateNotFoundException,
			MalformedTemplateNameException, ParseException, IOException, TemplateException {

		ConstructorImpl c = new ConstructorImpl();
		Data data = new ControlStructuresData(TemplateType.IF, "true", "test2");
		MissionData missionData = new MissionData();
		
		
		TimeData timeData = new TimeData(TimeSelector.DATEOFCPU);
		WeatherData weatherData = new WeatherData(WeatherSelector.NORMAL, WeatherSelector.GOOD, "1800");
		ItemData itemData = new ItemData();
		itemData.setItems("1");
		
		boolean isPlayer = true;
		int items = 1;
		for (int i = 0; i < items; i++ ) {
			
			itemData.setDataType("Object");
			if (isPlayer) {
				itemData.setIsPlayer("1");
				isPlayer = false;
			}
			itemData.setItemMainNumber(String.valueOf(i));
			itemData.setItemSubNumber(String.valueOf((i+1)));
			itemData.setPosition("2856,13,2142");
			itemData.setSide("WEST");
		}
		
		missionData.setItemData(itemData);
		missionData.setWeatherData(weatherData);
		missionData.setTimeData(timeData);
		
		missionData.setTemplateType(TemplateType.MISSION);
		
		c.doStatementConsole(missionData);
		
		
		

		// Application.launch(View.class, args);
	}
}
