package de.simcom.games.arma.dc.scriptMachine.army;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Command {

	private String doctrine;
	private Map<String, List> task = new HashMap<String, List>();

	public Command(String doctrine) {
		this.doctrine = doctrine;
	}

	public void addTask(String position, String kindOf) {

		List<String> taskData = new ArrayList<String>();
		Collections.addAll(taskData, position, kindOf);

		task.put(String.valueOf(task.size() + 1), taskData);
	}

	public void allTasks() {
		task.forEach((k, v) -> {
			System.out.println(v);
		});
	}

	@SuppressWarnings("unchecked")
	public List<String> searchFor(String prefix) {
		List<String> list = new ArrayList<String>();

		task.forEach((k, v) -> {
			if (v.contains(prefix)) {
				list.addAll(v);
			}
		});
		return list;
	}

	public void availableTasks(Unit unit) {
		switch (doctrine) {
		case "1":

			break;

		default:
			break;
		}
	}

	private void kindOfTask(Unit unit) {
		switch (unit.getRole()) {
		case "AA":

			break;

		default:
			break;
		}
	}

}
