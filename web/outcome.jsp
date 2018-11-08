
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
<h3>Metry<%=request.getAttribute("MetersToDouble")%></h3><br>
<h3>Centymetry <%=request.getAttribute("CentimetersToDouble")%></h3><br>
<h3>Milimetry<%=request.getAttribute("MilimetersToDouble")%></h3><br>
<h2>Waga</h2>
<h3>Kilogramy <%=request.getAttribute("KilogramsToDouble")%></h3><br>
<h3>Gramy<%=request.getAttribute("GramsToDouble")%></h3><br>
<h3>Miligramy<%=request.getAttribute("MiligramsToDouble")%></h3><br>

</body>
</html>
