package dos;

import uno.Datos;

public class MasDatos2 extends Datos {
	
	int otraVar;
	void otroMetodo() {}

	public void metodoMas() {
		Datos datos = new Datos();

		this.varPublica = 2;
		this.varProtegida = 3;
		
		this.metPublico();
		this.metProtegido();
		
		datos.varPublica = 2;
		
		datos.metPublico();
		
	}
}