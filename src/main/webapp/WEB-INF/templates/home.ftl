<#include "main-template.ftl"/>
<#macro m_body>
    <#if role == "client">
    principal.name
    here client
    <#--client profile-->

    <#else>
    principal.name
    here profile
    <#--provider profile-->

    </#if>
</#macro>
<@main title="Регистрация"/>