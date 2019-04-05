<jsp:include page="header.jsp"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<s:setDataSource url="jdbc:mysql://localhost:3306/hpes_project" driver="com.mysql.jdbc.Driver" user="root" password="aayam1"/>
<c:set var="id" value="${sessionScope['uid']}"/>
<s:query var="r">select * from userHistory where uid=${id}</s:query>
<center>${sessionScope['name']}'s Logs:<ul>
<c:forEach var="rs" items="${r.rows}">
    <li><c:if test="${rs.transaction==0}">${rs.fname}${rs.lname} has put up ${rs.bookName} to be sold.</c:if>
        <c:if test="${rs.transaction==1}">${rs.fname}${rs.lname} has viewed ${rs.bookName} to buy.</c:if><br></li>
</c:forEach></ul></center>
<jsp:include page="footer.jsp"/>