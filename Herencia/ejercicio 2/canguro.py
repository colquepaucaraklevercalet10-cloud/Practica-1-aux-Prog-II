from animal import Animal

class Canguro(Animal):
    def __init__(self, nombre: str, edad: int):
        super()._init_(nombre, edad)

    def desplazarse(self):
        print(f"{self.nombre} salta con sus patas fuertes.")

    def __str__(self):
        return f"Canguro(nombre={self.nombre}, edad={self.edad})"