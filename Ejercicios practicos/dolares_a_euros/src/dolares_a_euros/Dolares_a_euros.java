/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dolares_a_euros;

/**
 *
 * @author josej
 */
import java.util.Scanner;
public class Dolares_a_euros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en dolares(debe de ser un numero entero.");
        int d = sc.nextInt();
        double conversion = d *1.14;
        System.out.printf("La conversion de $%d es igual a: %.2f euros.%n", d, conversion);
    }
    
}
