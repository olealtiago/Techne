public class main {
	public  static void main(String[] args) {
		Prova p1a1 = new Prova();
		Prova p2a1 = new Prova();
		Prova p1a2 = new Prova();
		Prova p2a2 = new Prova();
		Prova p1a3 = new Prova();
		Prova p2a3 = new Prova();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		p1a1.setNotas(4.0, 2.5);
		p2a1.setNotas(1.0, 7.0);
		p1a2.setNotas(6.5, 3.5);
		p2a2.setNotas(0.0, 3.0);
		p1a3.setNotas(5.0, 4.0);
		p2a3.setNotas(6.0, 1.5);
		
		a1.setProvas(p1a1, p2a1);
		a2.setProvas(p1a2, p2a2);
		a3.setProvas(p1a3, p2a3);
		
		Turma t1 = new Turma();
		t1.setAlunos(a1, a2, a3);
		
		//Se alguma média retornar negativo (valor invalido) quer dizer que a soma das partes de alguma de suas provas excedeu 10 ou foram setadas notas negativas.
		System.out.println("Media aluno 1: " + a1.calcularMedia());
		System.out.println("Media aluno 2: " + a2.calcularMedia());
		System.out.println("Media aluno 3: " + a3.calcularMedia());
		System.out.println("Media da turma: " + t1.calcularMedia());
		System.out.println();


		//outro teste

		p1a1.setNotas(10.0, 1.5);
		p2a1.setNotas(13.0, 7.0);
		p1a2.setNotas(6.5, 30.5);
		p2a2.setNotas(10.0, 3.0);
		p1a3.setNotas(6.0, 4.0);
		p2a3.setNotas(6.0, 1.5);

		System.out.println("Media aluno 1: " + a1.calcularMedia());
		System.out.println("Media aluno 2: " + a2.calcularMedia());
		System.out.println("Media aluno 3: " + a3.calcularMedia());
		System.out.println("Media da turma: " + t1.calcularMedia());
		System.out.println();

		//outro teste
		p1a1.setNotas(10.0, 0);
		p2a1.setNotas(10.0, 0);
		p1a2.setNotas(0, 10.0);
		p2a2.setNotas(0, 10.0);
		p1a3.setNotas(0, 10.0);
		p2a3.setNotas(0, 10.0);

		System.out.println("Media aluno 1: " + a1.calcularMedia());
		System.out.println("Media aluno 2: " + a2.calcularMedia());
		System.out.println("Media aluno 3: " + a3.calcularMedia());
		System.out.println("Media da turma: " + t1.calcularMedia());
		System.out.println();

	}
}