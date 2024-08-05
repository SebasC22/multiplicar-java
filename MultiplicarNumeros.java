
package com.mycompany.multiplicarnumeros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MultiplicarNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar el primer numero");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        System.out.println ("El resultado es: " + (num1 * num2));


}
    
}
