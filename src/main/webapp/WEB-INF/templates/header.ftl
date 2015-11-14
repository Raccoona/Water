<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>

<#--<@security.authorize access="hasAnyRole('ROLE_CLIENT','ROLE_PROVIDER')">-->
<#--<@security.authentication property="user.name" var="name"/>-->
<#--</@security.authorize>-->
<header>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
            </div>
            <div>
                <ul class="nav navbar-nav">
                <#if user??>
                    <li><a id="home" href="/user/home"> Home </a></li>
                    <#if user.userRole == "ROLE_CLIENT">
                        <li><a id="provider" href="user/providers/get"> Provider </a></li>
                        <li><a id="statistics" href="#">Statistics</a></li>
                    <#else>
                        <li><a id="clients" href="/user/clients/get">Clients</a></li>
                    </#if>
                    <li><a href="/logout">Logout</a></li>
                <#else>
                    <a href="/registration">Зарегистрироваться</a> или <a href="/login">Войти</a>
                </#if>
                </ul>
            </div>
        </div>
    </nav>
</header>