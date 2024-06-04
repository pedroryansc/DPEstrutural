package controleRemotoBridge;

public class ArCondicionado implements ControleRemoto {

	public void ligar() {
		System.out.println("Ar-condicionado ligado.");
	}
	
	public void desligar() {
		System.out.println("Ar-condicionado desligado.");
	}
	
	public void aumentar() {
		System.out.println("Temperatura do ar-condicionado aumentada.");
	}
	
	public void diminuir() {
		System.out.println("Temperatura do ar-condicionado diminuída.");
	}
	
}