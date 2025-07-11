# Ludmila Martos DNI: 34811650

"""
>> Programa para la gestión de notas de alumnos en un colegio. El programa debe permitir:
1. **Cargar alumnos:** Ingresar la cantidad de alumnos y sus datos: nombre y notas de tres trimestres (notas entre 1 y 10).
2. **Mostrar listado con condición:** Listar todos los alumnos con sus notas, promedio y condición según el promedio:
   * Promedio >= 8: "Promocionado"
   * Promedio >= 6 y < 8: "Regular"
   * Promedio < 6: "Libre"
3. **Mostrar alumno con mejor promedio:** Indicar el alumno con el promedio más alto.

4. **Mostrar listado ordenado por promedio:** Mostrar la lista de alumnos ordenada de forma descendente según el promedio.

5. **Buscar alumno por nombre:** Permitir buscar un alumno por nombre e imprimir su información completa.

6. **Modificar nota de un alumno:** Permitir modificar la nota de un trimestre específico para un alumno dado. Actualizar
automáticamente su promedio y condición.
"""


def validar_numero(inf):
    # Solicita al usuario que ingrese un número, elimina espacios en blanco al inicio y al final
    entrada = input('Ingrese cantidad de alumnos (mayor a ' + str(inf) + ' por favor): ').strip()
    # Bucle que se repite mientras:
    # - la entrada no sea un número entero positivo (isdigit devuelve False)
    # - o el número ingresado sea menor o igual al mínimo permitido (inf)
    while not entrada.isdigit() or int(entrada) <= inf:
        # Si la entrada contiene letras, símbolos o está vacía (no es un número entero positivo)
        if not entrada.isdigit():
            print('Error: solo se permiten números enteros positivos.')
        # Si es un número, pero menor o igual al valor mínimo permitido
        else:
            print('Error: el número debe ser mayor a ' + str(inf) + ' Intente nuevamente.')
        # Vuelve a pedir al usuario que ingrese un valor, eliminando espacios
        entrada = input(f'Ingrese cantidad de alumnos (mayor a {inf} por favor): ').strip()
    # Convierte la entrada válida a entero y la retorna
    return int(entrada)

def validar_nota(mensaje):
    # Solicita una nota al usuario usando el mensaje recibido como parámetro
    # Elimina espacios en blanco al principio y al final
    entrada = input(mensaje).strip()
    # Verifica si la entrada es un número entero (isdigit()) y si está en el rango permitido (1 a 10)
    valido = entrada.isdigit() and 1 <= int(entrada) <= 10
    # Mientras la entrada no sea válida, repite el pedido
    while not valido:
        # Muestra un mensaje de error explicando los requisitos
        print("¡Error! Ingrese un número entero válido entre 1 y 10, sin espacios ni caracteres.")
        # Vuelve a pedir la nota al usuario y elimina espacios
        entrada = input(mensaje).strip()
        # Vuelve a validar: debe ser un número entero y estar entre 1 y 10
        valido = entrada.isdigit() and 1 <= int(entrada) <= 10
    # Si pasó las validaciones, convierte la entrada a entero y la devuelve
    return int(entrada)


def validar_nombre(mensaje):
    # Solicita al usuario que ingrese un nombre, usando el mensaje recibido como parámetro
    # Elimina espacios en blanco al inicio y al final
    nombre = input(mensaje).strip()
    # Mientras el nombre contenga números (cualquier carácter que sea un dígito) o esté vacío
    while any(char.isdigit() for char in nombre) or nombre == "":
        # Muestra mensaje de error explicando las condiciones válidas
        print("¡Error! El nombre no debe contener números ni estar vacío.")
        # Vuelve a pedir al usuario que ingrese un nombre y elimina espacios
        nombre = input(mensaje).strip()
    # Cuando el nombre es válido (sin números y no vacío), lo devuelve
    return nombre


def cargar_alumnos(n):
    # Inicializa listas vacías de longitud n, una para los nombres y tres para las notas de cada trimestre
    nombres = [""] * n       # Lista para almacenar los nombres de los alumnos
    trim1 = [0] * n          # Lista para notas del primer trimestre
    trim2 = [0] * n          # Lista para notas del segundo trimestre
    trim3 = [0] * n          # Lista para notas del tercer trimestre
    # Bucle que se repite n veces, una por cada alumno
    for i in range(n):
        # Informa al usuario qué alumno está cargando (usando i+1 para numeración desde 1)
        print("\nCarga del alumno", i + 1)
        # Solicita el nombre del alumno usando la función validar_nombre (evita nombres vacíos o con números)
        nombres[i] = validar_nombre("Ingrese nombre: ")
        # Solicita y valida la nota del primer trimestre
        trim1[i] = validar_nota("Ingrese nota del trimestre 1 (1-10): ")
        # Solicita y valida la nota del segundo trimestre
        trim2[i] = validar_nota("Ingrese nota del trimestre 2 (1-10): ")
        # Solicita y valida la nota del tercer trimestre
        trim3[i] = validar_nota("Ingrese nota del trimestre 3 (1-10): ")
    # Devuelve las cuatro listas cargadas con los datos ingresados
    return nombres, trim1, trim2, trim3

def calcular_promedios(trim1, trim2, trim3):
    # Crea una lista de ceros del mismo tamaño que las listas de notas, para almacenar los promedios
    promedios = [0] * len(trim1)
    # Bucle que recorre cada posición de las listas de notas
    for i in range(len(trim1)):
        # Suma las tres notas correspondientes al alumno i y las divide por 3
        # Guarda el resultado (el promedio) en la posición i de la lista 'promedios'
        promedios[i] = (trim1[i] + trim2[i] + trim3[i]) / 3
    # Devuelve la lista de promedios calculados
    return promedios


def asignar_condiciones(promedios):
    condiciones = []  # Lista vacía donde se irán guardando las condiciones de cada alumno
    # Recorre la lista de promedios, uno por uno
    for p in promedios:
        if p >= 8:
            # Si el promedio es 8 o más, el alumno promociona
            condiciones.append("Promocionado")
        elif p >= 6:
            # Si el promedio es 6 o 7.99, el alumno queda regular
            condiciones.append("Regular")
        else:
            # Si el promedio es menor a 6, el alumno queda libre
            condiciones.append("Libre")
    return condiciones  # Devuelve la lista con las condiciones correspondientes a cada alumno


def mostrar_alumnos_con_condicion(nombres, trim1, trim2, trim3, promedios, condiciones):
    print("\nListado completo sin ordenar:")  # Imprime título para indicar que mostrará la lista completa sin orden
    # Recorre todos los índices según la cantidad de alumnos (la longitud de la lista nombres)
    for x in range(len(nombres)):
        # Imprime los datos del alumno en la posición x:
        # nombre, notas de cada trimestre, promedio (redondeado a 2 decimales) y condición final
        print('\nAlumno:', nombres[x],
              '| Trimestre 1:', trim1[x],
              '| Trimestre 2:', trim2[x],
              '| Trimestre 3:', trim3[x],
              '| Promedio:', round(promedios[x], 2),
              '| Condición:', condiciones[x])


def obtener_mejor_alumno(nombres, promedios):
    pos = 0  # Inicializa la posición del mejor alumno como 0 (primer alumno)
    mayor = promedios[0]  # Inicializa el mayor promedio con el promedio del primer alumno
    # Recorre los promedios desde el segundo alumno (índice 1) hasta el último
    for i in range(1, len(promedios)):
        if promedios[i] > mayor:  # Si el promedio actual es mayor que el mayor registrado
            mayor = promedios[i]  # Actualiza el mayor promedio
            pos = i  # Actualiza la posición del mejor alumno con el índice actual
    # Devuelve el nombre y promedio del alumno con el mayor promedio encontrado
    return nombres[pos], mayor


def ordenar_descendente(nombres, trim1, trim2, trim3, promedios):
    n = len(promedios) - 1  # Calcula el índice máximo para iterar en los ciclos (longitud - 1)
    # Ciclo externo controla el número de pasadas necesarias para ordenar la lista
    for k in range(n):
        # Ciclo interno compara elementos adyacentes hasta el índice límite que va decreciendo
        for x in range(n - k):
            # Compara el promedio actual con el siguiente para ordenar de mayor a menor
            if promedios[x] < promedios[x + 1]:
                # Intercambia los promedios si el actual es menor que el siguiente
                aux = promedios[x]
                promedios[x] = promedios[x + 1]
                promedios[x + 1] = aux
                # Intercambia los nombres para mantener correspondencia con los promedios
                aux_nom = nombres[x]
                nombres[x] = nombres[x + 1]
                nombres[x + 1] = aux_nom
                # Intercambia las notas del primer trimestre correspondientes
                aux_trim1 = trim1[x]
                trim1[x] = trim1[x + 1]
                trim1[x + 1] = aux_trim1
                # Intercambia las notas del segundo trimestre correspondientes
                aux_trim2 = trim2[x]
                trim2[x] = trim2[x + 1]
                trim2[x + 1] = aux_trim2
                # Intercambia las notas del tercer trimestre correspondientes
                aux_trim3 = trim3[x]
                trim3[x] = trim3[x + 1]
                trim3[x + 1] = aux_trim3
    # Una vez ordenados, imprime la lista completa mostrando todos los datos por alumno
    print("\nListado completo ordenado por promedio:")
    for x in range(len(nombres)):
        print('Alumno:', nombres[x],
              '| Trimestre 1:', trim1[x],
              '| Trimestre 2:', trim2[x],
              '| Trimestre 3:', trim3[x],
              '| Promedio:', round(promedios[x], 2))


def buscar_alumno(nombre_buscado, nombres, trim1, trim2, trim3, promedios, condiciones):
    encontrado = False  # Inicializa la bandera que indica si el alumno fue encontrado
    # Recorre la lista de nombres para buscar coincidencia
    for i in range(len(nombres)):
        # Compara el nombre buscado con el actual, ignorando mayúsculas y minúsculas
        if nombres[i].lower() == nombre_buscado.lower():
            # Si encuentra el alumno, imprime los datos completos
            print('\nAlumno encontrado:')
            print('Alumno:', nombres[i],
                  '| Trimestre 1:', trim1[i],
                  '| Trimestre 2:', trim2[i],
                  '| Trimestre 3:', trim3[i],
                  '| Promedio:', round(promedios[i], 2),
                  '| Condición:', condiciones[i])
            encontrado = True  # Cambia la bandera a True indicando que se encontró
    # Si terminó el ciclo sin encontrar el alumno, muestra mensaje de error
    if not encontrado:
        print("No se encontró ningún alumno con ese nombre.")

def modificar_nota(nombres, trim1, trim2, trim3, promedios, condiciones):
    # Pide el nombre del alumno a modificar y elimina espacios al inicio/final
    nombre = input("Ingrese el nombre del alumno a modificar: ").strip()
    # Valida que el nombre no esté vacío después de eliminar espacios
    while nombre == "":
        print("¡Error! El nombre no puede estar vacío ni contener solo espacios.")
        nombre = input("Ingrese el nombre del alumno a modificar: ").strip()
    # Recorre la lista de nombres para buscar coincidencia
    for i in range(len(nombres)):
        # Compara el nombre ingresado con cada nombre en la lista, ignorando mayúsculas/minúsculas
        if nombres[i].lower() == nombre.lower():
            # Muestra los datos actuales del alumno encontrado
            print("\nAlumno encontrado:", nombres[i])
            print("Notas actuales -> Trimestre 1:", trim1[i],
                  "| Trimestre 2:", trim2[i],
                  "| Trimestre 3:", trim3[i])
            # Solicita qué trimestre se desea modificar
            trimestre = input("¿Qué trimestre desea modificar? (1, 2 o 3): ").strip()
            # Valida que el trimestre ingresado sea válido (1, 2 o 3)
            while trimestre not in ["1", "2", "3"]:
                print("Trimestre inválido.")
                trimestre = input("Ingrese 1, 2 o 3: ").strip()
            # Pide la nueva nota y la valida usando la función validar_nota
            nueva_nota = validar_nota("Ingrese la nueva nota (1 a 10): ")
            # Actualiza la nota correspondiente al trimestre indicado
            if trimestre == "1":
                trim1[i] = nueva_nota
            elif trimestre == "2":
                trim2[i] = nueva_nota
            elif trimestre == "3":
                trim3[i] = nueva_nota
            # Calcula el nuevo promedio del alumno
            promedios[i] = (trim1[i] + trim2[i] + trim3[i]) / 3
            # Asigna la nueva condición según el promedio actualizado
            if promedios[i] >= 8:
                condiciones[i] = "Promocionado"
            elif promedios[i] >= 6:
                condiciones[i] = "Regular"
            else:
                condiciones[i] = "Libre"
            # Muestra mensaje de éxito y termina la función
            print("Nota actualizada con éxito.")
            return
    # Si no se encontró ningún alumno con el nombre ingresado, muestra un mensaje de error
    print("No se encontró ningún alumno con ese nombre.")


# *************************************************
def menu():
    print("\n--- MENÚ DE OPCIONES ---")  # Imprime el menú principal
    print("1. Cargar alumnos")
    print("2. Mostrar listado sin ordenar con condición")
    print("3. Mostrar alumno con mejor promedio")
    print("4. Mostrar listado ordenado por promedio")
    print("5. Buscar alumno por nombre")
    print("6. Modificar nota de un alumno")
    print("0. Salir")

# Variables globales inicializadas vacías o con estado inicial
nombres = []        # Lista para guardar nombres de alumnos
trim1 = []          # Lista para notas del primer trimestre
trim2 = []          # Lista para notas del segundo trimestre
trim3 = []          # Lista para notas del tercer trimestre
promedios = []      # Lista para promedios calculados
condiciones = []    # Lista para condición de cada alumno (Promocionado, Regular, Libre)
datos_cargados = False  # Bandera que indica si ya se cargaron los datos de alumnos
opcion = ""         # Variable para guardar la opción elegida por el usuario

# Bucle principal del programa que se repite hasta que el usuario ingresa "0"
while opcion != "0":
    menu()  # Muestra el menú en pantalla
    opcion = input("Seleccione una opción: ").strip()  # Solicita opción al usuario y elimina espacios

    if opcion == "1":  # Opción para cargar alumnos
        n = validar_numero(0)  # Pide y valida cantidad de alumnos mayor a 0
        nombres, trim1, trim2, trim3 = cargar_alumnos(n)  # Solicita datos de alumnos y notas
        promedios = calcular_promedios(trim1, trim2, trim3)  # Calcula los promedios de los alumnos
        condiciones = asignar_condiciones(promedios)  # Asigna condición según promedio
        datos_cargados = True  # Cambia bandera para indicar que ya hay datos cargados
        print("-------------------------------------------------------------------------------------")
        print("Datos cargados correctamente.")
        print("-------------------------------------------------------------------------------------")

    elif opcion == "2":  # Opción para mostrar listado sin ordenar
        if datos_cargados:  # Verifica que haya datos cargados
            mostrar_alumnos_con_condicion(nombres, trim1, trim2, trim3, promedios, condiciones)
        else:
            print("Primero debe cargar los datos.")  # Indica que se debe cargar datos primero

    elif opcion == "3":  # Opción para mostrar mejor alumno
        if datos_cargados: # Verifica que haya datos cargados
            nombre_mejor, promedio_mejor = obtener_mejor_alumno(nombres, promedios)
            print("-------------------------------------------------------------------------------------")
            print("El mejor alumno es:", nombre_mejor, "con promedio de:", round(promedio_mejor, 2))
            print("-------------------------------------------------------------------------------------")
        else:
            print("Primero debe cargar los datos.")

    elif opcion == "4":  # Opción para mostrar listado ordenado por promedio descendente
        if datos_cargados: # Verifica que haya datos cargados
            ordenar_descendente(nombres, trim1, trim2, trim3, promedios)
        else:
            print("Primero debe cargar los datos.")

    elif opcion == "5":  # Opción para buscar alumno por nombre
        if datos_cargados: # Verifica que haya datos cargados
            nombre_buscado = input("Ingrese el nombre del alumno a buscar: ").strip()
            buscar_alumno(nombre_buscado, nombres, trim1, trim2, trim3, promedios, condiciones)
        else:
            print("Primero debe cargar los datos.")

    elif opcion == "6":  # Opción para modificar nota de un alumno
        if datos_cargados: # Verifica que haya datos cargados
            modificar_nota(nombres, trim1, trim2, trim3, promedios, condiciones)
        else:
            print("Primero debe cargar los datos.")

    elif opcion == "0":  # Opción para salir del programa
        print("Fin del programa. ¡Hasta luego!")

    else:  # Cualquier otra opción inválida
        print("Opción inválida. Intente nuevamente.")
