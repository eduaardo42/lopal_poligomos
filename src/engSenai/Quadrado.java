package engSenai;

public class Quadrado {
	
	private double lado;
	
	public void setLado (double lado) {
		this.lado = lado;
		
	}
	
	public double calcularArea () {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	public double calcularPerimetro () {
		double perimetro = lado * 4;
		return perimetro;
	}
	public void mostrarResultado () {
		System.out.println("-------------------");
		System.out.println("Informações do quadrado");
		System.out.println("-------------------");
		System.out.println("Área: " + calcularArea());
		System.out.println("Lados: " + lado);
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("-------------------");
	}
}
