package lista02;

public class Quest10 {

	public static void main(String[] args) {
		
		double valor, frete, total;
		String regiao;
		valor = 500;
		regiao = "NE";
		switch (regiao) {
		case "N":
			frete = 250;
			total = valor + frete;
			System.out.println("Valor total (frete incluso) R$" + total);
			break;
		case "NE":
			frete = 200;
			total = valor + frete;
			System.out.println("Valor total (frete incluso) R$" + total);
			break;
		case "CO":
			frete = 180;
			total = valor + frete;
			System.out.println("Valor total (frete incluso) R$" + total);
			break;
		case "SE":
			frete = 85;
			total = valor + frete;
			System.out.println("Valor total (frete incluso) R$" + total);
			break;
		case "S":
			frete = 150;
			total = valor + frete;
			System.out.println("Valor total (frete incluso) R$" + total);
			break;
		default:
			break;

		}
	}

}
