from payments import Payments

class Cash(Payments):
    number = int
    name = str
    cvv = int

    def __init__(self, id, name, number, cvv):
        super().__init__(id)
        self.number = number
        self.name = name
        self.cvv = cvv