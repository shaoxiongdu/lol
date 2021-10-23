<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 杜少雄
  Date: 2021/10/23
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>英雄列表</title>
    <%@ include file="/jsp/common/head.jsp"%>
    <link rel="stylesheet" href="static/css/heroList.css">
</head>
<body>

    <div class="main">
        <div class="title">
            <h2>英雄联盟所有英雄列表</h2>
        </div>
        <div class="heroList animate__flash">
            <c:forEach items="${requestScope.heroList}" var="hero">
                <a href="heroServlet?action=detail&id=${hero.id}">
                    <div class="heroItem animate__flash">
                        <img src="${hero.avatarURL}" alt="">
                        <br>${hero.title}
                    </div>
                </a>

            </c:forEach>
        </div>
    </div>

</body>

<script>

    $("#pn_btn").click(()=>{

        let pageNo = $("#pn_input").val();

        if(pageNo < 1 || pageNo > ${requestScope.page.totalPageNo}){
            alert("跳转页码错误，请重试呐！")
            return;
        }

        location.href = "heroServlet?action=page&pageNo=" + pageNo;

    })

</script>
</html>
