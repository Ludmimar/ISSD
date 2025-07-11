# Ludmila Martos DNI: 34811650

"""
1) Diseñaremos un programa que obtendrá números pares desde el número 2. (25%)
Nuestro programa deberá:
a) Solicitar al usuario un valor de tipo entero y guardarlo en una variable.
b) Imprimir los números pares desde el 2 y hasta el valor ingresado por el
usuario (inclusive), según el inciso anterior.
c) Calcular la suma de estos números pares.
d) Imprimir la suma obtenida en el inciso anterior, con el mensaje: “La suma de
los números pares es:” seguida del valor obtenido.
"""

print("**** PROGRAMA DE NUMEROS PARES ****")

suma=0
# Solicitamos que se ingrese un numero por teclado
n=int(input("Ingrese el numero: "))

"""ciclo para iterar en la secuencia:
El primer argumento indica el inicio de la secuencia
El segundo es el fin de la secuencia (Usamos n+1 porque
range excluye el límite superior; si queremos incluir n en
la secuencia si es par, debemos poner el límite uno más allá.
El tercer argumento es el paso o incremento"""

for x in range(2,n+1,2):  
    print(x)
    suma+=x
print("La suma de los números pares es: ", suma)
print("**** FIN DEL PROGRAMA ****")
