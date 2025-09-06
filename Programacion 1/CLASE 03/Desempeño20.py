# En una empresa trabajan n empleados cuyos sueldos oscilan entre
# $100 y $500, realizar un programa que lea los sueldos que cobra cada
# empleado e informe cuántos empleados cobran entre $100 y $300
# y cuántos cobran más de $300.
# | Además el programa deberá informar el importe que gasta la empresa
# en sueldos al personal


cantAlt=int(input("Ingresar cantidad de empleados: "))
x=1
suma=0
cant1=0
cant2=0
while x<=cantAlt:
    print("Los sueldos oscilan entre $100 y $500")
    sueldo=float(input("Ingrese el sueldo: "))
    if sueldo<=300:
        cant1=cant1+1
    else:
        cant2=cant2+1
    suma=suma+sueldo
    x=x+1
promedio=suma/cantAlt
print("La cantidad de empleados que cobran hasta 300 es de:  ")
print(cant1)
print("La cantidad de empleados que cobran mas de 300 es de:  ")
print(cant2)
print("Importe que gasta la empresa en sueldos al personal: ")
print(suma)
