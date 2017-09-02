
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<title>毕业设计管理系统——登录页面</title>



<style type="text/css" rel="stylesheet" href="./css_files/bootstrap.min.css">
BODY       {MARGIN-TOP:20px;MARGIN-BOTTOM:0px; background:url(./cssIndex_files/bg_1.jpg) }
TABLE      {FONT-SIZE:12px;FONT-FAMILY:verdana,arial;}
INPUT      {FONT-SIZE:12px; FONT-FAMILY:verdana,sans-serif;}
.inputbox  {BACKGROUND:#FFFFFF; PADDING-LEFT:1px;BORDER-RIGHT:#2C59AA 1px solid; BORDER-TOP:#2C59AA 1px solid; FONT-SIZE:12px; BORDER-LEFT:#2C59AA 1px solid; COLOR:#000000; BORDER-BOTTOM:#2C59AA 1px solid; HEIGHT:20px;}
.btn_2k3   {BORDER-RIGHT:#002D96 1px solid; PADDING-RIGHT:2px; BORDER-TOP:#002D96 1px solid; PADDING-LEFT:2px; FONT-SIZE:12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#FFFFFF, EndColorStr=#9DBCEA); BORDER-LEFT:#002D96 1px solid; CURSOR:hand; COLOR:#000000; PADDING-TOP:2px; BORDER-BOTTOM:#002D96 1px solid;}
.copyright {FONT-SIZE:12px; COLOR:#A8A8A8; LINE-HEIGHT:20px; LETTER-SPACING:0px; TEXT-DECORATION:none;}
</style>
</head>
<body onLoad="checkbrOK();" oncontextmenu="return false" ondragstart="return false">
<form id="loginForm" name="loginForm" action="http://jw3.nwnu.edu.cn:7001/WebEducation/education.jsp" method="post">
   <input id="userID"  name="userID" type="hidden" value="">
   <input id="userInfo" name="userInfo" type="hidden" value="">
   <input id="userOther" name="userOther" type="hidden" value="">
</form>
<table height="100%" width="100%">
  <tbody>
  <tr>
    <td>
      <table id="Table2" cellspacing="0" cellpadding="0" align="center">
        <tbody>
          <tr>
             <td valign="top"><img id="Image1" alt=""border="0"></td>
             <td><br><img id="Image2" alt="" src="./cssIndex_files/web.gif" border="0"></td>
          </tr>
        </tbody>
      </table>
    </td>
  </tr>
  <tr>
    <td height="10">
    </td>
  </tr>
  <tr>
    <td valign="top" align="middle" height="100%">
      <table id="Table1" style="BORDER-RIGHT: #b0b0b0 1pt outset; PADDING-RIGHT: 10px; 
      BORDER-TOP: #b0b0b0 1pt outset; PADDING-LEFT: 10px; BACKGROUND: #ffffff;
       FILTER: progid: DXImageTransform.Microsoft.dropshadow(OffX=5, OffY=5, Color=&#39;
       #CCCCCC&#39;, Positive=&#39;true&#39;); PADDING-BOTTOM: 10px; 
       BORDER-LEFT: #b0b0b0 1pt outset; WIDTH: 350px; PADDING-TOP: 10px; 
       BORDER-BOTTOM: #b0b0b0 1pt outset; HEIGHT: 200px" cellspacing="0" cellpadding="4" border="0">
        <tbody>
          <tr>
            <td style="FILTER: progid: DXImageTransform.Microsoft.Alpha(opacity=90)" align="middle" 
            bgcolor="#63a3f2" colspan="4" height="30"><span id="Label3" style="FONT-SIZE=14px;FONT-WEIGHT: bold; COLOR: black">用 户 登 录</span></td>
          </tr>
          <tr height="3">
            <td nowrap="" width="50" bgcolor="#00ae5c"></td>
            <td nowrap="" width="30" bgcolor="#f7b61a"></td>
            <td nowrap="" width="45" bgcolor="#e23845"></td>
            <td nowrap="" width="227" bgcolor="#333333"></td>
          </tr>
          <tr>
            <td valign="top" align="left">
              <table width="102" height="110">
                <tbody>
                  <tr>
                    <td><img id="Image1" alt="" src="./cssIndex_files/login.jpg" border="0"></td>
                  </tr>
                  <tr>
                   
                  </tr>
                </tbody>
              </table>
            </td>
            <td valign="center" align="middle" colspan="3">
              <table cellpadding="5" width="252">
                <tbody>
                  <tr>
                      <s:form action="login.action">
    	<s:textfield label="用户名" name="user.account"></s:textfield>
    	<s:password label="密码" name="user.password"></s:password>
    	<s:submit label="登录" value="登录"></s:submit>
    </s:form>
                  </tr>
                </tbody>
              </table>
            </td>
          </tr>
        </tbody>
      </table>
    </td>
  </tr>
  <tr>
    <td valign="bottom" align="middle">
       <table id="Table3" cellspacing="0" cellpadding="0" align="center">
         <tbody>
           <tr>
              <td align="middle">热线电话：18971032642</td>
           </tr>
           <tr>
             <td align="middle"><img height="1" src="./cssIndex_files/line.jpg" width="90%"></td>
           </tr>
           <tr>
             <td class="copyright" valign="bottom" align="middle" height="20">版权所有(C) 邹宇&nbsp;;建议：IE浏览器、分辨率为1024X768</td>
           </tr>
         </tbody>
       </table>
    </td>
  </tr>
  </tbody>
</table>


</body></html>