<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html ng-app="demo">
	<head>
		<title>Hello AngularJS</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.min.js"></script>
    	<script src="angular.jsp"></script>
	</head>

	<body>
		<div ng-controller="Hello">
			<p>The ID is {{greeting.id}}</p>
			<p>The content is {{greeting.content}}</p>
		</div>
	</body>
</html>