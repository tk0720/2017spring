<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세 보기</h1>
	<div>
		<span>sabun</span>
		<span>${bean.sabun }</span>
	</div>
	<div>
		<span>name</span>
		<span>${bean.name }</span>
	</div>
	<div>
		<span>nalja</span>
		<span>${bean.nalja }</span>
	</div>
	<div>
		<span>pay</span>
		<span>${bean.pay }</span>
	</div>
	<div>
		<a href="edit.do?idx=${bean.sabun }">수정</a>
		<a href="#">삭제</a>
	</div>
</body>
</html>