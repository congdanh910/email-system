<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <div title="OptionList" style="padding:0px; height:100%">
		        <table id="option-list" class="easyui-datagrid"></table>
		    
				    <script type="text/javascript">
					    jQuery('#option-list').datagrid({
					        url:"<c:url value ='/admin/option/datagrid'/>",
					        iconCls : "icon-save",
					        pageSize : 10,
					        pageList : [10,20,50,100,150,200,250],
					        fit : true,
					        singleSelect : true,
					        rownumbers : true,
					        pagination : true,
					        columns:[[
					            {field:'optionName',title:'Option Name',width:100},
					            {field:'optionValue',title:'Option Value',width:100},
					        ]]
					    });
				    </script>
		    </div>
