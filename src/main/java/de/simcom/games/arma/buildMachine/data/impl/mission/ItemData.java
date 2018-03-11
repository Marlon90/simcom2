package de.simcom.games.arma.buildMachine.data.impl.mission;

public class ItemData {

	private String items;
	private String itemMainNumber;
	private String itemSubNumber;
	private String dataType;
	private String position;
	private String side;
	private String isPlayer;

	public ItemData(String itemMainNumber, String itemSubNumber, String dataType, String position, String side,
			String isPlayer) {
		super();
		this.itemMainNumber = itemMainNumber;
		this.itemSubNumber = itemSubNumber;
		this.dataType = dataType;
		this.position = position;
		this.side = side;
		this.isPlayer = isPlayer;
	}

	public ItemData() {

	}

	public String getItemMainNumber() {
		return itemMainNumber;
	}

	public void setItemMainNumber(String itemMainNumber) {
		this.itemMainNumber = itemMainNumber;
	}

	public String getItemSubNumber() {
		return itemSubNumber;
	}

	public void setItemSubNumber(String itemSubNumber) {
		this.itemSubNumber = itemSubNumber;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getIsPlayer() {
		return isPlayer;
	}

	public void setIsPlayer(String isPlayer) {
		this.isPlayer = isPlayer;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "itemData";
	}
}
