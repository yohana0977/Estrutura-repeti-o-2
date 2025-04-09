package Pré_Condicionada1;

import java.util.Random;

public class Do_While2 {
	public static void main(String[] args) {
		Random random = new Random();
		int faceDado;
		do {
			faceDado = random.nextInt(7);
			System.out.println("faceDado: " + faceDado);
		} while (faceDado != 6);
	}
}
