Desafío - Escritura y lectura
-

-  Descripción

En el siguiente desafío debes crear un archivo y un fichero. Se necesita escribir y leer desde
el archivo creado por el usuario. Para ello, se deberá validar la información de entrada. 

- Formato del archivo 

El archivo tendrá múltiples líneas y en cada línea un texto aleatorio.
Cada elemento debe corresponder a un texto precargado dentro de ArrayList que se entregará
en el requerimiento, esto debe implementarse para llenar el archivo.

      Perro
      Gato
      Juan
      Daniel
      Juan
      Gato
      Perro
      Camila
      Daniel
      Camila

En el ejemplo anterior, el fichero está llenado con información extraída desde un ArrayList.


Requerimientos
--

1. Crear un método llamado crearArchivo(directorio,fichero), este método recibe
   el nombre del directorio y el fichero como parámetros de entrada.
   (0,5 Puntos)
2. El nombre del fichero debe terminar con “.txt”, para indicar que es un archivo de texto.
   (0,25 Puntos)
3. Validar que el nombre del directorio no exista dentro del programa.
   (1,5 Puntos)
      -Si el directorio no existe, se debe crear.
      -Si existe se mostrará el siguiente mensaje por consola
      -Si existe algún otro problema al crear el directorio, se mostrará el siguiente
      mensaje por consola:

       Error al crear directorio

4. Escribir en el archivo con un salto de línea lo que se encuentra en el siguiente ArrayList.
   (1,5 Puntos)

Considerar utilizar Iterator para recorrer la lista.

     ArrayList<String> lista = new ArrayList<String>();
         lista.add("Perro");
         lista.add("Gato");
         lista.add("Juan");
         lista.add("Daniel");
         lista.add("Juan");
         lista.add("Gato");
         lista.add("Perro");
         lista.add("Camila");
         lista.add("Daniel");
         lista.add("Camila");


5. Crear un método llamado 

         buscarTexto(nombreFichero,texto),
   este método recibe el nombre del fichero y el texto a buscar como parámetros de entrada.
   (1,75 Puntos)

6. Validar que el fichero exista.
   (1,5 Puntos)
   -Si el fichero no existe, se mostrará el siguiente mensaje por consola.

       El fichero ingresado no existe

7. Si el fichero existe, buscar el texto ingresado dentro del archivo.
   (1,5 Puntos)

8. Mostrar por consola la cantidad de veces que la palabra ingresada se encuentra en el
   texto.
   (1,5 Puntos)
          
       cantidad de repeticiones del texto -> 2



Algunas imagenes del proyecto


Imagen 1

![img.png](imagenes%20del%20proyecto%2Fimg.png)

Imagen 2

![img_1.png](imagenes%20del%20proyecto%2Fimg_1.png)
