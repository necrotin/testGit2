<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
보드리스트다~
<table>
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>글쓴이</th>
		<th>내용</th>
		<th>작성일</th>
	</tr>
	<c:forEach items="${boardList }" var="board">
		<tr>
			<td>${board.bo_no }</td>
			<td>${board.bo_title }</td>
			<td>${board.bo_writer }</td>
			<td>${board.bo_content }</td>
			<td>${board.bo_date }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>