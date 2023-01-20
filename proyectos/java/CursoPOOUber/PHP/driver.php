<?php
require_once('account.php');

class Driver extends Account{

    public function __construct($id,$name,$document,$email,$password){
        parent:: __construct($name,$document);
        $this -> id = $id;
        $this -> email = $email;
        $this -> password = $password;
    }
    public function PrintDataDriver(){
        echo "ID:$this->id, DRIVER:{$this->name->name}, EMAIL:{$this->email->email},DOCUMENT{$this -> password}";  
    }
}