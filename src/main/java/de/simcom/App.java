package de.simcom;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.simcom.games.arma.buildMachine.constructor.impl.ConstructorImpl;
import de.simcom.games.arma.buildMachine.data.Data;
import de.simcom.games.arma.buildMachine.data.impl.ControlStructuresData;
import de.simcom.games.arma.buildMachine.data.impl.mission.MissionData;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Attributes;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.CrewLinks;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.CustomData;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Entities;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Item;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.Links;
import de.simcom.games.arma.buildMachine.data.impl.mission.entities.PositionInfo;
import de.simcom.games.arma.buildMachine.data.impl.mission.intel.Intel;
import de.simcom.games.arma.buildMachine.enums.TemplateType;
import de.simcom.games.arma.buildMachine.enums.TimeSelector;
import de.simcom.games.arma.buildMachine.enums.WeatherSelector;
import de.simcom.games.arma.soundMachine.SoundMachine;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class App {

	public static <E> void main(String[] args) throws SQLException, TemplateNotFoundException,
			MalformedTemplateNameException, ParseException, IOException, TemplateException, InterruptedException {

		ConstructorImpl c = new ConstructorImpl();
		c.setTemplateEngine("templates/mission");
		Data data = new ControlStructuresData(TemplateType.IF, "true", "test2");

		Item item = new Item();
		item.setAttributes(new Attributes("1"));
		item.setDataType("Object");
		item.setPositionInfo(new PositionInfo(new double[] { 2856, 13, 2874 }));
		item.setSide("West");
		item.setType("classname");
		item.setId();
		Item item2 = new Item();
		item2.setAttributes(new Attributes("1"));
		item2.setDataType("Object");
		item2.setPositionInfo(new PositionInfo(new double[] { 2856, 13, 2874 }));
		item2.setSide("West");
		item2.setType("rhsusf_army_ocp_rifleman_10th");
		item2.setId();
		Item item3 = new Item();
		item3.setAttributes(new Attributes("0"));
		item3.setDataType("Object");
		// item3.setPositionInfo(new PositionInfo(new double[] { 2856, 13, 2874 }));
		item3.setSide("West");
		item3.setType("rhsusf_army_ocp_rifleman_10th");
		item3.setId();

		CrewLinks crewLinks = new CrewLinks();
		Links links = new Links();

		Item item4 = new Item();
		item4.setAttributes(new Attributes("1"));
		item4.setDataType("Object");
		item4.setPositionInfo(new PositionInfo(new double[] { 2856, 13, 2874 }));
		item4.setSide("West");
		item4.setType("rhsusf_army_ocp_rifleman_10th");
		item4.setId();
		item4.setItem0("0");
		item4.setItem1("1");

		CustomData customData = new CustomData();
		customData.setRole("1");
		customData.setTurretPath("TurretPath");
		item4.setCustomData(customData);
		links.addItem(item4);

		crewLinks.setLinks(links);
		item.setCrewLinks(crewLinks);

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

		SoundMachine sm = new SoundMachine();
		Map<String, Object> dataD = new HashMap<String, Object>();
		dataD.put("where", "North");
		dataD.put("what", "enemy");
		dataD.put("specific", "rpg");
		sm.contact(dataD);

		// profileNamespace setVariable ["simcom","simcomString2"];
		// c.doStatementConsole(missionData);

		// Application.launch(View.class, args);
	}

}
