<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="head.jsp"/>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<div class="container">
    <div class="row align-content-center">
        <div class="col">
            <h2>Road Improvement System - Group 12345</h2>
        </div>

        <div class="col float-md-right">
            <form>
                Username: <input id="username" type="text">
                Password: <input id="password" type="password">
                <input id="submit" class="button" type="button" value="Submit" onclick="checkPassword()">
                <span id="message"></span>
            </form>
        </div>
    </div>
</div>
<hr/>
<div class="container">
    <br/>
    <div class="jumbotron">
        <div class="container">
            <h3>
                Welcome to the Road Improvement System!
            </h3>
        </div>
    </div>

    <br/>
    <div class="alert alert-info text-left" role="alert">
        <div class="update" id="update">
            This is your site. Build your team and your product backlog and start improving your business.
        </div>
    </div>

</div>

<script language="javascript" type="text/javascript">
    function checkPassword() {
        var theUsername = document.getElementById("username").value;
        var thePassword = document.getElementById("password").value;
        if (theUsername == "user" && thePassword == "pass") {
            document.getElementById("message").innerHTML = "Welcome";
            window.location.href = "welcome";
        }
        else if (theUsername.length == 0) {
            document.getElementById("message").innerHTML = "Missing Username"
        }
        else {
            document.getElementById("message").innerHTML = "Incorrect Username/Password. Please try again.";
        }
    }
</script>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>