import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados=new Scanner(System.in);
		
		double roupa,roupa2,qtd,qtd2,valor, valor2, total;
		int codigo=0,codigo2=0;
		
		codigo=dados.nextInt();
		qtd=dados.nextDouble();
		roupa=dados.nextDouble();
		
		codigo2=dados.nextInt();
		qtd2=dados.nextDouble();
		roupa2=dados.nextDouble();
		
		valor=qtd*roupa;
		valor2=qtd2*roupa2;
		
		total=valor+valor2;
		
		
		System.out.printf("Valor a pagar %.2f%n",total);
		
		
		dados.close();
}
}