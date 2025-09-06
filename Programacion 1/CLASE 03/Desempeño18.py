# Escribir un programa que solicite ingresar 10 notas de alumnos y nos
# informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
print("Ingresar 10 notas: ")
x=1
mayores=0
menores=0
while x<=10:
    notas=int(input("Ingrese una nota: "))
    if notas<=6:
        menores=menores+1
    else:
        mayores=mayores+1   
    x=x+1
print("La cantidad de notas menores o iguales a 6: ")
print(menores)
print("La cantidad de notas mayores a 6")
print(mayores)
