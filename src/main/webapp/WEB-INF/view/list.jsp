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
   function update(id) {
	location.href="toUpdate?id="+id
}
</script>
</head>
<body>
<form action="list" method="post">
   编号:<input type="text" name="id" value="${vo.id }">
   关键字:<input type="text" name="keywords" value="${vo.keywords }">
   描述:<input type="text" name="description" value="${vo.description }">
   公司名称:<input type="text" name="name" value="${vo.name }"> 
  主营产品:<input type="text" name="goods" value="${vo.goods }">
  地址:<input type="text" name="addr" value="${vo.addr }">
  注册资本:<input type="text" name="startPrice" value="${vo.startPrice }">--<input type="text" name="endPrice" value="${vo.endPrice }">
  成立时间:<input type="text" name="startDate" value="${vo.startDate }">--<input type="text" name="endDate" value="${vo.endDate }">
  年检日期:<input type="text" name="startCheck" value="${vo.startCheck }">--<input type="text" name="endCheck" value="${vo.endCheck }">
  状态:<select name="status">
						<option value="通过">通过</option>
						<option value="未通过">未通过</option>
						<option value="待定">待定</option>
				</select>
   <input type="submit" value="查询">
</form>
	<table class="table table-dark"s">
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>描述</td>
			<td>公司名称</td>
			<td>主管产品</td>
			<td>地址</td>
			<td>注册资本(万元)</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年检状态</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${info.list }" var="c">
			<tr>
				<td>${c.id }</td>
				<td>${c.keywords }</td>
				<td>${c.description }</td>
				<td>${c.name }</td>
				<td>${c.goods }</td>
				<td>${c.addr }</td>
				<td>${c.price }</td>
				<td>${c.date }</td>
				<td>${c.check }</td>
				<td>${c.status }</td>
				<td>${c.beizhu }</td>
				<td><input type="button" value="年检审核" onclick="update(${c.id})"></td>
			</tr>
		</c:forEach>
		<tr>
		  <td colspan="100" align="center">
		     当前是${info.pageNum }/${info.pages }页--共${info.total }条数据
		     <a href="list?pageNum=1">首页</a>
		     <a href="list?pageNum=${info.prePage }">上一页</a>
		     <a href="list?pageNum=${info.nextPage }">下一页</a>
		     <a href="list?pageNum=${info.pages }">尾页</a>
		  </td>
		</tr>
	</table>
</body>
</html>