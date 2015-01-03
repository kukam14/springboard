<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> Car_Log Parking RegForm</title>
	<script type="text/javascript"> 
		function doSubmit() {
			if(parkingFrm.parking_date.value == "") {
				alert("주차일을 입력해주세요.");
				return;
			}
			if(parkingFrm.place.value == "") {
				alert("주차장을 입력해주세요.");
				return;
			}
			
			parkingFrm.submit();
		}
		
	</script>
 
</head>
<table border="0" width="600px" >
<form name="parkingFrm" action="parkingReg.do" method="post">
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		주차일
	</td>
	<td align="left" width="20">				
		<input type="text" size="30" maxLength="150" name="parking_date">
	</td>
</tr>
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		주차장
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="place">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		주차 시작시간
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="start_time">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		주차 종료시간
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="end_time">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		주차비
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="park_price">
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
