/**
*
*/
function BiduleProvider(){
	
		var x;
		/**
		permet de configurer le provider
		*/
		this.setX :  function setX(xX){
			x= xX; 
		};
/**

*/		
this.$get = ['$http','dependance1','dependance2','dependance3',function($http,dependance1,dependance2,dependance3){
	         // retourne l'objet fabriqué 
			  return {
			 methode1 = function(){
				  
			  }
			  ,
			  methode2 = function(){
				  
			  }
			  ,
			  methode3 = function(){
				  
			  }
			  ,
			  methode4 : function(){
				  
			  }  
			  }
			  
			}];
			
			
			
}
/**
déclare l'objet provider au super provider.
Permet de retourner cet objet 
*/
$provider.provide('bidule',BiduleProvider);
