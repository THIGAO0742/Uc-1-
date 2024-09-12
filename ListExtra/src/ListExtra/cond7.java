package ListExtra;

import java.util.Scanner;

public class cond7 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String gorgeta;
		double conta,contagor,vlamg,gorg;
		int amigos;
		
		gorg = 0;
		contagor = 0;
		System.out.println("CONTA");
		System.out.print("Valor da conta: ");
		conta=tec.nextDouble();
		System.out.print("Com quantos amigos deseja dividir a conta: ");
		amigos=tec.nextInt();
		System.out.print("Gorgeta (S/N): ");
		gorgeta=tec.next();
		System.out.println(" ");
		if (gorgeta.equals("S")) {
			contagor = conta+(conta*0.1);
			vlamg = contagor/amigos;
			gorg = conta*0.1;
			System.out.println("CONTA");
			System.out.println("Gorgeta 10% R$"+gorg);
			System.out.println("Valor Total R$"+contagor);
			System.out.println("Valor por pessoa R$"+vlamg);

		}else if (gorgeta.equals("N")) {
			
			vlamg = conta/amigos;
			System.out.println("CONTA");
			System.out.println("Valor Total R$"+conta);
			System.out.println("Valorpor pessoa R$"+vlamg);
		} else {
			System.err.println("Resposta indefinida");
		}
		
		
		
		
		
	}//main

}
