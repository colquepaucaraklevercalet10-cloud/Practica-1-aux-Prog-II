from multimethod import multimethod

class Videojuego:
    def __init__(self, nombre="", plataforma="", cantidad_jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    @multimethod
    def agregarJugadores(self):
        self.cantidad_jugadores += 1

    def agregarJugadoresDesdeTeclado(self):
        cantidad = int(input(f"Ingrese cantidad de jugadores para {self.nombre}: "))
        self.cantidad_jugadores += cantidad

    def __str__(self):
        return f"Videojuego: {self.nombre}, Plataforma: {self.plataforma}, Jugadores: {self.cantidad_jugadores}"

juego1 = Videojuego("FIFA 24", "PS5")
juego2 = Videojuego("Minecraft", "PC", 4)

juego1.agregarJugadores()             
juego1.agregarJugadoresDesdeTeclado() 
juego2.agregarJugadores()             
juego2.agregarJugadoresDesdeTeclado() 
print(juego1)
print(juego2)