<%--
  Created by IntelliJ IDEA.
  user: lumanman
  Date: 2018/7/5
  Time: 下午3:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Hello World</title>
    <script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
Hello World!<br/>
<%
    out.println("Your IP address isasdasd " + request.getRemoteAddr());
%>
<script >
    $.ajax({
        url:'http://localhost:8080/test',
        type:'post',
        data:{usernid:'djh123',
            password:'djhmima',
            username:'djh',
            sex:'female',
            age:'14',
            address:'asdas',
            tag:'海贼王'},
        success:function(res) {
            console.log(res)
        }
    })
</script>
</body>
</html>