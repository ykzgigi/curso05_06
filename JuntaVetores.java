package curso05_06;

import java.util.Scanner;

public class JuntaVetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];
		
		for(int i=0; i<2; i++) {
			System.out.print("Informe o primeiro valor: ");
			 a[i] = ler.nextInt();
			 System.out.print("Informe o segundo valor: ");
			 b[i] = ler.nextInt();
		
		}
		for(int i=0; i<2; i++) {
			 c[i] = a[i];
			 c[i+2] = b[i];
		}
		for(int i=0; i<4; i++) {
			System.out.println( c[i]);
		}
		
		ler.close(); 

	}

}
