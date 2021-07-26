package metodoDeJacobbi;

public class Jacobi {
	protected double x0, y0, z0, x1, y1, z1, e, e1, e2, e3;
	protected int cont = 1;

	public void printSolucao() {
		System.out.printf("\n\nResultado: \nx = %.3f\ny = %.3f \nz = %.3f\n", this.x1, this.y1, this.z1);

	}

	public void jacobi() {
		System.out.printf("\nIteracao   x\t    y\t   z\n");

		System.out.printf("\n%d\t|%.4f\t|%.4f\t|%.4f\n", 0, this.x0, this.y0, this.z0);

		do {
			// Cálculo das interações
			this.x1 = Main.f1(this.x0, this.y0, this.z0);
			this.y1 = Main.f2(this.x0, this.y0, this.z0);
			this.z1 = Main.f3(this.x0, this.y0, this.z0);

			System.out.printf("%d\t|%.4f\t|%.4f\t|%.4f\n", cont, x1, y1, z1);

			// Cálculo do erro
			this.e1 = Math.abs(this.x0 - x1);
			this.e2 = Math.abs(this.y0 - y1);
			this.e3 = Math.abs(this.z0 - z1);

			cont++; // contador de iterações

			// definindo o valor das próximas iterações
			this.x0 = this.x1;
			this.y0 = this.y1;
			this.z0 = this.z1;

		} while (this.e1 > this.e && this.e2 > this.e && this.e3 > this.e);

	}

	// Criador da minha classe
	public Jacobi(double x0, double y0, double z0, double e) {
		this.x0 = x0;
		this.y0 = y0;
		this.z0 = z0;
		this.e = e;
	}

}
