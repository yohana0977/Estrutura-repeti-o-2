package Pré_Condicionada1;

import java.util.Scanner;

public class While_3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fat = 1;
		int i = 1;

		System.out.println("informe o fatorial:");
		int n = ler.nextInt();

		while (i <= n) {
			fat = fat * i;
			i++;

			System.out.println("o fatorial é: " + fat);
		}

	}
}
