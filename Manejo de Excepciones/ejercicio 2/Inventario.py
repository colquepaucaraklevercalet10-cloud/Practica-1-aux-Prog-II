class Inventario:
    def __init__(self):
        self.productos = []

    def agregarProducto(self, p):
        for prod in self.productos:
            if prod.codigo.lower() == p.codigo.lower():
                raise Exception(f"El código ya existe: {p.codigo}")

        if p.precio < 0 or p.stock < 0:
            raise Exception("Precio/stock no pueden ser negativos")

        self.productos.append(p)

    def buscarProducto(self, codigo):
        for p in self.productos:
            if p.codigo.lower() == codigo.lower():
                return p
        raise ProductoNoEncontradoException(f"Producto no encontrado: {codigo}")

    def venderProducto(self, codigo, cantidad):
        p = self.buscarProducto(codigo)
        if p.stock < cantidad:
            raise StockInsuficienteException("Stock insuficiente para vender " + str(cantidad))
        p.stock -= cantidad

    def listar(self):
        print("\nInventario:")
        for p in self.productos: 
            p.mostrar()
if __name__ == "__main__":
    inv = Inventario()
    try:
        inv.agregarProducto(Producto("P1", "Laptop", 2500, 5))
        inv.agregarProducto(Producto("P2", "Mouse", 40, 20))

        inv.listar()

        inv.venderProducto("P1", 3)
        inv.listar()

        inv.venderProducto("P1", 5)

    except Exception as e:
        print("Error:", e)