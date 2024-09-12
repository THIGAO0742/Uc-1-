import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		int[] num={4,5,9,8,7,45,2,5,8,6,3,1,10,50};

		Scanner tec = new Scanner(System.in);
		int N;	
		System.out.print("Digite o valor que deseja encontra: ");
		N = tec.nextInt();
		for(int x = 0; x<num.length ;x++ ) {		
			if(num[x]==N) {
				System.out.println("Valor encontrado");
			}//if
		}//for
		
		
	}
}
