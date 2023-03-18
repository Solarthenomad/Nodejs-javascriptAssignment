<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        table {
            border-top : 1px solid #444444;
            border-collapse : collapse;

        }

        tr {
            border-bottom : 1px solid #444444;
            padding : 15px;
        }

        td{
            border-bottom : 1px solid #efefef;
            padding : 15px
        }

        table.even {
            background-color : #efefef;
        }

        .text {
            text-align : center;
            padding-top : 25px;
            color : #000000;

        }

        .text:hover {
            text-decoration : underline;
        }

        a:link {
            color: #FFFFFF;
            text-decoration : none;

        }
        a:hover {
            text-decoration : underline;
        }

        
    </style>
</head>
<body>
    <?php
   
    $connect = mysqli_connect('127.0.0.1', 'root', 'password', 'db_board') or die("connect failed");
    $query = "select * from board order by number desc";  //역순 출력
    $result = mysqli_query($connect, $query);
    $total = mysqli_num_rows($result);
 //result set의 총 레코드(행) 수의 반환

    session_start();

    if (isset($_SESSION['userid'])){
    ?><b><?php ?></b>님 반갑습니다
    <button onclick="location.href = './logout_action.php'" style = "float:right; font-size: 15px;">로그아웃</button>
    <br />
    <?php 
        
    } else {
    ?>
        <button onclick="location.href ='./login.php'" style = "float:right; font-size: 15px;">로그인</button>
    <?php    
    }
    ?>

    <p style = "font-size : 25px; text-align : center">Hackstagram 게시판</p>

    <table align = "center">
        <thead align = "center">
            <tr>
                <td width = "50" align = "center"> 번호</td>
                <td width = "500" align = "center">제목 </td>
                <td width = "100" align = "center">작성자</td>
                <td width = "200">날짜</td>
                <td width = "50">조회수</td>
            </tr>
        </thead>

        <tbody>
            <?php 
            while ($rows = mysqli_fetch_assoc($result)) {
                if ($total % 2 ==0) {
            ?>
               <tr class="even">
                <!--배경색 진하게 하기-->

               <?php } else {

               ?>

               <tr>
                <!--배경색 그냥-->
               <?php } ?>
               <td width = "50" align="center"><?php echo $total ?></td>
               <td width = "500" align="center">
                <a href ="read.php?number=<?php echo $rows['number'] ?>">
                <?php echo $rows['title'] ?>
               </td>
               <td width "100" align="center"><?php echo $rows['id']?></td>
               <td width = "100"><?php echo $rows['date']?></td>
               <td width = "50" align="center"><?php echo $rows['hit']?></td>

               </tr>
               <?php
               $total--;
               }
               ?>
        </tbody>
    </table>

    <div class= "text">
        <font style = "cursor : hand" onclick = "location.href='./write.php'">글쓰기</font>
    </div>
    
</body>

</html>