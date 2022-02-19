package desafio;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-=-=-= Verificar Senha =-=-=-");
		System.out.println(" ");
		
		
		int opcao;
		do {
			System.out.println("-=-=--=-=-=-= Verificar Senha =-=-=-=-=-=-=-=-");
			System.out.println("-=-=-= Digite (1) para Verificar a Senha =-=-=-");
			System.out.println("-=-=-=-=-=-= Digite (2) para Sair -=-=-=-=-=-=-");
			
			System.out.println(" ");
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				System.out.println(" ");
				System.out.println("Digite a senha a ser verificada: ");
				String senha = entrada.next();

				if (senha.length() > 3) {

					boolean achouNumero = false;
					boolean achouMaiuscula = false;
					boolean achouMinuscula = false;
					boolean achouSimbolo = false;

					for (char c : senha.toCharArray()) {
						if (c >= '0' && c <= '9') {
							achouNumero = true;
						} else if (c >= 'A' && c <= 'Z') {
							achouMaiuscula = true;
						} else if (c >= 'a' && c <= 'z') {
							achouMinuscula = true;
						} else {
							achouSimbolo = true;
						}
					}
					if (achouNumero == true && achouMaiuscula == true && achouMinuscula == true && achouSimbolo == true) {
						System.out.println("Sua senha é considerada forte!");
						System.out.println("Sua senha tem " + senha.length() + " caracteres.");
						System.out.println("A senha escolhida foi: " + senha + " \n");

					} else {
						System.out.println("Sua senha é fraca! \n");
						System.out.println("Dica para construção de senha: \n" + "\nNo minimo: \n" + " 6 caracteres \n"
								+ " 1 digito numérico \n" + " 1 letra minúscula \n" + " 1 letra maiuscúla \n"
								+ " 1 caracter especial ex: [ !@#$%^&*()-+ ]\n");

						System.out.println("Sua senha tem " + senha.length() + " caracteres.");
						System.out.println("");
						System.out.println("A senha escolhida foi: " + senha + " \n");

					}

				} else {
					System.out.println("Senha inválida, sua senha possui 03 ou menos caracteres! ");
					System.out.println("Sua senha é fraca! ");
					System.out.println("Dica para construção de senha: \n" + "\nNo minimo: \n" + " 6 caracteres \n"
							+ " 1 digito numérico \n" + " 1 letra minúscula \n" + " 1 letra maiuscúla \n"
							+ " 1 caracter especial ex: [ !@#$%^&*()-+ ]\n");

					System.out.println("Sua senha tem " + senha.length() + " caracteres.");
					System.out.println(" ");
					System.out.println("A senha escolhida foi: " + senha + " \n");

				}
				
				
			} if(opcao == 2) {
				System.out.println("Sessão encerrada!");
			}
			
		} while (opcao == 1 );
		System.out.println(" ");


		entrada.close();

	}
}
