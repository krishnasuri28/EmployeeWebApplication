'use strict'
angular.module('employeeServiceModule', []).factory('EmployeeService', ["$http", function($http) {
    var service = {};
    
    service.createEmployee = function(data) {
        var url = "/employee/createEmployee";
        return $http.post(url,data);
    }
    service.findAllEmployees = function (){
    	var url = "/employee/findAllEmployee";
    	return $http.get(url);
    }
    service.updateEmployee = function(data) {
    	var url = "/employee/updateEmployee";
        return $http.put(url,data);
    }
    service.deleteEmployee = function(id) {
        return $http.delete("/employee/deleteEmployee/" + id );
    }
    service.getAllCountries = function (){
    	return $http.get("/employee/getAllCountries");
    }
    return service;
}]);