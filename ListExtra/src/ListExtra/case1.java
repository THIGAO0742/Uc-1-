package ListExtra;

import java.util.Scanner;

public class case1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String fruta;
		System.out.println("Qual fruta deseja compra?");
		fruta = tec.next();

		switch (fruta) {
		case "maçã":
			System.out.println("A maçã está custando R$2,00");
			break;
		case "morango":
			System.out.println("O morango está custando R$4,00");
			break;
		case "jaca":
			System.out.println("A java está custando R$3,00");
			break;
		case "melancia":
			System.out.println("A melancia está custando R$5,00");
			break;
		default:
			System.out.println("NÃO VENDEMOS ESTÁ FRUTA");
			break;
		}
		
			
	}

}
