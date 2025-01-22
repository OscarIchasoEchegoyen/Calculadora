package org.ed.calculadora;
import java.util.Scanner;

//Clase principal que contiene la lógica de la calculadora
public class Calculadora {
 public static void main(String[] args) {
     // Crear un objeto Scanner para leer la entrada del usuario
     Scanner scanner = new Scanner(System.in);

     // Menú de opciones
     Menu();

     // Leer la opción seleccionada por el usuario
     System.out.print("Ingrese el número de la operación: ");
     int eleccion = scanner.nextInt();

     // Leer los dos números que el usuario desea operar
     System.out.print("Ingrese el primer número: ");
     double numero1 = scanner.nextDouble();
     System.out.print("Ingrese el segundo número: ");
     double numero2 = scanner.nextDouble();

     // Declaración de variables para el resultado y la validez de la operación
     double resultado = 0;
     boolean operacionValida = true;

     // Selección de la operación basada en la opción ingresada
     switch (eleccion) {
         case 1: // Suma
             resultado = numero1 + numero2;
             break;
         case 2: // Resta
             resultado = numero1 - numero2;
             break;
         case 3: // Multiplicación
             resultado = numero1 * numero2;
             break;
         case 4: // División
             if (numero2 != 0) {
                 resultado = numero1 / numero2;
             } else {
                 // Manejo del caso de división entre cero
                 System.out.println("Error: No se puede dividir entre cero.");
                 operacionValida = false;
             }
             break;
         default: // Caso de opción no válida
             System.out.println("Operación no válida.");
             operacionValida = false;
     }

     // Mostrar el resultado si la operación fue válida
     if (operacionValida) {
         System.out.println("El resultado es: " + resultado);
     }

     // Cerrar el objeto Scanner
     scanner.close();
 }

private static void Menu() {
	System.out.println("CALCULADORA");
     System.out.println("Seleccione una operación:");
     System.out.println("1. Sumar");
     System.out.println("2. Restar");
     System.out.println("3. Multiplicar");
     System.out.println("4. Dividir");
}
}