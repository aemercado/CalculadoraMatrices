package uno;

public class Datos {
	
	int varSinModificador;
	public int varPublica;
	protected int varProtegida;
	private int varPrivada;

	void metSinModificador() {
		System.out.println("método sin modificador de uno.Datos");
	}

	public void metPublico() {
		System.out.println("método público de uno.Datos");
	}

	protected void metProtegido() {
		System.out.println("método protegido de uno.Datos");
	}

	private void metPrivado() {
		System.out.println("método privado de uno.Datos");
	}
}