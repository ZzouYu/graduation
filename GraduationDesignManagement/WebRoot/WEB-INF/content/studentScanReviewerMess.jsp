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


<P>我的基本信息：</P>
		<table width="416" height="358" border="1">
			<tr>
				<th width="133">
					学号
				</th>
				<td width="267">
					${student.studentNo}
				</td>
			</tr>
			<tr>
				<th>
					姓名
				</th>
				<th>
					${student.name}
				</th>
			</tr>
			<tr>
				<th>
					专业
				</th>
				<td>
					${student.specialty}
				</td>
			</tr>
			<tr>
				<th>
					班级
				</th>
				<th>
					${student.classno}
				</th>
			</tr>
			<tr>
				<th>
					电话号码
				</th>
				<td>
					${student.telephone}
				</td>
			</tr>
			<tr>
				<th>
					E-mail
				</th>
				<th>
					${student.email}
				</th>
			</tr>
			<tr>
				<th>
					QQ
				</th>
				<td>
					${student.qq}
				</td>
			</tr>
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
             <td><a href="fileUpload">我的毕业设计</a></td>
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
Copyright &#169;2017 邹宇. <br>

技术支持&nbsp;&nbsp;：宇&nbsp;&nbsp;邹

</div>
</div>



</div>


</body></html>