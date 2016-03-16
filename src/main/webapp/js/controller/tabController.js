fpModule.controller('tabController', ['currentTabSelectedService', function (currentTabSelectedService) {
		currentTabSelectedService.save(1);

        this.setTab = function (tabId) {        	
        	currentTabSelectedService.save(tabId);
        };

        this.isSet = function (tabId) {
            return currentTabSelectedService.get() === tabId;
        };
    }]);