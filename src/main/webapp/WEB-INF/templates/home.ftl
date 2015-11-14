<#include "main-template.ftl"/>
<#macro m_body>

<#if user.userRole == "ROLE_CLIENT">
<div class="container">
    <table class="table">
        <thead>
            <tr>
                <th>Provider</th>
                <th>Status</th>
                <th>Date</th>
            </tr>
        </thead>
        <tbody>
            <#list waterReqs as w>
            <tr>
                <td>${w.to.name}</td>
                <td>${w.status}</td>
                <#if w.date??>
                    <td>${w.date}</td>
                <#else >
                <td>Provider hasn't accepted ur request yet</td>
                </#if>
            </tr>
            </#list>
        </tbody>
    </table>
</div>
<#else>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>Client</th>
            <th>Status</th>
            <th>Date</th>
        </tr>
        </thead>
        <tbody>
            <#list waterReqs as w>
            <tr>
                <td>${w.from.name}</td>
                <td>${w.status}</td>
                <td>
                    <form role="form" action="/user/request/update" method="post">
                        <input type="hidden" name="waterReqId" style="display: none" value=${w.id}>
                        <input type="date" name="date">
                        <input type="submit" class="btn btn-primary" value="Accept request">
                    </form>
                </td>
            </tr>
            </#list>
        </tbody>
    </table>
</div>
</#if>
</#macro>
<@main title="Index"/>