package Programacion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		
		int n1;
		int supenso = 0;
		int suf = 0;
		int bien = 0;
		int not = 0;
		int sobre = 0;
		
		for (int contador=0;contador<=10;contador++) {
			if (contador==10) {
				System.out.println("El número de suspensos es de: "+ supenso);
				System.out.println("El número de sufientes es de: "+ suf);
				System.out.println("El número de notas con un bien es de: "+ bien);
				System.out.println("El número de notables es de: "+ not);
				System.out.println("El número de sobresalientes es de: "+ sobre);
			}
			
				else {
			System.out.println("Ingresa un número: ");
			n1 = consola.nextInt();
			while (n1>=0&&n1<=10) {	
			switch (n1) {
				case 0: System.out.println("Insuficiente");
				break;
				case 1: System.out.println("Insuficiente");
				break;
				case 2: System.out.println("Insuficiente");
				break;
				case 3: System.out.println("Insuficiente");
				break;
				case 4: System.out.println("Insuficiente");
				break;
				case 5: System.out.println("Suficiente");
				break;
				case 6: System.out.println("Bien");
				break;
				case 7: System.out.println("Notable");
				break;
				case 8: System.out.println("Notable");
				break;
				case 9: System.out.println("Sobresaliente");
				break;
				case 10: System.out.println("Sobresaliente");
				break;
				default: System.out.println("Esta nota no es válida: "+n1);
				break;
			}
				break;
			}
			
			if (n1>=0&&n1<=4) {
				supenso++;
			}
			else if (n1==5) {
				suf++;
			}
			else if (n1==6) {
				bien++;
			}
			else if (n1>=6&&n1<=8) {
				not++;
			}
			else if (n1>=9&&n1<=10) {
				sobre++;	
			}
			}
			}
		
		consola.close();

		
	}
	}
	






