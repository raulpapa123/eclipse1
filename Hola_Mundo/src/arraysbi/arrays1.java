package arraysbi;

import java.util.Scanner;

public class arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		int[][] n = new int[4][5];

		for (int j = 0; j < n.length; j++) {

			for (int i = 0; i < n.length; i++) {
				System.out.println("intruduce la columna y la fila:");
				n[i][j] = consola.nextInt();
			}
		}
		for (int j = 0; j < n.length; j++) {
			System.out.println(" ");
			for (int i = 0; i < n.length; i++) {
				System.out.print(n[i][j]);
				if (i != 2) {
					System.out.print("---");
			consola.close();
		}
	}
		}}}
