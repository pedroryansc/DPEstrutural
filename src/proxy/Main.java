package proxy;

public class Main {
	public static void main(String[] args) {
		
		Servico proxyAdmin = new ProxyControleAcesso("admin");
		proxyAdmin.executar();
		
		Servico proxyUsuarioComum = new ProxyControleAcesso("comum");
		proxyUsuarioComum.executar();
		
	}
}