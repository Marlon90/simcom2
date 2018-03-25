/*
* Description
* Simple task. Objective positional data and priority.
* 
* Parameters
* Positonal data, priority of task itself.
*
* Return 
* Array as object including the objective data.
*/
params ["_positionalData", "_priority"];

_positionalData = _this select 0;
_priority = _this select 1;

_objective = [_positionalData, _priority];

_objective


