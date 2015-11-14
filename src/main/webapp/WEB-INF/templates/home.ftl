<html>
<head>

</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand active" href="#">SN</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li><a id="showU" href="#" onclick="doAjaxShowUserHomePage()">${user.name}</a></li>
            <#if user.userRole == "ROLE_ClIENT">
                <li><a id="showF" href="#" onclick="doAjaxShowFriends()">Friends</a></li>
                <li><a id="showOU" href="#" onclick="doAjaxShowOtherUsers()">Other users</a></li>
            <#else>
                <li><a id="showF" href="#" onclick="doAjaxShowFriends()">Clients</a></li>
                <li><a id="showOU" href="#" onclick="doAjaxShowOtherUsers()">Other users</a></li>
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
<#if user.userRole == "ROLE_ClIENT">
    ${user.name}

<#else>
    ${user.name}
</#if>
</body>
</html>