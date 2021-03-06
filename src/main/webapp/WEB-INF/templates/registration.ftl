<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<html>
<head>
    <title> Registration </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/resources/css/lib/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h3> Welcome to registration page! </h3>
<@sf.form action="/registration" method="post" modelAttribute="userform">
    <div class="form-group">
        <@sf.label path="name"> Company name: </@sf.label>
        <@sf.input path="name" cssClass="form-control"/>
        <@sf.errors path="name"/>
    </div>
    <div class="form-group">
        <@sf.label path="userRole"> Role: </@sf.label>
        <@sf.select path="userRole" cssClass="form-control">
            <@sf.option value=0> Client </@sf.option>
            <@sf.option value=1> Provider </@sf.option>
        </@sf.select>
        <@sf.errors path="userRole"/>
    </div>
    <div class="form-group">
        <@sf.label path="city"> City: </@sf.label>
        <@sf.input path="city" cssClass="form-control"/>
        <@sf.errors path="city"/>
    </div>
    <div class="form-group">
        <@sf.label path="mobilePhone"> Mobile: </@sf.label>
        <@sf.input path="mobilePhone" cssClass="form-control"/>
        <@sf.errors path="mobilePhone"/>
    </div>
    <div class="form-group">
        <@sf.label path="email"> Email: </@sf.label>
        <@sf.input path="email" cssClass="form-control"/>
        <@sf.errors path="email"/>
    </div>
    <div class="form-group">
        <@sf.label path="login"> Login: </@sf.label>
        <@sf.input path="login" cssClass="form-control"/>
        <@sf.errors path="login"/>
    </div>
    <div class="form-group">
        <@sf.label path="password"> Password: </@sf.label>
        <@sf.password path="password" cssClass="form-control"/>
        <@sf.errors path="password"/>
    </div>
    <div class="form-group">
        <@sf.label path="repassword"> Confirm password: </@sf.label>
        <@sf.password path="repassword" cssClass="form-control"/>
        <@sf.errors path="repassword"/>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</@sf.form>
</div>
<script type="text/javascript" src="/resources/js/lib/jquery-2.1.4.js"></script>
<script type="text/javascript" src="/resources/js/lib/bootstrap.min.js"></script>
</body>
</html>