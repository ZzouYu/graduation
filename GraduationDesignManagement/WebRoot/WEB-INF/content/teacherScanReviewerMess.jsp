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

</style>

</head>
<body>
<div id="warp">
<div id="top">
	<div id="top1"></div>
    <div id="menu">
    <ul style="float:left; font-size:5px">
        	<li>欢迎您，${sessionScope.login.account}老师</li></ul>
    	<ul style="float:right">
        	<li><a href="logout">注销登录</a></li>
            
      </ul>
    </div>
    
    
</div>

<div id="index">
	<div class="right" id="right">
	  <div class="kcjj">
	   
	    <div class="kcjj_wz">
<P>我的基本信息：</P>
	<table width="416" height="358" border="1">
			<tr>
				<th width="133">
					教工账号
				</th>
				<td width="267">
					${Teacher.teacheNo}
				</td>
			</tr>
			<tr>
				<th>
					姓名
				</th>
				<td>
					${Teacher.name}
				</td>
			</tr>
			<tr>
				<th>
					职称
				</th>
				<td>
					${Teacher.professional}
				</td>
			</tr>
			<tr>
				<th>
					电话号码
				</th>
				<td>
					${Teacher.telephone}
				</td>
			</tr>
			<tr>
				<th>
					地址
				</th>
				<td>
					${Teacher.address}
				</td>
			</tr>
			<tr>
				<th>
					E-mail
				</th>
				<td>
					${Teacher.email}
				</td>
			</tr>
		</table> </div>
      </div>
	</div>
    <div class="left" id="left">
    	<div class="fzrjj"><div class="more"></div>
        <br><br> <br>
        	
          <p class="jj"> <table width="194" height="168" border="1">
            <tr>
              <td><a href="teacherAddTitileForm">添加题目</a></td>
            </tr>
            <tr>
              <td><a href="teacherModifyPassForm">修改登录密码</a></td>
            </tr>
            <tr>
              <td><a href="teacherScanReviewerMess">查看个人信息</a></td>
            </tr>
             <tr>
              <td><a href="teacherScanReviewerMess">毕业论文</a></td>
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