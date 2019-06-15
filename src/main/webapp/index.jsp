<%@ page import="lombok.var" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>WorkWise Html Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <link rel="stylesheet" type="text/css" href="css/animate.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/line-awesome.css">
    <link rel="stylesheet" type="text/css" href="css/line-awesome-font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/jquery.mCustomScrollbar.min.css">
    <link rel="stylesheet" type="text/css" href="lib/slick/slick.css">
    <link rel="stylesheet" type="text/css" href="lib/slick/slick-theme.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/responsive.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>


<body>


<div class="wrapper">


    <header>
        <div class="container">
            <div class="header-data">
                <div class="logo">
                    <a href="index.html" title=""><img src="images/logo.png" alt=""></a>
                </div><!--logo end-->
                <div class="search-bar">
                    <form>
                        <input type="text" name="search" placeholder="Search...">
                        <button type="submit"><i class="la la-search"></i></button>
                    </form>
                </div><!--search-bar end-->
                <nav>
                    <ul>
                        <li>
                            <a href="index.html" title="">
                                <span><img src="images/icon1.png" alt=""></span>
                                主页
                            </a>
                        </li>
                        <li>
                            <a href="companies.html" title="">
                                <span><img src="images/icon2.png" alt=""></span>
                                公司
                            </a>
                        </li>
                        <li>
                            <a href="projects.html" title="">
                                <span><img src="images/icon3.png" alt=""></span>
                                项目
                            </a>
                        </li>
                        <li>
                            <a href="profiles.html" title="">
                                <span><img src="images/icon4.png" alt=""></span>
                                简介
                            </a>
                            <ul>
                                <li><a href="user-profile.html" title="">User Profile</a></li>
                                <li><a href="my-profile-feed.html" title="">my-profile-feed</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="jobs.html" title="">
                                <span><img src="images/icon5.png" alt=""></span>
                                工作
                            </a>
                        </li>
                        <li>
                            <a href="#" title="" class="not-box-open">
                                <span><img src="images/icon6.png" alt=""></span>
                                消息
                            </a>
                            <div class="notification-box msg">
                                <div class="nt-title">
                                    <h4>Setting</h4>
                                    <a href="#" title="">Clear all</a>
                                </div>
                                <div class="nott-list">
                                    <div class="notfication-details">
                                        <div class="noty-user-img">
                                            <img src="images/resources/ny-img1.png" alt="">
                                        </div>
                                        <div class="notification-info">
                                            <h3><a href="messages.html" title="">Jassica William</a></h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do.</p>
                                            <span>2 min ago</span>
                                        </div><!--notification-info -->
                                    </div>
                                    <div class="notfication-details">
                                        <div class="noty-user-img">
                                            <img src="images/resources/ny-img2.png" alt="">
                                        </div>
                                        <div class="notification-info">
                                            <h3><a href="messages.html" title="">Jassica William</a></h3>
                                            <p>Lorem ipsum dolor sit amet.</p>
                                            <span>2 min ago</span>
                                        </div><!--notification-info -->
                                    </div>
                                    <div class="notfication-details">
                                        <div class="noty-user-img">
                                            <img src="images/resources/ny-img3.png" alt="">
                                        </div>
                                        <div class="notification-info">
                                            <h3><a href="messages.html" title="">Jassica William</a></h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                                tempo incididunt ut labore et dolore magna aliqua.</p>
                                            <span>2 min ago</span>
                                        </div><!--notification-info -->
                                    </div>
                                    <div class="view-all-nots">
                                        <a href="messages.html" title="">View All Messsages</a>
                                    </div>
                                </div><!--nott-list end-->
                            </div><!--notification-box end-->
                        </li>
                        <li>
                            <a href="#" title="" class="not-box-open">
                                <span><img src="images/icon7.png" alt=""></span>
                                通知
                            </a>
                            <div class="notification-box">
                                <div class="nt-title">
                                    <h4>Setting</h4>
                                    <a href="#" title="">Clear all</a>
                                </div>
                                <div class="nott-list">
                                    <div class="notfication-details">
                                        <div class="noty-user-img">
                                            <img src="images/resources/ny-img1.png" alt="">
                                        </div>
                                        <div class="notification-info">
                                            <h3><a href="#" title="">Jassica William</a> Comment on your project.</h3>
                                            <span>2 min ago</span>
                                        </div><!--notification-info -->
                                    </div>
                                    <div class="notfication-details">
                                        <div class="noty-user-img">
                                            <img src="images/resources/ny-img2.png" alt="">
                                        </div>
                                        <div class="notification-info">
                                            <h3><a href="#" title="">Jassica William</a> Comment on your project.</h3>
                                            <span>2 min ago</span>
                                        </div><!--notification-info -->
                                    </div>
                                    <div class="notfication-details">
                                        <div class="noty-user-img">
                                            <img src="images/resources/ny-img3.png" alt="">
                                        </div>
                                        <div class="notification-info">
                                            <h3><a href="#" title="">Jassica William</a> Comment on your project.</h3>
                                            <span>2 min ago</span>
                                        </div><!--notification-info -->
                                    </div>
                                    <div class="notfication-details">
                                        <div class="noty-user-img">
                                            <img src="images/resources/ny-img2.png" alt="">
                                        </div>
                                        <div class="notification-info">
                                            <h3><a href="#" title="">Jassica William</a> Comment on your project.</h3>
                                            <span>2 min ago</span>
                                        </div><!--notification-info -->
                                    </div>
                                    <div class="view-all-nots">
                                        <a href="#" title="">View All Notification</a>
                                    </div>
                                </div><!--nott-list end-->
                            </div><!--notification-box end-->
                        </li>
                    </ul>
                </nav><!--nav end-->
                <div class="menu-btn">
                    <a href="#" title=""><i class="fa fa-bars"></i></a>
                </div><!--menu-btn end-->
                <div class="user-account">
                    <div class="user-info">
                        <img src="images/resources/user.png" alt="">
                        <a href="#" title="">${sessionScope.user.uname}</a>
                    </div>
                    <div class="user-account-settingss">
                        <h3>在线状态</h3>
                        <ul class="on-off-status">
                            <li>
                                <div class="fgt-sec">
                                    <input type="radio" <c:if test="${ sessionScope.user.leftstauts==1 }">checked="checked"</c:if> name="leftstauts" id="c5">
                                    <label for="c5">
                                        <span></span>
                                    </label>
                                    <small>在线</small>
                                </div>
                            </li>
                            <li>
                                <div class="fgt-sec">
                                    <input type="radio" <c:if test="${ sessionScope.user.leftstauts==0 }" >checked="checked"</c:if> name="leftstauts" id="c6">
                                    <label for="c6">
                                        <span></span>
                                    </label>
                                    <small>离线</small>
                                </div>
                            </li>
                        </ul>
                        <h3>设置</h3>
                        <ul class="us-links">
                            <li><a href="profile-account-setting.html" title="">账户设置</a></li>
                            <li><a href="#" title="">隐私</a></li>
                            <li><a href="#" title="">帮助</a></li>
                            <li><a href="#" title="">条款和条件</a></li>
                        </ul>
                        <h3 class="tc"><a href="javascript:login_out();" title="">登出</a></h3>
                    </div><!--user-account-settingss end-->
                </div>
            </div><!--header-data end-->
        </div>
    </header><!--header end-->

    <main>
        <div class="main-section">
            <div class="container">
                <div class="main-section-data">
                    <div class="row">
                        <div class="col-lg-3 col-md-4 pd-left-none no-pd">
                            <div class="main-left-sidebar no-margin">
                                <div class="user-data full-width">
                                    <div class="user-profile">
                                        <div class="username-dt">
                                            <div class="usr-pic">
                                                <img src="images/resources/user-pic.png" alt="">
                                            </div>
                                        </div><!--username-dt end-->
                                        <div class="user-specs">
                                            <h3>${sessionScope.user.uname}</h3>
                                            <span>${sessionScope.user.signature}</span>
                                        </div>
                                    </div><!--user-profile end-->
                                    <ul class="user-fw-status">
                                        <li>
                                            <h4>粉丝</h4>
                                            <span>${sessionScope.user.fans}</span>
                                        </li>
                                        <li>
                                            <h4>关注</h4>
                                            <span>${sessionScope.user.attention}</span>
                                        </li>
                                        <li>
                                            <a href="#" title="">查看资料</a>
                                        </li>
                                    </ul>
                                </div><!--user-data end-->
                                <div class="suggestions full-width">
                                    <div class="sd-title">
                                        <h3>人气榜</h3>
                                        <i class="la la-ellipsis-v"></i>
                                    </div><!--sd-title end-->
                                    <div class="suggestions-list">
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s1.png" alt="">
                                            <div class="sgt-text">
                                                <h4>杰西卡·威廉姆斯</h4>
                                                <span>平面设计师</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s2.png" alt="">
                                            <div class="sgt-text">
                                                <h4>丹尼</h4>
                                                <span>PHP开发者</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s3.png" alt="">
                                            <div class="sgt-text">
                                                <h4>阿莫尔</h4>
                                                <span>开发者网站</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s4.png" alt="">
                                            <div class="sgt-text">
                                                <h4>比尔·盖茨</h4>
                                                <span>C & C++ 开发</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s5.png" alt="">
                                            <div class="sgt-text">
                                                <h4>杰西卡·威廉姆斯</h4>
                                                <span>平面设计师</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s6.png" alt="">
                                            <div class="sgt-text">
                                                <h4>丹尼</h4>
                                                <span>PHP 开发者</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="view-more">
                                            <a href="#" title="">查看更多</a>
                                        </div>
                                    </div><!--suggestions-list end-->
                                </div><!--suggestions end-->
                                <div class="tags-sec full-width">
                                    <ul>
                                        <li><a href="#" title="">帮助中心</a></li>
                                        <li><a href="#" title="">关于</a></li>
                                        <li><a href="#" title="">隐私政策</a></li>
                                        <li><a href="#" title="">社区准则</a></li>
                                        <li><a href="#" title="">社区政策</a></li>
                                        <li><a href="#" title="">事业</a></li>
                                        <li><a href="#" title="">语言</a></li>
                                        <li><a href="#" title="">版权声明</a></li>
                                    </ul>
                                    <div class="cp-sec">
                                        <img src="images/logo2.png" alt="">
                                        <p><img src="images/cp.png" alt="">Copyright 2018 @Danny</p>
                                    </div>
                                </div><!--tags-sec end-->
                            </div><!--main-left-sidebar end-->
                        </div>
                        <div class="col-lg-6 col-md-8 no-pd">
                            <div class="main-ws-sec">
                                <div class="post-topbar">
                                    <div class="user-picy">
                                        <img src="images/resources/user-pic.png" alt="">
                                    </div>
                                    <div class="post-st">
                                        <ul>
                                            <li><a class="post_project" href="#" title="">发布动态</a></li>
                                            <li><a class="post-jb active" href="#" title="">寻找合作者</a></li>
                                        </ul>
                                    </div><!--post-st end-->
                                </div><!--post-topbar end-->
                                <div class="top-profiles">
                                    <div class="pf-hd" style="background-color: #fff">
                                        <h3>投资者</h3>
                                        <i class="la la-ellipsis-v"></i>
                                    </div>
                                    <div class="profiles-slider">
                                        <div class="user-profy">
                                            <img src="images/resources/user1.png" alt="">
                                            <h3>丹尼</h3>
                                            <span>Dearcv董事</span>
                                            <ul>
                                                <li><a href="#" title="" class="followw">聊天</a></li>
                                                <li><a href="#" title="" class="envlp"><img src="images/envelop.png"
                                                                                            alt=""></a></li>
                                                <li><a href="#" title="" class="hire">邀请</a></li>
                                            </ul>
                                            <a href="#" title="">个人信息</a>
                                        </div><!--user-profy end-->
                                        <div class="user-profy">
                                            <img src="images/resources/user2.png" alt="">
                                            <h3>丹尼</h3>
                                            <span>Graphic Designer</span>
                                            <ul>
                                                <li><a href="#" title="" class="followw">聊天</a></li>
                                                <li><a href="#" title="" class="envlp"><img src="images/envelop.png"
                                                                                            alt=""></a></li>
                                                <li><a href="#" title="" class="hire">邀请</a></li>
                                            </ul>
                                            <a href="#" title="">个人信息</a>
                                        </div><!--user-profy end-->
                                        <div class="user-profy">
                                            <img src="images/resources/user3.png" alt="">
                                            <h3>丹尼</h3>
                                            <span>Graphic Designer</span>
                                            <ul>
                                                <li><a href="#" title="" class="followw">聊天</a></li>
                                                <li><a href="#" title="" class="envlp"><img src="images/envelop.png"
                                                                                            alt=""></a></li>
                                                <li><a href="#" title="" class="hire">邀请</a></li>
                                            </ul>
                                            <a href="#" title="">个人信息</a>
                                        </div><!--user-profy end-->
                                        <div class="user-profy">
                                            <img src="images/resources/user1.png" alt="">
                                            <h3>丹尼</h3>
                                            <span>Graphic Designer</span>
                                            <ul>
                                                <li><a href="#" title="" class="followw">聊天</a></li>
                                                <li><a href="#" title="" class="envlp"><img src="images/envelop.png"
                                                                                            alt=""></a></li>
                                                <li><a href="#" title="" class="hire">邀请</a></li>
                                            </ul>
                                            <a href="#" title="">个人信息</a>
                                        </div><!--user-profy end-->
                                        <div class="user-profy">
                                            <img src="images/resources/user2.png" alt="">
                                            <h3>丹尼</h3>
                                            <span>Graphic Designer</span>
                                            <ul>
                                                <li><a href="#" title="" class="followw">聊天</a></li>
                                                <li><a href="#" title="" class="envlp"><img src="images/envelop.png"
                                                                                            alt=""></a></li>
                                                <li><a href="#" title="" class="hire">邀请</a></li>
                                            </ul>
                                            <a href="#" title="">个人信息</a>
                                        </div><!--user-profy end-->
                                        <div class="user-profy">
                                            <img src="images/resources/user3.png" alt="">
                                            <h3>丹尼</h3>
                                            <span>Graphic Designer</span>
                                            <ul>
                                                <li><a href="#" title="" class="followw">聊天</a></li>
                                                <li><a href="#" title="" class="envlp"><img src="images/envelop.png"
                                                                                            alt=""></a></li>
                                                <li><a href="#" title="" class="hire">邀请</a></li>
                                            </ul>
                                            <a href="#" title="">个人信息</a>
                                        </div><!--user-profy end-->
                                    </div><!--profiles-slider end-->
                                </div><!--top-profiles end-->
                                <div class="posts-section">
                                <c:forEach items="${ArticleList}" var="artc">
                                    <div class="post_topbar" style="background-color: #fff;margin-bottom: 26px; " >
                                        <div class="post-bar">
                                            <div class="usy-dt">
                                            <img src="images/resources/us-pic.png" alt="">
                                            <div class="usy-name">
                                                <h3>${artc.uname}</h3>
                                                <span ><img src="images/clock.png" alt="">${artc.creattime}</span>
                                            </div>
                                        </div>
                                            <div class="ed-opts">
                                                <a href="#" title="" class="ed-opts-open"><i class="la la-ellipsis-v"></i></a>
                                                <ul class="ed-options">
                                                    <li><a href="#" title="">编辑帖子</a></li>
                                                    <li><a href="#" title="">查看作者</a></li>
                                                    <li><a href="#" title="">邀约</a></li>
                                                    <li><a href="#" title="">关闭</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="epi-sec">
                                            <ul class="descp">
                                                <li><img src="images/icon8.png" alt=""><span>${artc.signature}</span></li>
                                                <li><img src="images/icon9.png" alt=""><span>${artc.sitename}</span></li>
                                            </ul>
                                            <ul class="bk-links">
                                                <li><a href="#" title=""><i class="la la-bookmark"></i></a></li>
                                                <li><a href="#" title=""><i class="la la-envelope"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="job_descp">
                                            <h3>${artc.title}</h3>
                                            <ul class="job-dt">
                                                <li><a href="#" title="">${artc.typename}</a></li>
                                                <li><span></span></li>
                                            </ul>
                                            <p>${artc.context}<a href="#" title="">查看更多</a></p>
                                        </div>
                                        <div class="job-status-bar">
                                            <ul class="like-com">
                                                <li>
                                                    <a href="#"><i class="la la-heart"></i> 赞</a>
                                                    <img src="images/liked-img.png" alt="">
                                                    <span>${artc.praise}</span>
                                                </li>
                                                <li><a href="#" title="" class="com"><img src="images/com.png" alt=""> 15条评论</a></li>
                                            </ul>
                                            <a><i class="la la-eye"></i> 热度：${artc.pageviews}</a>
                                        </div>
                                        	<div class="comment-sec">
                                                <ul>
                                                	<c:forEach items="${artc.ctexts}" var="artcontext">
                                                    <li>
                                                        <div class="comment-list">
                                                            <div class="bg-img">
                                                                <img src="images/resources/bg-img3.png" alt="">
                                                            </div>
                                                            <div class="comment">
                                                                <h3>${artcontext.uname}</h3>
                                                                <span><img src="images/clock.png"
                                                                           alt="">${artcontext.commenttime}</span>
                                                                <p>${artcontext.text}</p>
                                                            </div>
                                                        </div><!--comment-list end-->
                                                    </li>
                                                    </c:forEach>
                                                </ul>
                                            </div><!--comment-sec end-->
                                            <div class="post-comment">
                                                <div class="cm_img">
                                                    <img src="images/resources/bg-img4.png" alt="">
                                                </div>
                                                <div class="comment_box">
                                                    <form class="comment-tab kind">
                                                        <input type="text" name="text" value="" placeholder="Post a comment">
                                                        <a href="javascript:Postcomment(${artc.aid})"><button type="button" >评论</button></a>
                                                    </form>
                                                    
                                                </div>
                                            </div><!--post-comment end-->
                                    </div>
                                </c:forEach>

                                    
                                    <div class="process-comm">
                                        <a href="#" title=""><img src="images/process-icon.png" alt=""></a>
                                    </div><!--process-comm end-->
                                </div><!--posts-section end-->
                            </div><!--main-ws-sec end-->
                        </div>
                        <div class="col-lg-3 pd-right-none no-pd">
                            <div class="right-sidebar">
                                <div class="widget widget-about">
                                    <img src="images/wd-logo.png" alt="">
                                    <h3>WorkWise</h3>
                                    <span>让你的想法变成事实</span>
                                    <div class="sign_link">
                                        <h3><a href="sign-in.html" title="">注册</a></h3>
                                        <a href="#" title="">学到更多</a>
                                    </div>
                                </div><!--widget-about end-->
                                <div class="widget widget-jobs">
                                    <div class="sd-title">
                                        <h3>热门文章</h3>
                                        <i class="la la-ellipsis-v"></i>
                                    </div>
                                    <div class="jobs-list">
                                        <div class="job-info">
                                            <div class="job-details">
                                                <h3>高级产品设计师</h3>
                                                <p>Lorem存有悲坐阿梅德，consectetur adipiscing ELIT ..</p>
                                            </div>
                                            <div class="hr-rate">
                                                <span>$25/hr</span>
                                            </div>
                                        </div><!--job-info end-->
                                        <div class="job-info">
                                            <div class="job-details">
                                                <h3>高级UI / UX设计</h3>
                                                <p>Lorem存有悲坐阿梅德，consectetur adipiscing ELIT ..</p>
                                            </div>
                                            <div class="hr-rate">
                                                <span>$25/hr</span>
                                            </div>
                                        </div><!--job-info end-->
                                        <div class="job-info">
                                            <div class="job-details">
                                                <h3>小型搜索引擎优化设计</h3>
                                                <p>Lorem存有悲坐阿梅德，consectetur adipiscing ELIT ..</p>
                                            </div>
                                            <div class="hr-rate">
                                                <span>$25/hr</span>
                                            </div>
                                        </div><!--job-info end-->
                                        <div class="job-info">
                                            <div class="job-details">
                                                <h3>高级开发人员设计师</h3>
                                                <p>Lorem存有悲坐阿梅德，consectetur adipiscing ELIT ..</p>
                                            </div>
                                            <div class="hr-rate">
                                                <span>$25/hr</span>
                                            </div>
                                        </div><!--job-info end-->
                                        <div class="job-info">
                                            <div class="job-details">
                                                <h3>高级开发人员设计师</h3>
                                                <p>Lorem存有悲坐阿梅德，consectetur adipiscing ELIT ..</p>
                                            </div>
                                            <div class="hr-rate">
                                                <span>$25/hr</span>
                                            </div>
                                        </div><!--job-info end-->
                                    </div><!--jobs-list end-->
                                </div><!--widget-jobs end-->
                                <div class="widget widget-jobs">
                                    <div class="sd-title">
                                        <h3>本周最受欢迎</h3>
                                        <i class="la la-ellipsis-v"></i>
                                    </div>
                                    <div class="jobs-list">
                                        <div class="job-info">
                                            <div class="job-details">
                                                <h3>高级产品设计师</h3>
                                                <p>Lorem存有悲坐阿梅德，consectetur adipiscing ELIT ..</p>
                                            </div>
                                            <div class="hr-rate">
                                                <span>$25/hr</span>
                                            </div>
                                        </div><!--job-info end-->
                                        <div class="job-info">
                                            <div class="job-details">
                                                <h3>高级UI / UX设计</h3>
                                                <p>Lorem存有悲坐阿梅德，consectetur adipiscing ELIT ..</p>
                                            </div>
                                            <div class="hr-rate">
                                                <span>$25/hr</span>
                                            </div>
                                        </div><!--job-info end-->
                                        <div class="job-info">
                                            <div class="job-details">
                                                <h3>小型搜索引擎优化设计</h3>
                                                <p>Lorem存有悲坐阿梅德，consectetur adipiscing ELIT ..</p>
                                            </div>
                                            <div class="hr-rate">
                                                <span>$25/hr</span>
                                            </div>
                                        </div><!--job-info end-->
                                    </div><!--jobs-list end-->
                                </div><!--widget-jobs end-->
                                <div class="widget suggestions full-width">
                                    <div class="sd-title">
                                        <h3>观看最多的人</h3>
                                        <i class="la la-ellipsis-v"></i>
                                    </div><!--sd-title end-->
                                    <div class="suggestions-list">
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s1.png" alt="">
                                            <div class="sgt-text">
                                                <h4>杰西卡·威廉姆斯</h4>
                                                <span>平面设计师</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s2.png" alt="">
                                            <div class="sgt-text">
                                                <h4>丹尼</h4>
                                                <span>PHP开发者</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s3.png" alt="">
                                            <div class="sgt-text">
                                                <h4>阿莫尔</h4>
                                                <span>开发者网站</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s4.png" alt="">
                                            <div class="sgt-text">
                                                <h4>比尔·盖茨</h4>
                                                <span>C &amp; C++ 开发</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s5.png" alt="">
                                            <div class="sgt-text">
                                                <h4>杰西卡·威廉姆斯</h4>
                                                <span>平面设计师r</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="suggestion-usd">
                                            <img src="images/resources/s6.png" alt="">
                                            <div class="sgt-text">
                                                <h4>丹尼</h4>
                                                <span>PHP开发者</span>
                                            </div>
                                            <span><i class="la la-plus"></i></span>
                                        </div>
                                        <div class="view-more">
                                            <a href="#" title="">更多用户</a>
                                        </div>
                                    </div><!--suggestions-list end-->
                                </div>
                            </div><!--right-sidebar end-->
                        </div>
                    </div>
                </div><!-- main-section-data end-->
            </div>
        </div>
    </main>


    <div class="post-popup pst-pj">
        <div class="post-project">
            <h3>Post a project</h3>
            <div class="post-project-fields">
                <form>
                    <div class="row">
                        <div class="col-lg-12">
                            <input type="text" name="title" placeholder="Title">
                        </div>
                        <div class="col-lg-12">
                            <div class="inp-field">
                                <select>
                                    <option>Category</option>
                                    <option>Category 1</option>
                                    <option>Category 2</option>
                                    <option>Category 3</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-12">
                            <input type="text" name="skills" placeholder="Skills">
                        </div>
                        <div class="col-lg-12">
                            <div class="price-sec">
                                <div class="price-br">
                                    <input type="text" name="price1" placeholder="Price">
                                    <i class="la la-dollar"></i>
                                </div>
                                <span>To</span>
                                <div class="price-br">
                                    <input type="text" name="price1" placeholder="Price">
                                    <i class="la la-dollar"></i>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-12">
                            <textarea name="description" placeholder="Description"></textarea>
                        </div>
                        <div class="col-lg-12">
                            <ul>
                                <li>
                                    <button class="active" type="submit" value="post">Post</button>
                                </li>
                                <li><a href="#" title="">Cancel</a></li>
                            </ul>
                        </div>
                    </div>
                </form>
            </div><!--post-project-fields end-->
            <a href="#" title=""><i class="la la-times-circle-o"></i></a>
        </div><!--post-project end-->
    </div><!--post-project-popup end-->

    <div class="post-popup job_post">
        <div class="post-project">
            <h3>Post a job</h3>
            <div class="post-project-fields">
                <form>
                    <div class="row">
                        <div class="col-lg-12">
                            <input type="text" name="title" placeholder="Title">
                        </div>
                        <div class="col-lg-12">
                            <div class="inp-field">
                                <select>
                                    <option>Category</option>
                                    <option>Category 1</option>
                                    <option>Category 2</option>
                                    <option>Category 3</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-12">
                            <input type="text" name="skills" placeholder="Skills">
                        </div>
                        <div class="col-lg-6">
                            <div class="price-br">
                                <input type="text" name="price1" placeholder="Price">
                                <i class="la la-dollar"></i>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="inp-field">
                                <select>
                                    <option>Full Time</option>
                                    <option>Half time</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-12">
                            <textarea name="description" placeholder="Description"></textarea>
                        </div>
                        <div class="col-lg-12">
                            <ul>
                                <li>
                                    <button class="active" type="submit" value="post">Post</button>
                                </li>
                                <li><a href="#" title="">Cancel</a></li>
                            </ul>
                        </div>
                    </div>
                </form>
            </div><!--post-project-fields end-->
            <a href="#" title=""><i class="la la-times-circle-o"></i></a>
        </div><!--post-project end-->
    </div><!--post-project-popup end-->


    <div class="chatbox-list">
        <div class="chatbox">
            <div class="chat-mg">
                <a href="#" title=""><img src="images/resources/usr-img1.png" alt=""></a>
                <span>2</span>
            </div>
            <div class="conversation-box">
                <div class="con-title mg-3">
                    <div class="chat-user-info">
                        <img src="images/resources/us-img1.png" alt="">
                        <h3>丹尼 <span class="status-info"></span></h3>
                    </div>
                    <div class="st-icons">
                        <a href="#" title=""><i class="la la-cog"></i></a>
                        <a href="#" title="" class="close-chat"><i class="la la-minus-square"></i></a>
                        <a href="#" title="" class="close-chat"><i class="la la-close"></i></a>
                    </div>
                </div>
                <div class="chat-hist mCustomScrollbar" data-mcs-theme="dark">
                    <div class="chat-msg">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec rutrum congue leo eget
                            malesuada. Vivamus suscipit tortor eget felis porttitor.</p>
                        <span>Sat, Aug 23, 1:10 PM</span>
                    </div>
                    <div class="date-nd">
                        <span>Sunday, August 24</span>
                    </div>
                    <div class="chat-msg st2">
                        <p>Cras ultricies ligula.</p>
                        <span>5 minutes ago</span>
                    </div>
                    <div class="chat-msg">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec rutrum congue leo eget
                            malesuada. Vivamus suscipit tortor eget felis porttitor.</p>
                        <span>Sat, Aug 23, 1:10 PM</span>
                    </div>
                </div><!--chat-list end-->
                <div class="typing-msg">
                    <form>
                        <textarea placeholder="Type a message here"></textarea>
                        <button type="submit"><i class="fa fa-send"></i></button>
                    </form>
                    <ul class="ft-options">
                        <li><a href="#" title=""><i class="la la-smile-o"></i></a></li>
                        <li><a href="#" title=""><i class="la la-camera"></i></a></li>
                        <li><a href="#" title=""><i class="fa fa-paperclip"></i></a></li>
                    </ul>
                </div><!--typing-msg end-->
            </div><!--chat-history end-->
        </div>
        <div class="chatbox">
            <div class="chat-mg">
                <a href="#" title=""><img src="images/resources/usr-img2.png" alt=""></a>
            </div>
            <div class="conversation-box">
                <div class="con-title mg-3">
                    <div class="chat-user-info">
                        <img src="images/resources/us-img1.png" alt="">
                        <h3>丹尼 <span class="status-info"></span></h3>
                    </div>
                    <div class="st-icons">
                        <a href="#" title=""><i class="la la-cog"></i></a>
                        <a href="#" title="" class="close-chat"><i class="la la-minus-square"></i></a>
                        <a href="#" title="" class="close-chat"><i class="la la-close"></i></a>
                    </div>
                </div>
                <div class="chat-hist mCustomScrollbar" data-mcs-theme="dark">
                    <div class="chat-msg">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec rutrum congue leo eget
                            malesuada. Vivamus suscipit tortor eget felis porttitor.</p>
                        <span>Sat, Aug 23, 1:10 PM</span>
                    </div>
                    <div class="date-nd">
                        <span>Sunday, August 24</span>
                    </div>
                    <div class="chat-msg st2">
                        <p>Cras ultricies ligula.</p>
                        <span>5 minutes ago</span>
                    </div>
                    <div class="chat-msg">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec rutrum congue leo eget
                            malesuada. Vivamus suscipit tortor eget felis porttitor.</p>
                        <span>Sat, Aug 23, 1:10 PM</span>
                    </div>
                </div><!--chat-list end-->
                <div class="typing-msg">
                    <form>
                        <textarea placeholder="Type a message here"></textarea>
                        <button type="submit"><i class="fa fa-send"></i></button>
                    </form>
                    <ul class="ft-options">
                        <li><a href="#" title=""><i class="la la-smile-o"></i></a></li>
                        <li><a href="#" title=""><i class="la la-camera"></i></a></li>
                        <li><a href="#" title=""><i class="fa fa-paperclip"></i></a></li>
                    </ul>
                </div><!--typing-msg end-->
            </div><!--chat-history end-->
        </div>
        <div class="chatbox">
            <div class="chat-mg bx">
                <a href="#" title=""><img src="images/chat.png" alt=""></a>
                <span>2</span>
            </div>
            <div class="conversation-box">
                <div class="con-title">
                    <h3>Messages</h3>
                    <a href="#" title="" class="close-chat"><i class="la la-minus-square"></i></a>
                </div>
                <div class="chat-list">
                    <div class="conv-list active">
                        <div class="usrr-pic">
                            <img src="images/resources/usy1.png" alt="">
                            <span class="active-status activee"></span>
                        </div>
                        <div class="usy-info">
                            <h3>丹尼</h3>
                            <span>Lorem ipsum dolor <img src="images/smley.png" alt=""></span>
                        </div>
                        <div class="ct-time">
                            <span>1:55 PM</span>
                        </div>
                        <span class="msg-numbers">2</span>
                    </div>
                    <div class="conv-list">
                        <div class="usrr-pic">
                            <img src="images/resources/usy2.png" alt="">
                        </div>
                        <div class="usy-info">
                            <h3>丹尼</h3>
                            <span>Lorem ipsum dolor <img src="images/smley.png" alt=""></span>
                        </div>
                        <div class="ct-time">
                            <span>11:39 PM</span>
                        </div>
                    </div>
                    <div class="conv-list">
                        <div class="usrr-pic">
                            <img src="images/resources/usy3.png" alt="">
                        </div>
                        <div class="usy-info">
                            <h3>丹尼</h3>
                            <span>Lorem ipsum dolor <img src="images/smley.png" alt=""></span>
                        </div>
                        <div class="ct-time">
                            <span>0.28 AM</span>
                        </div>
                    </div>
                </div><!--chat-list end-->
            </div><!--conversation-box end-->
        </div>
    </div><!--chatbox-list end-->

</div><!--theme-layout end-->


<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/popper.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery.mCustomScrollbar.js"></script>
<script type="text/javascript" src="lib/slick/slick.min.js"></script>
<script type="text/javascript" src="js/scrollbar.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/index.js"></script>

</body>
</html>
