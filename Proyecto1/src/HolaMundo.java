/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reset
 */
//HOLA MUNDO
import java.util.Scanner;
public class HolaMundo {
    public static void main(String args[]) {
       
      
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
        
        
    }

}
