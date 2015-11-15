<#include "main-template.ftl"/>
<#macro m_body>

<div>${user.name}</div>
    <#if user.city??>
    <div>${user.city}</div>
    </#if>
    <#if user.city??>
    <div>${user.mobilePhone}</div>
    </#if>
    <#if user.city??>
    <div>${user.email}</div>
    </#if>

</#macro>
<@main title="Index"/>