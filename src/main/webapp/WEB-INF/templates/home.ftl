<html>
<head>

</head>
<body>
<#if principal.role == "ROLE_CLIENT">
    principal.name
    principal.role
<#else>
    principal.name
    principal.role
</#if>
</body>
</html>