import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados=new Scanner(System.in);
		
		int number;
		double horas, valor,salary;
		
		number=dados.nextInt();
		horas=dados.nextDouble();
		valor=dados.nextDouble();
		
		salary=horas*valor;
		System.out.println("number" + number);
		System.out.printf("Salary= U$%.2f%n",salary);
		
		dados.close();
		
}
}
