from persona import Persona

class Cliente(Persona):
    def __init__(self, nombre: str, apellido: str, ci: str, nroCompra: str, idCliente: str):
        super()._init_(nombre, apellido, ci)
        self.nroCompra = nroCompra
        self.idCliente = idCliente

    def mostrar_datos(self) -> str:
        return f"Cliente: {self.nombre} {self.apellido}, CI: {self.ci}, NroCompra: {self.nroCompra}, ID: {self.idCliente}"