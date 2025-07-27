
<!DOCTYPE html>
<html>
<head><title>Payment</title></head>
<body>
    <h2>Payment Module</h2>
    <form action="/payment/pay" method="post">
        User ID: <input type="text" name="userId" /><br/>
        Amount: <input type="number" name="amount" /><br/>
        <input type="submit" value="Pay"/>
    </form>
</body>
</html>
