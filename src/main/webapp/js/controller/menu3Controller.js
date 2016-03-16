fpModule.controller('menu3Controller',
				[
						'$scope',
						'$location',
						'currentTabSelectedService',
						'menuRetrieveService',
						'dataHolderService',
						function($scope, $location, currentTabSelectedService, menuRetrieveService, dataHolderService) {

							$scope.temp = "controller is synced";
							
							$scope.loadMenu = function(){
								alert('......... menu3Controller');
								if(currentTabSelectedService.get() === 3){
									alert('Load Menu of Main land china');
								}
							}
						
						} ]);
