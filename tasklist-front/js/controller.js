tasklist.controller('TasklistController', function($scope, tasklistService) {

	var ctrl = this;

	tasklistService.getTasks(function(response){
        ctrl.getTasks = response;
        
    },function(data, status) {
        
        console.error('Repos error', status, data);
    }); 

    ctrl.cadastrar = function(taskData) {

    };

    $scope.update = function(taskData) {
        tasklistService.addTask(taskData).success(function(response){  
        }).error(function(data, status) {
            console.error('Repos error', status, data);
        });
      };
 
});