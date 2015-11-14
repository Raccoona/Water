<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>

<#--<@security.authorize access="hasAnyRole('ROLE_CLIENT','ROLE_PROVIDER')">-->
    <#--<@security.authentication property="user.name" var="name"/>-->
<#--</@security.authorize>-->
<header>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand active" href="#">SN</a>
            </div>
            <div>
                <ul class="nav navbar-nav">
                    <li><a id="home" href="#"> Home </a></li>
                <#if user.userRole == "ROLE_CLIENT">
                    <li><a id="provider" href="/providers/get"> Provider </a></li>
                    <li><a id="statistics" href="#">Statistics</a></li>
                <#else>
                    <li><a id="clients" href="clients/get">Clients</a></li>
                </#if>
                    <li><a href="/logout">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</header>