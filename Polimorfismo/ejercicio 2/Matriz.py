from multimethod import multimethod

class Matriz:
    
    @multimethod
    def __init__(self):

        self.matriz = [[1 if i == j else 0 for j in range(10)] for i in range(10)]

    @multimethod
    def __init__(self, matriz: list):
        self.matriz = [row[:] for row in matriz]

    @multimethod
    def sumar(self, otra: 'Matriz'):
        resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(10)] for i in range(10)]
        return Matriz(resultado)

    @multimethod
    def restar(self, otra: 'Matriz'):
        resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(10)] for i in range(10)]
        return Matriz(resultado)

    @multimethod
    def igual(self, otra: 'Matriz'):
        for i in range(10):
            for j in range(10):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True

    def __str__(self):
        return "\n".join([str(row) for row in self.matriz])

m1 = Matriz()

valores = [[i + j for j in range(10)] for i in range(10)]
m2 = Matriz(valores)

suma = m1.sumar(m2)

resta = m2.restar(m1)

iguales = m1.igual(m2)

print("Matriz 1 (Identidad):")
print(m1)
print("\nMatriz 2:")
print(m2)
print("\nSuma:")
print(suma)
print("\nResta:")
print(resta)
print("\n¿Matriz 1 es igual a Matriz 2?", iguales)