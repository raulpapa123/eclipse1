package T4R4;

import java.util.Scanner;

public class Ejercicio2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		int zona = 0;
		int preciop;
		int peso = 0;
		
		System.out.println("-------- ZONAS --------");
		System.out.println("1. América del norte");
		System.out.println("2. América central");
		System.out.println("3. América del sur");
		System.out.println("4. Europa");
		System.out.println("5. Asia");
		System.out.println("-----------------------");
		System.out.println("A que zona va dirigida el paquete?: ");
		zona = consola.nextInt();
		switch (zona) {
		case 1: preciop=24;
		System.out.println("Cuantos kilos pesa el paquete: ");
		peso = consola.nextInt();
		if (peso>1 | peso<5) {
		System.out.println("El coste del envío sería de: "+peso*preciop);	
		}
		else {
			System.out.println("El peso indicado no es valido");
		}
		break;
		case 2: preciop=20;
		System.out.println("Cuantos kilos pesa el paquete: ");
		peso = consola.nextInt();
		if (peso>1 | peso<5) {
		System.out.println("El coste del envío sería de: "+peso*preciop+" euros");	
		}
		else {
			System.out.println("El peso indicado no es valido");
		}
		break;
		case 3: preciop=21;
		System.out.println("Cuantos kilos pesa el paquete: ");
		peso = consola.nextInt();
		if (peso>1 | peso<5) {
		System.out.println("El coste del envío sería de: "+peso*preciop+" euros");	
		}
		else {
			System.out.println("El peso indicado no es valido");
		}
		break;
		case 4: preciop=10;
		System.out.println("Cuantos kilos pesa el paquete: ");
		peso = consola.nextInt();
		if (peso>1 | peso<5) {
		System.out.println("El coste del envío sería de: "+peso*preciop+" euros");	
		}
		else {
			System.out.println("El peso indicado no es valido");
		}
		break;
		case 5: preciop=18;
		System.out.println("Cuantos kilos pesa el paquete: ");
		peso = consola.nextInt();
		if (peso>1 | peso<5) {
		System.out.println("El coste del envío sería de: "+peso*preciop+" euros");	
		}
		else {
			System.out.println("El peso indicado no es valido");
		}
		break;
		default: System.out.println("Zona no válida");
		}
		consola.close();
	}

}
