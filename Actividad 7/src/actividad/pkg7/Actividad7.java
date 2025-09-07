/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg7;

/**
 *
 * @author Daniel Predes
 */
  // Clase base
abstract class Figura {
    // Método que será sobrescrito
    public abstract double calcularArea();
}

// Clase derivada: Círculo
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase derivada: Rectángulo
class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
public class Actividad7 {

  
// polimorfismo
    public static void main(String[] args) {
       //  usamos la referencia de la clase base
       
        Figura figura1 = new Circulo(5);   // radio = 5
        Figura figura2 = new Rectangulo(4, 6); // base = 4, altura = 6

        // mismo método pero con diferentes funciones
        System.out.println("Area del circulo: " + figura1.calcularArea());
        System.out.println("Area del rectangulo: " + figura2.calcularArea());
    }
    
}
