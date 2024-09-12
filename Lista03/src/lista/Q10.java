package lista;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		final int MAIOR = 18;
		final int MENOR = 10;
		int id = 0, maior18 = 0, menor10 = 0, maisVei = 0;
		double somaId = 0, mediaId = 0;
		for (int x = 0; x < 10; x++) {
			System.out.print("Idade:");
			id = tec.nextInt();
			somaId = somaId + id;
			if (id > maisVei) {
				maisVei = id;
			} // IF
			if (id >= MAIOR) {
				maior18++;
			} else if (id <= MENOR) {
				menor10++;
			} // IF
		} // FOR
		mediaId = somaId / 10;
		System.out.println("Á méida de idade do grupo é de :" + mediaId);
		System.out.println("Quantidade de pessoas Maiores de 18 anos :" + maior18);
		System.out.println("Quantidade de pessoas Menores de 10 anos:" + menor10);
		System.out.println("Á maior idade do grupo é de :" + maisVei);

	}

}
