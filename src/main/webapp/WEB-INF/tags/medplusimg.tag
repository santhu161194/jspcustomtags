<%@ tag body-content="empty" dynamic-attributes="attrs" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${attrs}" var="a">
<c:choose>
<c:when test="${a.key eq 'src'}">
       <c:set var="attr" value=" ${a.key}=https://silverspaceship.com/${a.value}"/>
   </c:when>    
   <c:otherwise>
      <c:set var="attr" value="${attr} ${a.key}=${a.value}"/>
   </c:otherwise>
</c:choose>
</c:forEach>
<img <c:out value="${attr}"/>/>