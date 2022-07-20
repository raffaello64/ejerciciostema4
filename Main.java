package Positivo_negativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
        
        int numero = sc.nextInt();
        
		if (numero == 0) {
        	System.out.println("El numero es 0");
        } else if (numero < 0) {
        	System.out.println("El numero es negativo");
        } else {
        	System.out.println("El numero es positivo");
        }
        
      
	}

}
