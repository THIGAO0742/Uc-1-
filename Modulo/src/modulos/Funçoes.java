package modulos;

import java.util.Scanner;

public class Funçoes {

	public static int somar(int n1, int n2) {
		int soma;
		soma = n1 + n2;

		return soma;
	}// somar

	public static int sub(int n1, int n2) {
		int sub;
		sub = n1 - n2;

		return sub;
	}// sub

	public static int mult(int n1, int n2) {
		int mult;
		mult = n1 * n2;

		return mult;
	}// mult

	public static double div(int n1, int n2) {
		double div;
		div = n1 / n2;

		return div;
	}// div

	public static int LerNr() {
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");

		return tec.nextInt();
	}// tec

	public static void main(String[] args) {

		int nr1, nr2;
		nr1 = LerNr();
		nr2 = LerNr();
		System.out.println("A Soma de " + nr1 + " + " + nr2 + " = " + somar(nr1, nr2));
		System.out.println("A Subtração de " + nr1 + " - " + nr2 + " = " + sub(nr1, nr2));
		System.out.println("A Multiplicação de " + nr1 + " * " + nr2 + " = " + mult(nr1, nr2));
		System.out.println("A Divisão de " + nr1 + " / " + nr2 + " = " + div(nr1, nr2));

	}// main

}
