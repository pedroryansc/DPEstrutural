package proxy;

public class ProxyControleAcesso implements Servico {

	private ServicoReal servicoReal;
	private String usuario;
	
	public ProxyControleAcesso(String usuario) {
		this.usuario = usuario;
	}
	
	public void executar() {
		if(this.verificarPermissao()) {
			if(this.servicoReal == null) {
				this.servicoReal = new ServicoReal();
			}
			this.servicoReal.executar();
		} else {
			System.out.println("Usuário " + usuario + " não tem permissão para acessar.");
		}
	}
	
	private boolean verificarPermissao() {
		return this.usuario.equals("admin");
	}
	
}