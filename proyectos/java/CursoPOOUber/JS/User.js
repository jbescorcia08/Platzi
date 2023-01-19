class User extends Account{
    constructor(id,name,document,email,password){
        super(id,name,document,email,password);
    }
    printAccountUser(){
        console.log(this.id)
        console.log(this.name)
        console.log(this.document)
        console.log(this.email)
        console.log(this.password)
    }
}