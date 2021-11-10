
public class Processador {
	public String processa(String s) {
		if(s == null) return null;
		else if(s.length() <= 3) return s.toUpperCase();
		else {
			String aux = s.substring(2,3);
			aux = aux + s.substring(1,2);
			aux = aux + s.substring(0,1);
			aux = aux + s.substring(3);
			return aux.toUpperCase();
		}
	}
}
