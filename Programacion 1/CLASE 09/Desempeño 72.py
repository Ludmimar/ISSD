def producto(lista):
    prod = 1
    for x in range(len(lista)):
        prod=prod*lista[x]
    return prod
# bloque principal
# Crear una lista de enteros por asignación.
lista=[1, 2, 3, 4, 5]
print("Lista:", lista)
print("Multiplicacion de todos sus elementos:",producto(lista))