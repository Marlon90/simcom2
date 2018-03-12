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

		timeOfChanges=1800;
		startWeather=0.8;
		startWind=0.2;
		startWaves=0.2;
		forecastWeather=0.8;
		forecastWind=0.1;
		forecastWaves=0.1;
		wavesForced=0.1;
		windForced=0.2;
		year=2018;
		month=3;
		day=12;
		hour=9;
		startFogDecay=0.2;
		forecastFogDecay=0;
	};

	class Entities {
	items=1;
	
		class Item0 {

			dataType="Object";
			side="West";

			class Entities {
				items=2;

				class Item0 {

					dataType= "Object";

					class PositionInfo {
						position[]={2856.013.02874.0};
					};

					side="West";

					class Attributes {

						isPlayer=1;
					};

					type="rhsusf_army_ocp_rifleman_10th";

				};

				class Item1 {

					dataType= "Object";

					class PositionInfo {
						position[]={2856.013.02874.0};
					};

					side="West";

					class Attributes {

						isPlayer=0;
					};

					type="rhsusf_army_ocp_rifleman_10th";

				};
			};
			class Attributes{};
		};
	};
};