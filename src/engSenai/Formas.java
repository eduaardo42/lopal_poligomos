package engSenai;


import engSenai.ui.Menu;

public class Formas {

	public static void main(String[] args) {
		
//		int contador = 1;
//		while(contador <= 10) {
//			System.out.println("SENAI - " + contador);
//			contador = contador + 1;
//			}
	//}
		
		Menu.mostrarMenu();
		
		System.out.println("É preciso voltar ao começo!");
		}
		
		public static void escrever(String nome) {
			System.out.println(nome);
			escrever(nome);
	}

}
