<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"/>
<s:set property="typee" value="seller" scope="page" var="typee"/>
<s:if test="${sessionScope['type']!=typee}">
    <jsp:forward page="login.jsp"  />
</s:if>
<center><form action="Upload" method="post">
        <table><tr><th>Enter Name of The Book</th><td><input type="text" name="bname"></td></tr>
            <tr><th>Enter a Short Description&nbsp;&nbsp;(max. 80 char)</th><td><input type="text" name="desc"></td></tr>
            <!--<tr><th>Upload a Cover Picture</th><td><input type="file" name="pic"></td></tr>-->
            <tr><th></th><td><input type="submit" value="Submit"></td></tr></table>
    </form></center>
<jsp:include page="footer.jsp"/>