<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/media/themes/default/easyui.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/media/themes/icon.css" />">
<script type="text/javascript"
	src="<c:url value="/resources/media/js/jquery.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/media/js/jquery.easyui.min.js" />"></script>
<script type="text/javascript">
	$(function() {

		$('#tt').tabs({
			border : true,
			onSelect : function(title) {
				//alert(title+' is selected');
			}
		});
	});

	// add tab function
	function addTabs(tabname) {
 		if ($('#tt').tabs('exists', tabname)) {
 			$('#tt').tabs('select', tabname);
 		} else {
			$('#tt').tabs('add', {
				title : tabname,
				content : tabname,
				closable : true
			});
 		}
	}
</script>

