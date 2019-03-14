<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
<head>
    <title>${pageName}</title>
</head>
 
<body>
    <div id="data">
        <table border="1">
            <tr>
                <th>USER_ID</th>
                <th>USER_NAME_KO</th>
                <th>USER_TYPE</th>
                <th>USER_STATUS</th>
                <th>USER_NO</th>
            </tr>
            <c:forEach var="x" items="${dataList}">
            <tr>
                <td>${x.userId}</td>
                <td>${x.userNameKo}</td>
                <td>${x.userType}</td>
                <td>${x.userStatus}</td>
                <td>${x.userNo}</td>    
            </tr>
            </c:forEach>
        </table>
    </div>
    <div id="dataResult"></div>
    <div id="root"></div>
    <script src="/js/react/${pageName}.bundle.js"></script>
</body>
</html>