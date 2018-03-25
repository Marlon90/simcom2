/* Description
* Get all positions with their objective priority.
*
* Parameters
* _objective is a list containing positional data and priority.
*
* Example of Object
* [[2567,2576, 0], "BROWN"]; 
*
*/
params ["_objective"];

_objective = _this select 0;

if (count _objective == 2) then {
	markerList pushBack _objective;
};


