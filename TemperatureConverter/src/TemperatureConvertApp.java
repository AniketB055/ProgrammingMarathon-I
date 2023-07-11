import java.util.Scanner;
public class TemperatureConvertApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in fah ");
		double fah = scan.nextDouble();
		TemperatureConverter temp = new TemperatureConverter();
		System.out.printf("%.2f",TemperatureConverter.calculateTemperature(fah));
		
		

	}

}
