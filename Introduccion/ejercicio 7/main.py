from carta import Carta
from buzon import Buzon

if __name__ == "__main__":

    b1 = Buzon(1, 3)

    c1 = Carta("C123", "Hola amigo, te escribo para saludarte.", "Juan Álvarez", "Peter Chaves")
    c2 = Carta("C456", "Querido amigo, ella no te ama...", "Pepe Mujica", "Wilmer Pérez")
    c3 = Carta("C789", "Feliz cumpleaños, con mucho amor.", "Paty Vasques", "Pepe Mujica")

    b1.agregar_carta(c1, 0, 0)
    b1.agregar_carta(c2, 0, 1)
    b1.agregar_carta(c3, 0, 2)

    print("Cartas recibidas por 'Pepe Mujica':", b1.contar_cartas_por_destinatario("Pepe Mujica"))

    b1.eliminar_carta("C456")

    print("¿Ha enviado cartas Pepe Mujica?:", b1.verificar_remitente("Pepe Mujica"))

    print("Cartas que contienen la palabra 'amor':")
    b1.buscar_por_palabra_clave("amor")

    print(b1)