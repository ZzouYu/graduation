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
        	<li>欢迎您，${sessionScope.login.account}</li></ul>
    	<ul style="float:right">
        	<li><a href="logout">注销登录</a></li>
            
      </ul>
    </div>
    
    
</div>

<div id="index">
	<div class="right" id="right">
	  <div class="kcjj">
	   
	    <div class="kcjj_wz">

	      老师信息
		<s:form action="addTeacher" method="post">
			<s:textfield name="teacher.teacheNo" label="教工编号"></s:textfield>
			<s:textfield name="teacher.name" label="姓名"></s:textfield>
			<s:radio list="#{1:'男',0:'女'}" name="teacher.sex" label="性别"></s:radio>
			<s:textfield name="teacher.professional" label="职称"></s:textfield>
			<s:textfield name="teacher.telephone" label="联系电话"></s:textfield>
			<s:textfield name="teacher.address" label="住址"></s:textfield>
			<s:textfield name="teacher.email" label="邮箱"></s:textfield>
			<s:radio list="#{1:'是',0:'否'}" label="是否评审人" name="teacher.reviewer"></s:radio>
			<s:submit value="提交"></s:submit>
		</s:form> </div>
      </div>
	</div>
    <div class="left" id="left">
    	<div class="fzrjj"><div class="more"></div>
        <br><br> <br>
        	
          <p class="jj"> <table width="194" height="168" border="1"  >
            <tr>
              <td><a href="addTeacherForm">添加老师信息</a></td>
            </tr>
            <tr>
              <td><a href="addStudentForm">添加学生信息</a></td>
            </tr>
            <tr>
              <td><a href="updatePasswordForm">同意修改密码</a></td>
            </tr>
            <tr>
              <td><a href="reviewerForm">为题目指定评审人</a></td>
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