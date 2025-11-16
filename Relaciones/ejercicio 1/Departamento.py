class Departamento:
    def __init__(self, a=None):
        self.n = [None] * 20
        if a is None:
            self.nombre = "A1"
            self.area = "social"
            self.nroEmpleados = 5
            self.n[0] = Empleado("Jhon")
            self.n[1] = Empleado()
            self.n[2] = Empleado("Arturo")
            self.n[3] = Empleado("Gael")
            self.n[4] = Empleado("Miguel")
        else:
            self.nombre = "A2"
            self.area = "familiar"
            self.nroEmpleados = a
            for i in range(self.nroEmpleados):
                self.n[i] = Empleado()

    def mostrarEmpleados(self):
        print(self.nombre, self.area, self.nroEmpleados, "empleados")
        if self.nroEmpleados == 0:
            print("Este departamento no tiene ningun empleado")
        for i in range(self.nroEmpleados):
            self.n[i].mostrar()

    def cambiarSalario(self, c):
        for i in range(self.nroEmpleados):
            self.n[i].setSueldo(c)

    def verificarSiPertenece(self, c):
        k = 0
        for i in range(self.nroEmpleados):
            for j in range(c.getNroEmpleados()):
                if self.n[i].getNombre() == c.n[j].getNombre():
                    print(self.n[i].getNombre(), "Pertenece a ambos departamentos")
                    k += 1
        if k == 0:
            print("Ningun empleado pertenece a ambos departamentos")

    def cambiarEmpleados(self, z):
        temp = self.n
        self.n = z.getN()
        z.setN(temp)
        aux = self.nroEmpleados
        self.nroEmpleados = z.getNroEmpleados()
        z.setNroEmpleados(aux)

    def setNombre(self, nombre):
        self.nombre = nombre

    def getArea(self):
        return self.area

    def setArea(self, area):
        self.area = area

    def getNroEmpleados(self):
        return self.nroEmpleados

    def setNroEmpleados(self, nroEmpleados):
        self.nroEmpleados = nroEmpleados

    def getN(self):
        return self.n

    def setN(self, n):
        self.n = n
if __name__ == "__main__":
    d1 = Departamento()
    d2 = Departamento(3)

    print("\n--- Departamento 1 ---")
    d1.mostrarEmpleados()

    print("\n--- Departamento 2 ---")
    d2.mostrarEmpleados()

    print("\n--- Cambiando salario d2 a 5000 ---")
    d2.cambiarSalario(5000)
    d2.mostrarEmpleados()

    print("\n--- Verificar si comparten empleados d1 y d2 ---")
    d1.verificarSiPertenece(d2)

    print("\n--- Intercambiando empleados d1 <-> d2 ---")
    d1.cambiarEmpleados(d2)

    print("\n--- Nuevos empleados d1 ---")
    d1.mostrarEmpleados()

    print("\n--- Nuevos empleados d2 ---")
    d2.mostrarEmpleados()