<?php
require_once('account.php');
class Car{
    public $id;
    public $licence;
    public $driver;
    public $passanger;

    public function __construct($licence, $driver){
        $this -> licence = $licence;
        $this -> driver = $driver;
    }

    public function PrintDataCar(){
        echo "Licence:$this->licence, Conductor:{$this->driver->name}, Document:{$this->driver->document}";  
    }
}