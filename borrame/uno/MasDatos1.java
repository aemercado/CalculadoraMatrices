package uno;

public class MasDatos1 extends Datos {
	
	int otraVar;
	void otroMetodo() {}

	public void metodoMas() {
		Datos datos = new Datos();

		this.varSinModificador = 1;
		this.varPublica = 2;
		this.varProtegida = 3;
		
		this.metSinModificador();
		this.metPublico();
		this.metProtegido();
		
		datos.varSinModificador = 1;
		datos.varPublica = 2;
		datos.varProtegida = 3;
		
		datos.metSinModificador();
		datos.metPublico();
		datos.metProtegido();
		
	}
}