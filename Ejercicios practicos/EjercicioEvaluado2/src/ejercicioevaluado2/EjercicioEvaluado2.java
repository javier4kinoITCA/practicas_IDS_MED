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
        double parcial1_porcentaje = 0.20;
        
        System.out.println("Ingrese la nota del parcial 2:");
        double parcial2 = sc.nextDouble();
        double parcial2_porcentaje = 0.25;
        
        System.out.println("Ingrese la nota del parcial 3:");
        double parcial3 = sc.nextDouble();
        double parcial3_porcentaje = 0.40;
        
        System.out.println("Ingrese la nota de la tarea:");
        double tarea = sc.nextDouble();
        double tarea_porcentaje = 0.20;
        
        double notaTotal = (parcial1*parcial1_porcentaje)+(parcial2*parcial2_porcentaje)+(parcial3*parcial3_porcentaje)+(tarea*tarea_porcentaje);
        
        System.out.printf("Nota final: %.2f%n", notaTotal);
    }
    
}
