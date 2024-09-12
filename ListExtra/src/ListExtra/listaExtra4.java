package ListExtra;

import java.util.Scanner;

public class listaExtra4 {
	public static void main (String[]args) {
		Scanner tec = new Scanner(System.in);
		final double DESCONTO = 0.07;
		final double TAXA = 0.03;
		double valor;
		System.out.print("Valor do produto: ");
		valor=tec.nextDouble();
		double descVista = valor * DESCONTO;
		double valorVista = valor - descVista;
		double valorTx = valor * TAXA;
		double valorTotal = valor + valorTx;
		double valorParcelado = valorTotal/2;
		
		System.out.println("Valor do Produdo: R$"+valor);
		System.out.println("***************************");
		System.out.println("A VISTA");
		System.out.println("Valor a VISTA: R$"+valorVista);
		System.out.println("Valor Desconto: R$"+descVista);
		System.out.println("***************************");
		System.out.println("PARCELADO");
		System.out.println("Valor Total: R$"+valorTotal);
		System.out.println("Valor da Parcela: R$"+valorParcelado);
		System.out.println("TAXA: R$"+valorTx);

		
		
		
		
	}
}
