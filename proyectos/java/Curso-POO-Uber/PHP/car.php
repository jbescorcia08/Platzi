<?php
require_once('account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    protected $passenger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function getPassenger(){
        return $this -> passenger;
    }

    public function setPassenger($passenger){
        if($passenger == 4){
            $this -> passenger = $passenger;
        }else{
            echo "Necesitas asignar 4 pasajeros.";
        }
    }
    

    public function printDataCar(){
        echo "Licencia: $this -> licence Driver: {$this -> driver -> name} Documento: {$this -> driver -> document}Numero de pasajeros: $this -> passenger
        <br>";
        
    }

}
?>