from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, licence, driver, typeCarAccepted, seatsMatrial):
        super().__init__(licence, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMatrial