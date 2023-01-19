from payments import Payments

class Paypal(Payments):
    email = str

    def __init__(self, email):
        super().__init__(id)
        self.email = email