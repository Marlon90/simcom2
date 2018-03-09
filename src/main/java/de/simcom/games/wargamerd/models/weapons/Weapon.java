package de.simcom.games.wargamerd.models.weapons;

import de.simcom.games.wargamerd.models.Element;
import de.simcom.games.wargamerd.models.ammo.Ammunition;

public interface Weapon extends Element {

	Ammunition getAmmo();
	int getRange();
	int getDamage();
}
