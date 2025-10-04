class Carta:
    def __init__(self, codigo, descripcion, remitente, destinatario):
        self.codigo = codigo
        self.descripcion = descripcion
        self.remitente = remitente
        self.destinatario = destinatario

    def get_codigo(self):
        return self.codigo

    def get_descripcion(self):
        return self.descripcion

    def get_remitente(self):
        return self.remitente

    def get_destinatario(self):
        return self.destinatario

    def __str__(self):
        return (f"Código: {self.codigo}, Remitente: {self.remitente}, "
                f"Destinatario: {self.destinatario}\nDescripción: {self.descripcion}")
