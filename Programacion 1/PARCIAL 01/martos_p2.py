# Ludmila Martos DNI: 34811650

"""
2) Realizar un programa que tomará dos números y nos dirá si el primero es divisible por el
segundo. Hará esto ad-infinitum (Es decir, ciclará de forma infinita) hasta que el usuario ingrese
un 0 (cero) como potencial divisor. (35%)
a) Solicitar al usuario un numero entero imprimiendo el mensaje “Ingrese el numero:”.
Almacenar este número en una variable.
b) Solicitar al usuario otro número entero imprimiendo el mensaje “Es divisible por:”.
Almacenar este número en una variable.
c) Si el primer número ingresado es divisible por el segundo, imprimir el mensaje “Si”.
De lo contrario imprimir “No”.
d) Si el segundo número ingresado es un 0 (cero) imprimir “No es posible dividir por 0”
y finalizar el programa, de lo contrario repetir el algoritmo desde el punto a)
"""

print("**** VALIDAR SI UN NUMERO ES DIVISIBLE POR OTRO **** ")
divisor=1
""" Para que el programa finalice cuando ingrese 0 como divisor lo coloco
como condicion del while
"""
while divisor>0:
    numero=int(input("Ingrese el numero:"))    
    divisor=int(input("Es divisible por:"))
# Verificar si el divisor NO es 0 para proceder con la división 
    if divisor!=0:
        # Calculo el modulo entre los dos numeros para verificar que sea par
        if numero%divisor==0:
            print("Si")        
        else:
            print("No")
# Este bloque 'else' maneja el caso en que divisor ES 0
    else:
        print("No es posible dividir por 0")
print("**** FIN DEL PROGRAMA ****")
       
    
    

