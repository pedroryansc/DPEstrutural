package controleRemotoBridge;

public class Televisao implements ControleRemoto {
	
	public void ligar() {
		System.out.println("Televisão ligada.");
	}
	
	public void desligar() {
		System.out.println("Televisão desligada.");
	}
	
	public void aumentar() {
		System.out.println("Volume da televisão aumentado.");
	}
	
	public void diminuir() {
		System.out.println("Volume da televisão diminuído.");
	}
	
}