package tema_1;

import java.util.Scanner;

public class Ejercicio4T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		double horaf;
		double hora;
		System.out.print("Indica las horas que has trabajado: ");
		hora = consola.nextDouble();
		
		consola.close();
		
		if (hora>0 && hora<=40){
			System.out.println(12*hora);
		}else if (hora>40) {horaf = 480+(hora-40)*16;
			System.out.println(horaf); 
		}else {System.out.println("Error");
		}
	}
}
