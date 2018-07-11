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
<br>
欢迎，尊敬的${sessionScope.username}
<script>
    // $.ajax({
    //     url:'http://localhost:8080/register',
    //     type:'post',
    //     dataType:"text",
    //     data:{usernid:'djh321',
    //         password:'djhmima',
    //         username:'djh',
    //         sex:'女',
    //         age:'14',
    //         address:'asdas',
    //         tag:'海贼王'},
    //     error:function(data){
    //         alert("error" + data);
    //     },
    //     success:function(data) {
    //         console.log(1)
    //     }
    // })
    $.ajax({
        url:'http://localhost:8080/login',
        type:'post',
        dataType:"text",
        data:{usernid:'djh321',
            password:'djhmima'
        },
        error:function(data){
            alert("error" + data);
        },
        success:function(data) {
            console.log(2)
        }
    })
</script>
</body>
</html>