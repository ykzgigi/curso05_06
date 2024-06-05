package curso05_06;

import java.util.Scanner;

public class Senhas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int senhaMestre, senhaTentativa;
		double num1, num2, soma;
		
		System.out.println("Cadastre uma senha (apenas números): ");
		senhaMestre = ler.nextInt();
		
		System.out.print("Digite um número: ");
		num1 = ler.nextDouble();
		System.out.print("Digite outro número: ");
		num2 = ler.nextDouble();
		soma = num1+num2;
		
		System.out.println("Digite a sua senha para desbloquear a soma: ");
		senhaTentativa = ler.nextInt();
		
		if (senhaTentativa == senhaMestre) {
			System.out.println("A soma é: " +soma);
		}
		if (senhaTentativa != senhaMestre) {
			System.out.println("Erro!!! Senha incorreta, tente novamente!");
			ler.close();
		}
	}

}
