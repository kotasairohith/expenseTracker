<?php ?>

<?php 

include('common.php');
head();
?>

	<form action="signup-submit.php" method="post" class="newuser_data">
		<center><h2>Create an Account</h2></center>
		<label class="label">Email</label><br>
		<input type="Email" size="40" name="mail" class="spacing"><br>
		<label class="label">Password</label><br>         
		<input type="Password" size="40" name="password" class="spacing" placeholder="&#x1F513;"><br>
		<label class="label">Phone</label><br>
		<input type="tel" size="40" name="age" class="spacing1">
		<span class="security">To protect your account, we’ll send a code to quickly verify it’s you. Standard call or SMS rates may apply.</span><br>
		<input type="submit" value="&#128274; Create account" class="submit">
	</form>
	<div class="existuser"> Already have an Account? &nbsp;&nbsp;    <input type="submit" onclick="window.location.href='login.php'" value="&#128274; Sign In" class="loginsubmit"></div>


<div style="margin-left:60px;margin-top:40px;width:500px;">
<?php

	foot();
?>
</div>

</body>
</html>