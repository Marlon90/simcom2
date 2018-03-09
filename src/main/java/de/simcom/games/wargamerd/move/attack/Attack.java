package de.simcom.games.wargamerd.move.attack;

import de.simcom.games.wargamerd.models.unit.Unit;
import de.simcom.games.wargamerd.move.Move;

public interface Attack extends Move {

	void setAttacker(Unit element);

	void setTarget(Unit element);

	void attack();
	
	Unit getAttacker();

	Unit getTarget();

}
