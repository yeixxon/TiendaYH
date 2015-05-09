'use strict';

/**
 * @ngdoc service
 * @name projectCeibaApp.consultProjects
 * @description
 * # consultProjects
 * Factory in the projectCeibaApp.
 */
angular.module('ventasApp')
  .factory('restUsuarios', function ($http) {
	  return {
		  	getGuardar: function(data){	
		      return $http({method:'POST',url:'../rest/Usuarios/Guardar',isArray: true,params:{data:data}});
		  	},
		  	getConsultarTodos: function(data){	
			      return $http({method:'POST',url:'../rest/Usuarios/ConsultarTodos',isArray: true});
			  	},
		  	getConsultar: function(data){	
			      return $http({method:'POST',url:'../rest/Usuarios/Consultar',isArray: true, params:{email:data.email,pw:data.password}});
			  	}
	  }
  });