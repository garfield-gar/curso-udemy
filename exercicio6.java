import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados=new Scanner(System.in);
		
		double A=0.0f,B=0.0f,C=0.0f,area,Circulo,trapezio,quadrado,retangulo;
		double pi=3.14159;
		
		A=dados.nextDouble();
		B=dados.nextDouble();
		C=dados.nextDouble();
		
		area=A*C/2;
		Circulo=pi*C*C;
		trapezio=((A+B)*C)/2;
		quadrado=B*B;
		retangulo=A*B;
		
		System.out.printf("triangulo %.3f%n",area);
		System.out.printf("Circulo %.3f%n",Circulo);
		System.out.printf("trapezio %.3f%n",trapezio);
		System.out.printf("quadrado %.3f%n",quadrado);
		System.out.printf("retangulo %.3f%n",retangulo);
		
		dados.close();
	}
		
}