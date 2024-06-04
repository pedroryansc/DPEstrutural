package controleRemotoBridge;

public class Main {
	public static void main(String[] args) {
		
		ControleRemotoComDispositivo controleTelevisao = new ControleRemotoComDispositivo(new Televisao());
		
		ControleRemotoComDispositivo controleArCondicionado = new ControleRemotoComDispositivo(new ArCondicionado());
		
		controleTelevisao.ligar();
		controleTelevisao.desligar();
		
		controleArCondicionado.ligar();
		controleArCondicionado.desligar();
		
	}
}