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
<div class="wrapper">
<footer>
    <div class="container">
        <a href="#" class="scrollpoint sp-effect3">
            <img src="/resources/img/freeze/logo.png" alt="" class="logo">
        </a>

        <div class="social">
            <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-twitter fa-lg"></i></a>
            <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-google-plus fa-lg"></i></a>
            <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-facebook fa-lg"></i></a>
        </div>
        <div class="rights">
            <p>Copyright &copy; 2014</p>

            <p>Template by <a href="http://www.scoopthemes.com" target="_blank">ScoopThemes</a></p>
        </div>
    </div>
</footer>
</div>
</#macro>