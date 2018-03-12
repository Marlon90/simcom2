version=52;
class EditorData {

	moveGridStep=1;
	angleGridStep=0;
	scaleGridStep=0;
	autoGroupingDist=0;
	toggles=1;

	class Camera {
		pos[]={2951.9795,38.534729,2080.355};
		dir[]={-0.026856616,-0.44948402,0.89289159};
		up[]={-0.013513672,0.8932879,0.44928241};
		aside[]={0.99955565,-3.9199222e-008,0.030065063};
	};
};

binarizationWanted=0;
randomSeed=4444425;

class ScenarioData {
	author="SIMCOM";
};

class Mission {

	class Intel {

		timeOfChanges=${intel.timeOfChanges};
		startWeather=${intel.startWeather};
		startWind=${intel.startWind};
		startWaves=${intel.startWaves};
		forecastWeather=${intel.forecastWeather};
		forecastWind=${intel.forecastWind};
		forecastWaves=${intel.forecastWaves};
		wavesForced=${intel.wavesForced};
		windForced=${intel.windForced};
		year=${intel.year};
		month=${intel.month};
		day=${intel.day};
		hour=${intel.hour};
		startFogDecay=${intel.startFogDecay};
		forecastFogDecay=${intel.forecastFogDecay};
	};

	class Entities {

		items=${entities.items};

		class Item${item.itemMainNumber} {

			dataType="Group";
			side="${entities.side}";

			class Entities {
				items=1;

				class Item${entities.itemSubNumber} {

					dataType= "${entities.dataType}";

					class PositionInfo {
						position[]={${entities.position}};
					};

					side="${entities.side}";

					class Attributes {

						isPlayer=${entities.isPlayer};
					};

					type="rhsusf_army_ocp_rifleman_10th";

				};
			};
			class Attributes{};
		};
	};
};