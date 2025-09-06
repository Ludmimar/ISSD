nro1=int(input("Ingrese primer valor:"))
nro2=int(input("Ingrese segundo valor:"))
nro3=int(input("Ingrese tercer valor:"))

print("El menor numero ingresado es: ")
if nro1<nro2 and nro1<nro3:    
    print(nro1)
else:
    if nro2<nro3:
        print(nro2)
    else:
        print(nro3)        
       
print("El mayor numero ingresado es: ")
if nro1>nro2 and nro1>nro3:
        print(nro1)
else:
    if nro2>nro3:
        print(nro2)
    else:
        print(nro3)
    

