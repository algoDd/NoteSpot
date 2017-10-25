/**
 * 
 */
var app=angular.module("adminApp",[]);
app.controller("adminCrtl",function($scope,$http){
	$scope.adminname="";
	$scope.adminemail="";
	$scope.message="";
	$scope.addAdmin=function(){
		if($scope.adminname!="" && $scope.adminemail!="")
		{
			$http({
				method : 'POST',
				url : '/api/addAdmin',
			    data : {'adminname' : $scope.adminname,'adminemail':$scope.adminemail}
			}).success(function(response){
				$scope.message=response;
				
			}).error(function(response){ $scope.message="Invalid!!!";});
			
		}	 
		else
	    { $scope.message="EMPTY FIELDS YOU IDIOT!!!";}
	}
});