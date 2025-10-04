from carta import Carta

class Buzon:
    def __init__(self, nro, nroC):
        self.nro = nro             
        self.nroC = nroC             
        self.cartas = [[None for _ in range(nroC)] for _ in range(3)]  

    def agregar_carta(self, c, fila, col):
        if 0 <= fila < len(self.cartas) and 0 <= col < self.nroC:
            self.cartas[fila][col] = c

    def eliminar_carta(self, codigo):
        for i in range(len(self.cartas)):
            for j in range(self.nroC):
                if self.cartas[i][j] is not None and self.cartas[i][j].get_codigo() == codigo:
                    self.cartas[i][j] = None
                    return True
        return False

    def contar_cartas_por_destinatario(self, destinatario):
        contador = 0
        for fila in self.cartas:
            for carta in fila:
                if carta is not None and carta.get_destinatario().lower() == destinatario.lower():
                    contador += 1
        return contador

    def verificar_remitente(self, remitente):
        for fila in self.cartas:
            for carta in fila:
                if carta is not None and carta.get_remitente().lower() == remitente.lower():
                    return True
        return False

    def buscar_por_palabra_clave(self, palabra):
        for fila in self.cartas:
            for carta in fila:
                if carta is not None and palabra.lower() in carta.get_descripcion().lower():
                    print(carta)

    def __str__(self):
        salida = f"Buzón Nº{self.nro}\n"
        for fila in self.cartas:
            for carta in fila:
                if carta is not None:
                    salida += str(carta) + "\n"
        return salida