<#include "main-template.ftl"/>
<#macro m_body>
    <#if provider??>
    <div>Company name: ${provider.name}</div>
    <div>Modile phone : ${provider.mobilePhone}</div>
    </#if>
</#macro>
<@main title="Provider"/>
