'use strict';


// Declare app level module which depends on filters, and services
var app = angular.module('PatchR-app', [
    'ngTable',
    'ngRoute',
    'ui.bootstrap'
]);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/about', {templateUrl: 'partials/about.html', controller: 'aboutCtrl'});
    $routeProvider.when('/browsePatches', {templateUrl: 'partials/browsePatches.html', controller: 'tableCtrl'});
    $routeProvider.when('/statistics', {templateUrl: 'partials/statistics.html', controller: 'statisticCtrl'});
    $routeProvider.when('/ontology', {templateUrl: 'partials/ontology.html', controller: 'ontologyCtrl'});
    $routeProvider.when('/contact', { templateUrl: 'partials/contact.html', controller: 'contactCtrl'});
    $routeProvider.otherwise({redirectTo: 'about'});
}]);
