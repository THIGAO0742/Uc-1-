package ListExtra;

import java.util.Scanner;

public class case2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		/*String Media;
		System.out.print("Digite seu Rendimento: ");
		Media=tec.next();
		switch (Media) {
		case "MB":
			System.out.println("RENDIMENTO"+Media);
			System.out.println("Media entre 9 á 10");
			break;
		case "B":	
			System.out.println("RENDIMENTO"+Media);
			System.out.println("Media entre 6 á 8");
			break;
		case "R":	
			System.out.println("RENDIMENTO"+Media);
			System.out.println("Media entre 3 á 5");
			break;
		case "SC":	
			System.out.println("RENDIMENTO"+Media);
			System.out.println("Media entre 0 á 2");
			break;

		default:
			break;
		}*/
		
		
		
		int media;
		System.out.print("Digite sua Media: ");
		media=tec.nextInt();
		switch (media) {
		case 0:
		case 1:
		case 2:

			System.out.println("Rendimento Escolar SC (Sem Concito");
			
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Rendimento Escolar R (Regular)");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Rendimento Escolar B (Bom)");
			break;
		case 9:
		case 10:
			System.out.println("Rendimento Escolar MB (Muito Bom)");
			break;
		default:
			break;
		}
		
		
		
		
		
		
		
		
	}

}
