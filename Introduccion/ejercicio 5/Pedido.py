class Pedido:
    def __init__(self, producto, entrega):
        self.producto = producto
        self.entrega = entrega 
        print(f"Pedido creado: {self.producto}, Entrega: {self.entrega}")
    def get_producto(self):
        return self.producto
    def set_producto(self, producto):
        self.producto = producto
    def get_entrega(self):
        return self.entrega
    def set_entrega(self, entrega):
        self.entrega = entrega
    def __str__(self):
        return f"Pedido [Producto={self.producto},Entrega={self.entrega}]"
    def __del__(self):
        print(f"Pedido eliminado:{self.producto}")

if __name__ == "__main__":
    pedido1 = Pedido ("Cafe", "12:30")
    print(pedido1)

    del pedido1
