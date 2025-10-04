from multimethod import multimethod

class Ordenador:
    def __init__(self, codigoSerial, numero, ram, procesador, estado):
        self.codigoSerial = codigoSerial
        self.numero = numero
        self.ram = ram
        self.procesador = procesador
        self.estado = estado

    def __str__(self):
        return f"{self.codigoSerial} | Nº {self.numero} | RAM: {self.ram}GB | CPU: {self.procesador} | Estado: {self.estado}"

class Laboratorio:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []

    def agregarOrdenador(self, ordenador):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(ordenador)

    @multimethod
    def informacion(self):
        for o in self.ordenadores:
            print(o)

    @multimethod
    def informacion(self, estado: str):
        for o in self.ordenadores:
            if o.estado.lower() == estado.lower():
                print(o)

    @multimethod
    def informacion(self, lab: 'Laboratorio'):
        for o in self.ordenadores:
            if o in lab.ordenadores:
                print(o)

    @multimethod
    def informacion(self, minRam: int):
        for o in self.ordenadores:
            if o.ram > minRam:
                print(o)

    def trasladarOrdenadores(self, destino, codigos):
        print(f"Antes del traslado de {self.nombre} a {destino.nombre}:")
        self.informacion()
        for cod in codigos:
            for o in self.ordenadores:
                if o.codigoSerial == cod:
                    destino.agregarOrdenador(o)
                    self.ordenadores.remove(o)
                    break
        print(f"\nDespués del traslado de {self.nombre} a {destino.nombre}:")
        print(f"{self.nombre}:")
        self.informacion()
        print(f"{destino.nombre}:")
        destino.informacion()

lab1 = Laboratorio("Lasin 1", 5)
lab2 = Laboratorio("Lasin 2", 5)

o1 = Ordenador("C001", 1, 8, "Intel i5", "Activo")
o2 = Ordenador("C002", 2, 16, "Intel i7", "Activo")
o3 = Ordenador("C003", 3, 4, "Intel i3", "Inactivo")
o4 = Ordenador("C004", 4, 12, "AMD Ryzen 5", "Activo")
o5 = Ordenador("C005", 5, 8, "Intel i5", "Inactivo")
o6 = Ordenador("C006", 6, 16, "AMD Ryzen 7", "Activo")

lab1.agregarOrdenador(o1)
lab1.agregarOrdenador(o2)
lab1.agregarOrdenador(o3)
lab2.agregarOrdenador(o4)
lab2.agregarOrdenador(o5)
lab2.agregarOrdenador(o6)

print("Ordenadores activos en Lasin 1:")
lab1.informacion("Activo")

print("\nOrdenadores con más de 8 GB de RAM en Lasin 2:")
lab2.informacion(8)

print("\nOrdenadores pertenecientes a Lasin 1 según lab2:")
lab2.informacion(lab1)

lab1.trasladarOrdenadores(lab2, ["C001", "C002"])