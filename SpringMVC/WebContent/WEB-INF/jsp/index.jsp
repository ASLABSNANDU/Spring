<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<title>Spring Page Redirection</title>
</head>

<body>
	<h2>Spring Page Redirection</h2>
	<p>Click below button to redirect the result to new page</p>

	<f:form method="GET" action="redirect">
		<table>
			<tr>
				<td><input type="submit" value="Redirect Page" /></td>
			</tr>
		</table>
	</f:form>
	
	
	
	
	
	 <h2>Spring Landing Pag</h2>
      <p>Click below button to get a simple HTML page</p>
      
      <f:form method = "GET" action = "staticPage">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Get HTML Page"/>
               </td>
            </tr>
         </table>  
      </f:form>
	
</body>

</html>