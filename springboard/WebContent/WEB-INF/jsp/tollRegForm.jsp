<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> Car_Log Toll RegForm</title>
	<script type="text/javascript"> 
		function doSubmit() {
			if(tollRegFrm.toll_date.value == "") {
				alert("주차일을 입력해주세요.");
				return;
			}
			if(tollRegFrm.toll_road.value == "") {
				alert("주차장을 입력해주세요.");
				return;
			}
			
			tollRegFrm.submit();
		}
		
	</script>
 
</head>
<table border="0" width="600px" >
<form name="tollRegFrm" action="tollReg.do" method="post">
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		날짜
	</td>
	<td align="left" width="20">				
		<input type="text" size="30" maxLength="150" name="toll_date">
	</td>
</tr>
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		이용도로
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="toll_road">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		목적지
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="destination">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		통행료
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="toll_price"> 원
	</td>
</tr>
<tr>
	<td bgcolor="#dddddd" align="center">
		설명
	</td>
	<td>
		<textarea cols="60" rows="15" name="description"></textarea><br/><br/>
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
