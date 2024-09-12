package ListExtra;

import java.util.Scanner;

public class cond6 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int timeA;
		int timeB;
		System.out.print("Placar do time A: ");
		timeA=tec.nextInt();
		System.out.print("Placar do time B: ");
		timeB=tec.nextInt();
		
		if (timeA > timeB) {
			System.out.println("Time A VENCEDOR");
		} else if(timeB > timeA) {
			System.out.println("Time B VENCEDOR");
		}else {
			System.out.println("EMPATE");
		}
		
		
		
		
		
	}

}
