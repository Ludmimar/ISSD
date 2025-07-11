# Ludmila Martos DNI: 34811650


"""Consigna:
Escribir un programa en Python que permita ingresar n cantidad de empleados por teclado.
Los datos deberán ser almacenados en dos listas, una con los nombres de los empleados y
otra con sus respectivos sueldos. Luego, implemente las siguientes
funciones:
1. calcular_promedio_sueldos: toma como argumento la lista de sueldos de los empleados y devuelve el
promedio de los sueldos.
2. obtener_empleado_sueldo_max: toma como argumento la lista de sueldos de los empleados y la lista
de nombres de los empleados y devuelve el nombre del empleado con el sueldo más alto.
3. ordenar_por_sueldo: toma como argumento la lista de nombres de empleados y la lista de sueldos y
devuelve dos listas ordenadas de menor a mayor, una con los nombres de los empleados y otra con sus
respectivos sueldos.
El programa deberá utilizar estas funciones para imprimir en pantalla el sueldo promedio de los empleados
y el nombre del empleado con el sueldo más alto.
Recordar: Utilizar lo visto hasta ahora, dispondrán de 7 días para realizarlo. Se debe explicar con
comentarios las líneas mas importantes, RECALCO “UTILIZAR LO VISTO EN CLASES” es determinante para ser calificado."""



"""Agregue validaciones para que el numero ingresado de la cantidad de empleados a procesar sea mayor a 0 y solo sea un numero"""

def validar_numero(inf):
    while True: # Utilizo un bucle infinito para seguir pidiendo al usuario hasta que ingrese un dato válido.
        entrada = input('Ingrese cantidad de empleados (mayor a ' + str(inf) + ' por favor): ').strip()
        if entrada.isdigit(): # verifico que todos los caracteres de la entrada sean dígitos (0-9).
            n = int(entrada) # Convierto la entrada en entero y verifico si es mayor al mínimo requerido.
            if n > inf:
                return n # Si lo es, lo devuelve y sale de la función.
            else: # Si no cumple con la condición, muestra el mensaje de error correspondiente.
                print('Error: el número debe ser mayor a ' + str(inf) + 'Intente nuevamente.')
        else:
            print('Error: solo se permiten números enteros positivos.')


"""Agregue validaciones para que el nombre ingresado del empleados a procesar sea un nombre valido"""

def validar_nombre(nombre):
    nombre = nombre.strip()  # Elimino espacios al principio y al final del texto que ingresó el usuario.
    if nombre == "":   # Si el usuario no ingresó nada (o solo espacios), devuelvo False para indicar que el nombre no es válido.
        return False
    for palabra in nombre.split():  # Divido el nombre en palabras separadas por espacios. Luego analizo cada palabra por separado.
        #Convierto la palabra a minúsculas para facilitar la comparación. Reemplazo vocales con tilde por sus equivalentes sin tilde.
        palabra_sin_tilde = palabra.lower().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u")
        # Verifico que la palabra (sin tildes) contenga solo letras.
        # Si alguna palabra tiene números, espacios internos, signos o caracteres especiales, devuelve False
        if not palabra_sin_tilde.isalpha():
            return False
    return True # Si ninguna palabra falló la condición anterior, el nombre es válido y se devuelve True.


"""Funcion para la carga de los empleados"""

def cargar_empleados(nombre, sueldo):
    # Recorro en este caso los array ya creados con la cantidad de n empleados cargados por teclado
    for i in range(len(nombre)):
        while True: # creo un bucle infinito hasta que ingrese un nombre valido
            nom = input('Nombre del empleado: ') # pido nombre por teclado
            if validar_nombre(nom): # Si la validacion da ok
                nombre[i] = nom.strip() # Guardamos el nombre en nombre[i]
                break # Sale del ciclo.
            else: # Si la validación falla, muestra un mensaje de error y vuelve a pedir el nombre.
                print("Error: el nombre no debe contener números, símbolos ni estar vacío. Intente de nuevo.")
        # Solicito ingresar el sueldo
        sueldo[i] = float(input('Sueldo: ')) # guardamos el sueldo en sueldo[i]


"""Funcion para calcular el promedio de los sueldos ingresados"""

def calcular_promedio_sueldos(s):
    suma=0
    for x in range(len(s)): # Recorro la lista recibida por parametro (s)
        suma=suma+s[x] # Acumulo los sueldos en una variable
        promedio=suma//n # Calculo el promedio con la cantidad de elementos del array (n)
    return promedio # Devuelvo el promedio


"""Funcion que recibe dos arreglos y muestra una lista con los elementos de ambas sincronizados
Se asume que ambas listas tienen la misma cantidad de elementos y están sincronizadas (el sueldo de nom[0] es sue[0], y así sucesivamente)."""

def mostrar_arreglo(nom, sue):
    for x in range(len(nom)):
        # nom[x] accede al nombre del empleado en la posición x y sue[x] accede al sueldo correspondiente en la misma posición x.
        print('Empleado:', nom[x], "--- Sueldo: $", sue[x])

"""Funcion que recibe dos listas y muestra el nombre del empleado con el sualdo mas alto"""
def obtener_empleado_sueldo_max(emple, suel):
    pos = 0
    mayor = suel[0] # Se asume que el primer sueldo es el mayor por ahora.
    for x in range(len(suel)): # Se recorre toda la lista de sueldos con un índice x
        if suel[x] > mayor: # En cada vuelta, se compara el sueldo actual (suel[x]) con el sueldo guardado en mayor
            mayor = suel[x] # Se actualiza el sueldo mayor
            pos = x # Se actualiza pos con el nuevo índice donde está el sueldo más alto
    print("Empleado con el sueldo mas alto: ", emple[pos])  # muestra el nombre del empleado que está en la posición pos.


"""Funcion que recibe dos listas y muestra una lista con los nombres y sueldos ordenados de menor a mayor"""

def ordenar_por_sueldo(nom, suel):
    # El índice máximo válido en una lista con n elementos es n - 1, pero como accedemos a x + 1,
    # No podemos permitir que x llegue hasta el último índice, porque suel[x + 1] daría error.
    n = len(suel) - 1
    for k in range(n): # Recorro la lista de sueldos
        for x in range(n - k): # (n - k) hace que cada vez se comparen menos elementos, porque los últimos ya están ordenados.
            if suel[x] > suel[x + 1]: # Si el sueldo actual es mayor que el siguiente, se intercambian
                aux1 = suel[x] # Guardamos temporalmente el valor de suel[x] en aux1
                suel[x] = suel[x + 1] # Reemplazamos suel[x] con suel[x + 1]
                suel[x + 1] = aux1 # Luego colocamos el valor guardado en aux1 en suel[x + 1]
                # También intercambia los nombres correspondientes, para que no se desincronicen las listas.
                aux2 = nom[x]
                nom[x] = nom[x + 1]
                nom[x + 1] = aux2
    for x in range(len(suel)): # Muestro la lista de los Empleados
        print('Empleado: ', nom[x], "--- Sueldo: $", suel[x])

# se lo agregue yo
def ordenar_por_nombre(nom, suel):
    n = len(nom) - 1
    for k in range(n):
        for x in range(n - k):
            if nom[x].lower() > nom[x + 1].lower():  # Comparación alfabética, sin distinguir mayúsculas
                aux1 = nom[x]
                nom[x] = nom[x + 1]
                nom[x + 1] = aux1

                aux2 = suel[x]
                suel[x] = suel[x + 1]
                suel[x + 1] = aux2

    for x in range(len(nom)):
        print('Empleado: ', nom[x], "--- Sueldo: $", f"{suel[x]:.2f}")

"""*********************************************************************************************************************"""

print('************* GESTION DE EMPLEADOS **************************')
# Cargamos cantidad de empleados...
n = validar_numero(0)

# Se crean los dos arreglos de n elementos...
nombres = n * [' ']
sueldos = n * [0]

# Se cargan los dos arreglos por teclado...
cargar_empleados(nombres, sueldos)
print('***************************************')
# Mostrar listado de empleados cargados
print("*** Lista de Empleados ***")
mostrar_arreglo(nombres,sueldos)

# 1. calcular_promedio_sueldos:
print("Promedio de sueldos: $", calcular_promedio_sueldos(sueldos))
print('***************************************')

# 2. obtener_empleado_sueldo_max:
obtener_empleado_sueldo_max(nombres, sueldos)
print('***************************************')

# 3. ordenar_por_sueldo:
print("*** Lista de Empleados ordenada de menor a mayor ***")
ordenar_por_sueldo(nombres, sueldos)
print('***************************************')

# se lo agregue yo
# 3. ordenar_por_nombre:
print("*** Lista de Empleados ordenada de menor a mayor alfabeticamente ***")
ordenar_por_nombre(nombres, sueldos)
print('***************************************')
