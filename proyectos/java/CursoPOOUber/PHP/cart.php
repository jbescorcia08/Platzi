<?php
require_once('payment.php');

class Cart extends Payment
{
    public $id;
    public $name;
    public $number;
    public $cvv;

    public function __construct($id, $name, $number, $cvv)
    {
        $this->id = $id;
        $this->name = $name;
        $this->number = $number;
        $this->cvv = $cvv;
    }
}
