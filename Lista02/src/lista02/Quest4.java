package lista02;

public class Quest4 {

	public static void main(String[] args) {

		final double PROMOF = 0.05;
		final double PROMOM = 0.13;
		String sexo;
		double compra,valorDesc,valorSub;
		
		sexo = "F";
		compra = 500;
		
		if(sexo == "F" || sexo == "f") {
			
			valorSub = compra * PROMOF;
			valorDesc = compra - valorSub;
			System.out.println("O valor da Compra foi R$"+compra+" // Valor do Desconto de 13% Para as Mulheres R$"+valorSub+
					" // Valor Total R$"+valorDesc);
			
		} else if (sexo == "M" || sexo == "m") {
			valorSub = compra * PROMOM;
			valorDesc = compra - valorSub;
			System.out.println("O valor da Compra foi R$"+compra+" // Valor do Desconto de 5%: R$"+valorSub+
					"// Valor Total R$"+valorDesc);
		}else {
			System.out.println("Sexo inválido");
		}
		
		
		
		
		
		
	}

}
