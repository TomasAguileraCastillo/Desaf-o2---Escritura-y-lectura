

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    //Creacion de Arraylist para ser usuado desde metodo y guardar el listado contenido del archivo
    public static ArrayList<String> lista = new ArrayList<String>();
    //creacion de variable para guardar la ruta
    public static String ruta;
    //public static String[] ruta = new String[1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
        System.out.println("opciones");
        System.out.println("1) Crear Directorio y Archivo");
        System.out.println("2) Buscar Archivo y Palabra");
        System.out.println("3) Terminar");

        System.out.print("selecciones opcion : ");
        op = Integer.parseInt(sc.next());
            if (op == 1) {
                System.out.println("\n");
                System.out.print("Ingrese un directorio a crear : ");
                String directorio = sc.next();
                System.out.print("Ingrese un archivo a crear : ");
                String archivo = sc.next();
                crearArchivo(directorio, archivo);
            }else if (op == 2) {
                System.out.println("\n");
                System.out.println("ingrese nombre del archivo");
                String archivoabuscar = sc.next();
                System.out.println("ingrese palabra para buscar : ");
                String texto = sc.next();
                buscarTexto(archivoabuscar, texto);
            }
        } while (op < 3 && op >0);
    }
    public static void buscarTexto(String nombreArchivoBuscar, String texto ){
        String ruta1 = ruta;
        File archivo = new File(ruta1+"/"+nombreArchivoBuscar+".txt");
        try {
            if (!archivo.exists()) {
                System.out.println("El Archivo ingresado No Existe");
                System.out.println("\n");
            }else  {
                //System.out.println("Archivo si existe");

                //Lectura del archivo y conteo de palabra existente
                String nombreArchivo = String.valueOf(archivo);
                FileReader fr = null;
                BufferedReader br = null;
                String data = "";
                ArrayList<String> contenidoarchivo = new ArrayList<String>();
                try {
                    fr = new FileReader(nombreArchivo);
                    br=new BufferedReader(fr);
                    data = br.readLine();
                    while (data != null) {
                        contenidoarchivo.add(data);
                        data = br.readLine();
                    }
                    br.close();
                    fr.close();
                }
                catch (Exception e){
                    System.out.println("Excepcion leyendo fichero "+ nombreArchivo + ": " + e);
                }
                int contador = 0;
                for (int i = 0; i < contenidoarchivo.size(); i++) {
                    if (contenidoarchivo.get(i).equals(texto)) {
                        contador++;
                    }
                }

                System.out.println("cantidad de repeticiones del texto -> " + contador);
                System.out.println("\n");
            }
        }catch (Exception e) {
            System.out.println("Error al Crear el archivo");
            e.printStackTrace();
        }
    }
    //Metodo para Creacion de Archivo validacion de Directorio
    public static void crearArchivo(String nombreDirectorio, String nombreArchivo) {
        try {
            File directorio = new File("src/" + nombreDirectorio);
            String ruta1 = String.valueOf(directorio);
            ruta=ruta1;
            if (!directorio.exists()) {
                directorio.mkdir();
                File archivos = new File(directorio.getAbsoluteFile() + "/" + nombreArchivo+".txt");
                try {
                    if (archivos.createNewFile()) {
                        System.out.println("Se a Creado el Archivo");
                        cargarArreglo();
                        escribirArreglo(archivos);
                    }
                }catch (IOException e) {
                System.out.println("Error al Crear el archivo");
                e.printStackTrace();
                }
            } else {// si existe
                System.out.println("El Directorio ya existe");
            }
        }catch (Exception e){
            System.out.println("Error al crear directorio");
            e.printStackTrace();
        }
        System.out.println("\n");
    }
    //Metodo para escribir en el array y el archivo
    public static void escribirArreglo(File ruta) {
        File ruta1 = ruta;
        FileWriter fileW = null;
        try {
            fileW = new FileWriter(ruta1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileW);
            for (Iterator<String> iterador = lista.iterator(); iterador.hasNext();) {
                String element = iterador.next();
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Carga de Array
    public static void cargarArreglo(){
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
    }








}