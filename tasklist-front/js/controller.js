tasklist.controller('TasklistController', function($scope, tasklistService, $interval) {

    var ctrl = this;
    $scope.enabledEdit=[];
    $scope.enabledSalvar=[];
    ctrl.status = false;
    $scope.getTasks =[];

    var newDataList = [];
   
    function reload(response) { 
        tasklistService.getTasks(function(response){
         },function(data, status) {    
             console.error('Repos error', status, data);
         });
    };
    
	tasklistService.getTasks(function(response){
        $scope.getTasks = response;
    },function(data, status) {    
        console.error('Repos error', status, data);
    });

    $scope.addTask = function(taskData) {
        tasklistService.addTask(taskData).success(function(response){  
        }).error(function(data, status) {
            console.error('Repos error', status, data);
        });
        $scope.taskData.titulo ='';
        $scope.taskData.descricao ='';
        $scope.getTasks.push(reload());
    };
    
    $scope.editarTask = function(index){
        $scope.enabledEdit[index] = true;
        $scope.enabledSalvar[index] = true;
    };

    $scope.salvarEdicaoTask = function(taskData){
        ctrl.reload();
        tasklistService.updateTask(taskData, ctrl.status).success(function(response){ 
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

    $scope.checar = function(check){
        ctrl.status = check;
    };
    
});