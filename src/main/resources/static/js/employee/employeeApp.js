var app = angular.module('employeeAppModule', []);

app.directive('mainMenu',function() {
	return {
		restrict: 'A',
		replace: true,
		controller: 'MainMenuController',
		templateUrl: '/views/menu.html'
	};
});



