package arraysbi;

import java.util.Scanner;

public class arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner consola = new Scanner(System.in);
		int x = 0;
		int l = 0;
		int sumatotal = 0;
		int[][] n = new int[5][4];
		int[] sumafila = new int[5];
		for (int j = 0; j < n[x].length; j++) {
			sumatotal += sumafila[];
			sumatotal = 0;
			for (int i = 0; i < n.length; i++) {
				System.out.println("intruduce la columna y la fila:");
				n[i][j] = consola.nextInt();
				sumatotal += n[i][j];
			}
		}
		for (int j = 0; j < n[x].length; j++) {
			System.out.println(" ");
			for (int i = 0; i < n.length; i++) {
				System.out.print(n[i][j]);
				if (i != 4) {
					System.out.print("---");

				}
			}
		}
		System.out.println(" ");
		consola.nextLine();
		System.out.println(sumafila[0]);
		System.out.println(sumafila[1]);
		System.out.println(sumafila[2]);
		System.out.println(sumafila[3]);
		System.out.println(sumafila[4]);
System.out.println(sumatotal);
		consola.close();
	}
}
