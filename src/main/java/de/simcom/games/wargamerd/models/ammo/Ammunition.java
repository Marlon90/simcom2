package de.simcom.games.wargamerd.models.ammo;

import de.simcom.games.wargamerd.models.Element;

public interface Ammunition extends Element {

	boolean isHeat();
	boolean isAPFSD();
	int getSize();
	int getSplash();
}
