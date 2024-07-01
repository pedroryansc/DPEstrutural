package atvBridge;

public class Forma {

	private Cor cor;
	
	public Forma() { // Como a relação entre forma e cor é uma associação por agregação, a cor não é obrigatória e, assim, não precisa ser definida no construtor
		
	}
	
	public Forma(Cor cor) {
		this.cor = cor;
	}
	
}