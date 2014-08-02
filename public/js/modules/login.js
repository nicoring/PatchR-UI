'use strict';

var login_module = angular.module('simple-login',['ui.bootstrap']);


login_module.factory('loginService', ['$http', '$modal', function($http, $modal) {

    // object holding public functions
    var loginService = {};

    var loggedIn = false;
    var loginID = null;
    var user =  {
        mail: null,
        name: null,
        role: null
    };

    // Getter for private variables
    loginService.getLoginStatus = function() {return loggedIn};
    loginService.getLoginID = function() {return loginID};
    loginService.getUserData = function() {return user};

    loginService.login = function($scope) {

        if (loggedIn) {return}

        var loginModalCtrl = function($scope, $modalInstance) {
            $scope.ok = function (user) {
                $modalInstance.close(user);
            };

            $scope.cancel = function () {
                $modalInstance.dismiss('cancel');
            };
        };

        var modalInstance = $modal.open({
            templateUrl: 'partials/tpl/loginModal.tpl.html',
            controller: loginModalCtrl
        });

        modalInstance.result.then(function(userInput) {

            user.mail = userInput.mail;

            $http.post('/login', userInput)
                .success(function(response) {

                    console.log('response: ', response);
                    //todo check status
                    if (true) {
                        loggedIn = true;
                        //todo get id
//                        loginID = response.data.id;

                        var loginModalSuccessCtrl = function($scope, $modalInstance) {
                            $scope.ok = function () {
                                $modalInstance.close();
                            };
                        };

                        $modal.open({
                            templateUrl: 'partials/tpl/loginModalSuccess.tpl.html',
                            controller: loginModalSuccessCtrl
                        }).result.then()

                    } else {
                        loggedIn = false;
                        loginID = null;

                        var loginModalErrorCtrl = function($scope, $modalInstance) {
                            $scope.ok = function () {
                                $modalInstance.close();
                            };

                            $scope.cancel = function () {
                                $modalInstance.dismiss('cancel');
                            };
                        };

                        $modal.open({
                            templateUrl: 'partials/tpl/loginModalError.tpl.html',
                            controller: loginModalErrorCtrl
                        }).result.then(function() {loginService.login()})
                    }
                })
        });
    };

    loginService.logout = function() {
        //TODO logout user
        loggedIn = false;
        loginID = null;
    };

    // return object with public functions
    return loginService;

}]);
