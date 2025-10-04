class Animal:
    def __init__(self, nombre: str, edad: int):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza.")

    def __str__(self):
        return f"Animal(nombre={self.nombre}, edad={self.edad})"