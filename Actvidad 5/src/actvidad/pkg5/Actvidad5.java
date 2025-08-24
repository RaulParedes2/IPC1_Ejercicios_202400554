/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actvidad.pkg5;

import java.util.Scanner;

/**
 *
 * @author Daniel Predes
 */
public class Actvidad5 {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int opcion;
       
       do{
           MostrarMenu();
           opcion=leerEntero(sc, "Elige Un Numero:");
   
           switch(opcion){
           
           case 1:
           OpcionTryCatch(sc);
           break;
           
           case 2: 
               OpcionSinTryCatch(sc);
               break;
               
           case 3:
               System.out.println("-----------------------------------------------------------");
               System.out.println("- SALIENDO...");
               System.out.println("-----------------------------------------------------------");
               break;
               
           default:
               System.out.println("-----------------------------------------------------------");
               System.out.println("Intentelo de nuevo (1 a 3)");
               System.out.println("-----------------------------------------------------------");
            }
        }
       while (opcion !=3);
       sc.close();
    }
    static void MostrarMenu(){
        System.out.println("-----------------------------------------------------------");
           System.out.println("==MENU==");
           System.out.println("1. Opcion '1' ");
           System.out.println("2. Opcion '2' ");
           System.out.println("3. SALIR");
           System.out.println("-----------------------------------------------------------");
        
    }
    static int leerEntero(Scanner sc, String mensaje){
        System.out.println(mensaje);
        while(!sc.hasNextInt()){
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("ERROR! Ingrese solo numeros");
                    System.out.println("-----------------------------------------------------------");
                    sc.next();
        }
        return sc.nextInt();
    }
    public static void  OpcionTryCatch(Scanner sc){
        try{
            System.out.println("Ingrese el valor #1 ");
            int Num1 = sc.nextInt();
            System.out.println("Ingrese el Valor #2 ");
            int Num2 = sc.nextInt();
            int resultado = Num1/Num2 ; //Error de la divicion, sigue funcionando 
            System.out.println("-----------------------------------------------------------");
            System.out.println("Resultado: " +resultado);
            System.out.println("-----------------------------------------------------------");
        }
        catch(Exception e){
        System.out.println("-----------------------------------------------------------");
        System.out.println("ERROR No es posible dividir dentro de cero");
        System.out.println("El Programa sigue Funcionando");
        System.out.println("-----------------------------------------------------------");
        }
    }
    public static void  OpcionSinTryCatch(Scanner sc){
            System.out.println("Ingrese el valor #1 ");
            int Num1 = sc.nextInt();
            System.out.println("Ingrese el Valor #2 ");
            int Num2 = sc.nextInt();
            int resultado = Num1/Num2 ; // Error de la divicion y Cierra el programa
            System.out.println("-----------------------------------------------------------");
            System.out.println("Resultado: " +resultado);
            System.out.println("-----------------------------------------------------------");
    }
}
