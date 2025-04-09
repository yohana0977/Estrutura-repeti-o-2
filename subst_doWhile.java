package Pré_Condicionada1;

import java.util.Scanner;

public class subst_doWhile {
public static void main (String [] args) {
	Scanner ler = new Scanner(System.in);
	double media = 0,soma = 0, num;
	int i = 1;
	
	do { 
		System.out.println ("Informe o " + i + " número:  ");
		num = ler.nextInt();
		soma = soma +num;
		i++;
				
    }while (i<=5);
	
	media = soma/5;
	System.out.println ("A soma é: " + soma);
	System.out.println ("A media é: " +media);

}
}

