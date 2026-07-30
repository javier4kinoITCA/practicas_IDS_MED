/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioevaluado2;

/**
 *
 * @author josej
 */
import java.util.Scanner;
public class EjercicioEvaluado2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota del parcial 1:");
        double parcial1 = sc.nextDouble();
        
        System.out.println("Ingrese la nota del parcial 2:");
        double parcial2 = sc.nextDouble();
        
        System.out.println("Ingrese la nota del parcial 3:");
        double parcial3 = sc.nextDouble();
        
        System.out.println("Ingrese la nota de la tarea:");
        double tarea = sc.nextDouble();
        
        double notaTotal = (parcial1*0.20)+(parcial2*0.25)+(parcial3*0.40)+(tarea*0.15);
        
        System.out.printf("Nota final: %.2f%n", notaTotal);
    }
    
}
