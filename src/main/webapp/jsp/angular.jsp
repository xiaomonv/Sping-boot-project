
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div ng-app="myApp" ng-controller="studentCtrl">

		<table border="1">
			<tr>
				<th>Roll no</th>
				<th>Name</th>
				<th>Field</th>
				<th>Course</th>
				<th>Address</th>
			<tr ng-repeat="x in names">
				<td>{{x.roll_no}}</td>
			</tr>
			<!-- 	<td>{{x.student_name}}</td>
				<td>{{x.student_field}}</td>
				<td>{{x.student_course}}</td>
				<td>{{x.student_address}}</td> -->
			</tr>
		</table>
	</div>
<%out.println("Hello"); %>
	<script type="text/javascript" src= "http://localhost:8080/getStudentDetails" >
		var app = angular.module('myApp', []);
		app.controller('studentCtrl', function($scope, $http) {
			 function _refreshPageData() {
		            $http({ method : 'GET',url : 'http://localhost:8080/getStudentDetails'}).then(function successCallback(response) {
		                $scope.employees = response.data.employees;
		            }, function errorCallback(response) {
		                console.log(response.statusText);
		            });
		        }
		/* 	$http.get("http://localhost:8080/addStudentDetails").then(
					function(response) {
						$scope.names = response.data.records;
					}); */
		});
       
	</script>
</body>
</html>