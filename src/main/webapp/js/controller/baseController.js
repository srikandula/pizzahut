fpModule.controller('baseController', [ '$scope', '$location', 
		function($scope, $location, dataHolderService) {

			$scope.initialise = function() {
				$location.path('base');
			};


		} ]);