tasklist.controller('TasklistController', function($scope, tasklistService) {

    var ctrl = this;
    $scope.enabledEdit=[];
    $scope.enabledSalvar=[];

	tasklistService.getTasks(function(response){
        ctrl.getTasks = response;
        
    },function(data, status) {
        
        console.error('Repos error', status, data);
    }); 

    ctrl.cadastrar = function(taskData) {

    };

    $scope.addTask = function(taskData) {
        tasklistService.addTask(taskData).success(function(response){  
        }).error(function(data, status) {
            console.error('Repos error', status, data);
        });
    };
    
    $scope.editarTask = function(index){
        $scope.enabledEdit[index] = true;
        $scope.enabledSalvar[index] = true;
    };

    $scope.salvarEdicaoTask = function(taskData){
        console.log(taskData);
        tasklistService.updateTask(taskData).success(function(response){  
        }).error(function(data, status) {
            console.error('Repos error', status, data);
        });
    };
    $scope.deleteTask = function(id) {
        tasklistService.deleteTask(id).success(function(response){  
        }).error(function(data, status) {
            console.error('Repos error', status, data);
        });
      };
    
});