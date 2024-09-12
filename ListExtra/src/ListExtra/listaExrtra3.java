package ListExtra;

import java.util.Scanner;

public class listaExrtra3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double salLiq,descBru;
		double salBru;
		final double INSS = 0.1;
		final double IR = 0.05;
		System.out.print("Digite o valor do salário Bruto: R$");
		salBru=tec.nextDouble();
		System.out.println(" ");
		double valInss = salBru * INSS;
		double valIr = salBru * IR;
		salLiq = salBru - valInss - valIr;
		descBru = valInss + valIr;
		System.out.println("Salário bruto: R$" + salBru);
		System.out.println("Desconto INSS: R$" + valInss);
		System.out.println("Desconto Imposto de renda: R$" + valIr);
		System.out.println("Salário Liquido: R$" + salLiq);
		System.out.println("Salário Liquido: R$" + salLiq);
		System.out.println("Desconto salário Bruto: R$" + descBru);
		
	}
}
