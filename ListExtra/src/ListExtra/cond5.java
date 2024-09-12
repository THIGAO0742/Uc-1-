package ListExtra;

import java.util.Scanner;

public class cond5 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double peso,altura;
		String sexo;
		System.out.print("Digite sua Altura: ");
		altura =tec.nextDouble();
		System.out.println("Digite seu Sexo");
		sexo =tec.next();
		
		if(sexo.equals("F")|| sexo.equals("f")) {
			peso = (62.1 * altura) - 47.7;
			System.out.println("Seu peso ideal é "+peso+"Kg");
		
		} else if (sexo.equals("M")  || sexo.equals("m")) {
			peso = 	(72.7 * altura) - 58;
			System.out.println("Seu peso ideal é "+peso+"Kg");
			
		}else {
			System.out.println("Valor inválido");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
