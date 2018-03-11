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
		
		timeOfChanges=${weatherData.timeOfChanges};
		startWeather=${weatherData.startWeather};
		startWind=${weatherData.startWind};
		startWaves=${weatherData.startWaves};
		forecastWeather=${weatherData.forecastWeather};
		forecastWind=${weatherData.forecastWind};
		forecastWaves=${weatherData.forecastWaves};
		wavesForced=${weatherData.wavesForced};
		windForced=${weatherData.windForced};
		year=${timeData.year};
		month=${timeData.month};
		day=${timeData.day};
		hour=${timeData.hour};
		startFogDecay=${weatherData.startFogDecay};
		forecastFogDecay=${weatherData.forecastFogDecay};
	};
	
	class Entities {
		
		items=${itemData.items};
		
		class Item${itemData.itemMainNumber} {
			
			dataType="Group";
			side="${itemData.side}";
			
			class Entities {
				items=1;
				
				class Item${itemData.itemSubNumber} {
					
					dataType= "${itemData.dataType}";
					
					class PositionInfo {
						position[]={${itemData.position}};
					};
				
					side="${itemData.side}";
					
					class Attributes {
					
						isPlayer=${itemData.isPlayer};
					};
					
					type="rhsusf_army_ocp_rifleman_10th";
					
				};
			};
			class Attributes{};
		};
	};
};