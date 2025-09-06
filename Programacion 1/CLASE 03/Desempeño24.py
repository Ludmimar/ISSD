# Desarrollar un programa que permita cargar n números enteros y luego
# nos informe cuántos valores fueron pares y cuántos impares.
# Emplear el operador “%” en la condición de la estructura condicional
# (este operador retorna el resto de la división de dos valores, por ejemplo
# 11%2 retorna un 1):
# if valor%2==0:
x=1
cant=int(input("Ingrese cantidad de numeros a cargar: "))
par=0
impar=0
while x<=cant:
    num=int(input("Ingrese un numero: "))
    if num%2==0:
        par=par+1
    else:
        impar=impar+1
    x=x+1
print("Cantidad de numeros pares: ")
print(par)
print("Cantidad de numeros impares: ")
print(impar)

