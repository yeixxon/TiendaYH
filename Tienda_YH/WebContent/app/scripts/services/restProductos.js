'use strict';

/**
 * @ngdoc service
 * @name projectCeibaApp.consultProjects
 * @description
 * # consultProjects
 * Factory in the projectCeibaApp.
 */
angular.module('ventasApp')
  .factory('restProductos', function ($http) {
	  return {
		  	getGuardar: function(data){	
		      return $http({method:'POST',url:'../rest/Producto/Guardar',isArray: true,params:{data:data}});
		  	},
		  	getConsultarTodos: function(data){	
			      return $http({method:'POST',url:'../rest/Producto/ConsultarTodos',isArray: true});
			  	},
		  	getConsultar: function(data){	
			      return $http({method:'POST',url:'../rest/Producto/Consultar',isArray: true, params:{id:data.id,pw:data.pw}});
			  	}
	  }
  });