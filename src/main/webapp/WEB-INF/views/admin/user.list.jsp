<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Users Management</title>
	<jsp:include page="layout/media.jsp"></jsp:include>
</head>
<body class="easyui-layout">
	<jsp:include page="layout/menu.jsp"></jsp:include>
	<jsp:include page="layout/footer.jsp"></jsp:include>
	<div data-options="region:'center',title:'Users Management'">
	
	    <table id="tt" class="easyui-datagrid" url="<c:url value ='/email/admin/user/datagrid'/>" iconCls="icon-save" rownumbers="true" pagination="true">
	        <thead>
	            <tr>
	                <th data-options="field:'username'">Username</th>
	                <th data-options="field:'name'">Name</th>
	                <th data-options="field:'email'">Email</th>
	                <th data-options="field:'phone'">Phone</th>
	                <th data-options="field:'company'">Company</th>
	                <th data-options="field:'address'">Address</th>
	                <th data-options="field:'enable'">Status</th>
	                <th data-options="field:'action'" align="center">Action</th>
	            </tr>
	        </thead>
	    </table>
	    
	</div>
</body>
</html>
