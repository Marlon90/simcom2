package de.simcom.games.arma.dc.buildMachine.data.impl.mission.entities;

import java.util.ArrayList;
import java.util.List;

public class Entities {

	private static int itemId = 0;
	private static boolean firstItem = true;
	private List<Item> items;
	private Attributes attributes;

	public Entities() {
		this.items = new ArrayList<Item>();
	}

	public Entities(Item item) {
		this.items = new ArrayList<Item>();
		this.items.add(item);
		if (firstItem) {
			itemId = 0;
			firstItem = false;
		}
		itemId = itemId + 1;
	}

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public String getIsPlayer() {
		return attributes.getIsPlayer();
	}

	public static int getItemId() {
		return itemId;
	}

	public static void setItemId(int itemId) {
		Entities.itemId = itemId;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Entities";
	}
}