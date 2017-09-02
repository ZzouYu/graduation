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

<p>
			下面是为题目添加评审人的列表：
		</p>

		<table width="600"  height="50" border="1">
			<tr>
				<th width="80">
					题目主编号
				</th>
				<th width="110">
					题目名称
				</th>
				<th width="110">
					选定评审让人
				</th>
				<th width="40">
					提交
			    </th>
			</tr>
			<s:iterator value="titles" var="title1">
				<tr>
				
					<form action="agreeAddReviewer">
					
					<td>       
						<input type="text" name="titlem.tmId" value="${title1.tmId}" size="2"/>
						 </td>
					    <td>       
						
						${title1.title}
						 </td>

					<td>

						<select name="teacher.tid">
							<option value="0">
								点击选定评审人
							</option>
							<s:iterator value="teacherReviewList" var="teacherReview">
								<option value="<s:property value='lid'/>">
									<s:property value="name" />
								</option>
							</s:iterator>
						</select>
					</td>
					
						<td><input class="inp" type="submit" value="提交"/></td>
						
					</form>

				</tr>
			</s:iterator>

		</table>
            
             </div>
      </div>
	</div>
    <div class="left" id="left">
    	<div class="fzrjj"><div class="more"></div>
        <br><br> <br>
        	
          <p class="jj"> <table width="194" height="168" border="1">
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