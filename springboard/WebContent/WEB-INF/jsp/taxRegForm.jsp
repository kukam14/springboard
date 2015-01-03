<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> Car_Log Tax RegForm</title>
	<script type="text/javascript"> 
		function doSubmit() {
			if(taxRegFrm.tax_date.value == "") {
				alert("날짜를 입력해주세요.");
				return;
			}
			if(taxRegFrm.tax_price.value == "") {
				alert("주차장을 입력해주세요.");
				return;
			}
			
			taxRegFrm.submit();
		}
		
	</script>
 
</head>
<table border="0" width="600px" >
<form name="taxRegFrm" action="taxReg.do" method="post">
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		납부일
	</td>
	<td align="left" width="20">				
		<input type="text" size="30" maxLength="150" name="tax_date">
	</td>
</tr>
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		자동차세
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="tax_price">
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="button" value="저장" onclick="doSubmit()">
	</td>
	
</tr>
</form>
</table>
</html>
