import java.util.Scanner;
public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		explorer.calculateSurfaceArea(3.0);
		System.out.println(PlanetExplorer.calculateSurfaceArea(r));
		scan.close();

	}

}
