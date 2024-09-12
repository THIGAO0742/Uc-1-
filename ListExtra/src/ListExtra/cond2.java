package ListExtra;

import java.util.Scanner;

public class cond2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int neg=0,pos=0,a,b;
		
		System.out.print("Digite um valor Positivo: ");
		a=tec.nextInt();
		System.out.print("Digite um valor Positivo: ");
		b=tec.nextInt();
		if(a>=0 && b<0) {
			pos=a;
			neg=b;
		}else if(b>=0 && a<0) {
			neg=a;
			pos=b;
		}
		
		System.out.println("Número Positivo: "+pos);
		System.out.println("Número Negativo: "+neg);


		
		
		
		
		
		
		
	}

}
