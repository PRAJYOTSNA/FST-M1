class Car:
   
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("Renault", "Duster", "2018", "Manual", "Orange")
car2 = Car("Honda", "SUV", "2020", "Manual", "Silver")
car3 = Car("Tesla", "Sedan", "2022", "Automatic", "Black")

car1.accelerate()
car1.stop()