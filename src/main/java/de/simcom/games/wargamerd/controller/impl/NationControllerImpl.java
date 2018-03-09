package de.simcom.games.wargamerd.controller.impl;

import java.sql.SQLException;

import de.simcom.games.wargamerd.controller.NationController;
import de.simcom.games.wargamerd.dao.NationDao;
import de.simcom.games.wargamerd.dao.impl.NationDaoImpl;
import de.simcom.games.wargamerd.nations.Nation;

public class NationControllerImpl implements NationController {

	NationDao<Nation, Integer> dao = new NationDaoImpl();
	
	@Override
	public String getName(int id) throws SQLException {
		return dao.getNation(id).getName();
	}
}