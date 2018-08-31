<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="head.jsp"/>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<div class="container">
    <div class="row">
        <div class="cols">
            <h2>Road Improvement System</h2>
        </div>
        <div class="cols">
            You are now logged in!
        </div>

    </div>
</div>

<hr/>

<div class="container">
    <div class="row">
        <div class="col">
            <h2>Welcome to the road improvement system site.</h2>
        </div>
        <div class="col">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                Book recommendation
            </button>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Recommended!</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <h3>You should check out Extreme Programming Installed</h3>
                <p class="title">It's a great book</p>
                <p>It's written by Ron Jeffries, Ann Anderson and Chet Hendrickson</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>