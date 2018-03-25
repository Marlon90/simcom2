package de.simcom.games.arma.dc.buildMachine.data.impl.mission.entities;

import java.util.ArrayList;
import java.util.List;

public class Item {

	private Integer id;
	private static List<Integer> ids = new ArrayList<Integer>();
	private Entities entity;
	private PositionInfo positionInfo;
	private Attributes attributes;
	private CustomData customData;
	private CrewLinks crewLinks;
	private String dataType;
	private String side;
	private String type;
	private Integer linkId;
	private String item0;
	private String item1;

	public Item() {
	}

	public Entities getEntity() {
		return entity;
	}

	public void setEntity(Entities entity) {
		this.entity = entity;
	}

	public String getId() {
		if (id != null) {
			return String.valueOf(id);	
		}
		return null;
	}

	public void setId() {
		this.id = ids.size() + 1;
		ids.add(id);
	}

	public PositionInfo getPositionInfo() {
		return positionInfo;
	}

	public void setPositionInfo(PositionInfo positionInfo) {
		this.positionInfo = positionInfo;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CustomData getCustomData() {
		return customData;
	}

	public void setCustomData(CustomData customData) {
		this.customData = customData;
	}

	public CrewLinks getCrewLinks() {
		return crewLinks;
	}

	public void setCrewLinks(CrewLinks crewLinks) {
		this.crewLinks = crewLinks;
	}

	public String getItem0() {
		return item0;
	}

	public void setItem0(String item0) {
		this.item0 = item0;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}
}