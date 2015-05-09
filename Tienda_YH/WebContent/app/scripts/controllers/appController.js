'use strict';

/**
 * @ngdoc function
 * @name projectCeibaApp.controller:EstadisticasCtrl
 * @description
 * # inicioController
 * Controller of the ventasApp
 */
angular.module('ventasApp')
  .controller('appController', function ($scope,$cookieStore,restUsuarios,$location) {
	  
	  
	  $scope.sesion = $cookieStore.get("conectado");
	  $scope.msj = false;
	  
	  $scope.iniciarS = function(){
		  $scope.sesion = $cookieStore.get("conectado");
	  };
	  
	  $scope.cerrarS = function(){
		  $cookieStore.remove("conectado");
		  $cookieStore.remove("usuario");
		  $scope.sesion = false;
	  };
	  
	  $scope.us = [{email:'',password:''}];
	  
	  $scope.login=function(us){
		  
		  console.log(us);
		  restUsuarios.getConsultar(us).success(function(data){
			  $scope.us=data;
			  console.log(data);
			  if(data.length != 0){
				  $cookieStore.put("conectado",true);
				  $cookieStore.put("usuario",data);
				  $scope.iniciarS();
				  $location.url("/menu");
				  $scope.msj = false;
			  }
			  else{
				  $scope.msj = true;
			  }
			  
		  });
		  
	  };

});