from Pasajero import Pasajero

class Crucero:
    def __init__(self, nombre, paisOrigen, paisDestino):
        self.nombre = nombre
        self.paisOrigen = paisOrigen
        self.paisDestino = paisDestino
        self.pasajeros = []

    def agregar_pasajero(self, pasajero):
        self.pasajeros.append(pasajero)

    def __pos__(self):
        return [str(p) for p in self.pasajeros]
    
    def __neg__(self):
        return [p.nombre for p in self.pasajeros]

    def __eq__(self, other):
        return sum(p.costoPasaje for p in self.pasajeros) + sum(p.costoPasaje for p in other.pasajeros)

    def __add__(self, other):
        return len(self.pasajeros) == len(other.pasajeros)

    def __sub__(self, other):
        h = sum(1 for p in self.pasajeros if p.genero.lower() == "hombre")
        m = sum(1 for p in self.pasajeros if p.genero.lower() == "mujer")
        return f"Hombres: {h}, Mujeres: {m}"