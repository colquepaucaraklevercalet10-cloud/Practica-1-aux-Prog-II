from cancion import Cancion
from video import Video
from multimethod import multimethod

class Mp4:
    def __init__(self, marca: str, capacidadGb: float):
        self.marca = marca
        self.capacidadGb = capacidadGb
        self.canciones = []
        self.videos = []

    @multimethod
    def borrar(self, nombre: str):
        self.canciones = [c for c in self.canciones if c.nombre != nombre]

    @multimethod
    def borrar(self, peso: int):
        self.canciones = [c for c in self.canciones if c.peso != peso]

    @multimethod
    def borrar(self, artista: object):  
        self.canciones = [c for c in self.canciones if c.artista != artista]

    def __add__(self, cancion: Cancion):
        if cancion not in self.canciones and self.espacio_disponible() > cancion.peso/1024/1024:
            self.canciones.append(cancion)
        return self

    def __sub__(self, video: Video):
        if video not in self.videos and self.espacio_disponible() > video.peso/1024:
            self.videos.append(video)
        return self

    def espacio_disponible(self):
        usado = sum(c.peso for c in self.canciones)/1024/1024
        usado += sum(v.peso for v in self.videos)/1024
        return self.capacidadGb - usado

    def __str__(self):
        return f"MP4 {self.marca} - Capacidad disponible: {self.espacio_disponible():.2f} Gb"