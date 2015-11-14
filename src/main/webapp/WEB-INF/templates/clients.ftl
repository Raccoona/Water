<#include "main-template.ftl"/>
<#macro m_body>
    <#if clients??>
    <div class="container">
        <table class="table">
            <tr>
                <#list clients as c> ${c.name}
                    <li>
                    <form role="form" action="/user/client">
                        <input type="text" name="clientId" style="display: none" value=${c.id}>
                        <input type="submit" class="btn btn-primary" value="show info">
                    </form>
                    </li>
                </#list>
            </tr>
        </table>
    </div>
    <#else>
    <div class="panel panel-default">
        <div class="panel-body"> You have no clients yet</div>
    </div>
    </#if>
</#macro>
<@main title="Clients" customStyles=["/resources/css/lib/bootstrap.min.css"]/>