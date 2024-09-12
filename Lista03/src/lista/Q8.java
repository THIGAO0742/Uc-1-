package lista;

import java.util.Random;

public class Q8 {

	
	public static void main(String[] args) {
		
		Random ger = new Random();
		int [] num = new int[20];
		int maior5=0,div3=0;
		
		System.out.println("Sorteio");
		
		for(int x = 0;x<num.length;x++) {
			num[x]=ger.nextInt(11);
		}
			
		System.out.print("Números sorteados: ");
		
		for (int i = 0;i<num.length;i++) {
			System.out.print(num[i]+" / ");
			
			if(num[i]>5){
				maior5++;
			}
			if(num[i] % 3 == 0) {
				div3++;
			}//if
		}
		System.out.println(" ");
		System.out.println("Números acima de 5: "+maior5);
		System.out.println("Números divisiveis por 3: "+div3);
			
		
		
		
	}

}
