<%--
  Created by IntelliJ IDEA.
  User: yangrukun
  Date: 2020/8/22
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>超链接</title>
  </head>
  <body>
  <a href="src\Test02.jsp">To Target</a>

 这里第一：超链接链接非web的文件夹下的.jsp不能连接 。
  第二：超链接不能带web/src\Test02.jsp,只能直接是直接src\Test02.jsp。
  注意：写路径的时候，不能以工程目录来写 ，要按照编译结果来写。

  一般的就是web下面的所有文件变成了编译结果，而且web也不存在，仅仅是web里面的目录变成了编译结果的目录
  不包括web这个。


  </body>
</html>
