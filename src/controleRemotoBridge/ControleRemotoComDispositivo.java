package controleRemotoBridge;

public class ControleRemotoComDispositivo implements ControleRemoto {

	private ControleRemoto controleRemoto;
	
	public ControleRemotoComDispositivo(ControleRemoto dispositivo) {
		this.controleRemoto = dispositivo;
	}
	
	public void ligar() {
		controleRemoto.ligar();
	}
	
	public void desligar() {
		controleRemoto.desligar();
	}
	
	public void aumentar() {
		controleRemoto.aumentar();
	}
	
	public void diminuir() {
		controleRemoto.diminuir();
	}
	
}