<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1>Caculator</h1>

<form method="post" action="result">
    <table>
        <tr>
            <td><input type="number" name="firstNumber"/></td>
            <td><input type="number" name="secondNumber"/></td>
        </tr>
        <tr>
            <td><input type="submit" name="caculator" value="Addition(+)"/></td>
            <td><input type="submit" name="caculator" value="Subtraction(-)"/></td>
            <td><input type="submit" name="caculator" value="Multiplication(x)"/></td>
            <td><input type="submit" name="caculator" value="Division(/)"/></td>
        </tr>
    </table>
</form>

<h1>Result = ${result}</h1>

</body>
</html>
