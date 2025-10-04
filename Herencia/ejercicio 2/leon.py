from animal import Animal

class Leon(Animal):
    def __init__(self, nombre: str, edad: int):
        super()._init_(nombre, edad)

    def desplazarse(self):
        print(f"{self.nombre} camina con fuerza.")

    def __str__(self):
        return f"Leon(nombre={self.nombre}, edad={self.edad})"