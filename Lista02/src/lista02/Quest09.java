package lista02;

public class Quest09 {

	public static void main(String[] args) {

		
		double numb1, numb2,total; 
		String operador; 
		operador = "*"; 
		numb1 = 5; 
		numb2 = 8; 
		
		if(operador == "+") {
			total = numb1 + numb2; 
			System.out.println(numb1+" "+operador+" "+numb2+" = "+total); 
		}else if(operador == "-") {
			total = numb1 - numb2; 
			System.out.println(numb1+" "+operador+" "+numb2+" = "+total); 
		}else if(operador == "*") {
			total = numb1 * numb2; 
			System.out.println(numb1+" "+operador+" "+numb2+" = "+total);
		}else if(operador == "/") {
			total = numb1 / numb2; 
			System.out.println(numb1+" "+operador+" "+numb2+" = "+total); 
		}else {
			System.out.println("Operador Invalido"); 
		}
		
		

		
		/*double numb1, numb2,total; 
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
		}*/ 
		
		
		
		
		
		
		
		
		
	}

}
