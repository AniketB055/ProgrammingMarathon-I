import java.util.Scanner;
public class AvgCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sem1=scan.nextInt();
		int sem2=scan.nextInt();
		int sem3=scan.nextInt();
		int sem4=scan.nextInt();
		int sem5=scan.nextInt();
		int sem6=scan.nextInt();
		int sem7=scan.nextInt();
		int sem8=scan.nextInt();
		double res = (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8.0;
		System.out.printf("%.2f",res);
		scan.close();
	}

}
