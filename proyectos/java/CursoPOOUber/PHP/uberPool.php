<?php
require_once('car.php');
class UberPool extends Car{
    public $brand;
    public $model;

    public function __construct($licence,$driver,$brand,$model){
        parent:: __construct($licence,$driver);
        $this -> brand = $brand;
        $this -> model = $model;
    }
}