<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0039)http://lygljxcxtd.jxtd2011.nwnu.edu.cn/ -->
<html xmlns="http://www.w3.org/1999/xhtml">

<title>毕业设计管理系统-添加老师信息页面</title>

<meta http-equiv="Page-Enter" content="blendTrans(Duration=1)">
<meta http-equiv="Page-Exit" content="blendTrans(Duration=1)">


<link href="./css_files/index.css" rel="stylesheet" type="text/css">
<link href="./css_files/index1.css" rel="stylesheet" type="text/css">
<style>
@import url("/css/index.css");
.tr td{
color:#fff;
background:#FF3333;
}
.inp{
 background-color:#00AA00;
 color:#fff;
 width:80px;
 height:35px;
 font-saze:20px;
}

</style>

</head>
<body>
<div id="warp">
<div id="top">
	<div id="top1"></div>
    <div id="menu">
    <ul style="float:left; font-size:5px">
        	<li>欢迎您，${sessionScope.login.account}同学</li></ul>
    	<ul style="float:right">
        	<li><a href="logout">注销登录</a></li>
            
      </ul>
    </div>
    
    
</div>

<div id="index">
	<div class="right" id="right">
	  <div class="kcjj">
	   
	    <div class="kcjj_wz">

<p>
			下面是为题目列表：
		</p>

		<table width="398" height="100" border="1">
		<tr class="tr">
		    <td width="500">题目</td>
		    <td width="235">类型</td> 
		    <td width="235">出题人</td> 
		   <td width="235">选题</td> 
	      </tr>
		 <s:iterator value="titles" var="title1">
		  <tr><form action="seclectTitle1" method="get">
		    <td width="235"><input type="text" name="title.tmId" value="${title1.tmId}" size="2"/>${title1.title}</td>
             <td>${title1.type}</td>
             <td>${title1.account}</td>
						<td><input class="inp" type="submit" value="提交"/></td>
	      </form></tr></s:iterator>
    </table>
            
             </div>
      </div>
	</div>
    <div class="left" id="left">
    	<div class="fzrjj"><div class="more"></div>
        <br><br> <br>
        	
          <p class="jj"> <table width="194" height="168" border="1">
            <tr>
              <td><a href="studentSeclectTitileForm">毕业设计选题</a></td>
            </tr>
            <tr>
              <td><a href="studentModifyPassForm">修改登录密码</a></td>
            </tr>
            <tr>
              <td><a href="studentScanReviewerMess">查看个人信息</a></td>
            </tr>
             <tr>
              <td><a href="fileUpload">毕业设计</a></td>
            </tr>
             <tr>
             <td><a href="studentScanTitle">我的选题</a></td>
             </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
          </table></p>
        </div>
        
        
    </div>


</div>



<div id="footer"><div id="wz">
   <br><hr>
Copyright &#169; 2017 邹宇. <br>

技术支持&nbsp;&nbsp;：宇&nbsp;&nbsp;邹

</div>
</div>



</div>


</body></html>