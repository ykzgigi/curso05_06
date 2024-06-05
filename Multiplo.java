package curso05_06;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {

		double num;
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		num = ler.nextDouble();

		if (num % 5 == 0) {
			System.out.println("O número " + num + " é múltiplo de 5");
		}
		if (num % 5 != 0) {
			System.out.println("O número " + num + " não é múltiplo de 5");
		ler.close();

	}
	}
}
