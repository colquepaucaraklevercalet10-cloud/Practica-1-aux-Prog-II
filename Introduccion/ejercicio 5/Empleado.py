class Empleado:
    def __init__(self, nombre, horario):
        self.nombre = nombre
        self.horario = horario
        print(f"Empleado creado: {self.nombre}, Horario:{self.horario}")

    def get_nombre(self):
        return self.nombre
    def set_nombre(self):
        self.nombre = nombre
    def get_horario(self):
        return self.horario
    def set_horario(sefl):
        self.horario = horario
    def __str__(self):
        return f"Empleado [Nombre={self.nombre}, Horario={self.horario}]"
    def __del__(self):
        print(f"Empleado eliminado:{self.nombre}")

if __name__ == "__main__":
    empleado1 = Empleado ("Ana", "8:00 - 16:00")
    print(empleado1)

    del empleado1
