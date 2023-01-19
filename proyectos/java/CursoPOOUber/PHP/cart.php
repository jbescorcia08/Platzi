<?php
require_once('payment.php');

class Cart extends Payment
{
    public $name;
    public $number;
    public $cvv;

    public function __construct($id, $name, $number, $cvv)
    {
        parent:: __construct($id);
        $this->name = $name;
        $this->number = $number;
        $this->cvv = $cvv;
    }
}
