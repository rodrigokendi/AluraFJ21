<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ attribute name="data" required="true" %>

<input type="text" id="${data}" name="${data}" />
<script>
$("#${data}").datepicker({dateFormat: 'dd/mm/yy',changeMonth : true, changeYear : true});
</script>