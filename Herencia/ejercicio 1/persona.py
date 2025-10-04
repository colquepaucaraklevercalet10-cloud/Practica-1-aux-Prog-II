class Persona:
    def _init_(self, nombre: str, apellido: str, ci: str):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci

    def mostrar_datos(self) -> str:
        return f"{self.nombre} {self.apellido} - CI: {self.ci}"