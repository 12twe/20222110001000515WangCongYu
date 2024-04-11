<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp" %>
<h1>User Info</h1>
<table>
    <tr>
        <td style="text-align: left;" width=150>Username:</td>
        <td style="text-align: left;"><%=request.getAttribute("username")%></td>
    </tr>
    <tr>
        <td style="text-align: left;">Password:</td>
        <td style="text-align: left;"><%=request.getAttribute("password")%></td>
    </tr>
    <tr>
        <td style="text-align: left;">Email:</td>
        <td style="text-align: left;"><%=request.getAttribute("email")%></td>
    </tr>
    <tr>
        <td style="text-align: left;">Gender:</td>
        <td style="text-align: left;"><%=request.getAttribute("gender")%></td>
    </tr>
    <tr>
        <td style="text-align: left;">Birthday:</td>
        <td style="text-align: left;"><%=request.getAttribute("birthday")%></td>
    </tr>
</table>

<%@include file="footer.jsp"%>
