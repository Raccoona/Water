<#include "main-template.ftl"/>
<#macro m_body>
<div>
${user.name}
</div>
    <#if bottles??>
        <#list bottles as bottle>
        ${bottle.name}
        ${bottle.user.name}
        ${bottle.waterLeft}
        </#list>
    </#if>
</#macro>
<@main title="Clients" customStyles=["/resources/css/lib/bootstrap.min.css"]/>