package tema_1;

import java.util.Scanner;

public class Ejercicio5T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double notam;

		System.out.println("Escribe la nota 1: ");
		nota1 = consola.nextDouble();
		System.out.println("Escribe la nota 2: ");
		nota2 = consola.nextDouble();
		System.out.println("Escribe la nota 3: ");
		nota3 = consola.nextDouble();

		consola.close();
		
		notam = (nota1 + nota2 + nota3)/3;
		
		if (notam>=0 && notam<5){System.out.println("insuficiente");
		}else if (notam>=5 && notam<6){System.out.println("suficiente"); 
		}else if (notam>=6 && notam<7){System.out.println("bien"); 
		}else if (notam>=7 && notam<9){System.out.println("notable"); 
		}else if (notam>=9 && notam<=10){System.out.println("sobresaliente"); 
		}else {System.out.println("Error");
	}
	}
}
