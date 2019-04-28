<%@ page import="static agile.wars.hackathon.service.Calculation.calcForAnal" %><%--
  Created by IntelliJ IDEA.
  User: aodintsov
  Date: 28.04.2019
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/main.css"/>
    <script src="/resources/js/dragndrop.js"></script>

</head>
<body>

<h1>Welcome to Wars </h1>

<div class="wrapper">
    <div id="eqip1" ondrop="drop(event)" ondragover="allowDrop(event)">Hat</div>
    <div id="eqip2" ondrop="drop(event)" ondragover="allowDrop(event)">Sword</div>
    <div id="eqip3" ondrop="drop(event)" ondragover="allowDrop(event)">Boots</div>
    <div id="body"><img src="../../resources/img/jedi-f.png"></div>
    <div id="money">Money</div>
    <div id="inventory"><img id="drag1" height="90px" width="90px" draggable="true" ondragstart="drag(event)"
                             src="../../resources/img/saber1.png"></div>
    <div id="achieves">
        <img id="hand" height="90px" width="90px"  src="../../resources/img/fastandfurious.png" title="Самая быстрая рука Мос-Айсли">
    </div>
    <div id="info">
        <div id="stre"><h3>Сила:<%= calcForAnal(1,1,1,1,1,1)[0] %></h3></div>
        <div id="inte"><h3>Интеллект:<%= calcForAnal(1,1,1,1,1,1)[1] %></h3></div>
        <div id="agil"><h3>Ловкость:<%= calcForAnal(1,1,1,1,1,1)[2] %></h3></div>
    </div>
</div>
</body>
</html>
