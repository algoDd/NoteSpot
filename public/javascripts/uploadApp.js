
//code for handling html
var app=angular.module('uploadApp',['naif.base64']);

app.config(['$compileProvider', function($compileProvider) {
	  $compileProvider.aHrefSanitizationWhitelist(/^\s*(https?|ftp|file|blob):|data:application\//);
	}]);

app.controller('uploadCrtl',function($scope,$http,$rootScope){
	$scope.show=true;
	$http({
		method:"GET",
		url:"/api/uploadFiles",
		
	}).success(function(data){
		$scope.fileuploaded=data;
	}).error(function(response){
		$scope.message="no files to view";
		console.log($scope.message);
	});
	 $scope.onLoad = function (e, reader, file, fileList, fileOjects, fileObj) {
		    alert('this is handler for file reader onload event!');
		    //console.log(atob(fileObj.base64));
		    $scope.files="data:application/pdf;base64,"+ fileObj.base64;
		    //window.open($scope.files);
		    if(fileObj.filetype=="application/pdf")
		    	{
		    		var size=fileObj.filesize.toString();
		    		$http({
		    			method:"POST",
		    			url:"/api/upload",
		    			data:{"filename":fileObj.filename,"filesize":size,"filetype":fileObj.filetype,"filebase64":$scope.files}
		    		}).success(function(response){
		    			alert("file saved");
		    			$http({
		    				method:"GET",
		    				url:"/api/uploadFiles",
		    				
		    			}).success(function(data){
		    				$scope.fileuploaded=data;
		    			}).error(function(response){
		    				$scope.message="no files to view";
		    				console.log($scope.message);
		    			});
		    		}).error(function(response){
		    			alert("not able to save");
		    		});
		    	}
		  }
		 
	
});
