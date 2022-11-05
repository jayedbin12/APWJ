<%--
  Created by IntelliJ IDEA.
  User: Jayed
  Date: 04-Nov-22
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Tax-Calculate</title>
</head>
<body>
<h2>Choose Tax Payer Category:</h2>
<select name="category" id="category">
    <option value="general">General</option>
    <option value="SeniorCitizen">Senior-citizen</option>
    <option value="disabled">Disabled</option>
    <option value="FreedomFighters">Freedom-Fighters</option>
</select>
<h2>Choose Zone:</h2>
<select name="zone" id="zone">
    <option value="dhaka">Dhaka</option>
    <option value="ctg">Chattagram</option>
    <option value="other">Other-city</option>
    <option value="rest">Rest of the country</option>
</select>
<h3>Salary-Breakdown</h3>
<form method="post" action="tax-calculate/v2">
    <table>
        <tr>
            <td>Enter Monthly Salary:</td>
            <td></td>
            <td><input type="number" name="salary" id="salary"/></td>
        </tr>
        <tr>
            <td>Enter Basic Salary:</td>
            <td></td>
            <td><input type="number" name="basicsalary" id="basicsalary"/></td>
        </tr>
        <tr>
            <td>Enter House Rent:</td>
            <td></td>
            <td><input type="number" name="rent" id="rent"/></td>
        </tr>
        <tr>
            <td>Enter Conveyance:</td>
            <td></td>
            <td><input type="number" name="conveyance" id="conveyance"/></td>
        </tr>
        <tr>
            <td>Medical Allowance:</td>
            <td></td>
            <td><input type="number" name="medical" id="medical"/></td>
        </tr>
        <tr>
            <td>Festival Bonus:</td>
            <td></td>
            <td><input type="number" name="bonus" id="bonus"/></td>
        </tr>
        <tr>
            <td></td>
        </tr>
        <tr>
            <td>Other Allowance:</td>
            <td></td>
            <td><input type="number" name="other" id="other"/></td>
        </tr>
        <tr>
            <td></td>
        </tr>
        <tr>
            <td>Investment(if not, type "0"):</td><br>
            <td></td>
            <td><input type="number" name="investment" id="investment"/></td>
        </tr>
        <tr>
            <td></td>
        </tr>
        <tr>
            <td><input type="submit" value="calculate"></td>
        </tr>
    </table>
</form>
</body>
</html>
