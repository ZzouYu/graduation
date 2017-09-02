<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>search</title>
<style>
#mydiv{
 position:absolute;
 left:50%;
 top:50%;
 margin-left:-200px;
 margin-top:-100px;
}
</style>
<script>
var xmlHttp;
     function getContent(){
    	var content=document.getElementById("keyword");
    	if(content.value==""){
    		clearContent();
    		return ;
    	}
    	xmlHttp=createXmlHttp();
    	var url="search?keyword="+escape(content.value);//不用escape传中文会有问题
    	xmlHttp.open("GET",url,true);
    	xmlHttp.onreadystatechange=callback;
    	xmlHttp.send(null);
     }

     
     function createXmlHttp(){
    	 var xmlHttp;
    	 if(window.XMLHttpRequest){
    		 xmlHttp=new XMLHttpRequest()
    	 }else if (window.ActiveXObject)
    	  {
    		  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    		  }
    	 return xmlHttp;
     }
     function callback(){
    	 if(xmlHttp.readyState == 4){
    		 if(xmlHttp.status == 200){
    		 var result=xmlHttp.responseText;
    		 var json = eval("("+result+")");
    		 setContent(json);
    		 }
    	 }
     }
    function setContent(contents){
    	clearContent();
    	var size = contents.length;
    	for(var i=0;i<size;i++){
    		var textNode=contents[i];
    		var tr=document.createElement("tr");
    		var td=document.createElement("td");
    		td.setAttribute("border", "0");
    		td.setAttribute("bdcolor", "#FFFAFA");
    		td.onmouseover=function(){
    			this.className="onmouseOver"
    		}
    		td.onmouseout=function(){
    			this.className="onmouseOut"
    		}
    		td.onclick=function(){	 
    			
    		}
    		var text=document.createTextNode(textNode);
    		td.appendChild(text);
    		tr.appendChild(td);
    		document.getElementById("content_table_body").appendChild(tr);
    	}
    }
    function clearContent(){
    	var contentTableBody = document.getElementById("content_table_body");
    	var size = contentTableBody.childNodes.length;
    	for(var i=size-1;i>=0;i--){
    		contentTableBody.removeChild(contentTableBody.childNodes[i])
    	}
    }
</script>
</head>
<body>
<div id="mydiv">
  <input type="text" size="50" id="keyword" onkeyup="getContent()"/>
   <input type="button" size="20" value="百度一下" />
   <div id="PopDiv">
      <table id="content_table" background-color="FFFAFA" border="0" cellspacing="0" 
      cellpadding="0">
      <tbody id="content_table_body">
     
      </tbody>
      </table>
   </div>
</div>
</body>
</html>