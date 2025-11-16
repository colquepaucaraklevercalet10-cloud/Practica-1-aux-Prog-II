class Empleado:
    def __init__(self, n=None):
        if n is None:
            self.nombre = "Gerson"
            self.cargo = "Supervisor"
            self.sueldo = 1200
        else:
            self.nombre = n
            self.cargo = "gerente"
            self.sueldo = 3000

    def mostrar(self):
        print(self.nombre, self.cargo, self.sueldo)

    def getSueldo(self):
        return self.sueldo

    def setSueldo(self, sueldo):
        self.sueldo = sueldo

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre