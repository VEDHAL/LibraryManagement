<!DOCTYPE html>
<html>
<head>
<title>Basic Form</title>
<h1>Registration Form</h1>
</head>
<body>
<jsp:include page="header.jsp"/>

<form action="useraction">
<!--text input-->
<lable for="id">ID:</lable>
<input type="text" id="id" name="id" placeholder="id">
<br>
<lable for="username">Username:</lable>
<input type="text" id="username" name="username" placeholder="username">
<br>
<!--email input-->
<lable for="email">email:</lable>
<input type="email" id="email" name="email">
<br>
<!--password input-->
<lable for="password">Password:</lable>
<input type="password" id="password" name="password" required>
<br>
<!--number input-->
<lable for="numbebr">number:</lable>
<input type="number" id="number" name="number">
<br>
<!--textarea input-->
<label for="textarea">Feedback:</label>
<textarea name="message" id="textarea" cols="30" rows="4"></textarea>
<br>
<!--checkbox-->
<input type="checkbox" id="subscribe" name="subscribe" value="yes">
<lable for="subscribe">subscribe to newsletter</lable>
<br>
<!--radio button-->
<label>Gender:</label>
<input type="radio" id="male" name="gender" value="male">Male
<input type="radio" id="female" name="gender" value="female">Female
<br>
<!--dropdown-->
<label for="state">State:</label>
<select name="state" id="state">
    <option value="karnataka">karnataka</option>
    <option value="kerala">kerala</option>
    <option value="TN">TN</option>
</select>
<br>
<!--file input-->
<lable for="file">Browse for file :</lable>
<input type="file" id="file"name="file" value="no">
<br>
<!--date input-->
<label for="date">Choose a Date :</label>
<input type="date" id="date" name="date">
<br>

<!--submit-->
<input type="submit" value="submit">
<!-- <jsp:include page="header.jsp"/> -->
</form>
</body>
</html>