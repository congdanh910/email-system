<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div data-options="region:'west',split:true" title="Navigation" style="width:180px;">
 	<ul class="easyui-tree">
        <li>
            <span>Information</span>
            <ul>
            	<li><a href="#" onclick="addTabs('Welcome')">welcome.html</a></li>
                <li><a href="#" onclick="addTabs('User', '<c:url value ='/admin/user/list'/>')">User account</a></li>
                <li><a href="#" onclick="addTabs('TimeSheet', '<c:url value=''/>')">TimeSheet</a></li>
                <li><a href="#" onclick="addTabs('Option List', '<c:url value="/admin/option/list"/>')">Option list</a></li>
                <li><a href="#" onclick="addTabs('Help')">help.html</a></li>
            </ul>
        </li>
    </ul>
</div>