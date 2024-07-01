package decorator;

public class DecoradorMain {
	public static void main(String args[]) {
		
		Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples());
		janelaDecorada.draw();
		
	}
}