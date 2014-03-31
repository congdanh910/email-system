<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		    <div title="TimeSheet" style="padding:0px;">
		        <table id="user-list" class="easyui-datagrid"></table>
		    
				    <script type="text/javascript">
					    jQuery('#user-list').datagrid({
					        url:"<c:url value ='/timesheet'/>",
					        iconCls : "icon-save",
					        pageSize : 10,
					        pageList : [10,20,50,100,150,200,250],
					        fit : true,
					        singleSelect : true,
					        rownumbers : true,
					        pagination : true,
					        columns:[[
					            {field:'thu2',title:'Thứ 2',width:100, 
					            		editor:{type:'combobox',
					            				options:{
					            						valueField:'optionId',
					            						textField:'optionName',
					            						url:'',
					            						required:true
					            						}
					            				}
					            },
					            {field:'thu3',title:'Thứ 3',width:100},
					            {field:'thu4',title:'Thứ 4',width:100},
					            {field:'thu5',title:'Thứ 5',width:100},
					            {field:'thu6',title:'Thứ 6',width:100},
					            {field:'thu7',title:'Thứ 7',width:100},
					            {field:'nghikophep',title:'Nghỉ không phép',width:100},
					            {field:'nghicophep',title:'Nghỉ có phép',width:100,align:'center'},
					            {field:'tongcong',title:'', width:100, align:'right'}
					        ]]
					    });
				    </script>
		    </div>
