/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculonotas;

/**
 *
 * @author josej
 */
import java.util.Scanner;
public class CalculoNotas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota del primer examen: ");
        double nota1 = sc.nextDouble();
        System.out.println("Ingrese la nota del segundo examen: ");
        double nota2 = sc.nextDouble();
        System.out.println("Ingrese la nota del tercer examen: ");
        double nota3 = sc.nextDouble();
        double promedio = (nota1+nota2+nota3)/3;
        System.out.println("El promedio final de los tres examenes es: " + promedio);

    }
    
}
