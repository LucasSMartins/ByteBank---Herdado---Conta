package entities;

public class CalculadorDeImposto {

	private double totalImposto;

	public void registra(Tributavel tri) {

		double valor = tri.getValorImposto();
		this.totalImposto += valor;
	}
	public double getvalorImposto() {
		return totalImposto;
	}
}
