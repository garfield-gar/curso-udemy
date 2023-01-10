import java.util.Locale;

public class fixacao1 {
public static void main(String[]args) {
	String product1="Computer";
	String product2="Office desk";
	
	int age =30;
	int code =5290;
	char gender = 'f';
	
	double price1 =2100.00;
	double price2=650.50;
	double measure= 53.234567;
	
	System.out.printf("Products:\n %s, which price is $ %.2f",product1,price1);
	System.out.printf("\n%s, which price is $%.2f",product2,price2);
	
	System.out.printf("\nRecord: %d year old, code %s and gender :%s",age,code,gender);
	
	System.out.printf("\n Measure whit eight decimal places:",measure);
	System.out.printf("\nRouded (three decimal places %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f%n", measure);
	
	
	
}
}
