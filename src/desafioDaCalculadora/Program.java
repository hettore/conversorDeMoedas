package desafioDaCalculadora;

import java.util.Locale;
import java.util.Scanner;

import dolar.DolarPrice;

public class Program {

	public static void main(String[] args) throws Exception {

		String dolar = DolarPrice.dolarprice();
		double dolarp = Double.parseDouble(dolar);

		Locale.setDefault(Locale.US);
		double quantidade;

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("               Bem vindo ao seu conversor de moedas!");
		System.out.println("------------------------------------------------------------------");
		System.out.println("         ATENÇÃO: Hoje só estamos trabalhando com o Dólar!");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("      O preco atual em Reais de um Dólar Americano é: R$ %.2f%n ", dolarp);
		System.out.println("Por falor insira a quantidade de Dólares que você quer comprar: ");
		quantidade = sc.nextDouble();

		System.out.printf("Você vai precisar de R$%.2f%n", (dolarp * quantidade));
		System.out.printf("Para comprar $%.2f%n", quantidade);

		sc.close();

	}

}
