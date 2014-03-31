<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <div title="Welcome" style="padding:0px; height: 100%">
		        <table id="user-list" class="easyui-datagrid"></table>
				    <script type="text/javascript">
					    jQuery('#user-list').datagrid({
					        url:"<c:url value ='/admin/user/datagrid'/>",
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
	    

