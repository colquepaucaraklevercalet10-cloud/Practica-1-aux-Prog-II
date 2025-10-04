from cancion import Cancion
from video import Video
from mp4 import Mp4

c1 = Cancion("Back To Black", "Amy Winehouse", 100)
c2 = Cancion("Lost On You", "LP", 150)
v1 = Video("Heathens", "twenty one pilots", 50)
v2 = Video("Harmonica Andromeda", "KSHMR", 70)
v3 = Video("Without Me", "Halsey", 30)

mp = Mp4("Sony", 2.0)

mp = mp + c1
mp = mp + c2
mp = mp - v1
mp = mp - v2
mp = mp - v3

print(mp)

mp.borrar("Lost On You")
print([str(c) for c in mp.canciones])