<?php
$Name = $_POST['Name'];
$Email = $_POST['Email'];
$Contact = $_POST['Contact'];

//procedural approach
$con=mysqli_connect("localhost","root","","ank");

$query="INSERT INTO form(Name,Email,Contact)VALUES('$Name','$Email','$Contact')";
if(mysqli_query($con,$query)){
    header("refresh:1,url=form.html");
}

// Database connection
/*$conn = new mysqli('localhost','root','','ank');
if($conn->connect_error){
    echo "$conn->connect_error";
    die("Connection Failed : ". $conn->connect_error);
}
else {


    $stmt = $conn->prepare("insert into form(Name, Email, Contact) values(?, ?, ?)");
    $stmt->bind_param("ssi", $Name, $Email, $Contact);
    $execval = $stmt->execute();
    echo $execval;
    echo "Registration successfully...";
    $stmt->close();
    $conn->close();
}*/
?>
