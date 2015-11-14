<#include "main-template.ftl"/>
<#macro m_body>
<div>
    <div><h2>${user.name}</h2></div>
    <br/>
    <br/>
</div>
    <#if bottles??>
        <#list bottles as bottle>
        <div>Bottle: ${bottle.name}</div>
        <div>LEFT:${bottle.waterLeft}</div>
        <br/>
        <br/>
        </#list>


    </#if>
</#macro>
<@main title="Clients" customStyles=["/resources/css/lib/bootstrap.min.css"]/>