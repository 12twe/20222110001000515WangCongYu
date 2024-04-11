<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2024/4/11
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.io.PrintWriter" %>
<h1>User List</h1>
<table border=1>
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
        <td>email</td>
        <td>gender</td>
        <td>birthday</td>
    </tr>
    <%
        ResultSet resultSet = (ResultSet) request.getAttribute("rsname");
        if(resultSet == null){
    %>
    <tr>
        <td>No Data!!!</td>
    </tr>
    <%}else {
            while (resultSet.next()) {
                out.println("<tr>\n" +
                        "<td>" + resultSet.getObject("id") + "</td>\n" +
                        "<td> " + resultSet.getObject("username") + "</td>\n" +
                        "<td>" + resultSet.getObject("password") + "</td>\n" +
                        "<td>" + resultSet.getObject("email") + "</td>\n" +
                        "<td>" + resultSet.getObject("gender") + " </td>\n" +
                        "<td>" + resultSet.getObject("birthday") + "</td>\n" +
                        "</tr>");
            }

    }
    %>
</table>
<%@ include file="footer.jsp"%>