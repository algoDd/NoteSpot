
//code for handling html
var app=angular.module('uploadApp',['naif.base64']);

app.config(['$compileProvider', function($compileProvider) {
	  $compileProvider.aHrefSanitizationWhitelist(/^\s*(https?|ftp|file|blob):|data:application\//);
	}]);

app.controller('uploadCrtl',function($scope,$http,$rootScope){
	
	 $scope.onLoad = function (e, reader, file, fileList, fileOjects, fileObj) {
		    alert('this is handler for file reader onload event!');
		    //console.log(atob(fileObj.base64));
		    $scope.files="data:application/pdf;base64,"+ fileObj.base64;
		    //window.open($scope.files);
		    if(fileObj.filetype=="application/pdf" &&fileObj.filesize<3000000)
		    	{
		    		var size=fileObj.filesize.toString();
		    		$http({
		    			method:"POST",
		    			url:"/api/upload",
		    			data:{"filename":fileObj.filename,"filesize":size,"filetype":fileObj.filetype,"filebase64":fileObj.base64}
		    		}).success(function(response){
		    			alert("file saved");
		    		}).error(function(response){
		    			alert("not able to save");
		    		})
		    	}
		  }
		 
	
});
