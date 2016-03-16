var fpModule = angular.module('fpModule', 
		['ngRoute',
         'ngResource']);

fpModule.config(['$routeProvider',
        function($routeProvider) {
            $routeProvider.               
                when('/base', {
                    templateUrl: 'partial/base.html',
                    controller : 'baseController'
                });
        }]);