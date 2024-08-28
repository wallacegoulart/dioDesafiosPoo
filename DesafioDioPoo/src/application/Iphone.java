package application;

import entities.ReprodutorMusical;

public class Iphone {
	public static void main(String[] args) {
		
		ReprodutorMusical rp = new ReprodutorMusical();		
		
		rp.tocar();
		rp.pausar();
		rp.selececionarMusica("Bonde do Tigrão");
	}

}
