<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("uberVan.php");
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX -> setPassenger(4);
$uberX->printDataCar();

$uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Dodge","rwew");
$uberPool -> setPassenger(4);
$uberPool->printDataCar();

$uberVan = new UberVan("HHSK123", new Account("Kevin","23434"),"cherolet 4","cuero");
$uberVan -> setPassenger(6);
$uberVan -> printDataCar();
?>