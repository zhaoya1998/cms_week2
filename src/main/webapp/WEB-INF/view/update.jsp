<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/index_work.css" />
<link href="<%=request.getContextPath()%>/css/index_work.css"
	rel="stylesheet">
<!-- 引入样式 -->
<link href="/resource/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript">
function update() {
	var formData = new FormData($("#form1")[0]);
	$.ajax({
		type : "post",
		url : "/update",
		data : formData,
		processData : false,
		contentType : false,
		success : function(flag) {
			if (flag) {
				alert("修改成功");
				location.href = "/list";
			} else {
				alert("修改失败");
				return;
			}
		}
	})
}
</script>
</head>
<body>
	<h1>审核记录</h1>
	<form action="update" method="post" id="form1">
		<table>
			<tr>
				<td>编号<input type="text" name="id" value="${company.id }"></td>
			</tr>
			<tr>
				<td>关键字<input type="text" name="keywords"
					value="${company.keywords }"></td>
			</tr>
			<tr>
				<td>描述<input type="text" name="description"
					value="${company.description }"></td>
			</tr>
			<tr>
				<td>公司名称<input type="text" name="name" value="${company.name }"></td>
			</tr>
			<tr>
				<td>主营产品<input type="text" name="goods" value="${company.goods }"></td>
			</tr>
			<tr>
				<td>地址<input type="text" name="addr" value="${company.addr}"></td>
			</tr>
			<tr>
				<td>注册资本(万元)<input type="text" name="price"
					value="${company.price }"></td>
			</tr>
			<tr>
				<td>成立时间<input type="text" name="date" value="${company.date }"></td>
			</tr>
			<tr>
				<td>年检状态:<select name="status">
				<option value=" ">请选择</option>
						<option value="通过">通过</option>
						<option value="未通过">未通过</option>
						<option value="待定">待定</option>
				</select></td>
			</tr>
			<tr>
			   <td>
			     备注:<input type="text" nam="beizhu" value="${company.beizhu}">
			   </td>
			</tr>
			<tr>
			  <td><input type="submit" value="审核" onclick="update()"></td>
			</tr>
		</table>
	</form>
</body>
</html>