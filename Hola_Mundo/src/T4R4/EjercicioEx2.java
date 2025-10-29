package T4R4;

import java.util.Scanner;

public class EjercicioEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		int anchura;
		int altura;
		
		System.out.println("Introduzca la altura: (mínimo 3) ");
		altura = consola.nextInt();
		System.out.println("Introduzca la anchura: (mínimo 7) ");
		anchura = consola.nextInt();
		//fila 1
		for (int i=0; i<anchura+1; i++) {
			System.out.print("* ");
		}
		System.out.println("  ");

		//fila 2
		for (int i=0; i<altura-2; i++) {
		System.out.print("*");

		for (int o=0; o<(anchura/2); o++) {
			System.out.print("  ");
		}
		System.out.print("*");
		for (int o=0; o<(anchura/2); o++) {
			System.out.print("  ");
		}
		System.out.println("*");
	}
		//fila 3
		for (int i=0; i<anchura+1; i++) {
			System.out.print("* ");
		}
		consola.close();
}
}
