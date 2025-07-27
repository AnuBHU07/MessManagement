
<!DOCTYPE html>
<html>
<head><title>Feedback</title></head>
<body>
    <h2>Feedback</h2>
    <form action="/feedback/submit" method="post">
        User ID: <input type="text" name="userId" /><br/>
        Message: <textarea name="message"></textarea><br/>
        <input type="submit" value="Submit Feedback"/>
    </form>
</body>
</html>
