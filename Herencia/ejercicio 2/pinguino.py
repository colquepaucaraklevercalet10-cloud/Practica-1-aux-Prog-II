from animal import Animal

class Pinguino(Animal):
    def __init__(self, nombre: str, edad: int):
        super()._init_(nombre, edad)

    def desplazarse(self):
        print(f"{self.nombre} nada y se desliza en el hielo.")

    def __str__(self):
        return f"Pinguino(nombre={self.nombre}, edad={self.edad})"