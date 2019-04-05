<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<s:setDataSource url="jdbc:mysql://localhost:3306/hpes_project" driver="com.mysql.jdbc.Driver" password="aayam1" user="root"/>
<s:query var="r">select * from loginDetails;</s:query>
<style>
            .page_header form{margin-left: 900px;margin-top: 0px;}
            .page_header span {font-size: 12px;} 
            .page_header input{width: 85px;}
            .page_header #login{width: 70px;border-radius: 5px 50px;background: #3498DB;border-color: white;}
            .page_header #register{margin-left: 900px; width: 70px; border-radius: 5px 50px;background: #3498DB;border-color: white;padding: 8px;}
            .page_header{background: #3498DB; border-radius: 15px;}
            .page_header .PageName{font-family: fantasy;font-size: 60px;padding: 10px;}
            #user{margin-left: 900px;border-radius: 5px 50px;background: #3498DB;border-color: white;}
</style>
<div class="page_header">
    <div class="PageName">Old Books</div>
<c:choose>
<c:when test="${sessionScope['name']==null}">
    <form action="Login" method="post"><table><tr><td><span>Email:</span></td><td><span>Password:</span></td></tr><tr><td><input type="text" name="mail" id="mail"></td><td><input id="passwor2d" type="password" name="password"></td><td><input type="submit" value="Login" id="login"></td></tr></table></form>
    <a href="Register.jsp"><button id="register" type="button" name="Register">Register</button></a>
    </c:when>   
    <c:otherwise>
    <a href="userPage.jsp"><button type="button" id="user">${sessionScope['name']}</button></a>
    </c:otherwise>
    </c:choose>
</div>
<!--<table width="90%" height="30%"><tr bgcolor="#3c6ab7"><th>Old Books</th><th></th></tr>
    <tr><td></td><td></td></tr></table>-->