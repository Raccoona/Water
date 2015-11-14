<html>
<body>
    <#if role == "client">
    principal.name
    here client
    <#--client profile-->

    <#else>
    principal.name
    here profile
    <#--provider profile-->

    </#if>
</body>
</html>