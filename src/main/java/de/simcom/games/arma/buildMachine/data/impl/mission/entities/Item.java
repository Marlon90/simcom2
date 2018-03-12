package de.simcom.games.arma.buildMachine.data.impl.mission.entities;

public class Item {

	private String id;
	private Entities entity;
	private PositionInfo positionInfo;
	private Attributes attributes;
	private String dataType;
	private String side;
	private String type;

	public Item() {
	}

	public Entities getEntity() {
		return entity;
	}

	public void setEntity(Entities entity) {
		this.entity = entity;
	}

	public String getId() {
		return id;
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