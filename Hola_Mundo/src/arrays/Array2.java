package arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'X';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        System.out.println("Contenido del array simbolo:");
        for (int i = 0; i < simbolo.length; i++) {
            System.out.println("simbolo[" + i + "] = '" + simbolo[i] + "'");
	}}}


