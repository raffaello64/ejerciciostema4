package Switch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una estacion: ");
        String estacion = sc.nextLine();
        switch (estacion) {
        
        case "primavera":
        	System.out.println("Es primavera, cuidate del polen");
        	break;
        case "verano":
        	System.out.println("Es verano, hay que ir a la playa");
        	break;
        case "otono":
        	System.out.println("Es otono, puedes ir a buscar setas");
        	break;
        case "invierno":
        	System.out.println("Es invierno, hay que abrigarse");
        	break;
        default:
        	System.out.println("No ha ingresado una estacion, por favor, ingrese primavera, verano, otono o invierno");
        	break;
        
        
        }
	}

}
