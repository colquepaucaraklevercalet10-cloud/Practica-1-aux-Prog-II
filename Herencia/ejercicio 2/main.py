from leon import Leon
from pinguino import Pinguino
from canguro import Canguro

def main():
    zoologico = [
        Leon("Simba", 5),
        Pinguino("Pingu", 3),
        Canguro("Kangoo", 6)
    ]

    for animal in zoologico:
        print(animal)
        animal.desplazarse()

if __name__ == "_main_":
    main()