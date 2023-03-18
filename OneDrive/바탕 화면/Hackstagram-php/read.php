<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hackstagram</title>
    <style>
        .read_table {
            border : 1px solid #444444;
            margin-top : 30px;
        }

        .read_title {
            height : 45px;
            font-size : 23.5px;
            text-align : center;
            background-color : #3C3C3C;
            color : white;
            width : 1000px;

        }

        .read_id {
            text-align: center;
            background-color : #EEEEEE;
            width : 30px;
            height : 30px;

        }

        .read_id2 {
            background-color : white;
            width : 60px;
            height : 30px;
            padding-left :10px;


        }

        .read_hit {
            background-color : #EEEEEE;
            width : 30px;
            text-align : center;
            height : 30px;
        }
        .read_hit2 {
            background-color : white;
            width : 60px;
            height : 33px;
            padding-left : 10px;
            
        }
        .read_content {
            padding : 20px;
            border-top: 1px solid #444444;
            height : 500px;
        }

        .read_btn {
            width : 800px;
            height : 200px;
            text-align : center;
            margin : auto;
            margin-top : 50px;
            
        }

        .read_btn1 {
            height : 50px;
            width : 100px;
            font-size : 20px;
            text-align: center;
            background-color: white;
            border:2px solid black;
            color : white;
            border-radius: 10px;
        }

        .read_comment_input {
            width : 700px;
            height : 500px;
            text-align : center;
            margin : auto;
        }

        .read_text3 {
            font- wieght : bold;
            float : left;
            margin-left: 20px;
        }

        .read_com_id {
            width : 100px;
        }

        .read_comment {
            width : 500px;
        }

    </style>
</head>
<body>
    <?php 
    $conncect = mysql_connect('127,0,01', 'root', 'password', 'db_board', );
    $number = $_GET['number']; //GET 방식 사용
    session_start();
    $query = "select title, content, date, hit id from board where number=$number";
    $result = $conncect->query($query);
    $rows = mysqli_fetch_assoc($result);
    
    $hit = "update board set hit = hit +1 where number = $number";
    $connect -> query($hit);

    if (isset($_SESSION['userid'])) {
    ?><b><?php echo $_SESSION['userid]; ?></b>님 반갑습니다.
        <button onclick = "location.href='./logout_action.php'" style="float:rieght; font-size:15px;">로그아웃</button>
        <br />
        <?php 
    }else {
        ?>
         <button onclick = 
         "location.href = './login.php'" style = "float:right; font-size:15px;">로그인</button>
         <br />
         <?php 
    }
         ?>
    




<table class="read_table" style="align = center">
    <tr>
        <td colspan = "4" class="read_title"><?php echo $rows['title'] ?></td>
    </tr>
    <tr>
        <td class="read_id">작성자</td>
        <td class="read_id2"><?php echo $rows['id'] ?></td>
        <td class="read_hit">조회수</td>
        <td class="read_hit2"><?php echo $rows['hit']+1 ?></td>
    </tr>
    <tr>
        <td colspan="4" class="read_content" valign="top">
                <?php echo $rows['content'] ?>
        </td>
    </tr>
</table>
<div class="read_btn">
        <button class="read_btn1" onclick="location.href='./index.php'">목록</button>&nbsp;&nbsp;
        <?php
        if (isset($_SESSION['userid']) and $_SESSION['userid'] == $rows['id'] { ?>
        <button class="read_btn1" onclick="location.href='./modify.php?number=<?=$number ?>'">수정</button>&nbsp;&nbsp;
        <button class="read_btn1" onclick="ask();">삭제</button>

        <script>
            function ask(){

                if(confirm("게시글을 삭제하시겠습니까?")){

                    window.location="./delete.php?number=<?=$number ?>"
                }
            }        
        </script>

    <?php } ?>
</div>
    
</body>
</html>