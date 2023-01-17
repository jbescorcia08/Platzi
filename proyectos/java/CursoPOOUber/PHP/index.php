<?php
require_once('car.php');
require_once('account.php');

$Car = new car("QWE234",new Account("jesus","WYEUS23"));

$Car -> PrintDataCar();