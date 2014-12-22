<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> Car_Log Repair RegForm</title>
	<script type="text/javascript"> 
		function doSubmit() {
			if(repairFrm.repair_date.value == "") {
				alert("주유일을 입력해주세요.");
				return;
			}
			if(repairFrm.distance.value == "") {
				alert("총주행거리를 입력해주세요.");
				return;
			}
			
			repairFrm.submit();
		}
		
	</script>
 
</head>
<table border="0" width="600px" >
<form name="repairFrm" action="repairReg.do" method="post">
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		날짜
	</td>
	<td align="left" width="20">				
		<input type="text" size="30" maxLength="150" name="repair_date">
	</td>
</tr>
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		총주행거리
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="distance"> Km
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		교체/정비 내역
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="title">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		교체/정비 비용
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="price"> 원
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		정비소
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="repair_shop">
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
