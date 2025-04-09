package Pré_Condicionada1;

import java.util.Scanner;

public class exercicio_subst {
public static void main (String [] args) {
	Scanner ler = new Scanner (System.in);
	double media = 0, soma = 0,num ;
	
	for (int i = 1; i<=5; i++) {
		System.out.println("Informe o " + i + " número: ");
		num = ler.nextDouble();
		soma = soma + num;
	}
	media = soma/5;
	System.out.println ("A soma é: " + soma);
	System.out.println ("A media é: " +media);
}
}
