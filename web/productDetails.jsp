<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<s:setDataSource url="jdbc:mysql://localhost:3306/hpes_project" driver="com.mysql.jdbc.Driver" user="root" password="aayam1"/>
        <jsp:include page="header.jsp"/>
        <br>
        <s:query var="rs">
            select * from books where bid=?
            <s:param value="${sessionScope['bid']}"/>
        </s:query>
            <c:forEach var="r" items="${rs.rows}">
                <s:query var="rs1">
                    select * from userDetails where uid=?
                    <s:param value="${r.sellerId}"/>
                </s:query>
                    <c:forEach var="r1" items="${rs1.rows}">
                        <center><b><span style="font-family: sans-serif; font-style: oblique; font-size: 20px;">Book Details:</span></b><hr style="width: 60px;"<br><br><br><pre style="margin-left: 830px;">Seller: ${r1.fname} ${r1.lname}
                         Contact: ${r1.phone},${r1.mail}</pre><br><table><tr><th>Book's Name:</th><td>${r.bookName}</td></tr><tr></tr><tr><th>Description</th><td>${r.description}</td></tr></table></center>                         

                         <s:update var="a">insert into userHistory values(?,?,?,1)                     
                             <s:param value="${r1.uid}"/>
                        <s:param value="${r1.fname}"/>
                        <s:param value="${r.bookName}"/>
                         </s:update>    
                    </c:forEach>  
            </c:forEach>
                    
                        
        <jsp:include page="footer.jsp"/>