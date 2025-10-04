from persona import Persona

class Jefe(Persona):
    def __init__(self, nombre: str, apellido: str, ci: str, sucursal: str, tipo: str):
        super()._init_(nombre, apellido, ci)
        self.sucursal = sucursal
        self.tipo = tipo

    def mostrar_datos(self) -> str:
        return f"Jefe: {self.nombre} {self.apellido}, CI: {self.ci}, Sucursal: {self.sucursal}, Tipo: {self.tipo}"