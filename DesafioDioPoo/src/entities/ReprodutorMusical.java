package entities;

public class ReprodutorMusical {
	
	public void tocar(){
		
		System.out.println("Tocando Musica");
		
	}

	
	public void pausar(){
		
		System.out.println("Musica Pausada");
		
	}
	
	
	public void selececionarMusica(String musica){
		
		System.out.println("Muscia escolhida: " + musica);
		tocar();
		
	}
	
	
}
