<%--
  Created by IntelliJ IDEA.
  User: 杜少雄
  Date: 2021/10/23
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>英雄详情</title>
    <%@ include file="/jsp/common/head.jsp"%>
    <link rel="stylesheet" href="static/css/heroDetal.css">
</head>
<body>

    <div class="main animate__flash">
        <div class="header">
            <div class="avatar">
                <img src="${requestScope.hero.avatarURL}" alt="">
            </div>
            <div class="title">
                <h2> &nbsp;${requestScope.hero.title} 一 ${requestScope.hero.name} 一 ${requestScope.hero.englishName} <span style="color: red">(数据来源版本:${requestScope.hero.version})</span></h2>
            </div>
        </div>

        <div class="item">
            <div class="title">
                <h3>背景故事</h3>
            </div>
            <p>${requestScope.hero.story}</p>
        </div>

        <div class="item">
            <div class="title">
                <h3>初始属性</h3>
            </div>
            <table class="propertyTable">
                <tr>
                    <th>物理攻击</th>
                    <th>魔法攻击</th>
                    <th>防御</th>
                    <th>上手难度</th>
                    <th>初始血量</th>
                    <th>初始移动速度</th>
                    <th>攻击距离</th>
                    <th>攻击速度</th>
                </tr>
                <tr>
                    <td>${requestScope.hero.attack}</td>
                    <td> ${requestScope.hero.magic}</td>
                    <td> ${requestScope.hero.defense}</td>
                    <td> ${requestScope.hero.difficulty}</td>
                    <td> ${requestScope.hero.hp}</td>
                    <td> ${requestScope.hero.moveSpeed}</td>
                    <td> ${requestScope.hero.attackRange}</td>
                    <td> ${requestScope.hero.attackSpeed}</td>
                </tr>

            </table>
        </div>

        <div class="item" >
            <div class="title">
                <h3>技能介绍</h3>
            </div>
            <table class="skillTable">
                <tr>
                    <th>技能</th>
                    <th>图标</th>
                    <th class="name">名称</th>
                    <th>描述</th>
                </tr>
                <tr>
                    <td class="name">被动</td>
                    <td>
                        <img src="${requestScope.hero.passiveSkillIconUrl}" alt="">
                    </td>
                    <td class="name"> ${requestScope.hero.passiveSkillName}</td>
                    <td> ${requestScope.hero.passiveSkillDescription}</td>
                </tr>
                <tr>
                    <td class="name">Q</td>
                    <td>
                        <img src="${requestScope.hero.qSkillIconUrl}" alt="">
                    </td>
                    <td class="name"> ${requestScope.hero.qSkillName}</td>
                    <td> ${requestScope.hero.qSkillDescription}</td>
                </tr>
                <tr>
                    <td class="name">W</td>
                    <td>
                        <img src="${requestScope.hero.wSkillIconUrl}" alt="">
                    </td>
                    <td class="name"> ${requestScope.hero.wSkillName}</td>
                    <td> ${requestScope.hero.wSkillDescription}</td>
                </tr>
                <tr>
                    <td class="name">E</td>
                    <td>
                        <img src="${requestScope.hero.eSkillIconUrl}" alt="">
                    </td>
                    <td class="name"> ${requestScope.hero.eSkillName}</td>
                    <td> ${requestScope.hero.eSkillDescription}</td>
                </tr>
                <tr>
                    <td class="name">R</td>
                    <td>
                        <img src="${requestScope.hero.rSkillIconUrl}" alt="">
                    </td>
                    <td class="name"> ${requestScope.hero.rSkillName}</td>
                    <td> ${requestScope.hero.rSkillDescription}</td>
                </tr>

            </table>
        </div>
    </div>
</body>
</html>
