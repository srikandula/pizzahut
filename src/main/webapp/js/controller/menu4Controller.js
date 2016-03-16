fpModule.controller('menu4Controller',
				[
						'$scope',
						'$location',
						'currentTabSelectedService',
						'menuRetrieveService',
						'dataHolderService',
						function($scope, $location, currentTabSelectedService, menuRetrieveService, dataHolderService) {

							$scope.temp = "controller is synced";
							
							$scope.loadMenu = function(){
								alert('......... menu4Controller');
								if(currentTabSelectedService.get() === 4){
									alert('Load Menu of Chutneys');
								}
							}
						
						} ]);
