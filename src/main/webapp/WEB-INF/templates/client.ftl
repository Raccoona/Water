<#include "main-template.ftl"/>
<#macro m_body>
<div>
<h2>${user.name}</h2>
</div>
    <#if bottles??>
        <#list bottles as bottle>
        <div>ID: ${bottle.id}</div>
        <div>Bottle: ${bottle.name}</div>
        <div>LEFT: ${bottle.waterLeft}</div>
        </#list>
    </#if>
</#macro>
<@main title="Clients" customStyles=["/resources/css/lib/bootstrap.min.css"]/>