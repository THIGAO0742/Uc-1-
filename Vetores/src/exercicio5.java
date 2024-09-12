import java.util.Iterator;
import java.util.Scanner;

public class exercicio5 {

	private static Scanner tec;

	public static void main(String[] args) {

		tec = new Scanner(System.in);	
		
		int[] num = new int[10];
		int[] par = new int[10];
		int[] impar = new int[10];
		
		System.out.println("Digite os números desejado");
		for (int i = 0; i <num.length; i++) {
			System.out.print(i+"° valor: ");
			num[i]=tec.nextInt();
			
			if (num[i] % 2 == 0) {
				par[i] = num[i];
			} else {
				impar[i] = num[i];
			}//if
		}//FOR
		System.out.println(" ");
		System.out.println("Numeros");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");		
		}
		System.out.println(" ");
		System.out.println("Par");
		for (int i = 0; i < par.length; i++) {
			System.out.print(par[i]+" ");		
		}
		System.out.println(" ");
		System.out.println("Impar");
		for (int i = 0; i < impar.length; i++) {
			System.out.print(impar[i]+" ");		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
