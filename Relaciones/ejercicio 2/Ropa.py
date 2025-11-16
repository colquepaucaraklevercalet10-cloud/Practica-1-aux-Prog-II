class Ropa:
    def __init__(self, tipo, material):
        self.tipo = tipo
        self.material = material

    def mostrar(self):
        print(f"Ropa -> Tipo: {self.tipo}, Material: {self.material}")

    def getTipo(self):
        return self.tipo

    def setTipo(self, tipo):
        self.tipo = tipo

    def getMaterial(self):
        return self.material

    def setMaterial(self, material):
        self.material = material