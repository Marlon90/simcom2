package de.simcom.games.wargamerd.models.weapons.cannons;

import de.simcom.games.wargamerd.models.weapons.Weapon;

public interface Cannon extends Weapon {

	void loadedHeat();

	void loadedAPFSD();
}
