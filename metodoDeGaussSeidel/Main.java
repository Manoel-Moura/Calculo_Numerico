package metodoDeGaussSeidel;

import java.util.Scanner;

public class Main {

	static double x0 = 1.0;
	static double y0 = 1.5;
	static double z0 = 2.0;

	public static double f1(double x0, double y0, double z0) {
		return (8 - (2 * y0 - z0)) / 3;
	}

	public static double f2(double x0, double y0, double z0) {
		return (-4 - (2 * x0 + 2 * z0)) / -4;
	}

	public static double f3(double x0, double y0, double z0) {
		return (3 - (-x0 + y0)) / 5;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor do erro: ");
		float e = sc.nextFloat();
		GaussSeidel g = new GaussSeidel(x0, y0, z0, e);
		g.gaussSeidel();
		g.printSolucao();
		sc.close();
	}

}
