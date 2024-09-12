package lista;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double P = 0, maior = 0, menor = 0;
		String text;
		System.out.print(" A compras? ");
		text = tec.next();
		for (int x = 1; x <= 8; x++) {
			System.out.print(" Protudo R$");
			P = tec.nextDouble();
			if (P > maior) {
				maior = P;
			} else if (P < maior || P < menor) {
				menor = P;
			}
		} // for
		System.out.print("O maior preço é " + maior);
		System.out.print("O menor preço é " + menor);
	}

}
