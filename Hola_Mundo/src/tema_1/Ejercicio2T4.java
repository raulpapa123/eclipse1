package tema_1;

import java.util.Scanner;

public class Ejercicio2T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);

		double hora;
		System.out.print("Indica tu hora: ");
		hora = consola.nextDouble();
		
		consola.close();
		
		if (hora<0 || hora>=24){
			System.out.println("Error");
		}else if (hora>=21 || hora<=5) {
			System.out.println("Buenas noches"); 
		}else if (hora>=6 && hora<=12) {
			System.out.println("Buenos dias");
		}else if (hora>=13 && hora<=20) {
			System.out.println("Buenas tardes");
		}else {
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		consola.close();
	}

}
