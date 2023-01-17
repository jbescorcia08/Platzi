from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello word")
    car = Car("AMS233",Account("jesus Barrios","hAHSS"))
    print(vars(car))
    print(vars(car.driver))

