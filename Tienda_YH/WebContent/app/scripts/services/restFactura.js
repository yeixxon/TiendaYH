'use strict';

/**
 * @ngdoc service
 * @name projectCeibaApp.consultProjects
 * @description
 * # consultProjects
 * Factory in the projectCeibaApp.
 */
angular.module('ventasApp')
  .factory('restFactura', function ($http) {
	  return {
		  	getGuardar: function(data){	
		      return $http({method:'POST',url:'../rest/Factura/Guardar',isArray: true,params:{data:data}});
		  	},
		  	getConsultarTodos: function(data){	
			      return $http({method:'POST',url:'../rest/Factura/ConsultarTodos',isArray: true});
			  	},
		  	getConsultar: function(data){	
			      return $http({method:'POST',url:'../rest/Factura/Consultar',isArray: true, params:{id:data.id,pw:data.pw}});
			  	}
	  }
  });