/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.7
 * Generated at: 2021-04-23 13:41:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/layui/css/layui.css\"> \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/layui/css/layui.mobile.css\"> \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/layui/css/layui.css\">\r\n");
      out.write("    <title>????????????</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/img/bg.jpg);background-size: cover;background-repeat: no-repeat;\">\r\n");
      out.write("    <div class=\"space\"></div>\r\n");
      out.write("    <div id=\"login-box\">\r\n");
      out.write("        <div class=\"login-box\">\r\n");
      out.write("            <h1 style=\"font-weight: bold;\">??????????????????</h1>\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/img/logo.png\" alt=\"\" style=\"width: 70px;height: 70px;\">\r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/saveUser\" method=\"post\" class=\"regist_form\">\r\n");
      out.write("                <div class=\"loginbar\">\r\n");
      out.write("                    <i class=\"layui-icon layui-icon-username\" style=\"font-size: 30px; color: #FFF;\"></i>\r\n");
      out.write("                    <input type=\"text\" name=\"loginacct\" id=\"username\" placeholder=\"???????????????\" class=\"loginacct\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.loginacct }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"loginbar\">\r\n");
      out.write("                    <i class=\"layui-icon layui-icon-password\" style=\"font-size: 30px; color: #FFF;\"></i>\r\n");
      out.write("                    <input type=\"password\" name=\"userpswd\" id=\"password\" placeholder=\"???????????????\" class=\"userpswd\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"loginbar\">\r\n");
      out.write("                    <i class=\"layui-icon layui-icon-password\" style=\"font-size: 30px; color: #FFF;\"></i>\r\n");
      out.write("                    <input type=\"password\" name=\"reuserpswd\" id=\"password\" placeholder=\"???????????????\" class=\"reuserpswd\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"loginbar\">\r\n");
      out.write("                    <i class=\"layui-icon layui-icon-username\" style=\"font-size: 30px; color: #FFF;\"></i>\r\n");
      out.write("                    <input type=\"text\" name=\"telephone\" id=\"telephone\" placeholder=\"?????????????????????\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"loginbar\">\r\n");
      out.write("                    <i class=\"layui-icon layui-icon-username\" style=\"font-size: 30px; color: #FFF;opacity: 0;\"></i>\r\n");
      out.write("                    <input id=\"checkCode\" type=\"text\" name=\"code\" placeholder=\"??????????????????\" class=\"input_code\">\r\n");
      out.write("                    <button id=\"code-btn\" type=\"button\">???????????????</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"login-btn\">\r\n");
      out.write("                    <!-- <input type=\"button\" value=\"??????\" id=\"bt\" class=\"\"> -->\r\n");
      out.write("                    <a href=\"#\" class=\"bt\" onclick=\"regist()\">??? ???</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"resigter\">\r\n");
      out.write("                    <a href=\"login\" style=\"float: left;\">?????????????</a>\r\n");
      out.write("                    <!-- <a href=\"\" style=\"float: right;\">?????????????</a> -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/jquery/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/jquery/layer/layer.js\"></script>\r\n");
      out.write("      \t<script type=\"text/javascript\">\r\n");
      out.write("      \t\r\n");
      out.write("      \t$(\".loginacct\").blur(function(){\r\n");
      out.write("\t\t\t//???username???\r\n");
      out.write("\t\t\tvar loginacct = $(this).val();\r\n");
      out.write("\t\t\tvar reLoginacct = /^\\w{6,12}$/;\r\n");
      out.write("\t\t\tif(reLoginacct.test(loginacct)==false){\r\n");
      out.write("\t    \t\t  layer.tips(\"<span style='color:black'>\"+'?????????6-12????????????????????????_????????????'+\"</span>\",\".loginacct\",{ tips: [2, ' #FFFFFF'],\r\n");
      out.write("\t\t    \t        time: 3000\r\n");
      out.write("\t    \t        })\r\n");
      out.write("\t    \t\t  return false;\r\n");
      out.write("\t    \t  }\r\n");
      out.write("\t\t\t//ajax????????????\r\n");
      out.write("\t\t\t$.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/checkUser\",{loginacct:loginacct},function(msg){ \r\n");
      out.write("// \t\t\t\talert(typeof(msg));\r\n");
      out.write("\t\t\t\tif($.trim(msg) == \"true\"){\r\n");
      out.write("\t\t\t\t\tlayer.tips(\"<span style='color:black'>\"+'?????????????????????????????????????????????'+\"</span>\",\".loginacct\",{ tips: [2, ' #FFFFFF'],\r\n");
      out.write("\t\t    \t        time: 3000\r\n");
      out.write("\t    \t        });\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tlayer.tips(\"<span style='color:black'>\"+'????????????????????????'+\"</span>\",\".loginacct\",{ tips: [2, ' #FFFFFF'],\r\n");
      out.write("\t\t    \t        time: 3000\r\n");
      out.write("\t    \t        });\r\n");
      out.write("\t\t\t\t} \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("      \t\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t$(\".userpswd\").blur(function(){\r\n");
      out.write("      \t\tvar userpswd = $(\".userpswd\").val();//??????\r\n");
      out.write("      \t\tvar rePswd = $(\".reuserpswd\").val();//???????????????\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t\t//???????????????????????????6??????????????????1??????????????????1????????????1???????????????\r\n");
      out.write("      \t\tvar reuserpswd =  /(?!^[0-9]+$)(?!^[A-z]+$)(?!^[^A-z0-9]+$)^.{8,16}$/;\r\n");
      out.write("\t\t\t if(reuserpswd.test(userpswd)==false){\r\n");
      out.write("\t\t\t\t layer.tips(\"<span style='color:black'>\"+'?????????8-16???????????????????????????????????????????????????????????????????????????'+\"</span>\",\".userpswd\",{ tips: [2, ' #FFFFFF'],\r\n");
      out.write("\t\t    \t        time: 3000\r\n");
      out.write("\t    \t        });\r\n");
      out.write("\t    \t\t  return false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t \r\n");
      out.write("      \t\t\r\n");
      out.write("      \t});\r\n");
      out.write("      \t\r\n");
      out.write("      \t\r\n");
      out.write("      \t$(\".reuserpswd\").blur(function(){\r\n");
      out.write("      \t\tvar userpswd = $(\".userpswd\").val();//??????\r\n");
      out.write("      \t\tvar rePswd = $(\".reuserpswd\").val();//???????????????\r\n");
      out.write("\t\t\tif(userpswd != rePswd){\r\n");
      out.write("\t\t\t\t\t layer.tips(\"<span style='color:black'>\"+'????????????????????????'+\"</span>\",\".reuserpswd\",{ tips: [2, ' #FFFFFF'],\r\n");
      out.write("\t\t\t    \t        time: 3000\r\n");
      out.write("\t\t    \t        });\r\n");
      out.write("\t\t    \t\t  return false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t});\r\n");
      out.write("      \t\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("\t\t //?????????????????????\r\n");
      out.write("  \t  \r\n");
      out.write("        $('#code-btn').click(function(){\r\n");
      out.write("            var count = 120;\r\n");
      out.write("            var phone=$(\"#telephone\").val();//????????????  \r\n");
      out.write("            var code = $(\".input_code\").val();//???????????????\r\n");
      out.write("            var reg_phone = /1\\d{10}/;\r\n");
      out.write("            if(!reg_phone.test(phone)){   //??????????????????????????????\r\n");
      out.write("               layer.tips(\"<span style='color:black'>\"+'???????????????????????????'+\"</span>\",\"#telephone\",{ tips: [2, ' #FFFFFF'],\r\n");
      out.write("\t    \t        time: 3000\r\n");
      out.write("   \t        });\r\n");
      out.write("                return false;\r\n");
      out.write("            } \r\n");
      out.write("            //????????????  \r\n");
      out.write("            $(\"#code-btn\").attr('disabled','disabled');  \r\n");
      out.write("            $(\"#code-btn\").html(\"?????????\" + count + \"???\");  \r\n");
      out.write("            var timer = setInterval(function(){  \r\n");
      out.write("              count--;\r\n");
      out.write("              $(\"#code-btn\").html(\"???????????????\" + count + \"???\"); \r\n");
      out.write("              if (count==0) {\r\n");
      out.write("                clearInterval(timer);\r\n");
      out.write("                $(\"#code-btn\").attr(\"disabled\",false);//????????????  \r\n");
      out.write("                $(\"#code-btn\").html(\"?????????????????????\").style(\"color\",\"black\");\r\n");
      out.write("                code = \"\";//??????????????????????????????????????????????????????????????????????????????????????? \r\n");
      out.write("              }\r\n");
      out.write("            },1000);\r\n");
      out.write("\r\n");
      out.write("            //???????????????????????????  \r\n");
      out.write("            $.ajax({  \r\n");
      out.write("                type: \"POST\", //???POST????????????  \r\n");
      out.write("                dataType: \"json\", //????????????:JSON  \r\n");
      out.write("                url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sendCode', //????????????  \r\n");
      out.write("                data: {\"phone\":phone},\r\n");
      out.write("                error: function (XMLHttpRequest, textStatus, errorThrown) { \r\n");
      out.write("                \tlayer.tips(\"<span style='color:black'>\"+'??????????????????????????????????????????????????????'+\"</span>\",\".input_code\",{ tips: [2, ' #FFFFFF'],\r\n");
      out.write("    \t    \t        time: 3000\r\n");
      out.write("        \t        })\r\n");
      out.write("                \treturn false;\r\n");
      out.write("                },  \r\n");
      out.write("                success: function (msg){\r\n");
      out.write("              \t  if($.trim(msg)=='true'){\r\n");
      out.write("                \t\tlayer.msg(\"??????????????????????????????\",{time:2000,icon:6});\r\n");
      out.write("                \t\t\r\n");
      out.write("              \t  }else{\r\n");
      out.write("              \t\t  layer.alert(\"???????????????????????????????????????????????????\",{icon:99});\r\n");
      out.write("              \t\t  return false;\r\n");
      out.write("              \t  }\r\n");
      out.write("                }//??????saveUser \r\n");
      out.write("            });\r\n");
      out.write("        }); \r\n");
      out.write("      \r\n");
      out.write("        $(window).keydown(function(e){\r\n");
      out.write("            var curKey = e.which; \r\n");
      out.write("            if(curKey == 13){\r\n");
      out.write("               regist(); \r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("\t\t//????????????????????????\r\n");
      out.write("\t\t\t  function regist() {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t  \t  var code = $(\".input_code\").val();//???????????????\r\n");
      out.write("\t\t\t  \t  var phone=$(\"#telephone\").val();//????????????  \r\n");
      out.write("\t\t\t  \t  var loginacct =$(\".loginacct\").val();//??????\r\n");
      out.write("\t\t\t  \t  var userpswd = $(\".userpswd\").val();//??????\r\n");
      out.write("\t      \t\t  var rePswd = $(\".reuserpswd\").val();//???????????????\r\n");
      out.write("\t      \t\t  \r\n");
      out.write("\t      \t\t  \r\n");
      out.write("\t      \t\t\r\n");
      out.write("\t      \t\t  \r\n");
      out.write("\t      \t\tvar reLoginacct = /^\\w{6,12}$/;\r\n");
      out.write("    \t\t\tif(reLoginacct.test(loginacct)==false){\r\n");
      out.write("    \t    \t\t  layer.alert(\"?????????6-12????????????????????????_?????????\",{icon:99})\r\n");
      out.write("    \t    \t\t  return false;\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t    \t  }\r\n");
      out.write("    \t\t\t\r\n");
      out.write("\t          \t\t var reuserpswd = /(?!^[0-9]+$)(?!^[A-z]+$)(?!^[^A-z0-9]+$)^.{8,16}$/;\r\n");
      out.write("\t    \t\t\t if(reuserpswd.test(userpswd)==false){\r\n");
      out.write("\t    \t\t\t\t layer.alert(\"?????????8-16????????????????????????????????????????????????????????????????????????\",{icon:99});\r\n");
      out.write("\t    \t    \t\t  return false;\r\n");
      out.write("\t    \t\t\t }else{\r\n");
      out.write("\t    \t\t\t\t if(userpswd != rePswd){\r\n");
      out.write("\t    \t\t\t\t\t layer.alert(\"?????????????????????\",{icon:99});\r\n");
      out.write("\t    \t\t    \t\t  return false;\r\n");
      out.write("\t    \t\t\t }\r\n");
      out.write("\t    \t\t\t\t \r\n");
      out.write("\t    \t\t\t }\r\n");
      out.write("\t      \t\t  \r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t    \t\t\t//ajax????????????\r\n");
      out.write("\t     \t\t\t$.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/checkUser\",{loginacct:loginacct},function(msg){ \r\n");
      out.write("//\t      \t\t\t\talert(typeof(msg));\r\n");
      out.write("\t     \t\t\t\tif($.trim(msg) == \"true\"){\r\n");
      out.write("\t     \t\t\t\t\tlayer.alert(\"??????????????????????????????????????????\",{icon:99});\r\n");
      out.write("\t     \t\t\t\t\treturn false;\r\n");
      out.write("\t     \t\t\t\t}else{\r\n");
      out.write("\t     \t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t    \t\t\t\t\t$.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/checkCode\",{phone:phone},function(result){\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t\t\t\t var reg_phone = /1\\d{10}/;\r\n");
      out.write("\t    \t\t\t              if(!reg_phone.test(phone)){   //??????????????????????????????\r\n");
      out.write("\t    \t\t\t            \t  layer.tips(\"<span style='color:black'>\"+'??????????????????????????????'+\"</span>\",\"#telephone\",{ tips: [2, ' #FFFFFF']\r\n");
      out.write("\t    \t\t\t            \t ,time: 3000});\r\n");
      out.write("\t    \t\t\t                  return false;\r\n");
      out.write("\t    \t\t\t              }\r\n");
      out.write("\t    \t\t\t              \r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t\t\t\tif(code == \"\"){\r\n");
      out.write("\t    \t\t\t\t\t\t\tlayer.alert(\"?????????????????????\",{icon:99});\r\n");
      out.write("\t    \t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t    \t\t\t\t\t\t}\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t\t\t\t//????????????????????????\r\n");
      out.write("\t    \t\t\t \t\t\tif(code!=result){\r\n");
      out.write("\t    \t\t\t \t\t\t\tlayer.alert(\"??????????????????????????????????????????????????????\",{icon:99});\r\n");
      out.write("\t    \t\t\t \t\t\t\treturn false;\r\n");
      out.write("\t    \t\t\t \t\t\t}\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t \t\t\tlayer.msg(\"?????????!?????????????????????....\",{time:1500,icon:6},function(){\r\n");
      out.write("\t    \t    \t\t\t\t\t$(\".regist_form\").submit();\r\n");
      out.write("\t    \t\t\t\t\t\t});\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t \t\t\t\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t \t\t\t\r\n");
      out.write("\t    \t\t\t\t\t\t\r\n");
      out.write("\t    \t\t\t\t\t\r\n");
      out.write("\t    \t\t\t \t\t\t\r\n");
      out.write("\t    \t\t\t\t\t});\r\n");
      out.write("\t    \t\t\t\t\t\r\n");
      out.write("\t     \t\t\t\t\t\r\n");
      out.write("\t     \t\t\t\t}\r\n");
      out.write("\t     \t\t\t\t\r\n");
      out.write("\t     \t\t\t\t\r\n");
      out.write("\t     \t\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t \t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t    \t  \r\n");
      out.write("\t    \t \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t      };\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t\r\n");
      out.write("        \r\n");
      out.write("        </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
