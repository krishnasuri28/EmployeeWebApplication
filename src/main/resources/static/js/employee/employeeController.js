'use strict'
var module = angular.module('employeeControllerModule', ['employeeServiceModule','employeeAppModule']);
module.controller("EmployeeController", ["$scope", "EmployeeService", "$window",
    function($scope, EmployeeService,$window) {
	
        $scope.employee = {};
        $scope.updateButton =false;
        
        $scope.init = function(){
        	var dataPromise = EmployeeService.getAllCountries();
        	dataPromise.then(function(response){
            	$scope.countries = response.data;
            }).catch (function(reason){
            	alert("error");
            });
        }
        
        $scope.saveEmployee = function (){
        	var dataPromise = EmployeeService.createEmployee($scope.employee);
            dataPromise.then(function(response){
            	$window.location.reload();
            }).catch (function(reason){
            	alert("error");
            });
        }
        
        $scope.deleteEmployee = function (employee){
        	var dataPromise = EmployeeService.deleteEmployee(employee.id);
            dataPromise.then(function(response){
            	$window.location.reload();
            }).catch (function(reason){
            	alert("error");
            });
        }
        
        $scope.loadEmployeeData = function (employee){
        	$scope.employee.id = employee.id;
        	$scope.employee.name = employee.name;
        	$scope.employee.department = employee.department;
        	$scope.employee.salary = employee.salary;
        	$scope.updateButton = true;
        }
        
        $scope.updateEmployee = function (){
        	var dataPromise = EmployeeService.updateEmployee($scope.employee);
        	dataPromise.then(function(response){
        		$window.location.reload();
            }).catch (function(reason){
            	alert("error");
            });
        }
        
        $scope.doClear = function (){
        	$scope.employee.id = '';
        	$scope.employee.name = '';
        	$scope.employee.department = '';
        	$scope.employee.salary = '';
        	$scope.updateButton =false;
        }
    }
]);