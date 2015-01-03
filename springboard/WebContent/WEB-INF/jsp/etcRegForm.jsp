<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title> Car_Log Etc RegForm</title>
	<script type="text/javascript"> 
		function doSubmit() {
			if(etcRegFrm.etc_date.value == "") {
				alert("날짜를 입력해주세요.");
				return;
			}
			if(etcRegFrm.title.value == "") {
				alert("주차장을 입력해주세요.");
				return;
			}
			
			etcRegFrm.submit();
		}
		
	</script>
 
</head>
<table border="0" width="600px" >
<form name="etcRegFrm" action="etcReg.do" method="post">
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		날짜
	</td>
	<td align="left" width="20">				
		<input type="text" size="30" maxLength="150" name="etc_date">
	</td>
</tr>
<tr>
	<td width="30%" bgcolor="#dddddd" align="center">
		내역
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="title">
	</td>
</tr>
<tr>
	<td width="10%" bgcolor="#dddddd" align="center">
		비용
	</td>
	<td align="left" height="30">				
		<input type="text" size="30" maxLength="150" name="etc_price"> 원
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
