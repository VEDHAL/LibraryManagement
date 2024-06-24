<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<h1><U>STUDENT FORM</U></h1>
</head>
<body>
<form action="Student">
<!-- text input -->
<lable for="studentname">Student Name:</lable>
<input type="text" id="studentname" name="studentname" placeholder="first">
<input type="text" id="studentname1" name="studentname1" placeholder="last">
<br><br>
<!--dropdown-->
<label for="course">Course:</label>
<select name="course" id="course">
    <option value="CIVIL">CIVIL</option>
    <option value="CSE">CSE</option>
    <option value="EEE">EEE</option>
    <option value="ISE">ISE</option>
</select>
<br><br>
<!--date input-->
<label for="date">Date of Birth :</label>
<input type="date" id="date" name="date">
<br><br>
<!--email input-->
<lable for="email">E-mail:</lable>
<input type="email" id="email" name="email" placeholder="@gmail.com">
<br><br>
<!--number input-->
<lable for="numbebr">Contact Number:</lable>
<input type="number" id="number" name="number">
<br><br>
<!-- text input -->
<lable for="guardianname">Guardian Name:</lable>
<input type="text" id="guardianname" name="guardianname" placeholder="full name">
<br><br>
<!--number input-->
<lable for="numb">Guardian Contact Number:</lable>
<input type="numb" id="numb" name="numb">
<br><br>
<!--radio button-->
<label>Gender:</label>
<input type="radio" id="male" name="gender" value="male">Male
<input type="radio" id="female" name="gender" value="female">Female
<br><br>
<!--dropdown-->
<label for="state">Nationality:</label>
<select name="nation" id="nation">
    <option value="American">American</option>
    <option value="Canadian">Canadian</option>
    <option value="Indian">Indian</option>
    <option value="Russian">Russian</option>
</select>
<br><br>
<!-- textarea input -->
<lable for="textarea">House address:</lable>
<textarea id="address" name="address" cols="60" rows="2" placeholder="enter address"></textarea>
<br><br>
<!--textarea input-->
<label for="textarea">In a few sentences,write down why do you want to join our college</label>
<textarea name="message" id="textarea" cols="60" rows="4"></textarea>
<br>
<!--submit-->
<input type="submit" value="submit">
</form>
</body>
</html>