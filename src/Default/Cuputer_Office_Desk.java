package Default;
import java.util.Locale;
public class Cuputer_Office_Desk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String product1 = "Computer";
		 String product2 = "Office desk";
		 
		 byte age = 30;
		 int code = 5290;
		 char gender = 'F';
		 
		 double price1 = 2100.0;
		 double price2 = 650.50;
		 double measure = 53.234567;
		 
		 
		System.out.println("Pruduct:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("measeu with eithg decimal places: %.8f%n", measure);
		System.out.printf("rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	
		
		
		 
	}

}
