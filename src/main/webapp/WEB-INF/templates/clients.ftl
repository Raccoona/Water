<#if clients??>
<#list clients as c>
    ${c.name} ${c.userRole}
</#list>
</#if>