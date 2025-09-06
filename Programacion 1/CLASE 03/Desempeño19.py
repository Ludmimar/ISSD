# Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la
# altura promedio de las personas.

cantAlt=int(input("Ingresar cantidad de personas: "))
x=1
suma=0
promedio=0
while x<=cantAlt:
    altura=float(input("Ingresar la altura: "))
    suma=suma+altura 
    x=x+1
promedio=suma/cantAlt
print("La altura promedio es de: ")
print(promedio)
