package de.simcom;

import java.io.IOException;
import java.sql.SQLException;

import de.simcom.games.arma.buildMachine.constructor.impl.ConstructorImpl;
import de.simcom.games.arma.buildMachine.data.Data;
import de.simcom.games.arma.buildMachine.data.impl.ControlStructuresData;
import de.simcom.games.arma.buildMachine.data.impl.mission.MissionData;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Attributes;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Entities;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Item;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.PositionInfo;
import de.simcom.games.arma.buildMachine.data.impl.mission.intel.Intel;
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
		
		Item item = new Item("0");
		item.setAttributes(new Attributes("1"));
		item.setDataType("Object");
		item.setPositionInfo(new PositionInfo(new double[] { 2856, 13, 2874 }));
		item.setSide("West");
		item.setType("classname");
		
		MissionData missionData = new MissionData(
				new Intel(WeatherSelector.NORMAL, WeatherSelector.GOOD, TimeSelector.DATEOFCPU, "1800"),
				new Entities(item));

		missionData.setTemplateType(TemplateType.MISSION);

		c.doStatementConsole(missionData);

		// Application.launch(View.class, args);
	}
}
