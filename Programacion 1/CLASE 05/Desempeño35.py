# Ludmila Martos DNI: 34811650

"""Realizar la carga de dos nombres de personas distintos.
Mostrar por pantalla luego ordenados en forma alfabética. """



#otro ejercicio
sueldos=[]
for x in range(5):
    valor=int(input("Ingrese sueldo:"))
    sueldos.append(valor)
    print("Lista sin ordenar")
    print(sueldos)

print(sueldos.sort())
"""
for k in range(4):
    for x in range(4):
        if sueldos[x]>sueldos[x+1]:
            aux=sueldos[x]
            sueldos[x]=sueldos[x+1]
            sueldos[x+1]=aux
print("Lista ordenada")
print(sueldos)
"""