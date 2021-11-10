
public class Aluno extends Prova{
	private Prova prova1;
	private Prova prova2;
	
	public double calcularMedia() {
		double n1 = prova1.calcularNotaTotal();
		double n2 = prova2.calcularNotaTotal();
		if(n1 != -1 && n2 != -1)
			return (prova1.calcularNotaTotal() + prova2.calcularNotaTotal()) / 2;
		else
			return -1;
	}
	
	public void setProvas(Prova prova1, Prova prova2) {
		this.prova1 = prova1;
		this.prova2 = prova2;
	}
}
