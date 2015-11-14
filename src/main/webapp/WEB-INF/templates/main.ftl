<html>

<head>
    <title> SN </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/resources/css/lib/bootstrap.min.css">
</head>

<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand active" href="#">SN</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li><a id="home" href="#"> Home </a></li>
            <#if user.userRole == "ROLE_ClIENT">
                <li><a id="provider" href="#"> Provider </a></li>
                <li><a id="statistics" href="#">Statistics</a></li>
            <#else>
                <li><a id="clients" href="#">Clients</a></li>
            </#if>
                <li><a href="/logout">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>

<div id="content" class="container"> </div>

<script type="text/javascript" src="/resources/js/lib/jquery-2.1.4.js"></script>
<script type="text/javascript" src="/resources/js/lib/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/custom/main.js"></script>

</body>

</html>