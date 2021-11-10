
public class Lampada {
	private boolean estado;
	
	public void Ligar() {
		this.estado = true;
	}
	
	public void Desligar() {
		this.estado = false;
	}
	
	public void Imprime() {
		if(estado == true) {
			System.out.println("Lampada ligada.");
		}
		else {
			System.out.println("Lampada desligada.");
		}
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
