package tema_1;

import java.util.Scanner;

public class Ejercicio1R4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		
		System.out.print("\nIntroduzca su nombre: ");
		double total = consola.nextDouble(); 
		
		consola.close();
		
		double numero1 = (total*0.40);
		double numero2 = (total*0.30);
		double numero3 = (total*0.30);
	
		System.out.println("el presupuesto pra ginecologia es de "+ numero1);
		System.out.println("el presupuesto para traumatología es de "+ numero2);
		System.out.println("el presupuesto para pediatría es de "+ numero3);
	}

}
