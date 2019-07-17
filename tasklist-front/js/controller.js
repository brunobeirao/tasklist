tasklist.controller('TasklistController', function($scope, tasklistService, $interval) {

    var ctrl = this;
    $scope.enabledEdit=[];
    $scope.enabledSalvar=[];
    ctrl.status = false;
    $scope.getTasks =[];
    ctrl.ver = true;
    

    function loadList() { 
        tasklistService.getTasks(function(response){    
            $scope.getTasks = response;
            if(response.length != 0){
                ctrl.ver = false;
            }
        },function(data, status) {    
            console.error('Repos error', status, data);
        })
    };
    loadList();

    $scope.addTask = function(taskData) {
        tasklistService.addTask(taskData).success(function(response){ 
            loadList();
            $scope.taskData.titulo ='';
            $scope.taskData.descricao ='';
        }).error(function(data, status) {
            console.error('Repos error', status, data);
        });
    };
    
    $scope.editarTask = function(index){
        $scope.enabledEdit[index] = true;
        $scope.enabledSalvar[index] = true;
    };

    $scope.salvarEdicaoTask = function(taskData){
        tasklistService.updateTask(taskData, ctrl.status).success(function(response){ 
            loadList();
        }).error(function(data, status) {
            console.error('Repos error', status, data);
        });
    };

    $scope.deleteTask = function(id) {
        tasklistService.deleteTask(id).success(function(response){
            loadList();
        }).error(function(data, status) {
            console.error('Repos error', status, data);
        });
      };

    $scope.checar = function(check){
        ctrl.status = check;
    };
    
});