from multimethod import multimethod

class Parada:
    def __init__(self, nombreP=None):
        self.admins = [""] * 10
        self.autos = [["", "", ""] for _ in range(10)]
        self.nombreP = nombreP if nombreP else ""
        self.nroAdmins = 0
        self.nroAutos = 0

    @multimethod
    def adicionar(self, x: str):
        if self.nroAdmins < 10:
            self.admins[self.nroAdmins] = x
            self.nroAdmins += 1

    @multimethod
    def adicionar(self, x: str, y: str, z: str):
        if self.nroAutos < 10:
            self.autos[self.nroAutos][0] = x
            self.autos[self.nroAutos][1] = y
            self.autos[self.nroAutos][2] = z
            self.nroAutos += 1

    def mostrar(self):
        print("Parada:", self.nombreP)
        print("Admins:")
        for i in range(self.nroAdmins):
            print(self.admins[i])
        print("Autos:")
        for i in range(self.nroAutos):
            print("Modelo:", self.autos[i][0], 
                  "Conductor:", self.autos[i][1], 
                  "Placa:", self.autos[i][2])

if __name__ == "__main__":
    p = Parada("Central")
    p.adicionar("Admin1")
    p.adicionar("Admin2")
    p.adicionar("Toyota", "Carlos", "123ABC")
    p.adicionar("Nissan", "Luis", "456XYZ")
    p.mostrar()