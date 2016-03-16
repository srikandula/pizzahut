fpModule.factory('menuRetrieveService',['$resource', function($resource) {
	  return  $resource(
			  'rs/menu'
			  );
}
]);

