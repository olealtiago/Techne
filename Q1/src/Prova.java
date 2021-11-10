
public class Prova {
	private double notaParte1;
	private double notaParte2;
	
	public double calcularNotaTotal() {
		return ((notaParte1 + notaParte2) <= 10) ? (notaParte1 + notaParte2) :  -1;
	}
	
	public void setNotas(double notaParte1, double notaParte2) {
		this.notaParte1 = notaParte1;
		this.notaParte2 = notaParte2;
	}
}
