from payments import Payments

class Cash(Payments):
    def __init__(self, id):
        super().__init__(id)