<?php
require_once('car.php');
class UberVan extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;
    protected $passenger;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license,$driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    public function setPassenger($passenger){
        if($passenger == 6){
            $this -> passenger = $passenger;
        }else{
            echo "Ingresa 6 pasajeros";
        }
    }

    public function printDataCar(){
        echo "
        Licencia: $this->license 
        Driver: {$this->driver->name} 
        Document: {$this->driver->document}
        Número de pasajeros: $this->passenger
        typecaracceted: $this -> typeCarAccepted;
        SeatMaterial: $this -> seatsMaterial;
        <br>";
    }

    

}
?>