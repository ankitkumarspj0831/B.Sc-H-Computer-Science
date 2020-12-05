<%@ page import = "java.io.*,java.util.*" %> <%@ page info = "This JSP Page
Written By ANKIT" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %> <%@ page contentType = "text/html" %>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <style>
      body {
        margin-top: 50px;
        text-align: center;
      }
    </style>
    <title>JSP FORM</title>
  </head>
  <body>
    Name: <%= request.getParameter("name") %>
    <br />
    <br />
    Birth Date: <%= request.getParameter("dob") %>
    <br />
    <br />
    Email: <%=request.getParameter("email") %>
    <br />
    <br />
    Gender: <%= request.getParameter("gender") %>
    <br />
    <br />
    Hobbies:
    <br />
    <% String[] hobbies = request.getParameterValues("hobby"); for(int i= 0; i <
    hobbies.length; i++){ out.println(hobbies[i] + "<br />"); } %>
  </body>
</html>
