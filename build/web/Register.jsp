<style>
    #heading{font-style: oblique; font-size-adjust: 16px;}
</style>
<jsp:include page="header.jsp"/>
<br><br><center><span id="heading">Registration Form:</span><br>
    <form method="post" action="Reg">
    <table>
        <tr><th>Enter First Name:</th><td><input type="text" name="fname"></td></tr>
        <tr><th>Enter Surname Name:</th><td><input type="text" name="lname"></td></tr>
        <tr><th>Enter Email:</th><td><input type="text" name="email"></td></tr>
        <tr><th>Enter Phone number:</th><td><input type="text" name="phone"></td></tr>
        <tr><th>Enter Password:</th><td><input type="text" id="password" name="password"></td></tr>
        <tr><th>Enter Type:</th><td><table><tr><th><input type="radio" name="typee" value="seller">&nbsp;Seller</th><th><input type="radio" name="typee" value="buyer">&nbsp;Buyer</th></tr></table></td></tr>
        <tr><th>Enter Retype Password:</th><td><input type="text" id="confirm_password" onchange="check_pass();"></td></tr>
        <!--<tr><th>Enter :</th><td><input type="text" name="email"></td></tr>-->
        <tr><th></th><td><input type="submit" id="submit" disabled="true"></td></tr>
    </table>
</form></center>
<jsp:include page="footer.jsp"/>
<script>
    function check_pass() {
    if (document.getElementById('password').value ===
            document.getElementById('confirm_password').value) {
        document.getElementById('submit').disabled = false;
    } else {
        document.getElementById('submit').disabled = true;
    }
}
</script>