<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Users Management</title>
	<jsp:include page="layout/media.jsp"></jsp:include>
</head>
<body class="easyui-layout">
	<jsp:include page="layout/top_menu.jsp"></jsp:include>
	<jsp:include page="layout/menu.jsp"></jsp:include>
	<jsp:include page="layout/footer.jsp"></jsp:include>
	
	<!-- 	This is page body -->
	
	<div data-options="region:'center'" border="false">
	    <div id="tt" class="easyui-tabs" style="width:500px;height:500px;" fit="true">
		    <div title="Welcome" style="padding:0px;">
		        <table id="user-list" class="easyui-datagrid"></table>
		    
				    <script type="text/javascript">
					    jQuery('#user-list').datagrid({
					        url:"<c:url value ='/email/admin/user/datagrid'/>",
					        iconCls : "icon-save",
					        pageSize : 10,
					        pageList : [10,20,50,100,150,200,250],
					        fit : true,
					        singleSelect : true,
					        rownumbers : true,
					        pagination : true,
					        columns:[[
					            {field:'username',title:'Username',width:200},
					            {field:'name',title:'Name',width:200},
					            {field:'email',title:'Email',width:150},
					            {field:'phone',title:'Phone',width:150},
					            {field:'company',title:'Company',width:150},
					            {field:'address',title:'Address',width:150},
					            {field:'enable',title:'Status',width:50},
					            {field:'action',title:'Action',width:100,align:'center'}
					        ]]
					    });
				    </script>
		    </div>
	    
		</div>
	    
	</div> 
	
</body>
</html>
