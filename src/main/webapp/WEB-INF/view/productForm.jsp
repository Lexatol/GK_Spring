<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>
<form:form action="formAdd" modelAttribute="newProduct">
    ID: <form:input path="id" />
    <br>
    TITLE: <form:input path="title" />
    <br>
    COST: <form:input path="cost" />
    <br>
    <input type="submit" value="add product" />
</form:form>
</body>
</html>