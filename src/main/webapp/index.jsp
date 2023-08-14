<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Spring MVC</title>
	</head>
	<body>
		<h1>환영합니다!</h1>
		<h2>Spring MVC 페이지입니다.</h2>
		<c:if test="${memberId ne null }">
			${memberName }님 환영합니다.
			<a href="/member/logout.do">로그아웃</a> <br>
			<a href="/member/mypage.do?memberId=${memberId }">마이페이지</a>
		</c:if>
		<c:if test="${memberId eq null }">
			<form action="/member/login.do" method="post">
				ID : <input type="text" name="memberId"><br>
				PW : <input type="password" name="memberPw"><br>
				<input type="submit" value="로그인">
			</form>
		</c:if>
	</body>
</html>