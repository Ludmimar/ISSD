num1=int(input("Ingrese primer valor:"))
num2=int(input("ingrese segundo valor:"))
suma = num1+num2
diferencia=num1-num2
producto=num1*num2
division=num1/num2

if num1>num2:
    print("El numero 1 es mayor")
    print("La suma de los numeros ingresados es: ")
    print(suma)
    print("La diferencia del los numeros ingresados es: ")
    print(diferencia)
else:
    print("El numero 2 es mayor")
    print("El producto de los numeros ingresados es: ")
    print(producto)
    print("La division de los numeros ingresados es: ")
    print(division)
