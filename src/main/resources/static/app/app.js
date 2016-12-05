'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
    'ngRoute',
    'myApp.view2',
    'myApp.viewTC',
    'myApp.viewRP',
    'myApp.viewCP',
    'myApp.viewRV',
    'services.factory',
    'services.parking',
    'services.vehicles',
    'myApp.version'
]).
config(['$locationProvider','$httpProvider', '$routeProvider', function($locationProvider, $httpProvider, $routeProvider) {
    $locationProvider.hashPrefix('!');
    $routeProvider.otherwise({redirectTo: '/viewRV'});
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
}])
