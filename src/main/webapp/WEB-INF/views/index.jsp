<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="head.jsp"/>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<div class="container">
    <div>Group 12345</div>
    <br/>
    <div class="jumbotron">
        <div class="container">
            <h3>
                Welcome to the Road Improvement System!<br/>
                The best site for information on pot holes.
            </h3>
        </div>
    </div>

    <br/>
    <div class="alert alert-info text-left" role="alert">
        <div class="update" id="update">
            This is your team's site. Build your team and your product backlog and start improving your business.
        </div>
    </div>

</div>

<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>