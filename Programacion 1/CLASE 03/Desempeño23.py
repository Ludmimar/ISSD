# Realizar un programa que permita cargar dos listas de 15 valores
# cada una. Informar con un mensaje cual de las dos listas tiene un valor
# acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas
# iguales")
# Tené en cuenta que puede haber dos o más estructuras repetitivas
# en un algoritmo.
print("**************")
print("*** LISTA 1***")
print("**************")
x=1
y=1
suma1=0
suma2=0
while x<=15:
    lista1=int(input("Ingrese un valor de la lista 1: "))
    suma1=suma1+lista1
    x=x+1
print("**************")
print("*** LISTA 2***")
print("**************")
while y<=15:
    lista2=int(input("Ingrese un valor de la lista 2: "))
    suma2=suma2+lista2
    y=y+1
if suma1>suma2:
    print("Lista 1 mayor")
else:
    print("Lista 2 mayor")
    

