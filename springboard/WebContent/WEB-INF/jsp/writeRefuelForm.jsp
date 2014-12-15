<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> Car_Log Refuel RegForm</title>
	<script type="text/javascript"> 
		function doSubmit() {
			if(refuelFrm.refuel_date.value == "") {
				alert("주유일을 입력해주세요.");
				return;
			}
			if(refuelFrm.distance.value == "") {
				alert("총주행거리를 입력해주세요.");
				return;
			}
			
			refuelFrm.submit();
		}
		
	</script>
 
</head>
<table border="0" width="600px" >
<form name="refuelFrm" action="writeRefuel.do" method="post">
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		주유일
	</td>
	<td align="left" width="20">				
		<input type="text" size="30" maxLength="150" name="refuel_date">
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
		주유량
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="gas_liter"> 리터
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		주유비
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="price"> 원
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		단가(리터당)
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="unit_price"> 원
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		주유소
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="gas_station">
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
