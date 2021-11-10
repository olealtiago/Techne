
public class Turma extends Aluno{
	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;
	
	
	public double calcularMedia() {
		double a1 = aluno1.calcularMedia();
		double a2 = aluno2.calcularMedia();
		double a3 = aluno3.calcularMedia();
		
		if(a1 != -1 && a2 != -1 && a3 != -1) {
			return (a1+a2+a3)/3;
		}
		return -1;
	}
	
	public void setAlunos(Aluno aluno1, Aluno aluno2, Aluno aluno3) {
		this.aluno1 = aluno1;
		this.aluno2 = aluno2;
		this.aluno3 = aluno3;
	}
}
