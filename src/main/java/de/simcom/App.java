package de.simcom;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.simcom.games.arma.buildMachine.constructor.impl.ConstructorImpl;
import de.simcom.games.arma.buildMachine.data.Data;
import de.simcom.games.arma.buildMachine.data.impl.ControlStructuresData;
import de.simcom.games.arma.buildMachine.data.impl.mission.MissionData;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Attributes;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Entities;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Item;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.PositionInfo;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Test;
import de.simcom.games.arma.buildMachine.data.impl.mission.intel.Intel;
import de.simcom.games.arma.buildMachine.enums.TemplateType;
import de.simcom.games.arma.buildMachine.enums.TimeSelector;
import de.simcom.games.arma.buildMachine.enums.WeatherSelector;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class App {

	public static <E> void main(String[] args) throws SQLException, TemplateNotFoundException,
			MalformedTemplateNameException, ParseException, IOException, TemplateException {

		ConstructorImpl c = new ConstructorImpl();
		c.setTemplateEngine("templates/mission");
		Data data = new ControlStructuresData(TemplateType.IF, "true", "test2");

		Item item = new Item();
		item.setAttributes(new Attributes("1"));
		item.setDataType("Object");
		item.setPositionInfo(new PositionInfo(new double[] { 2856, 13, 2874 }));
		item.setSide("West");
		item.setType("classname");
		
		Item item2 = new Item();
		item2.setAttributes(new Attributes("1"));
		item2.setDataType("Object");
		item2.setPositionInfo(new PositionInfo(new double[] { 2856, 13, 2874 }));
		item2.setSide("West");
		item2.setType("rhsusf_army_ocp_rifleman_10th");
		
		Item item3 = new Item();
		item3.setAttributes(new Attributes("0"));
		item3.setDataType("Object");
		//item3.setPositionInfo(new PositionInfo(new double[] { 2856, 13, 2874 }));
		item3.setSide("West");
		item3.setType("rhsusf_army_ocp_rifleman_10th");

		Entities entity = new Entities();
		Entities entity2 = new Entities();
		entity2.addItem(item2);
		entity2.addItem(item3);
		item.setEntity(entity2);
		entity.addItem(item);		
		
		MissionData missionData = new MissionData(
				new Intel(WeatherSelector.NORMAL, WeatherSelector.GOOD, TimeSelector.DATEOFCPU, "1800"),
				new Entities(item));

		missionData.setTemplateType(TemplateType.MISSION);

		c.doStatementConsole(missionData);

		// Application.launch(View.class, args);
	}
}
