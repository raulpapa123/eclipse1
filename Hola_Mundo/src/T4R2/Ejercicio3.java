package T4R2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		int i;
		int i1 = 0;
		
        for (i = 0; i <=10 ; i++) {
                System.out.print("escribe un número: ");
                i1 = consola.nextInt();
        if (i1>0){
			System.out.println(i1+" es positivo");
		}else if (i1<0) {
			System.out.println(i1+" es negativo"); 
		}else {
			System.out.println("Error");
		consola.close();
		}
	}
}
}