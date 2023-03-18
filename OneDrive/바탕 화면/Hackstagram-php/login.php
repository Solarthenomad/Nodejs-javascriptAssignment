<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div>
        <span style = "font-size : 25px;"><strong>로그인</strong></span>

        <form action="login_action.php" method="post">
            <p>ID<input name="id" type="text"></p>
            <p>PW<input name = "pw" type="password"></p>
            <br />
            <button type="submit">로그인</button>
            
        </form><br />
        <button id = "register" onclick="location.href = './register.php'">회원가입</button>
    </div>

    
</body>
</html>