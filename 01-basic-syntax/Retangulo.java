public class Retangulo {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return this.largura;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return this.largura * this.altura;
	}

	public double calcularPerimetro() {
		return 2 * (this.largura + this.altura);

	}

	public double aumentar (double fator){
		return fator * (this.largura / this.altura);
	}


}