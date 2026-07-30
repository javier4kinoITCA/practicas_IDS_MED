/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioevaluado4;

/**
 *
 * @author josej
 */
import java.util.Scanner;
public class EjercicioEvaluado4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String nombrep = sc.nextLine();
        
        System.out.println("Ingrese el precio del producto: ");
        double preciop = sc.nextDouble();
        
        double IVA =(preciop*0.13);
        double total =(preciop+IVA);
        
        System.out.printf("Nombre del producto: %s%nPrecio del producto: %.2f%nIVA del producto: %.2f%nTotal: %.2f%n",nombrep,preciop,IVA,total);
    }
    
}
