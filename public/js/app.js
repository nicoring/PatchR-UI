'use strict';


// Declare app level module which depends on filters, and services
var app = angular.module('PatchR-app', [
    'ngTable',
    'ngRoute',
    'ui.bootstrap',
    'PatchR-app.filters',
    'PatchR-app.services',
    'PatchR-app.directives',
    'PatchR-app.controllers'
]);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/about', {templateUrl: 'partials/about.html', controller: 'aboutController'});
    $routeProvider.when('/browsePatches', {templateUrl: 'partials/browsePatches.html', controller: 'tableController'});
    $routeProvider.when('/statistics', {templateUrl: 'partials/statistics.html', controller: 'statisticController'});
    $routeProvider.when('/ontology', {templateUrl: 'partials/ontology.html', controller: 'ontologyController'});
    $routeProvider.when('/contact', { templateUrl: 'partials/contact.html', controller: 'contactController'});
    $routeProvider.otherwise({redirectTo: 'about'});
}]);
