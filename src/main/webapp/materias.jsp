<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Materias</title>
</head>
<body>
<%
    String[] materias = new String[3];
    materias[0] = "Matematicas";
    materias[1] = "Espanol";
    materias[2] = "Ingles";
%>
<ul>
    <%
        for (int i = 0; i < materias.length; i++) {
            %><li><%= materias[i] %></li><%
        }
    %>
</ul>
</body>
</html>
