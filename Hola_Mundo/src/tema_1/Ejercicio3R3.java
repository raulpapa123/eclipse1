package tema_1;

import java.util.Scanner;

public class Ejercicio3R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		double numero1, numero2, numero3;
		double total;
		
		System.out.print("\nIngrese el presupuesto: ");
		total = consola.nextDouble(); 
		
		consola.close();
		
		numero1 = (total*0.40);
		numero2 = (total*0.30);
		numero3 = (total*0.30);
	
		System.out.println("el presupuesto pra ginecologia es de "+ numero1);
		System.out.println("el presupuesto para traumatología es de "+ numero2);
		System.out.println("el presupuesto para pediatría es de "+ numero3);

	}

}
