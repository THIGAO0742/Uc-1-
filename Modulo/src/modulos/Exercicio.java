package modulos;

import java.util.Scanner;

public class Exercicio {

	private static Scanner tec;

	public static double LerNr() {
		tec = new Scanner(System.in);
		System.out.print("Valor da Compra  R$");

		return tec.nextDouble();
	}// TEC

	public static double ValF(double n1) {
		double vlTotal;
		vlTotal = n1;

		if (vlTotal < 500) {
			vlTotal = vlTotal - (vlTotal * 0.05);

		} else if (vlTotal >= 500) {
			vlTotal = vlTotal - (vlTotal * 0.075);

		} // if
		return vlTotal;
	}// valF

	public static void main(String[] args) {
		double nr1;
		nr1 = LerNr();
		System.out.println("O valor com desconto da Compra foi R$" + ValF(nr1));

	}// MAIN
}
