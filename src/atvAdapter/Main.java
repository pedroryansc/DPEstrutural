package atvAdapter;

public class Main {
	public static void main(String[] args) {
		
		Classe1 c1 = new Classe1("Pedro");
		System.out.println("String: " + c1.getTxt());
		
		System.out.println("JSON: " + Classe2.retornaJSON(c1));
		
	}
}
