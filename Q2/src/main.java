public class main {

	public  static void main(String[] args) {
		Processador p1 = new Processador();
		
		System.out.println(p1.processa(null));
		System.out.println(p1.processa("abc"));
		System.out.println(p1.processa("abcdef"));
		
		
	}
	
	
}
