import java.util.Scanner;
import java.util.Locale;
public class exercio2 {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados=new Scanner(System.in);
		
	
		
		double A, R, pi=3.14159f;
		R=dados.nextDouble();
		
		A=pi*R*R;
		
		
	    System.out.printf("A=%.4f%n", A);
		
		dados.close();
}
}
