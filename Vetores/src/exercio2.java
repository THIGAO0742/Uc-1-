import java.util.Scanner;

public class exercio2 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		double [] nota = new double[5];
		double soma=0,media=0;
		
		for(int x = 0; x<nota.length;x++) {
			
			System.out.print(x+"º Nota: ");
			nota[x]=tec.nextDouble();	
		}
		
		for(int x = 0;x<nota.length;x++ ) {
			soma+=nota[x];

		}
		
		media= soma/nota.length;
		System.out.println("A media das notas é: "+media);
		
		
		
	}

}
