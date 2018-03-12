package de.simcom.games.arma.buildMachine.data.impl.mission.entities;

import java.util.ArrayList;
import java.util.List;

public class Item {

	private String id;
	private List<Entities> entities;
	private PositionInfo positionInfo;
	private Attributes attributes;
	private String dataType;
	private String side;
	private String type;

	public Item(String id) {
		this.id = id;
	}

	public Item(String id, Entities entity) {
		this.id = id;
		this.entities = new ArrayList<Entities>();
		this.entities.add(entity);
	}

	public String getId() {
		return id;
	}

	public List<Entities> getEntities() {
		return entities;
	}

	public void setEntities(List<Entities> entities) {
		this.entities = entities;
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
}