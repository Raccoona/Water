<html>
<head>

</head>
<body>
<#if principal.userRole == "ROLE_CLIENT">
    ${principal.name}asdasd
<#else>
    ${principal.name}
</#if>
</body>
</html>