<#include "main-template.ftl"/>
<#macro m_body>


<div id="content" class="container">
    <#if waterRequests??>
        <h3> Заявки</h3>
        <#list waterRequests as request>
            <p>Отправлена заявка. Статус: ${request.status}</p>
        </#list>
    </#if>

</div>
</#macro>
<@main title="Profile" customScripts=["/resources/js/lib/bootstrap.min.js", "/resources/js/custom/main.js"]/>

