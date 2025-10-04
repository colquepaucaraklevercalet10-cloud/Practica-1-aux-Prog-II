class Video:
    def __init__(self, nombre: str, artista: str, peso: int):
        self.nombre = nombre
        self.artista = artista
        self.peso = peso

    def __str__(self):
        return f"Video: {self.nombre} - {self.artista} ({self.peso} Mb)"