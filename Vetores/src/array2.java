import java.util.Scanner;

public class array2 {

	private static Scanner tec;

	public static void main(String[] args) {

		String [] pais = new String[5];
		tec = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("País["+i+"]: ");
			pais[i]=tec.next();
		}
		
		for(int i=0; i<5;i++) {
			System.err.println( "PAÍS["+i+"]: "+pais[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
