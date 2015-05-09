'use strict';

/**
 * @ngdoc function
 * @name projectCeibaApp.controller:EstadisticasCtrl
 * @description
 * # inicioController
 * Controller of the ventasApp
 */
angular.module('ventasApp')
  .controller('usuarioController', function ($scope,restUsuarios,$location,$cookieStore) {
	    
	  
	  
	  $scope.guardar=function(user){
		  
		  console.log(user);
		  restUsuarios.getGuardar(user).success(function(data){	
			  console.log(data)
			  if(data == true){
				  alert('Guardado');
			  }else{
				  alert('Error al Guardar');
			  }
			  
		  });
		  
	  };

	  $scope.cargar=function(){
		  
		  restUsuarios.getConsultarTodos().success(function(data){
			  $scope.us = data;
			  
		  });
		  
	  };
	  
	  
});