package engSenai;

public class Retangulo {

	private double base;
	private double altura;
	
	public void setBase (double base) {
		this.base = base;
	}
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double calcularArea () {
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro () {
		double perimetro = base * 2 + altura * 2;
		return perimetro;
	}
	public void mostrarResultado () {
		System.out.println("-------------------");
		System.out.println("Informações do retangulo");
		System.out.println("-------------------");
		System.out.println("Área: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("-------------------");
		
	}
	
}
