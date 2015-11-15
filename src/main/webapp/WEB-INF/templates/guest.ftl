<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<!doctype html>
<!--[if lt IE 7]>
<html lang="en" class="no-js ie6"><![endif]-->
<!--[if IE 7]>
<html lang="en" class="no-js ie7"><![endif]-->
<!--[if IE 8]>
<html lang="en" class="no-js ie8"><![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->

<head>
    <meta charset="UTF-8">
    <title>Oleose App Landing Page | Bootstrap Theme</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <link rel="shortcut icon" href="/resources/favicon.png">

    <link rel="stylesheet" href="/resources/css/cool/bootstrap.css">
    <link rel="stylesheet" href="/resources/css/cool/modal.css">

    <link rel="stylesheet" href="/resources/css/cool/animate.css">
    <link rel="stylesheet" href="/resources/css/cool/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/css/cool/slick.css">
    <link rel="stylesheet" href="/resources/js/cool/rs-plugin/css/settings.css">

    <link rel="stylesheet" href="/resources/css/cool/freeze.css">


    <script type="text/javascript" src="/resources/js/cool/modernizr.custom.32033.js"></script>

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<div id="dark-bg">
</div>
<div id="content-body">
    <div id="right">
        <h3>Присоедениться</h3>


    <#--<form class="form-horizontal">-->
    <#--<div class="form-group">-->
    <#--<div class="col-lg-12">-->
    <#--<input type="text" class="form-control form-block" placeholder="Enter your username">-->
    <#--</div>-->
    <#--</div>-->
    <#--<div class="form-group">-->
    <#--<div class="col-lg-12">-->
    <#--<input type="text" class="form-control form-block" placeholder="Enter your email address">-->
    <#--</div>-->
    <#--</div>-->
    <#--<div class="form-group">-->
    <#--<div class="col-lg-12">-->
    <#--<input type="text" class="form-control form-block" placeholder="Enter your password">-->
    <#--</div>-->
    <#--</div>-->
    <#--<div class="form-group">-->
    <#--<div class="col-lg-12">-->
    <#--<input type="text" class="form-control form-block" placeholder="Retype your password">-->
    <#--</div>-->
    <#--</div>-->
    <#--<div class="form-group">-->
    <#--<div class="col-lg-12">-->
    <#--<input type="submit" value="Отправить">-->
    <#--</div>-->
    <#--</div>-->
    <#--</form>-->
    <#--</div>-->
    <@sf.form action="/registration" cssClass="form-horizontal" method="post" modelAttribute="userform">

        <div class="form-group">
            <div class="col-lg-12">
                <@sf.input path="name" cssClass="form-control form-block" placeholder="Enter your username" />
                    <@sf.errors path="name"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-lg-12">
                <@sf.select path="userRole" cssClass="form-control">
                    <@sf.option value=0> Client </@sf.option>
                    <@sf.option value=1> Provider </@sf.option>
                </@sf.select>
                <@sf.errors path="userRole"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-lg-12">
                <@sf.input path="city" cssClass="form-control form-block" placeholder="Enter your username" />
                    <@sf.errors path="city"/>
            </div>
        </div>


        <div class="form-group">
            <div class="col-lg-12">
                <@sf.input path="mobilePhone" cssClass="form-control form-block" placeholder="Enter your username" />
                    <@sf.errors path="mobilePhone"/>
            </div>
        </div>


        <div class="form-group">
            <div class="col-lg-12">
                <@sf.input path="email" cssClass="form-control form-block" placeholder="Enter your username" />
                    <@sf.errors path="email"/>
            </div>
        </div>


        <div class="form-group">
            <div class="col-lg-12">
                <@sf.input path="login" cssClass="form-control form-block" placeholder="Enter your username" />
                    <@sf.errors path="login"/>
            </div>
        </div>


        <div class="form-group">
            <div class="col-lg-12">
                <@sf.input path="password" cssClass="form-control form-block" placeholder="Enter your username" />
                    <@sf.errors path="password"/>
            </div>
        </div>


        <div class="form-group">
            <div class="col-lg-12">
                <@sf.input path="repassword" cssClass="form-control form-block" placeholder="Enter your username" />
                    <@sf.errors path="repassword"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-lg-12">
                <input type="submit" value="Отправить"/>
            </div>
        </div>
    </@sf.form>
    </div>
    <div id="left">
        <h3>Авторизироваться</h3>

        <form role="form" class="form-horizontal" method="post" action="/login/process">
            <div class="form-group">
                <div class="col-lg-12">
                    <input id="login" name="login"  class="form-control form-block"  type="text" required />
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-12">
                    <input id="password" name="password" class="form-control form-block"  type="password" required />
                <#if error??> Invalid login or password! </#if>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-12">
                    <input type="submit" value="Отправить" />
                </div>
            </div>
        </form>
    </div>
</div>

<div class="pre-loader">
    <div class="load-con">
        <img src="/resources/img/freeze/logo.png" class="animated fadeInDown" alt="">

        <div class="spinner">
            <div class="bounce1"></div>
            <div class="bounce2"></div>
            <div class="bounce3"></div>
        </div>
    </div>
</div>

<header>

    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1">
                    <span class="fa fa-bars fa-lg"></span>
                </button>
                <a class="navbar-brand" href="index.html">
                    <img src="/resources/img/freeze/logo.png" alt="" class="logo">
                </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#about">Про нас</a>
                    </li>
                    <li><a href="#features">Общая выгода</a>
                    </li>
                    <li class="sign-in"><a style="cursor: pointer;" id="megaSuperMenMaximAndreyLysiAidarSashaIDR">Присоедениться</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-->
    </nav>


    <!--RevSlider-->
    <div class="tp-banner-container">
        <div class="tp-banner">
            <ul>
                <!-- SLIDE  -->
                <li data-transition="fade" data-slotamount="7" data-masterspeed="1500">
                    <!-- MAIN IMAGE -->
                    <img src="/resources/img/transparent.png" alt="slidebg1" data-bgfit="cover"
                         data-bgposition="left top"
                         data-bgrepeat="no-repeat">
                    <!-- LAYERS -->
                    <!-- LAYER NR. 1 -->
                    <div class="tp-caption lfl fadeout hidden-xs"
                         data-x="left"
                         data-y="bottom"
                         data-hoffset="30"
                         data-voffset="0"
                         data-speed="500"
                         data-start="700"
                         data-easing="Power4.easeOut">
                        <img src="/resources/img/freeze/Slides/hand-freeze.png" alt="">
                    </div>

                    <div class="tp-caption lfl fadeout visible-xs"
                         data-x="left"
                         data-y="center"
                         data-hoffset="700"
                         data-voffset="0"
                         data-speed="500"
                         data-start="700"
                         data-easing="Power4.easeOut">
                        <img src="/resources/img/freeze/iphone-freeze.png" alt="">
                    </div>

                    <div class="tp-caption large_white_bold sft" data-x="550" data-y="center" data-hoffset="0"
                         data-voffset="-80" data-speed="500" data-start="1200" data-easing="Power4.easeOut">
                        Oleose
                    </div>
                    <div class="tp-caption large_white_light sfr" data-x="770" data-y="center" data-hoffset="0"
                         data-voffset="-80" data-speed="500" data-start="1400" data-easing="Power4.easeOut">
                        App
                    </div>
                    <div class="tp-caption large_white_light sfb" data-x="550" data-y="center" data-hoffset="0"
                         data-voffset="0" data-speed="1000" data-start="1500" data-easing="Power4.easeOut">
                        Landing Theme
                    </div>

                    <div class="tp-caption sfb hidden-xs" data-x="550" data-y="center" data-hoffset="0"
                         data-voffset="85" data-speed="1000" data-start="1700" data-easing="Power4.easeOut">
                        <a href="#about" class="btn btn-primary inverse btn-lg">Читать далее</a>
                    </div>

                </li>
                <!-- SLIDE 2 -->
                <li data-transition="zoomout" data-slotamount="7" data-masterspeed="1000">
                    <!-- MAIN IMAGE -->
                    <img src="/resources/img/transparent.png" alt="slidebg1" data-bgfit="cover"
                         data-bgposition="left top"
                         data-bgrepeat="no-repeat">
                    <!-- LAYERS -->
                    <!-- LAYER NR. 1 -->
                    <div class="tp-caption lfb fadeout hidden-xs"
                         data-x="center"
                         data-y="bottom"
                         data-hoffset="0"
                         data-voffset="0"
                         data-speed="1000"
                         data-start="700"
                         data-easing="Power4.easeOut">
                        <img src="/resources/img/freeze/Slides/freeze-slide2.png" alt="">
                    </div>


                    <div class="tp-caption large_white_light sft" data-x="center" data-y="250" data-hoffset="0"
                         data-voffset="0" data-speed="1000" data-start="1400" data-easing="Power4.easeOut">
                        Every Pixel <i class="fa fa-heart"></i>
                    </div>


                </li>

                <!-- SLIDE 3 -->
                <li data-transition="zoomout" data-slotamount="7" data-masterspeed="1000">
                    <!-- MAIN IMAGE -->
                    <img src="/resources/img/transparent.png" alt="slidebg1" data-bgfit="cover"
                         data-bgposition="left top"
                         data-bgrepeat="no-repeat">
                    <!-- LAYERS -->
                    <!-- LAYER NR. 1 -->
                    <div class="tp-caption customin customout hidden-xs"
                         data-x="right"
                         data-y="center"
                         data-hoffset="0"
                         data-customin="x:50;y:150;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.5;scaleY:0.5;skewX:0;skewY:0;opacity:0;transformPerspective:0;transformOrigin:50% 50%;"
                         data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
                         data-voffset="50"
                         data-speed="1000"
                         data-start="700"
                         data-easing="Power4.easeOut">
                        <img src="/resources/img/freeze/Slides/freeze.png" alt="">
                    </div>

                    <div class="tp-caption customin customout visible-xs"
                         data-x="center"
                         data-y="center"
                         data-hoffset="0"
                         data-customin="x:50;y:150;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.5;scaleY:0.5;skewX:0;skewY:0;opacity:0;transformPerspective:0;transformOrigin:50% 50%;"
                         data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
                         data-voffset="0"
                         data-speed="1000"
                         data-start="700"
                         data-easing="Power4.easeOut">
                        <img src="/resources/img/freeze/Slides/freeze.png" alt="">
                    </div>

                    <div class="tp-caption lfb visible-xs" data-x="center" data-y="center" data-hoffset="0"
                         data-voffset="400" data-speed="1000" data-start="1200" data-easing="Power4.easeOut">
                        <a href="#" class="btn btn-primary inverse btn-lg">Purchase</a>
                    </div>


                    <div class="tp-caption mediumlarge_light_white sfl hidden-xs" data-x="left" data-y="center"
                         data-hoffset="0" data-voffset="-50" data-speed="1000" data-start="1000"
                         data-easing="Power4.easeOut">
                        Powerful Responsive
                    </div>
                    <div class="tp-caption mediumlarge_light_white sft hidden-xs" data-x="left" data-y="center"
                         data-hoffset="0" data-voffset="0" data-speed="1000" data-start="1200"
                         data-easing="Power4.easeOut">
                        App Landing Page
                    </div>
                    <div class="tp-caption small_light_white sfb hidden-xs" data-x="left" data-y="center"
                         data-hoffset="0" data-voffset="80" data-speed="1000" data-start="1600"
                         data-easing="Power4.easeOut">
                        <p>Nulla pretium libero interdum, tempus lorem non, rutrum diam. <br> Quisque pellentesque
                            diam
                            sed pulvinar lobortis. Vestibulum ante <br>ipsum primis in faucibus orci luctus et
                            ultrices
                            posuere cubilia Curae.</p>
                    </div>

                    <div class="tp-caption lfl hidden-xs" data-x="left" data-y="center" data-hoffset="0"
                         data-voffset="160" data-speed="1000" data-start="1800" data-easing="Power4.easeOut">
                        <a href="#" class="btn btn-primary inverse btn-lg">Purchase</a>
                    </div>


                </li>

            </ul>
        </div>
    </div>


</header>


<div class="wrapper">


    <section id="about">
        <div class="container">

            <div class="section-heading scrollpoint sp-effect3">
                <h1>About Us</h1>

                <div class="divider"></div>
                <p>Oleose Beautiful App Landing Page</p>
            </div>

            <div class="row">
                <div class="col-md-3 col-sm-3 col-xs-6">
                    <div class="about-item scrollpoint sp-effect2">
                        <i class="fa fa-download fa-2x"></i>

                        <h3>Easy setup</h3>

                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                            incididunt ut
                            labore et dolore.</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3 col-xs-6">
                    <div class="about-item scrollpoint sp-effect5">
                        <i class="fa fa-mobile fa-2x"></i>

                        <h3>On-the-go</h3>

                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                            incididunt ut
                            labore et dolore.</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3 col-xs-6">
                    <div class="about-item scrollpoint sp-effect5">
                        <i class="fa fa-users fa-2x"></i>

                        <h3>Social connect</h3>

                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                            incididunt ut
                            labore et dolore.</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3 col-xs-6">
                    <div class="about-item scrollpoint sp-effect1">
                        <i class="fa fa-sliders fa-2x"></i>

                        <h3>Dedicated support</h3>

                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                            incididunt ut
                            labore et dolore.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section id="features">
        <div class="container">
            <div class="section-heading scrollpoint sp-effect3">
                <h1>Features</h1>

                <div class="divider"></div>
                <p>Learn more about this feature packed App</p>
            </div>
            <div class="row">
                <div class="col-md-4 col-sm-4 scrollpoint sp-effect1">
                    <div class="media media-left feature">
                        <a class="pull-right" href="#">
                            <i class="fa fa-cogs fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">User Settings</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                    <div class="media media-left feature">
                        <a class="pull-right" href="#">
                            <i class="fa fa-envelope fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">Messages Inbox</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                    <div class="media media-left feature">
                        <a class="pull-right" href="#">
                            <i class="fa fa-users fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">Friends List</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                    <div class="media media-left feature">
                        <a class="pull-right" href="#">
                            <i class="fa fa-comments fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">Live Chat Messages</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                    <div class="media media-left feature">
                        <a class="pull-right" href="#">
                            <i class="fa fa-calendar fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">Calendar / Planner</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <img src="/resources/img/freeze/iphone-freeze.png" class="img-responsive scrollpoint sp-effect5"
                         alt="">
                </div>
                <div class="col-md-4 col-sm-4 scrollpoint sp-effect2">
                    <div class="media feature">
                        <a class="pull-left" href="#">
                            <i class="fa fa-map-marker fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">My Places</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                    <div class="media feature">
                        <a class="pull-left" href="#">
                            <i class="fa fa-film fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">Media Player™</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                    <div class="media feature">
                        <a class="pull-left" href="#">
                            <i class="fa fa-compass fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">Intuitive Statistics</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                    <div class="media feature">
                        <a class="pull-left" href="#">
                            <i class="fa fa-picture-o fa-2x"></i>
                        </a>

                        <div class="media-body">
                            <h3 class="media-heading">Weather on-the-go</h3>
                            Lorem ipsum dolor sit amet.
                        </div>
                    </div>
                    <div class="media active feature">
                        <a class="pull-left" href="#">
                            <i class="fa fa-plus fa-2x"></i>
                        </a>

                        <div class="media-body ">
                            <h3 class="media-heading nan-text">Присоедениться!</h3>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <footer>
        <div class="container">
            <a href="#" class="scrollpoint sp-effect3">
                <img src="/resources/img/freeze/logo.png" alt="" class="logo">
            </a>


            <div class="rights">
                <p>JetBrains 2015</p>

            </div>
        </div>
    </footer>
</div>
<script src="/resources/js/cool/jquery-1.11.1.min.js"></script>
<script src="/resources/js/cool/bootstrap.min.js"></script>
<script src="/resources/js/cool/slick.min.js"></script>
<script src="/resources/js/cool/placeholdem.min.js"></script>
<script src="/resources/js/cool/rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
<script src="/resources/js/cool/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
<script src="/resources/js/cool/waypoints.min.js"></script>
<script src="/resources/js/cool/scripts.js"></script>
<script src="/resources/js/cool/modal.js"></script>

<script>
    $(document).ready(function () {
        appMaster.preLoader();
    });
    <#if errorReg??>
    $('#dark-bg').fadeIn();
    $('#content-body').fadeIn();

    $('#content-body').animate({
        'left': '45%',
        'opacity': '1'
    }, 500);

    $('#content-body').animate({
        'left': '52%'
    }, 500)

    $('#content-body').animate({
        'left': '50%'
    }, 500)

    </#if>
</script>

</body>

</html>
