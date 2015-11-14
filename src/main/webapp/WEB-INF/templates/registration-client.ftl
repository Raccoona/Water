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
<@sf.form action="/registration-client" method="post" modelAttribute="clientform">
    <div class="form-group">
        <@sf.label path="address"> Login: </@sf.label>
        <@sf.input path="address" cssClass="form-control"/>
        <@sf.errors path="address"/>
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