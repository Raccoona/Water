<#include "main-template.ftl"/>
<#macro m_body>
    <#if provider??>
    ${provider.name} ${provider.userRole}
    </#if>
</#macro>
<@main title="Provider"/>
