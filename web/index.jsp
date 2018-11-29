<%--
  Created by IntelliJ IDEA.
  User: longdk
  Date: 11/29/18
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple calculator</h1>
  <form method="post" action="/calculate">
    First operand: <input type="text" name="firstNumber"><br/>
    Operator: <select name="operator">
    <option value="+">Addition</option>
    <option value="-">Subtraction</option>
    <option value="*">Multiplication</option>
    <option value="/">Division</option>
              </select><br/>
    Second operand: <input type="text" name="secondNumber"><br/>
    <input type="submit" id="submit" value="Calculate">

  </form>
  </body>
</html>
