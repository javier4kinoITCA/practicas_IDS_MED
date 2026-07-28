/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arista;

/**
 *
 * @author josej
 */
import java.util.Scanner;
public class Arista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la arista de un cubo");
        double arista = sc.nextDouble();
        double volumen = Math.pow(arista, 3);
        System.out.printf("El volumen del cubo con arista %.2f es: %.2f%n", arista, volumen);

    }
    
}
