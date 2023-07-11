import java.util.Scanner;
public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double inches = scan.nextDouble();
		HeightConverter converter = new HeightConverter();
		System.out.println(HeightConverter.convertInchesToFeet(inches));

	}

}
