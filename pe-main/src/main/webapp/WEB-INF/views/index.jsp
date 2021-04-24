<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>谊动</title>
    <script src="${PATH }/static/js/nav.js"></script>
    <link rel="stylesheet" href="${PATH }/static/css/yidong_index.css">
    <link rel="stylesheet" href="${PATH }/static/bootstrap/css/bootstrap-grid.min.css">
</head>

<body>
    <!-- 头部 -->
    <div id="head">
        <div class="head_con">
        <c:if test="${empty sessionScope.loginacct }">
            <div class="box_from">
                <a class="register" href="login">登录 |</a>
                <a class="login" href="regist">注册</a>
            </div>
        </c:if>
        <c:if test="${not empty sessionScope.loginacct }">
            <div class="box_from">
                
                <a class="login" href="#">您好！${sessionScope.loginacct.loginacct }</a>
            </div>
        </c:if>
            <div class="box_title">
                <a href="yidong_index.html">欢迎来到谊动</a>
            </div>
        </div>
    </div>

    <!-- 导航栏 -->
    <div class="header">
        <div class="nav_wrap" id="nav_wrap">
            <ul>
                <li class="current"><a href="#">首页</a></li>
                <li><a href="#">约战运动</a></li>
                <li><a href="#">运动教程</a></li>
                <li><a href="#">社区论坛</a></li>
            </ul>
            <span class="side"></span>
        </div>
    </div>

    <!-- 轮播图 -->
    <div id="wrap">
        <ul id="pic">
            <li>
                <img src="${PATH }/static/img/轮播图1.png" alt="">
            </li>
            <li>
                <img src="${PATH }/static/img/轮播图2.jpg" alt="">
            </li>
            <li>
                <img src="${PATH }/static/img/轮播图3.jpg" alt="">
            </li>
        </ul>
        <ol id="list">
            <li class="on"></li>
            <li></li>
            <li></li>
        </ol>
    </div>

    <!-- 视频推荐 -->
    <div id="recommend">
        <div class="box_titleTwoR">
            <h2>视频推荐</h2>
            <div class="contentR">
                <p class="titleR">热门运动课程</p>
            </div>
        </div>
        <div id="box_rowR">
            <div class="row">
                <div class="col-md-3">
                    <div class="list">
                        <video width="275px" height="150px" controls>
                            <source type="video/mp4" src="${PATH }/static/videos/1.1(Av86290157,P1).mp4">
                            <source type="video/ogg" src="${PATH }/static/videos/1.1(Av86290157,P1).ogg">
                        </video>
                    </div>
                    <p>羽毛球基础训练</p>
                </div>
                <div class="col-md-3">
                    <div class="list1">
                        <video width="275px" height="150px" controls>
                            <source type="video/mp4" src="${PATH }/static/videos/1.1(Av86290157,P1).mp4">
                            <source type="video/ogg" src="${PATH }/static/videos/1.1(Av86290157,P1).ogg">
                        </video>
                    </div>
                    <p>羽毛球基础训练</p>
                </div>
                <div class="col-md-3">
                    <div class="list2">
                        <video width="275px" height="150px" controls>
                            <source type="video/mp4" src="${PATH }/static/videos/1.1(Av86290157,P1).mp4">
                            <source type="video/ogg" src="${PATH }/static/videos/1.1(Av86290157,P1).ogg">
                        </video>
                    </div>
                    <p>羽毛球基础训练</p>
                </div>
                <div class="col-md-3">
                    <div class="list3">
                        <video width="275px" height="150px" controls>
                            <source type="video/mp4" src="${PATH }/static/videos/1.1(Av86290157,P1).mp4">
                            <source type="video/ogg" src="${PATH }/static/videos/1.1(Av86290157,P1).ogg">
                        </video>
                    </div>
                    <p>羽毛球基础训练</p>
                </div>
            </div>
        </div>
    </div>

    <!-- 线上好课 -->
    <div id="course">
        <div class="box_titleTwoC">
            <h2>线上好课</h2>
            <div class="contentC">
                <p class="titleC">近期更新课程</p>
            </div>
        </div>
        <div id="box_rowC">
            <div class="row">
                <div class="col-md-3">
                    <div class="list">
                        <video width="275px" height="150px" controls>
                            <source type="video/mp4" src="${PATH }/static/videos/1.打球必备10种过人动作(Av459790469,P1).mp4">
                            <source type="video/ogg" src="${PATH }/static/videos/1.打球必备10种过人动作(Av459790469,P1).mp4">
                        </video>
                    </div>
                    <p>篮球教学</p>
                </div>
                <div class="col-md-3">
                    <div class="list1">
                        <video width="275px" height="150px" controls>
                            <source type="video/mp4" src="${PATH }/static/videos/1.打球必备10种过人动作(Av459790469,P1).mp4">
                            <source type="video/ogg" src="${PATH }/static/videos/1.打球必备10种过人动作(Av459790469,P1).mp4">
                        </video>
                    </div>
                    <p>篮球教学</p>
                </div>
                <div class="col-md-3">
                    <div class="list2">
                        <video width="275px" height="150px" controls>
                            <source type="video/mp4" src="${PATH }/static/videos/1.打球必备10种过人动作(Av459790469,P1).mp4">
                            <source type="video/ogg" src="${PATH }/static/videos/1.打球必备10种过人动作(Av459790469,P1).mp4">
                        </video>
                    </div>
                    <p>篮球教学</p>
                </div>
                <div class="col-md-3">
                    <div class="list3">
                        <video width="275px" height="150px" controls>
                            <source type="video/mp4" src="${PATH }/static/videos/1.打球必备10种过人动作(Av459790469,P1).mp4">
                            <source type="video/ogg" src="${PATH }/static/videos/1.打球必备10种过人动作(Av459790469,P1).mp4">
                        </video>
                    </div>
                    <p>篮球教学</p>
                </div>
            </div>
        </div>
    </div>

    <!-- 热门 -->
    <div id="hot">
        <div class="row">
            <div class="col-md-6">
                <div class="title">
                    <p>MORE</p>
                    <h3>热门帖子</h3>
                </div>
                <div class="hot_list">
                    <ul>
                        <li>
                            <a class="txt" href="#">xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</a>
                            <a class="time" href="#">2021-4-14</a>
                        </li>
                        <li>
                            <a class="txt" href="#">xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</a>
                            <a class="time" href="#">2014-4-14</a>
                        </li>
                        <li>
                            <a class="txt" href="#">xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</a>
                            <a class="time" href="#">2014-4-14</a>
                        </li>
                        <li>
                            <a class="txt" href="#">xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</a>
                            <a class="time" href="#">2014-4-14</a>
                        </li>
                        <li>
                            <a class="txt" href="#">xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</a>
                            <a class="time" href="#">2014-4-14</a>
                        </li>
                        <li>
                            <a class="txt" href="#">xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</a>
                            <a class="time" href="">2014-4-14</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-md-6">
                <div class="title">
                    <p>MORE</p>
                    <h3>热门约战</h3>
                </div>
                <div class="hot_tag">
                    <label class="football">
                        <a href="">足球</a>
                    </label>
                    <label class="tennis">
                        <a href="">网球</a>
                    </label>
                    <label class="running">
                        <a href="">跑步</a>
                    </label>
                    <label class="ping-pong">
                        <a href="">乒乓球</a>
                    </label>
                    <label class="badminton">
                        <a href="">羽毛球</a>
                    </label>
                    <label class="basketball">
                        <a href="">篮球</a>
                    </label>
                </div>
            </div>
        </div>
    </div>

    <!-- 尾部 -->
    <div id="end">
        <div class="row">
            <div class="col-md-4">
                <a href="#">广州未来可期发展有限公司</a>
                <p>报名电话：020-000-0000</p>
                <p>招商电话：000-000-0000</p>
                <p>联系邮箱：xxx@.com</p>
                <p class="copyright"> ©2021 - 谊动 版权所有</p>
            </div>
            <div class="col-md-4">
                <ul>
                    <li>
                        友情链接：<a href="">央视体育</a>
                    </li>
                    <li class="list">
                        <a href="">百度地图</a>
                    </li>
                    <li class="list">
                        <a href="">体育频道</a>
                    </li>
                </ul>
            </div>
        </div>

    </div>
</body>

</html>