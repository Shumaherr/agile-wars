<%--
  Created by IntelliJ IDEA.
  User: aodintsov
  Date: 28.04.2019
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shop</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/shop.css"/>
    <script src="/resources/js/dragndrop.js"></script>

</head>
<body>
<div class="wrapper">
<div id="body" ondrop="drop(event)" ondragover="allowDrop(event)"><img src="../../resources/img/uotto.png"></div>
<div id="text" ondrop="drop(event)" ondragover="allowDrop(event)">Sword</div>
<div id="item" ondrop="drop(event)" ondragover="allowDrop(event)">Boots</div>
</div>
</body>
</html>
