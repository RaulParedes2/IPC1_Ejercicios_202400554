/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg6;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
/**
 *
 * @author Daniel Predes
 */
public class Actividad6 {
    //valor de las variables
    
    static int ultimoN = -1;
    static int ultimoResultado = -1;
    
    //Suma con recursividad de n numero
    public static int SumaRecursiva(int n){
        if(n<=1){
            return n; 
        }
        else{
            return n + SumaRecursiva(n-1);
        }
    }
    
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do{
            MostrarMenu();
            opcion = leerEntero(sc, "Elige una opcion: ");
            switch (opcion){
                case 1:
                    Suman(sc);
                    break;
                    
                case 2: 
                    Archivo(sc);
                    break;
                    
                case 3:
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("SALIENDO....");
                    System.out.println("--------------------------------------------------------------------");
                    
                default:
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Intentelo de nuevo(1 al 3)");
                System.out.println("--------------------------------------------------------------------");
            }
            
        }
        while(opcion !=3);
        sc.close();
    }
    //Menu
    static void MostrarMenu(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("==Menu==");
        System.out.println("1. Calcular la suma usando la funcion recursiva.");
        System.out.println("2. Generar archivo .txt");
        System.out.println("3. SALIR");
        System.out.println("--------------------------------------------------------------------");
    }
    
    static int leerEntero(Scanner sc, String mensaje){
        System.out.print(mensaje);
        while (!sc.hasNextInt()){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ERROR 'Ingrese un numero'");
        System.out.println("--------------------------------------------------------------------");
        sc.next();
        }
        return sc.nextInt();
    }
    
    //Retorno del resultado de la suma recursiva
       static void Suman(Scanner sc) {
        int n = leerEntero(sc, "Ingrese un numero n: ");
        int resultado = SumaRecursiva(n);
        
        // Guardar el último cálculo
        ultimoN = n;
        ultimoResultado = resultado;
        
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("La suma de 1 hasta " + n + " es: " + resultado);
        System.out.println("--------------------------------------------------------------------");
    }
       static void Archivo(Scanner sc){
            sc.nextLine();
            
        if (ultimoN == -1) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ERROR: Primero debe calcular la suma (opción 1).");
            System.out.println("--------------------------------------------------------------------");
            return;
        }

        System.out.print("Ingrese el nombre del archivo (ejemplo: Carnet.txt): ");
        String nombreArchivo = sc.nextLine();

        String texto = "La suma de 1 hasta " + ultimoN + " es: " + ultimoResultado;
        File archivo = new File(nombreArchivo);

        // Escribir archivo
        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write(texto);
            System.out.println("Resultado guardado en: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("ERROR: No se pudo escribir en el archivo.");
        }

        // Leer archivo
        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("--------------------------------------------------------------------");
        } catch (IOException e) {
            System.out.println("ERROR: No se pudo leer el archivo.");
        }
       }
    }
    
