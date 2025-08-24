/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author Daniel Predes
 */
public class Calculadora {
    static int a=0;
    static int b=0;
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int opcion;
        do{
            MostrarMenu();
            opcion= leerEntero(sc, "Elige un numero: ");
            
            switch(opcion){
                
                case 1: Suma(sc);
                break;
                
                case 2: Resta(sc);
                break;
                
                case 3: Multiplicacion(sc);
                break;
                
                case 4: Division(sc);
                break;
                
                case 5: Potencia(sc);
                break;
                
                case 6: Raiz(sc);
                break;
                
                case 7:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Saliendo...");
                    System.out.println("-----------------------------------------------------------");
                    break;
                default:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Intentelo de nuevo(1 a 7)");
                    System.out.println("-----------------------------------------------------------");
            }
            System.out.println();
        }
        while(opcion !=7);  
        sc.close();
    }
    static void MostrarMenu (){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Menu de operaciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Divicion");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz");
        System.out.println("7. Salir");
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
    static void pedirNumero (Scanner sc){
        a = leerEntero(sc, "Ingrese el valor de 'a': ");
        b= leerEntero(sc, "Ingrese el valor de 'b': ");
    }
    
    static void Suma(Scanner sc){
        pedirNumero(sc);
        System.out.println("Resultado de" + a +"+"+b+"="+(a+b));
    }
     static void Resta(Scanner sc){
        pedirNumero(sc);
        System.out.println("Resultado de" + a +"-"+b+"="+(a-b));
     }
     static void Multiplicacion(Scanner sc){
        pedirNumero(sc);
        System.out.println("Resultado de" + a +"*"+b+"="+(a*b));
     }
     static void Division(Scanner sc){
        pedirNumero(sc);
        if(b==0){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("ERROR: No se puede dividir entre 0");
            System.out.println("-------------------------------------------------------------------");
        }
        else{
        System.out.println("Resultado de" + a +"/"+b+"="+((double)a/b));
        }
     }
     static void Potencia(Scanner sc){
        pedirNumero(sc);
        System.out.println("Resultado de" + a +"^"+b+"="+Math.pow(a, b));
     }
     static void Raiz(Scanner sc){
        pedirNumero(sc);
        if (a < 0 || b < 0){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("ERROR: No se admiten numeros Negativos");
            System.out.println("-------------------------------------------------------------------");
        }
        else{
        System.out.println("Raiz cuadrada de" + a +"="+ Math.sqrt(a));
        System.out.println("Raiz cuadrada de" + b +"="+ Math.sqrt(b));
        }
     }
}
