import java.util.Scanner;

public class exercicio1 {

	private static Scanner tec;

	public static void main(String[] args) {

		int[] num = new int[6];
		tec = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			System.out.print(i+"º  valor:");
			num[i]=tec.nextInt();
		}
		
		for(int i=5; i>=0;i--) {
			System.out.println(i+"º valor:"+num[i]);
		}
		
		
		
		
		
		
		
		
	}

}
