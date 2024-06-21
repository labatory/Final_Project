<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>로그인</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2 class="mt-5 mb-3">로그인</h2>
    <div class="row justify-content-center">
        <div class="col-lg-6">
            <form action="/login" method="post">
                <div class="form-group">
                    <label for="uID">아이디:</label>
                    <input type="text" class="form-control" id="uID" name="uID" required>
                </div>
                <div class="form-group">
                    <label for="uPW">비밀번호:</label>
                    <input type="password" class="form-control" id="uPW" name="uPW" required>
                </div>
                <button type="submit" class="btn btn-primary">로그인</button>
            </form>
            <div id="login-error" class="mt-3"></div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>