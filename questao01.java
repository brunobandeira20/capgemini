package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		int valor;

		List<String> degraus = new ArrayList<>();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor de 'n': ");

		valor = entrada.nextInt();

		for (int i = 0; i < valor; i++) {
			degraus.add("*".repeat(i + 1) + " ".repeat(valor - 1));

			for (String d : degraus) {
				System.out.println(d);
			}

		}

		entrada.close();

	}

}
