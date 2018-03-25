package de.simcom.games.arma.dc.buildMachine.data.impl.mission.entities;

import java.util.ArrayList;
import java.util.List;

public class Links {

	private List<Item> items;

	public Links() {
		this.items = new ArrayList<Item>();
	}

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}