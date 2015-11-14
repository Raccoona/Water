<#include "main-template.ftl"/>
<#macro m_body>
<br>
<#list bottles as bottle>
ID: ${bottle.id} Bottle: ${bottle.name}, LEFT: ${bottle.waterLeft} <br>
</#list>
</#macro>
<@main title="Index"/>