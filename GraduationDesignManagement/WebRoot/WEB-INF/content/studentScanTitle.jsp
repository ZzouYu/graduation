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
.tb{
 border:1px solid #ddd;
}
.tr1 td{
 color:#fff;
 background-color:green;
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
	  
	   
  </body>  
	    <div class="kcjj_wz">
	  <table width="398" height="80" class="tb" border="1">
		<tr class="tr1">
		    <td width="235" >题目</td>
		    <td width="235">类型</td> 
		    <td width="235">出题人</td> 
		     <td width="235">状态</td> 
		     <td width="235">修改</td> 
	      </tr>
		    <td>手机订餐系统</td>
             <td>android</td>
             <td>张三</td>
             <td>已选</td>
             <td><input type="submit" value="重选"></td>
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
Copyright &#169; 2017 邹宇.<br>

技术支持&nbsp;&nbsp;：宇&nbsp;&nbsp;邹

</div>
</body>
</html>