print("Datos del operario:")
sueldo=int(input("Ingrese el sueldo: "))
antiguedad=int(input("Ingrese los años de antigüedad: "))
print("Aumento a otorgar:")
if sueldo<500 and antiguedad>=10:
    print("Se otorgara un aumento del 20 %: Sueldo a cobrar: ")
    aumento=sueldo+((20*sueldo)/100)
    print(aumento)
else:
    if sueldo<500 or antiguedad<10:
        print("Se otorgara un aumento del 5 %: Sueldo a cobrar: ")
        aumento=sueldo+((5*sueldo)/100)
        print(aumento)
    else:
        print(sueldo)
    
    
