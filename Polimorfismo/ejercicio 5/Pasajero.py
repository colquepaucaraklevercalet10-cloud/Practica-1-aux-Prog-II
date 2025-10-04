class Pasajero:
    def __init__(self, nombre, edad, genero, nroHabitacion, costoPasaje):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero
        self.nroHabitacion = nroHabitacion
        self.costoPasaje = costoPasaje

    def __str__(self):
        return f"{self.nombre}, {self.edad}, {self.genero}, Habitación: {self.nroHabitacion}, Costo: {self.costoPasaje}"

    def __pos__(self):
        return str(self)

    def __neg__(self):
        return f"Pasajero: {self.nombre}"