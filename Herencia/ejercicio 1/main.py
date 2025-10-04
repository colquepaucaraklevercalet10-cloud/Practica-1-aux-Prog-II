from cliente import Cliente
from jefe import Jefe

c1 = Cliente("Juan", "Vargas", "123456", "N001", "C45")
j1 = Jefe("Ana", "Torres", "789012", "Sucursal Lima", "General")

print(c1.mostrar_datos())
print(j1.mostrar_datos())