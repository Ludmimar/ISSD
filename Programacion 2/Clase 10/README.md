# Clase 10 - Archivos de Texto

Esta clase introduce el manejo de **Archivos de Texto** en Java, cubriendo lectura y escritura de archivos mediante flujos de bytes y caracteres.

## 📚 Conceptos Clave

### 🔤 Flujos de Bytes
- **FileInputStream**: Para leer archivos en bytes
- **FileOutputStream**: Para escribir archivos en bytes
- **read()**: Lee un byte del archivo (-1 si es fin de archivo)
- **write()**: Escribe un byte en el archivo
- **close()**: Cierra el archivo y libera recursos

### 📝 Flujos de Caracteres
- **FileReader**: Para leer archivos de caracteres
- **FileWriter**: Para escribir archivos de caracteres
- **BufferedReader**: Para leer líneas completas (readLine())
- **InputStreamReader**: Convierte bytes en caracteres

### 📊 Archivos CSV
- **CSVReader**: Para leer archivos CSV
- **CSVWriter**: Para escribir archivos CSV
- **OpenCSV**: Librería externa para manejar CSV
- **Separadores**: Comas, punto y coma, tabuladores

## 📁 Estructura de Ejercicios

### Ejercicios de Flujos de Bytes (01-02)
- **Ejercicio 01**: MostrarArchivo - Leer y mostrar archivo con FileInputStream
- **Ejercicio 02**: CopiarArchivo - Copiar archivo con FileInputStream/FileOutputStream

### Ejercicios de Flujos de Caracteres (03-06)
- **Ejercicio 03**: LeerCars - Leer caracteres del teclado con BufferedReader
- **Ejercicio 04**: LeeLíneas - Leer líneas del teclado con BufferedReader
- **Ejercicio 05**: TecladoADisco - Escribir desde teclado a archivo con FileWriter
- **Ejercicio 06**: DiscoAPantalla - Leer archivo y mostrar en pantalla con FileReader

## 📁 Problemas Propuestos

- **Problema 01**: CompararArchivos - Comparar contenido de dos archivos
- **Problema 02**: MostrarArchivoPersonalizado - Mostrar cualquier archivo ingresado por teclado
- **Problema 03**: FibonacciArchivo - Generar primeros 10 términos de Fibonacci y guardarlos
- **Problema 04**: ListaArticulos - Ingresar artículos hasta "FIN" y guardarlos en archivo
- **Problema 05**: CopiarArchivoConRuta - Copiar archivo y agregar ruta origen en destino

## 🎯 Objetivos de Aprendizaje

1. **Flujos de Bytes**:
   - FileInputStream para leer archivos
   - FileOutputStream para escribir archivos
   - Manejo de excepciones FileNotFoundException e IOException
   - Cerrar archivos correctamente

2. **Flujos de Caracteres**:
   - FileReader para leer archivos de texto
   - FileWriter para escribir archivos de texto
   - BufferedReader con InputStreamReader para entrada de consola
   - readLine() para leer líneas completas

3. **Operaciones Comunes**:
   - Leer archivo completo byte por byte o línea por línea
   - Escribir datos en archivo
   - Copiar archivos
   - Comparar contenido de archivos

4. **Archivos CSV**:
   - Lectura de archivos CSV con OpenCSV
   - Escritura de archivos CSV
   - Separadores personalizados
   - Manejo de filas y columnas

## 🔧 Herramientas y Sintaxis

### FileInputStream
```java
FileInputStream fis = new FileInputStream("archivo.txt");
int byte = fis.read(); // Lee un byte, -1 si es fin
fis.close(); // Cerrar siempre
```

### FileOutputStream
```java
FileOutputStream fos = new FileOutputStream("archivo.txt");
fos.write(byte); // Escribe un byte
fos.close();
```

### FileReader y BufferedReader
```java
FileReader fr = new FileReader("archivo.txt");
BufferedReader br = new BufferedReader(fr);
String linea = br.readLine(); // null si es fin
br.close();
```

### FileWriter
```java
FileWriter fw = new FileWriter("archivo.txt");
fw.write("texto");
fw.close();
```

### BufferedReader desde Consola
```java
BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
);
String entrada = br.readLine();
```

## 📝 Notas Importantes

- **Siempre cerrar archivos**: Usar close() para liberar recursos
- **Manejo de excepciones**: FileNotFoundException e IOException son comunes
- **Rutas de archivos**: Usar rutas absolutas o relativas al proyecto
- **Try-with-resources**: Java 7+ cierra automáticamente recursos
- **Buffering**: BufferedReader/Writer mejoran rendimiento con archivos grandes

## 🚀 Ejecución

Cada ejercicio puede ejecutarse independientemente:

```bash
javac src/*.java
java -cp src NombreClasePrincipal
```

**Nota sobre CSV**: Los ejercicios de CSV requieren la librería OpenCSV y un proyecto Maven configurado. Los conceptos se mencionan en el documento pero no se implementan ejercicios específicos ya que requieren configuración externa del entorno Maven. Se recomienda revisar el documento proporcionado para detalles sobre CSV con OpenCSV.

## 📖 Recursos Adicionales

- Documentación oficial de Java sobre [I/O Streams](https://docs.oracle.com/javase/tutorial/essential/io/)
- [OpenCSV Documentation](https://opencsv.sourceforge.net/)
- [Apache Maven](https://maven.apache.org/)

