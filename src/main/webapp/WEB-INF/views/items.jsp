<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Items Management</title>
    <!-- Include CSS and JavaScript files here -->
</head>
<body>

<h2>Items List</h2>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Type</th>
            <th>Quantity</th>
            <th>Priority Rate</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <!-- Use JSTL c:forEach tag to loop through items -->
        <c:forEach items="${items}" var="item">
            <tr>
                <td>${item.name}</td>
                <td>${item.type}</td>
                <td>${item.quantity}</td>
                <td>${item.priorityRate}</td>
                <td>
                    <!-- Add form for updating and deleting items -->
                    <!-- The forms can submit to the respective ItemController endpoints -->
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<h2>Add New Item</h2>
<form action="items" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>

    <label for="type">Type:</label>
    <input type="text" id="type" name="type"><br><br>

    <label for="quantity">Quantity:</label>
    <input type="number" id="quantity" name="quantity" min="0"><br><br>

    <label for="priorityRate">Priority Rate:</label>
    <input type="number" id="priorityRate" name="priorityRate" min="1"><br><br>

    <input type="submit" value="Submit">
</form>

<h3>Add New Item</h3>
<form id="addItemForm">
    <!-- Input fields for the item properties here -->
    <input type="text" name="name" placeholder="Item name" required>
    <input type="text" name="type" placeholder="Item type" required>
    <input type="number" name="quantity" placeholder="Quantity" min="1" required>
    <input type="number" name="priorityRate" placeholder="Priority Rate" required>
    <button type="submit">Add Item</button>
</form>

<!-- Include JavaScript to handle form submissions and AJAX requests if needed -->

</body>
</html>
