import java.util.Scanner;
import java.util.Locale;
public class Exercicio3 {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados=new Scanner(System.in);
		
		
		int a,b,c,d, diferencial;
		
		a=dados.nextInt();
		b=dados.nextInt();
		c=dados.nextInt();
		d=dados.nextInt();
		
		diferencial=(a*b)-(c*d);
		
		System.out.println(diferencial);
		
		dados.close();
}
}
