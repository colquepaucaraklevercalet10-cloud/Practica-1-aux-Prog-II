from Pasajero import Pasajero
from Crucero import Crucero

c1 = Crucero("Caribeño", "Perú", "México")
c2 = Crucero("Pacífico", "Chile", "EEUU")

p1 = Pasajero("Juan Vargas", 30, "hombre", 502, 500)
p2 = Pasajero("Martina Vasques", 25, "mujer", 603, 1000)
p3 = Pasajero("Wilmer Montero", 28, "hombre", 401, 925)
p4 = Pasajero("Ana Torres", 22, "mujer", 701, 800)
p5 = Pasajero("Carlos Ruiz", 35, "hombre", 302, 1200)

c1.agregar_pasajero(p1)
c1.agregar_pasajero(p2)
c1.agregar_pasajero(p3)

c2.agregar_pasajero(p4)
c2.agregar_pasajero(p5)

print(+p1)
print(-p1)
print(+c1)
print(-c1)
print(c1 == c2)
print(c1 + c2)
print(c1 - c2)