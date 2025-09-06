def maslarga(lista):
    pos = 0
    for x in range(len(lista)):
        if len(lista[x])>len(lista[pos]):
            pos=x
    return lista[pos]
# bloque principal
# Crear una lista de enteros por asignación.
palabras=["enero", "febrero", "marzo", "abril", "mayo", "junio"]
print("Palabra con mas caracteres:",maslarga(palabras))