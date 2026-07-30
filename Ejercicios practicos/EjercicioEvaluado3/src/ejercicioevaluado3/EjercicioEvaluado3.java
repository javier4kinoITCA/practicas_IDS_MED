/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioevaluado3;

/**
 *
 * @author josej
 */
import java.util.Scanner;
public class EjercicioEvaluado3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota del parcial 1: ");
        double parcial1 = sc.nextDouble();
        
        System.out.println("Ingrese la nota del parcial 2: ");
        double parcial2 = sc.nextDouble();
        
        System.out.println("Ingrese la nota del parcial 3: ");
        double parcial3 = sc.nextDouble();
        
        double nota1 = (parcial1+parcial2+parcial3)/3;
        System.out.printf("La nota 1 es: %.2f%n", nota1);
        
        System.out.println("Ingrese la nota del examen final: ");
        double nota2 = sc.nextDouble();
        
        System.out.println("Ingrese la nota del trabajo: ");
        double nota3 = sc.nextDouble();
        
        double notaTotal = (nota1*0.55)+(nota2*0.30)+(nota3*0.15);
        
        System.out.printf("La nota final de Logica Computacional es: %.2f%n", notaTotal);
        
        

    }
    
}
