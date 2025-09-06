# Confeccionar un programa que lea n pares de datos, cada par de datos
# corresponde a la medida de la base y la altura de un triángulo. El programa
# deberá informar:
# a| De cada triángulo la medida de su base, su altura y su superficie.
# b| La cantidad de triángulos cuya superficie es mayor a 12 (la superficie
# se calcula multiplicando la base por la altura y a este valor se divide en 2)

n=int(input("Ingrese cantidad de triangulos a procesar: "))
cantidad = 0
for f in range(n):
    base=int(input("Ingrese la medida del triangulo: "))
    altura=int(input("Ingrese la altura del triangulo: "))
    superficie=base*altura
    print("La superficie es: ")
    print(superficie)
    if superficie >12:
        cantidad=cantidad+1
print("La cantidad de triángulos con superficie superior a 12 son")
print(cantidad)
