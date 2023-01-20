<?php
require_once('account.php');

class User extends Account{

    public function __construct($id,$name,$document,$email,$password){
        parent:: __construct($name,$document);
        $this -> id = $id;
        $this -> email = $email;
        $this -> password = $password;
    }
    public function PrintDataUser(){
        echo "ID:$this->id, USER:{$this->name->name}, EMAIL:{$this->email->email},DOCUMENT{$this -> password}";  
    }
}