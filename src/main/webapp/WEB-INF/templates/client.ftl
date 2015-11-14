<#include "main-template.ftl"/>
<#macro m_body>
<div>
${user.name}
</div>
    <#if bottles??>
        <#list bottles as bottle>
        ${bottle.name}<br/>
        ${bottle.user.name}<br/>
        ${bottle.waterLeft}<br/>
        <br/>
        <br/>
        </#list>
    </#if>
</#macro>
<@main title="Clients" customStyles=["/resources/css/lib/bootstrap.min.css"]/>