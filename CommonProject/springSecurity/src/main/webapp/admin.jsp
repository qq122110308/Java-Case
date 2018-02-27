<%@ page language="java" contentType="text/html; charset=UTF-8"%>  
<%@page session="true" %>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<html xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">
<!DOCTYPE html>  
<html>  
    <head>  
        <meta charset="UTF-8">  
        <title>hello</title>  
    </head>  
    <body>  
	<h1 th:inline="text">Hello World</h1>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Sign Out"/>
    </form> 
    </body>  
</html>  