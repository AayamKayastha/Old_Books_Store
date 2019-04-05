<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>

<s:setDataSource url="jdbc:mysql://localhost:3306/hpes_project" driver="com.mysql.jdbc.Driver" password="aayam1" user="root"/>
<jsp:include page="header.jsp"/>
<s:query var="rs">select * from books</s:query>
    <center><table>
<c:forEach var="r" items="${rs.rows}">
    <tr><th><a href="ProductView?bid=${r.bid}">${r.bookName}</a></th><td>${r.description}</td></tr><tr></tr>
</c:forEach>
        </table></center>
<jsp:include page="footer.jsp"/>