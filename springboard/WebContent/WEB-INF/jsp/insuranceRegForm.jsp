<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> Car_Log Insurance RegForm</title>
	<script type="text/javascript"> 
		function doSubmit() {
			if(insurRegFrm.company.value == "") {
				alert("날짜를 입력해주세요.");
				return;
			}
						
			insurRegFrm.submit();
		}
		
	</script>
 
</head>
<table border="0" width="600px" >
<form name="insurRegFrm" action="insuranceReg.do" method="post">
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		보험사
	</td>
	<td align="left" width="20">				
		<input type="text" size="30" maxLength="150" name="company">
	</td>
</tr>
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		보험 시작일
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="insur_start_date">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		보험 종료일
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="insur_end_date">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		보험료
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="insur_price">
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
