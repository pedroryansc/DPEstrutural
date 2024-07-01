package facade;

public class Main {
	public static void main(String[]args) {
		
		CarroFacade facade = new CarroFacade();
		facade.construirCarroCompleto("Branco", "VW", "Gol", "1.0");
		
	}
}