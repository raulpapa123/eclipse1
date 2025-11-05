package arraysbi;

import java.util.Scanner;

public class arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);

		int[][] n = new int[4][4];

		for (int j = 0; j < n.length; j++) {

			for (int i = 0; i < n.length; i++) {
				int numeroAleatorioEntero = (int) (Math.random() * 100);
				n[i][j] = numeroAleatorioEntero;
				if (i == j) {
					n[i][j] = 0;
				}
			}
		}
		for (int j = 0; j < n.length; j++) {
			System.out.println(" ");
			for (int i = 0; i < n.length; i++) {
				System.out.print(n[i][j]);
				if (i != 3) {
					System.out.print("---");
				}
			}
		}
		consola.close();
	}
}
