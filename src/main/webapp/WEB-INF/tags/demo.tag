<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="mapObj" var="x">
  ${x.key} and ${x.value}
  <c:choose>
    <c:when test="${x.key eq href}">
        <c:set var="attr" value="http://www.google.com"/>
    </c:when>    
    <c:otherwise>
       <c:set var="attr" value=" ${x.key}=${x.value}"/>
    </c:otherwise>
</c:choose>
</c:forEach>
<%out.println("values aree:"+jspContext.getAttribute("mapObj"));%>
<c:forEach items="${mapObj}" var="a"> 
<h2>text is ${a.key}="${a.value}"</h2> 
</c:forEach> --%>
<%@tag body-content="scriptless" dynamic-attributes="${mapObj}"%>
<h1 style="color:blue">"this is"+${mapObj}</h1>	