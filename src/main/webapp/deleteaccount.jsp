<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete-form</title>
 <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
    

    <style>
        .header {
            background-color: yellow;
            text-align: center;
        }
       
        .footer {
            background-color: tomato;
            text-align: center;
        }
          .fieldset {
    margin-bottom: 30px;
    border: none;
  }
 
  .legend {
    font-size: 1.4em;
    margin-bottom: 10px;
  }
 
  .label {
    display: block;
    margin-bottom: 5px;
  }
 
  .label.light {
    font-weight: 300;
    display: inline;
  }
    </style>
</head>
<body>
 <form action="deleteaccount" method="get">

        <h1>Delete account </h1>

        <fieldset>
            <legend>Delete account info</legend>
            <label for="name">User ID:</label>
            <input type="text" id="name" name="user_id">

            <!-- <label for="name1">new:</label>
            <input type="email" id="mail" name="user_email"> -->

            <!-- <label for="password">Password:</label>
            <input type="password" id="password" name="user_password">

            <label>Age:</label>
            <input type="text" id="age" name="user_age" > -->

           <!--  <label>Gender:</label>
            <input type="radio" id="male" value="gender_male" name="user_gender"><label class="light" for="development">Male</label><br>
            <input type="radio" id="female" value="gender_female" name="user_gender"><label class="light" for="design">Female</label><br>
            <input type="radio" id="other" value="gender_other" name="user_gender"><label class="light" for="design">Other</label> -->
        </fieldset>
 		<button type="submit"  href="getall.jsp">Delete</button>    </form>


</body>
</html>