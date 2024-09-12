import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		/*Scanner tec = new Scanner(System.in); 
		int Soma = 0,N; 
		System.out.println("Digite valores que deseja somar"); 
		System.out.print("1º valor: "); 
		N=tec.nextInt(); 
		for ( int x = 2; N!=0; x++) { 
			Soma=N+Soma; 
			System.out.print(x+"º valor: "); 
			N=tec.nextInt(); 	 
			} 
		System.out.println("A soma de todos os números é: "+Soma); */
		
		Scanner tec = new Scanner(System.in); 
		int Soma = 0,N,x=2;
		
		System.out.println("Digite valores que deseja somar"); 
		System.out.print("1º valor: "); 
		N=tec.nextInt();
		while(N!=0){
			Soma=N+Soma; 
			System.out.print(x+"º valor: "); 
			N=tec.nextInt(); 
			x++;
		}
		System.out.println("A soma de todos os números é: "+Soma);
		
		
		
		
		
		
		
		
		
		
		
	}

}
