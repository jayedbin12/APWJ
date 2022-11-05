<%--
  Created by IntelliJ IDEA.
  User: Jayed
  Date: 05-Nov-22
  Time: 12:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Calculation</title>
</head>
<body>
<table>
    <tr>
        <td><h2>Monthly Salary is ${salary}</h2></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h3>Basic Salary: ${calculator.getBasicSalary()}</h3></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h3>Yearly Salary: ${calculator.getYearlySalary()}</h3></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h3>House Rent Yearly: ${calculator.getHouseRent()}</h3></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h3>Yearly Conveyance Allowance: ${calculator.getConveyanceAllowance()}</h3></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h3>Two Yearly Bonus: ${calculator.getFestivalBonus()}</h3></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h3>Other Allowance Yearly: ${calculator.getOtherAllowance()}</h3></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h2>Yearly-Tax: ${calculator.getTaxs()}</h2></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h2>Monthly-Tax: ${calculator.getNetSalary()}</h2></td>
    </tr>
    <tr>
        <td></td>
    </tr>
    <tr>
        <td><h3>Investment-Tax: ${calculator.getInvestmentTax()}</h3></td>
    </tr>
</table>
</body>
</html>
