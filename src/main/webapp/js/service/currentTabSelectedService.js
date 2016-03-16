fpModule.factory('currentTabSelectedService',[function() {
		  var currentTabId = 1;
		  
		  return {
			  save:function(newTabId){
				  this.currentTabId = newTabId;
			  },		  
			  get:function(){
				  return this.currentTabId ;
			  }
		  }
}]);
