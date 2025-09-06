num=int(input("Ingrese un un número entero positivo de hasta tres cifras:"))
if num<10:
    print("Contiene 1 cifra")    
else:
    if num<100:
        print("Contiene 2 cifras")
    else:
        if num<1000:
            print("Contiene 3 cifras")
        else:
            print("Error! Se solicito un numero de hasta tres cifras!")
        

