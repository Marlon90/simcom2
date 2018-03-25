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
	items=${items?size};
	<#assign i = items[item]>
		class Item${item} {
	
			dataType="${i.dataType}";
			side="${i.side}";

			class Entities {
				items=${i.entity.items?size};
				<#list 0..items[item].entity.items?size-1 as subItem>
				<#assign j = i.entity.items[subItem]>
				class Item${subItem} {

					dataType= "${j.dataType}";

					class PositionInfo {
						<#if (j.positionInfo.position)??>
						position[]={${j.positionInfo.position}};
						</#if>
					};

					side="${j.side}";

					class Attributes {
						
						<#if j.attributes.isPlayer != "0">
						isPlayer=${j.attributes.isPlayer};
						</#if>
					};
					<#if (j.id)??>
					id = ${j.id};
					</#if>
					type="${j.type}";

				};
				</#list>
			};
			class Attributes{};
			<#if (i.id)??>
			id = ${i.id};
			</#if>
			
			<#if (i.crewLinks)??>
			class CrewLinks {
				<#list 0..i.crewLinks.links.items?size-1 as subItem>
				<#assign j = i.crewLinks.links.items[subItem]>
				<#assign sizeOf = items[item].crewLinks.links.items?size>
				class LinkIDProvider {
					
					nextID=${sizeOf};
				};
				
				class Links {
					items=${sizeOf};
					
					class Item${subItem} {
						
						linkID=${subItem};
						item0=${j.item0};
						item1=${j.item1};
						
						class CustomData {
							role=${j.customData.role};
						};
					};
				};
			};
			</#list>
			</#if>
		};
	</#list>
	};
};