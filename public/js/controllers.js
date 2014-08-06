'use strict';

/* Controllers */

app.controller('aboutCtrl', function($scope) {
    window.document.title = "PatchR - About";

});
app.controller('tableCtrl', ['$scope', '$filter', '$http', 'ngTableParams', 'loginService', function($scope, $filter, $http, ngTableParams, loginService) {

    window.document.title = "PatchR - Browse patches";

    // boolean for showing filter boxes in each column and text for filter button
    // this values get changed by toggleFilter()
    $scope.show_filter = false;
    $scope.filterButtonText = "Show Filter";

    // value for grouping and boolean if grouped or not, for less angular in html
    $scope.grouped = false;
    $scope.groupby = 'none';

    // initialize arrays for patches and alerts
    $scope.patches = [];
    $scope.alerts = [];

    // login if not logged in, logout user else
    $scope.login = function() {
        if (loginService.getLoginStatus()) {
            loginService.logout();
            if (!loginService.getLoginStatus()) {
                $scope.loginButtonText = 'Login';
            }
        } else {
            loginService.login($scope);
            if (loginService.getLoginStatus()) {
                $scope.loginButtonText = 'Logout';
            }
        }
    };

    $scope.loginButtonText = 'Login';


    // create a table, with parameter and setting object
    $scope.tableParams = new ngTableParams({
        page: 1, // page to show
        count: 10, // count per page
        sorting: {
            lastTime: 'desc' //initial sorting
        }
    }, {
        total: $scope.patches.length, // total count of rows important for pagination

        // main function of ng-table
        // is called on every change on the table
        // and
        getData: function($defer, params) {

            // filter data, with given filter parameters in params.filter
            var filteredData = params.filter() ?
                $filter('filter')($scope.patches, $scope.tableParams.filter()) :
                $scope.patches; // raw data on no filtering

            // sort data, with given sorting parameters in params.sorting
            var orderedData = params.sorting() ?
                $filter('orderBy')(filteredData, $scope.tableParams.orderBy()) :
                filteredData; // filtered data on no sorting

            // slice the rows into pices for pagination in relation to count and current page (set in parameter object)
            $scope.data = orderedData.slice((params.page() - 1) * params.count(), params.page() * params.count());

            // set new total count of rows after filtering
            params.total(orderedData.length);

            // make rows available for ng-table
            $defer.resolve($scope.data);
        }
    });

    // reloads data from the server into $scope.patches and reloads the table
    $scope.loadData = function() {

        // get load button
        var btn = $('#load-button');

        // set button state to loading
        btn.button('loading');
        var start = new Date().getTime();

        // ajax request to get patches
        $http.get("/patches")
            .success(function(data) {

                // get patches array
                $scope.patches = data.patches;
                $scope.tableParams.reload();
            })
            .error(function() {
                // add an alert, if the request fails, which shows up above the table
                $scope.addAlert('Reloading failed! Maybe the Server is not available at the moment, please try again later.', 'danger');
            })
            ['finally'](function() {

            // set delay for loading state in relation to time since the request started
            var delay =  1000 - (new Date().getTime() - start);
            delay = delay < 0 ? 0 : delay;

            // reset loading-button state after every type of response
            setTimeout(function() {
                btn.button('reset');
            }, delay);

        });
    };

//        $scope.loadData();

    // show or hide filter boxes and change button text in relating to it
    $scope.toggleFilter = function() {
        $scope.show_filter = !$scope.show_filter;
        $scope.filterButtonText = $scope.show_filter ? "Hide Filter" : "Show Filter";
    };

    // sets the grouping of the table and reload table
    $scope.setGrouping = function(value) {
        $scope.grouped = $scope.groupby != 'none';
        $scope.tableParams.settings().groupBy = $scope.grouped ? $scope.groupby : null;
        $scope.tableParams.reload();
    };

    // sets the sorting to the given params, should be an object
    $scope.setSorting = function(sort) {
        $scope.tableParams.sorting(sort);
        $scope.tableParams.reload();
    };

    // adds an alert, which shows up over the table, alterType is the bootstrap type of the alert danger/warning
    $scope.addAlert = function(message, alertType) {
        $scope.alerts.push({type: alertType, msg: message});
    };

    // removes the alert with the given index
    $scope.closeAlert = function(index) {
        $scope.alerts.splice(index, 1);
    };
}]);
app.controller('statisticCtrl', function($scope, $http) {
    window.document.title = "PatchR - Statistics";

//        $http.get("/statistics").success(function(data) {
//            $scope.stats = data;
//        })

});
app.controller('ontologyCtrl', function($scope) {
    window.document.title = "PatchR - Ontology";

});
app.controller('contactCtrl', function() {
    window.document.title = "PatchR - Contact";
});
