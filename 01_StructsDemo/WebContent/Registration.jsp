<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<sx:head/>
</head>
<body>
<s:actionerror/>
<s:form action="login" method="post" enctype="multipart/form-data" >

<s:textfield name="username" label="Username"></s:textfield>
<s:password name="password" label="Password"></s:password><br/>
<s:password name="cfmPassword" label="Confirm Password"></s:password><br/>
<s:textfield name="age" key="age" size="20" />
 
 <s:radio list="{'male','female'}" name="gender" label="Gender"></s:radio>  

 <s:checkboxlist label = "Hobbies" name = "hobbies"
         list = "{'Swimining','Dancing','Cooking' , 'Reading' , 'others'}" />
         
  <s:textfield name="mobile" label="Enter valid number"></s:textfield>  <br/>     
 <s:textfield name="email" label="Enter Email Id"></s:textfield>   
 <br/>
 
 <sx:datetimepicker name="dob" label="Date(dd-MMM-yyyy)" 
displayFormat="dd-MMM-yyyy" /> 
         
 <s:select list="{'Java','PHP','Python'}" name="skills" multiple="true" label="Skills"></s:select>
 
 
 <s:doubleselect list="{'Developer','Manager','Tester'}" name="doubleSelectRole" 
	doubleList="top == 'Developer' ? {'Java','PHP'} : (top == 'Manager' ? {'HR Manager', 'Finance Manager'} : {'UI Testing', 'Functional Testing'})" 
	doubleName="doubleSelectExpertise" label="Occupation"></s:doubleselect>

	<s:textarea name="bio" label="About Yourself" cols="20" rows="3" wrap="true"></s:textarea><br/>
	<s:file name="userImage" label="upload file"></s:file>
	 
	<s:submit value="register"></s:submit>
	<s:submit value ="clear"></s:submit>

<s:submit value="login"></s:submit>
</s:form>
</body>
</html>