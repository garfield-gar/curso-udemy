import java.util. Scanner;
public class Exercicio1 {
public static void main (String[]args) {
	
	Scanner dados=new Scanner(System.in);
	
		
	int S,SM,R;
	
	S=dados.nextInt();
	SM=dados.nextInt();
		
	
	R = S+SM;
	
	System.out.print("\nSaida :"+R);
	dados.close();
}
}