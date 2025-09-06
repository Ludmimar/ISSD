""" """
# Identificador de mayor estatura

print("Datos de la primer persona")
nombre1=input("Ingrese nombre:")
edad1=int(input("Ingrese la edad:"))
altura1=float(input("Ingrese la altura Ej 1.75:"))
print("Datos de la segunda persona")
nombre2=input("Ingrese nombre:")
edad2=int(input("Ingrese la edad:"))
altura2=float(input("Ingrese la altura Ej 1.75:"))
print("La persona mas alta es:")
if altura1>altura2:
    print(nombre1)
else:
    print(nombre2)
    
print("********************************")

# Identificador de nombres alfabéticamente mayores
nombre1=input("Ingrese el primer nombre:")
nombre2=input("Ingrese el segundo nombre:")
if nombre1==nombre2:
    print("Ingreso dos nombre iguales")
else:
    if nombre1>nombre2:
        print(nombre1)
        print("es mayor alfabeticamente")
    else:
        print(nombre2)
        print("es mayor alfabeticamente")

print("********************************")
# Identificador de nombres alfabéticamente mayores
opcion="si"
suma=0
while opcion=="si":
    valor=int(input("Ingrese un valor:"))
    suma=suma+valor
    opcion=input("Desea cargar otro numero (si/no):")
print("La suma de valores ingresados es")
print(suma)

print("********************************")
