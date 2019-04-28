<%--
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
    <div id="achieves">ach</div>
    <div id="info">Info</div>
</div>
</body>
</html>
