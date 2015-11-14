<html>

<head>
    <title> Get Excel </title>
    <link rel="stylesheet" href="/resources/css/lib/bootstrap.min.css">
    <script src="/resources/js/lib/jquery-2.1.4.js"></script>
    <script src="/resources/js/custom/excelPage.js"></script>
</head>

<body>
<div class="container">
    <a href="/registration"> Sign up </a>
    <a href="/login"> Sign in </a>
</div>

<div>
<#if user.userRole == "ROLE_PROVIDER">

</#if>

    <input type="hidden" value="${user.id}" id="js-user-id">
    <label for="begin_date">Начало периода</label>
    <input type="date" name="begin_date" id="js-begin_date"/>
    <label for="end_date">Конец периода</label>
    <input type="date" name="end_date" id="js-end_date"/>
    <button id="js-get-excel">Submit</button>
</div>
<script type="text/javascript" src="/resources/js/lib/jquery-2.1.4.js"></script>
<script type="text/javascript" src="/resources/js/lib/bootstrap.min.js"></script>
</body>

</html>