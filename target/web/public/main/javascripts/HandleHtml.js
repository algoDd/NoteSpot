//code for handling html
var app=angular.module('handlingApp',['ui.router']);

app.config(function($stateProvider,$urlRouterProvider)
		{
	$urlRouterProvider.otherwise('home');
	$stateProvider
		.state('about',{
			name: 'about',
			url:'/about',
			templateUrl:'/assets/html/about1.html'
		}).state('home',{
			name: 'home',
			url:'/home',
			templateUrl:'/assets/html/home.html'
		}).state('contact',{
			name: 'contact',
			url:'/about',
			templateUrl:'/assets/html/contact1.html'
		}).state('login',{
			name: 'login',
			url:'/login',
			templateUrl:'/assets/html/login.html'
		}).state('signup',{
			name: 'signup',
			url:'/signup',
			templateUrl:'/assets/html/signup.html'
		});
});
app.controller('handlingCrtl',function($scope,$http){
	$scope.test="hey";
	$scope.renderButton=function(){
		gapi.signin2.render('my-signin2', {
			'scope': 'profile email',
			'width': 240,
			'height': 50,
			'longtitle': true,
			'theme': 'dark',
			'onsuccess': onSuccess,
			'onfailure': onFailure
			}).onSuccess(function(googleUser) {
				console.log('Logged in as: ' + googleUser.getBasicProfile().getName());
				alert("Logged in as: "+ googleUser.getBasicProfile().getName());
				window.location.href="frstup.php";
				}).onFailure(function(error) {
					console.log(error);
				});
	}
	/*$scope.login=function(){
		var user=$scope.username;
		var pass=$scope.password;
		$http({
			method:'GET',
			url:'/api/login'
			
		});
	}*/
	$scope.signup=function(){
		$http({
			method:'POST',
			url:'/api/signup',
			data:{"username":$scope.username,"email_id":$scope.emailId,"password":$scope.password}
		}).success(function(response){
			 alert("Done!");
			}).error(function(response){
				alert(response);
			});
		}
});
