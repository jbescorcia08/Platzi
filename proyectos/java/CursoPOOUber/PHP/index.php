<?php
require_once('car.php');
require_once('account.php');
require_once('uberX.php');
require_once('uberPool.php');

$uberX = new UberX("CB1223",new Account("Jesus","83747HG"),"Chelolet","LND23");
$uberX->PrintDataCar();

$uberPool = new UberPool("CG234",new Account("Andres","83747HG"),"NISSAN","23D23");
$uberPool->PrintDataCar();