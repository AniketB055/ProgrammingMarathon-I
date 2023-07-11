import java.util.*;
public class TheNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double num= scan.nextDouble();
		double result = halveTheNumber(num);
		System.out.println("Result is "+result);

	}
	
	public static double halveTheNumber(double num)
	{
		double half = num/2;
		return(half);
	}

}
