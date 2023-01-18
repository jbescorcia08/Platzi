<?php
require_once('car.php');
class UberVan extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($licence,$driver,$typeCarAccepted,$seatsMaterial){
        parent:: __construct($licence,$driver);
        $this -> typeCarAccepted = $typeCarAccepted;
        $this -> seatsMaterial = $seatsMaterial;
    }
}