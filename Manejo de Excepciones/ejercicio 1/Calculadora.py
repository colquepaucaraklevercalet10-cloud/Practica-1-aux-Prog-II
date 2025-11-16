class Calculadora:

    @staticmethod
    def sumar(a, b):
        return a + b

    @staticmethod
    def restar(a, b):
        return a - b

    @staticmethod
    def multiplicar(a, b):
        return a * b

    @staticmethod
    def dividir(a, b):
        if b == 0:
            raise ArithmeticError("División por cero no permitida")
        return a / b

    @staticmethod
    def convertir(valor):
        try:
            return int(valor)
        except ValueError:
            raise NumeroInvalidoException(f"El valor '{valor}' no es numérico")

if __name__ == "__main__":
    try:
        print("Suma:", Calculadora.sumar(5, 3))
        print("Resta:", Calculadora.restar(10, 4))
        print("Multiplicación:", Calculadora.multiplicar(6, 7))
        print("División:", Calculadora.dividir(20, 4))

        # Prueba de conversión correcta
        print("Convertir '123':", Calculadora.convertir("123"))

        # Prueba de conversión incorrecta
        print("Convertir 'abc':", Calculadora.convertir("abc"))

    except NumeroInvalidoException as e:
        print("Error Número Inválido:", e)
    except ArithmeticError as e:
        print("Error Aritmético:", e)