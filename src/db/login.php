<?php ?>

<?php 

include('common.php');
head();
?>

	<form action="signup-submit.php" method="post" class="newuser_data">
		<center><h2>Sign in</h2></center>
		<label class="label">Phone number, email or user ID</label><br>
		<input type="Email" size="40" name="mail" class="spacing1"><br>
		<span class="security">Standard call, message, or data rates may apply.</span><br>
		<input type="checkbox" id="me"><label for="me" class="label"> Remember me</label>
		<input type="submit" value="&#128274; Sign In" class="submit">
		<div class="newuser">New? &nbsp;&nbsp;<a href="signup.php">Create an account.</a></div>
	</form>


<?php

	foot();
?>
</div>

</body>
</html>