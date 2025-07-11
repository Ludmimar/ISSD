# Ludmila Martos DNI: 34811650

"""
3) Diseñaremos un programa que analizará cadenas de caracteres (Strings) (40%)
Nuestro programa deberá:
a) Solicitar al usuario el ingreso de una cadena de caracteres (String) y guardarla en
una variable.
b) Imprimir, una por una, las letras de esta cadena de caracteres.
c) Imprimir la cantidad de letras de esta cadena de caracteres, con el mensaje “La
cantidad de letras es:” seguido de la cantidad de letras.
d) Ciclar de manera infinita, es decir, solicitar el ingreso de otra cadena de caracteres
(inciso a) hasta que el usuario ingrese la palabra clave salir
"""

print("**** CADENA DE CARACTERES ****")
cad=input("Ingrese la cadena de caracteres:")
# Condicion de salida del ciclo la palabra clave "salir"
while cad!="salir":
    contador=0
    # len(cad) me devuelve la longitud de la cadena
    # se lo paso como argumento al for para que itere en cada indice de la cadena
    for x in range(len(cad)):
        #Agrego esta condicion para que no me cuente espacios en blanco
        if cad[x]!=" ":
            #Imprimo el caracter que se encuentra en cada indice
            print(cad[x])
            contador=contador+1
    print("La cantidad de letras es:" , contador)
    #Solicito otra cadena hasta que ingrese "salir"
    cad=input("Ingrese la cadena de caracteres:")
print("Saliendo del programa")
    
