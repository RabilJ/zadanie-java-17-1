
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wynik</title>
</head>
<body>
<h1>Wynik</h1>
<h2>
Długość
</h2>
<h3>Metry<%out.print(request.getAttribute("MetersToDouble"));%></h3><br>
<h3>Centymetry <%out.print(request.getAttribute("CentimetersToDouble"));%></h3><br>
<h3>Milimetry<%out.print(request.getAttribute("MilimetersToDouble"));%></h3><br>
</body>
</html>
