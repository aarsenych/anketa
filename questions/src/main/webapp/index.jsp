<html>
    <head>
        <title>Myserver.com</title>
    </head>
    <body>
        <h2>Questionnary</h2>
        <form action="/question" method="post">
            <fieldset>
                <legend>Personal information:</legend>
            First name:<br>
            <input type="text" name="firstname"><br>
            Last name:<br>
            <input type="text" name="lastname"><br>
                Age<br>
            <input type="number" age="age"><br><br>
                <form>Your gender?<br><br>
                    <input type="radio" name="gender" value="male" checked> Male<br>
                    <input type="radio" name="gender" value="female"> Female<br><br>
                </form>
                <form>Are you a student?<br><br>
                    <input type="radio" name="student" value="male" checked> Yes<br>
                    <input type="radio" name="student" value="female"> No<br>
                </form>
            <input type="submit" value="Submit">
            </fieldset>
        </form>
    </body>
</html>
