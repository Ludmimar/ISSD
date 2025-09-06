canTotal=int(input("Ingrese cantidad total de preguntas que se le realizaron:"))
cantAcerto=int(input("Ingrese la cantidad de preguntas que contestó correctamente:"))
porcentaje=(cantAcerto*100)/canTotal

if porcentaje>=90:
    print("Nivel máximo")    
else:
    if porcentaje>=75:
        print("Nivel medio")
    else:
        if porcentaje>=50:
            print("Nivel regular")
        else:
            print("Fuera de nivel")
