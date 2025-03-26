package engSenai.dao;

import java.awt.Menu;
import java.util.Scanner;

import engSenai.Quadrado;

public class QuadradoDao {

	public void criarQuadrado () {
		Quadrado quadrado = new Quadrado();
	
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Qual o lado do quadrado? ");
		
		//Criar um objeto scanner
		Scanner leitor = new Scanner (System.in);
				
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.mostrarResultado();
		
		engSenai.ui.Menu.continuar(leitor);
		
		//Fechar o objeto scanner, remover da memória
		//leitor.close();
		
	}
	
}
