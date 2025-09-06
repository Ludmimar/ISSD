# Contador desde el 20 al 30

for x in range(20,31):
    print(x)

print("------------------------------------")
# Realizar un programa que imprima todos los números impares que hay entre 1 y 100.
for x in range(1,100,2):
    print(x)

print("------------------------------------")
# Desarrollá un programa que permita la carga de 10 valores por teclado y, posteriormente nos
# muestre la suma de los valores ingresados y su promedio.

suma=0
for f in range(10):
    valor=int(input("Ingrese valor:"))
    suma=suma+valor
print("La suma es")
print(suma)
promedio=suma/10
print("El promedio es:")
print(promedio)

print("------------------------------------")
# Contador de aprobados y reprobados

aprobados=0
reprobados=0
for f in range(10):
    nota=int(input("Ingrese la nota:"))
    if nota>=7:
        aprobados=aprobados+1
    else:
        reprobados=reprobados+1
print("Cantidad de aprobados")
print(aprobados)
print("Cantidad de reprobados")
print(reprobados)

print("------------------------------------")
# Múltiplos de 3 y de 5

mul3=0
mul5=0
for f in range(10):
    valor=int(input("Ingrese un valor:"))
    if valor%3==0:
        mul3=mul3+1
    if valor%5==0:
        mul5=mul5+1
print("Cantidad de valores ingresados múltiplos de 3")
print(mul3)
print("Cantidad de valores ingresados múltiplos de 5")
print(mul5)

print("------------------------------------")
# Detector de N valores mayores a 1000

cantidad=0
n=int(input("Cuantos valores ingresará:"))
for f in range(n):
    valor=int(input("Ingrese el valor:"))
    if valor>=1000:
        cantidad=cantidad+1
print("La cantidad de valores ingresados mayores o iguales a 1000 son")
print(cantidad)




