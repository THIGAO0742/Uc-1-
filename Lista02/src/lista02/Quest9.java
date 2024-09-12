package lista02;

public class Quest9 {

	public static void main(String[] args) {

		double numb1, numb2,total;
		String operador;
		operador = "-";
		numb1 = 54;
		numb2 = 87;
		
		switch (operador) {
		case "+":
			total = numb1 + numb2;
			System.out.println(numb1+" "+operador+" "+numb2+" = "+total);
			break;
		case "-":
			total = numb1 - numb2;
			System.out.println(numb1+" "+operador+" "+numb2+" = "+total);
			break;
		case "*":
			total = numb1 * numb2;
			System.out.println(numb1+" "+operador+" "+numb2+" = "+total);
			break;
		case "/":
			total = numb1 / numb2;
			System.out.println(numb1+" "+operador+" "+numb2+" = "+total);

			break;
		default:
			System.out.println("Operador Invalido");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
