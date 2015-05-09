'use strict';

/**
 * @ngdoc function
 * @name projectCeibaApp.controller:EstadisticasCtrl
 * @description
 * # inicioController
 * Controller of the ventasApp
 */
angular.module('ventasApp')
  .controller('inicioController', function ($scope,restUsuarios) {
	    
	  $scope.guardar=function(user){
		  
		  console.log(user);
		  restUsuarios.getGuardar(user).success(function(data){				  
			  if(data){
				  alert('Guardado');
			  }else{
				  alert('Error al Guardar');
			  }
			  
		  });
		  
	  };
	  
	  $scope.login=function(login){
		  
		  console.log(user);
		  restUsuarios.getGuardar(user).success(function(data){				  
			  if(data){
				  alert('Guardado');
			  }else{
				  alert('Error al Guardar');
			  }
			  
		  });
		  
	  };
	  
	  
});