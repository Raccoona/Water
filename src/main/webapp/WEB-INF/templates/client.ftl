<#include "main-template.ftl"/>
<#macro m_body>
<div>
    <h2>${user.name}</h2>
</div>
    <input type="hidden" style="display: none" name="userId" value=${client.id}>
    <#if bottles??>
    <div id="waterList">
        <#list bottles as bottle>
        <div>ID: ${bottle.id}</div>
        <div>Bottle: ${bottle.name}</div>
        <div>LEFT: ${bottle.waterLeft}</div>
        </#list>
    </div>
    </#if>
</#macro>
<@main title="Clients" customStyles=["/resources/css/lib/bootstrap.min.css"] customScripts=["/resources/js/custom/info-bottle.js"]/>