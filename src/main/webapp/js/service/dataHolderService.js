fpModule.factory('dataHolderService', ['$log', function($log) {
	  var requestCaseId = [];
	  
	  return {
		  saveCaseId : function(caseId) {
			  requestCaseId.push(caseId);
		  },
		  getCaseId : function(){
			  return requestCaseId;
		  }
	  }
}]);


