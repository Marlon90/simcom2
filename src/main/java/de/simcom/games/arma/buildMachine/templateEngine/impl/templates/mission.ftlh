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

		timeOfChanges=${intel.weatherData.timeOfChanges};
		startWeather=${intel.weatherData.startWeather};
		startWind=${intel.weatherData.startWind};
		startWaves=${intel.weatherData.startWaves};
		forecastWeather=${intel.weatherData.forecastWeather};
		forecastWind=${intel.weatherData.forecastWind};
		forecastWaves=${intel.weatherData.forecastWaves};
		wavesForced=${intel.weatherData.wavesForced};
		windForced=${intel.weatherData.windForced};
		year=${intel.timeData.year};
		month=${intel.timeData.month};
		day=${intel.timeData.day};
		hour=${intel.timeData.hour};
		startFogDecay=${intel.weatherData.startFogDecay};
		forecastFogDecay=${intel.weatherData.forecastFogDecay};
	};

	class Entities {
	<#list 0..items?size-1 as item>
	items=;
	
		class Item${item} {

			dataType="${items[item].dataType}";
			side="${items[item].side}";

			class Entities {
				items=1;
				<#list 0..items[item].entity.items?size-1 as subItem>
				class Item${subItem} {

					dataType= "${items[item].entity.items[subItem].dataType}";

					class PositionInfo {
						position[]={${items[item].entity.items[subItem].positionInfo.position}};
					};

					side="${items[item].entity.items[subItem].side}";

					class Attributes {

						isPlayer=${items[item].entity.items[subItem].attributes.isPlayer};
					};

					type="rhsusf_army_ocp_rifleman_10th";

				};
				</#list>
			};
			class Attributes{};
		};
	</#list>
	};
};