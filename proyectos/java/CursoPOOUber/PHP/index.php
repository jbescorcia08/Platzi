<?php
require_once('car.php');
require_once('account.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('user.php');
require_once('driver.php');

$uberX = new UberX("CB1223",new Account("Jesus","83747HG"),"Chelolet","LND23");
$uberX->PrintDataCar();

$uberPool = new UberPool("CG234",new Account("Andres","83747HG"),"NISSAN","23D23");
$uberPool->PrintDataCar();

$driver = new Driver(1,"jose","232342323","hekaekjd@hasdnads.com","klajdkasjdlak");
$driver -> PrintDataDriver();

$user = new User(1,"jesus","4566855","Jeuss@gmail.com","skdlfjsdfkjs");
$user -> PrintDataUser();




