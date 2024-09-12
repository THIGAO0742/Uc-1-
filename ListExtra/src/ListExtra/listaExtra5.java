package ListExtra;

import java.util.Scanner;

public class listaExtra5 {
	public static void main (String[]args) {
		Scanner tec = new Scanner(System.in);
		final double KGBOLO = 19.75;
		final double TAXA = 0.2;
		double pesoBl;
		double valorVenda,valorCusto,lucro;
		System.out.println("Digite o peso que deseja do Bolo: ");
		pesoBl=tec.nextDouble();
		valorCusto = pesoBl * KGBOLO;
		lucro = valorCusto * TAXA;
		valorVenda = lucro + valorCusto;
		
		
		System.out.println("O valor a venda: R$"+valorVenda);
		System.out.println("Custo: R$"+valorCusto);
		System.out.println("Peso: "+pesoBl+"KG");
		System.out.println("Valor do lucro: R$"+lucro);
		System.out.println("Valor do kg: R$"+KGBOLO);
	

	
		
		
		
		
		
		
		
	}
}
