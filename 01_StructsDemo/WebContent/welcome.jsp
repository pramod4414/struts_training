<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>

<body>
<s:if test="hasActionMessages()">
<s:actionmessage/>

</s:if>

.....WELCOME TO OUR WORLD.....<br/>
<br/><br/>
USERNAME :-<s:property value="username"></s:property><br/>
 GENDER :-<s:property value="gender"></s:property><br/>
 AGE :-<s:property value="age"></s:property><br/>
 
 file uploaded succesfully
 User 
 
 User Image: <s:property value="userImage" /><br/>  
        Content Type:<s:property value="userImageContentType" /><br/>  
        File Name:  <s:property value="userImageFileName" /><br/>  
        Uploaded Image: <img src="userimages/<s:property value="userImageFileName"/>"   
                                                     width="100" height="100" />                  

 
<%-- HOBBIES :-<s:property value="hobbies"></s:property><br/>

DATE OF BIRTH :-<s:property value="dob"></s:property><br/>
SKILLS :-<s:property value="skills"></s:property><br/>
ROLE :-<s:property value="doubleSelectRole"></s:property><br/>
EXPERTISE :-<s:property value="doubleSelectExpertise"></s:property><br/>
BIO :-<s:property value="bio"></s:property><br/>
  --%>
  
  
<a href="HelloPage.jsp">click here for more</a>
</body>

</html>