class Celular:
    def __init__(self, nroTel, dueño, espacio=64, ram=4, nroApp=10):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio
        self.ram = ram
        self.nroApp = nroApp

    def aumentarApps(self):
        self.nroApp += 10

    def disminuirEspacio(self):
        self.espacio -= 5

    def __str__(self):
        return f"NroTel: {self.nroTel}, Dueño: {self.dueño}, Espacio: {self.espacio}GB, RAM: {self.ram}GB, NroApp: {self.nroApp}"

cel1 = Celular("12345678", "Juan")
cel2 = Celular("87654321", "Ana", 128, 8, 20)

print("Antes:")
print(cel1)
print(cel2)

cel1.aumentarApps()
cel1.disminuirEspacio()
cel2.aumentarApps()
cel2.disminuirEspacio()

print("Después:")
print(cel1)
print(cel2)