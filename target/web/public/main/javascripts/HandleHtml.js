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
		});
});
app.controller('handlingCrtl',function($scope,$http){
	$scope.test="hey";
	
});
