
<style>
    .loginReq{font-size: 20px; color: red;margin-top: 40px;}
    #login{background: #3c6ab7; border-radius: 5px 50px; height: 30px; width: 75px;}
</style>
<jsp:include page="header.jsp"/>
<%="<span class=loginReq><center>You need to Login to Proceed</center></span>"%>
<br><br>
<center><form action="Login" method="post">
    <table>
        <tr>
            <td>Enter Email:</td>
        
            <td>&nbsp;&nbsp;&nbsp;<input type="text" name="mail"></td>
        </tr><tr><td></td><td></td></tr>
        <tr>
            <td>Enter Password:</td>
            <td>&nbsp;&nbsp;&nbsp;<input type="password" name="password"></td>
        </tr>
        <tr>
        <table><tr><td><input type="submit" value="Login" id="login"></td></tr></table>
        </tr>
    </table>
</form>
</center>
<jsp:include page="footer.jsp"/>