<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
</head>

<body>
<h1>Shop</h1>

<ul>
    <c:forEach var="product" items="${products}">
        <li>ID: ${product.id}   | TITLE: ${product.title}   | COST: ${product.cost} </li>
    </c:forEach>
</ul>

</body>
</html>