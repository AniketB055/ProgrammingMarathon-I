import java.util.Scanner;

public class TimeConverterApp {

	public static void main(String[] args) {
		
		
			Scanner scan = new Scanner(System.in);
			double minutes = scan.nextInt();
			double converted = convertToHours( minutes);
			System.out.println(converted);
			
	}
		
		
		public static double convertToHours(double minutes)
		{
			double hours = minutes/60;
			return (hours);
		}

	}


