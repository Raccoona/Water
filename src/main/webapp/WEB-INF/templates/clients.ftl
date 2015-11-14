<#if clients??>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th>name</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <#list clients as c>
                    <tr>
                        <td> ${c.name} </td>
                        <td>
                            <form role="form" action="/user/client">
                                <input type="text" name="clientId" style="display: none" value=${c.id} >
                                <input type="submit" class="btn btn-primary" value="show info">
                            </form>
                        </td>
                    </tr>
                </#list>
            </tbody>
        </table>
    </div>
<#else>
<div class="panel panel-default">
    <div class="panel-body"> You have no clients yet </div>
</div>
</#if>