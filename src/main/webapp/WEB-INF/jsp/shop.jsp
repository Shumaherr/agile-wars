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
<div id="body"><img src="../../resources/img/uotto.png"></div>
<div id="text"><h1>Приветствую тебя, ${User.nickName}</h1><p>Как насчет ГИГА шлем Джа-Джа Бинкса за 117 кредитов? </p>
    <img src="../../resources/img/helmet1.png" height="100px" width="100px" title="ГИГА шлем Джа-Джа Бинкса"></div>
<div id="item" ondrop="drop(event)" ondragover="allowDrop(event)">
    <img src="../../resources/img/blaster1.png" height="90px" width="90px">
    <img src="../../resources/img/saber2.png" height="90px" width="90px">

</div>
</div>
</body>
</html>
