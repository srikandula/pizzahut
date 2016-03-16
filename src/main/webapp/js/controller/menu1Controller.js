fpModule.controller('menu1Controller', [
		'$scope',
		'$location',
		'currentTabSelectedService',
		'menuRetrieveService',
		'dataHolderService',
		function($scope, $location, currentTabSelectedService,
				menuRetrieveService, dataHolderService) {

			var menuList = {};

			$scope.loadMenu = function() {
				$scope.pizzaHutMenuList = menuRetrieveService.get(function(
						testData) {
					$scope.menuList = testData.items;
				});
			}

		} ]);
