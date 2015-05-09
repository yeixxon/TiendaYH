'use strict';

/**
 * @ngdoc overview
 * @name projectCeibaApp
 * @description
 * # projectCeibaApp
 *
 * Main module of the application.
 */
angular.module('ventasApp', [
   'ngAnimate',
   'ngCookies',
   'ngResource',
   'ngRoute',
   'ngSanitize',
   'ngTouch'
  ])
  
  .config(function ($routeProvider) {
	  $routeProvider
        .when('/registro', {
        templateUrl: 'views/registro.html',
        controller: 'usuarioController'
      })
      .when('/allUsuarios', {
        templateUrl: 'views/usuarios.html',
        controller: 'usuarioController'
      })
      .when('/', {
        templateUrl: 'views/menu.html',
        controller: 'usuarioController'
      })
      .otherwise({
        redirectTo: '/'
      });
  });