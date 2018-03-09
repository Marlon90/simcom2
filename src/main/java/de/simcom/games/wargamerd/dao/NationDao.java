package de.simcom.games.wargamerd.dao;

import java.sql.SQLException;

import de.simcom.games.wargamerd.nations.Nation;

public interface NationDao<E,T> {

	Nation getNation(int id) throws SQLException;
	
}
