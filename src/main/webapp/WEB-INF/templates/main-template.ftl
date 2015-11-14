<#macro main title="Hello!" customScripts=[] customStyles=[]>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/lib/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/resources/css/lib/main.css"/>

    <script src="/resources/js/lib/jquery-2.1.4.js"></script>

    <#list customStyles as style>
        <link rel="stylesheet" type="text/css" href="${style}"/>
    </#list>

    <#list customScripts as script>
        <script src="${script}"></script>
    </#list>

</head>
<body>
<div class="site-wrapper">
    <#include "header.ftl"/>

    <div class="content">
        <div class="container">
            <@m_body/>
        </div>
    </div>
</div>

</body>
</html>
</#macro>