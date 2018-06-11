<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ex" uri="/WEB-INF/custom.tld"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<html lang="en">

<body>
	<%-- 	<c:url value="/resources/text.txt" var="url"/>
	<spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
	Spring URL: ${springUrl} at ${time}
	<br>
	JSTL URL: ${url}
	<br>
	Message: ${message}
	<h1><ex:Hello number='20'>This is jsp body</ex:Hello></h1> --%>
<%-- 	
	<ex:upper text='santhu' ><a href="google">google</a></ex:upper>

	<br/>
	<ex:replace>
		<ex:upper text='santhu' />
	</ex:replace>
	<br/>
	
	<ex:power number="3" power="2">  
	body  
	</ex:power>
	
	<br/>
	
	3 ^ 3 =
	
<demo:demo2/> --%>
<%-- <demo:demo href="sajkfhn" style="style"></demo:demo> --%>

<ex:meplusimg src="static/shot_2_thumb.png" something="someother"/>
<ex:meplusimg src="static/shot_1_thumb.png" something="someother"/>

<tags:medplusimg src="static/shot_2_thumb.png" something="someother"/>
<tags:medplusimg src="static/shot_1_thumb.png" something="someother"/>

</body>

</html>
