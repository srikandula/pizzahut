fpModule.controller('menu2Controller',
				[
						'$scope',
						'$location',
						'currentTabSelectedService',
						'menuRetrieveService',
						'dataHolderService',
						function($scope, $location, currentTabSelectedService, menuRetrieveService, dataHolderService) {

							$scope.temp = "controller is synced";
							
							$scope.loadMenu = function(){	
								alert('......... menu2Controller');
								if(currentTabSelectedService.get() === 2){
									alert('Load Menu of Dominos');
								}
							}
						} ]);
