<#include "main-template.ftl"/>
<#macro m_body>

<#if user.userRole=="ROLE_CLIENT">
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                <th> Provider </th>
                <th> Status </th>
                <th> Date </th>
                </tr>
            </thead>
            <tbody>
                <#list waterReq as w>
                <tr>
                    <td> ${w.to.name} </td>
                    <td> ${w.status} </td>
                    <td> <#if w.date??> ${w.date} <else> No date yet </#if> </td>
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
            <th> Provider </th>
            <th> Status </th>
            <th> Date </th>
            </tr>
            </thead>
            <tbody>
                <#list waterReq as w>
                <tr>
                    <td> ${w.to.name} </td>
                    <td> ${w.status} </td>
                    <form action="">
                        <input type="hidden" name="waterReqId" style="display: none" value=${w.id}>
                        <input type="date" name="date">
                        <input type="submit" class="btn btn-primary" value="Accept request">
                    </form>
                </tr>
                </#list>
            </tbody>
        </table>
    </div>
</#if>

</#macro>
<@main title="Index"/>