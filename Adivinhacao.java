package br.com.java17;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(100);
		int tentativas = 0;

		while (tentativas < 5) {
			System.out.print("Digite um número entre 0 e 100: ");
			int numeroDigitado = leitura.nextInt();
			tentativas++;

			if (numeroDigitado == numeroAleatorio) {
				System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
				break;
			} else if (numeroDigitado < numeroAleatorio) {
				System.out.println("O número digitado é menor que o número gerado.");
			} else {
				System.out.println("O número digitado é maior que o número gerado.");
			}
		}

		if (tentativas == 5) {
			System.out
					.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroAleatorio);
		}

	}
}
