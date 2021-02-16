<?php
$Name = $_POST['Name'];
$Email = $_POST['Email'];
$Contact = $_POST['Contact'];

// Database connection
$conn = new mysqli('test@localhost','root','','ank');
if($conn->connect_error){
    echo "$conn->connect_error";
    die("Connection Failed : ". $conn->connect_error);
}
else {
    $stmt = $conn->prepare("insert into registration(Name, Email, Contact) values(?, ?, ?)");
    $stmt->bind_param("sssi", $Name, $Email, $Contact);
    $execval = $stmt->execute();
    echo $execval;
    echo "Registration successfully...";
    $stmt->close();
    $conn->close();
}
?>
