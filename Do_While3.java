package Pré_Condicionada1;

import java.util.Scanner;

public class Do_While3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println ("Digite um Numero: ");
			numero = ler.nextInt();
		}while (numero != 0);
		
		System.out.println ("Você digitou: " + numero + " Para terminar");
		ler.close();
	}

}
