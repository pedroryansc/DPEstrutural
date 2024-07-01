package facade;

public class CarroFacade {

	private CarroCor cor;
	private CarroMarca marca;
	private CarroModelo modelo;
	private CarroMotor motor;
	
	public CarroFacade() {
		cor = new CarroCor();
		marca = new CarroMarca();
		modelo = new CarroModelo();
		motor = new CarroMotor();
	}
	
	public void construirCarroCompleto(String cor, String marca, String modelo, String motor) {
		System.out.println("--- Construindo um carro completo ---");
		this.cor.setCor(cor);
		this.marca.setMarca(marca);
		this.modelo.setModelo(modelo);
		this.motor.setMotor(motor);
		System.out.println("Carro de modelo " + modelo + ", marca " + marca + ", motor " + motor + " e cor " + cor
							+ " construído com sucesso.");
	}
	
}