package ListExtra;

import java.util.Scanner;

public class caseatv1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int x;
		System.out.print("Digite um número para o elemto X:");
		x = tec.nextInt();
		switch (x) {
		case 1:
			System.out.println("X é 1");
			break;
		case 2:
			System.out.println("X é 2");
			break;
		case 3:
			System.out.println("X é 3");
			break;
        case 4:
        	System.out.println("X é 4");
			break;
        case 5:
        	System.out.println("X é 5");
        	break;
		default:
			System.out.println("X é maior que 5");
		}
		
		
		
		
		
	}

}
