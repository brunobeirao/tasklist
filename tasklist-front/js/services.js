tasklist.service('tasklistService', function ($http, $resource){

    var queryConfig = {get: {
                                    method: 'GET',
                                    params : {},
                                    isArray: false,
                              },
                        query: {
                                    method: 'GET',
                                    params : {},
                                    isArray: true,
                              }
                       };
	
	var ADD_TASK = 'http://localhost:8080/tasklist/add';
	
    var LIST_TASK = 'http://localhost:8080/tasklist/list';
    
    var UPDATE_TASK = 'http://localhost:8080/tasklist/update';

    var DELETE_TASK = 'http://localhost:8080/tasklist/delete';

    var serviceGetTask = $resource(LIST_TASK, queryConfig);
    
	var _addTask = function (taskData, callback, error) {
        return $http ({
            url : ADD_TASK,
            headers : postHeaders,
            method: 'POST',
            transformRequest: transformRequest,
            data:{
                titulo: taskData.titulo,
                descricao: taskData.descricao,
            }
        });
    };

    var _updateTask = function (taskData, status, callback, error) {
        return $http ({
            url : UPDATE_TASK,
            headers : postHeaders,
            method: 'POST',
            transformRequest: transformRequest,
            data:{
                id: taskData.id,
                titulo: taskData.titulo,
                descricao: taskData.descricao,
                status: status
            }
        });
    };

    var _deleteTask = function (id, callback, error) {
        return $http ({
            url : DELETE_TASK,
            headers : postHeaders,
            method: 'POST',
            transformRequest: transformRequest,
            data:{
                id: id,
            }
        });
    };
	
	var _getTasks = function (callback, error) {
        serviceGetTask.query(callback, error);
    };
    
    var transformRequest = function(obj) {
        var str = [];
        for(var p in obj)
        str.push(encodeURIComponent(p) + '=' + encodeURIComponent(obj[p]));
        return str.join('&');
    };

    var postHeaders = {'Content-Type': 'application/x-www-form-urlencoded'};
    
    var headers = {'Content-Type': 'application/json'};

    return {
        addTask         		     	: _addTask,
        getTasks						: _getTasks,
        updateTask                      : _updateTask,
        deleteTask                      : _deleteTask
    };

});