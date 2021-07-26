package metodoDeJacobbi;

import java.util.Scanner;

public class Main {

	static double x0 = 1.0;
	static double y0 = 1.5;
	static double z0 = 2.0;

	// Retorna as minhas funções a serem resolvidas
	public static double f1(double x0, double y0, double z0) {
		return (17 - y0 + 2 * z0) / 20;
	}

	public static double f2(double x0, double y0, double z0) {
		return (-18 - 3 * x0 + z0) / 20;
	}

	public static double f3(double x0, double y0, double z0) {
		return (25 - 2 * x0 + 3 * y0) / 20;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor do erro: ");
		float e = sc.nextFloat();
		Jacobi g = new Jacobi(x0, y0, z0, e);
		g.jacobi();
		g.printSolucao();
		sc.close();
	}

}
