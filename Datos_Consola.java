
package com.mycompany.datos_consola;
import java.util.Scanner;
public class Datos_Consola {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        String edad = scanner.nextLine();

        System.out.print("Ingrese su dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("\nDatos Personales:");
        System.out.println("-----------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }
}