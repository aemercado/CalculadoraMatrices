package uno;

public class Metiche1 {
	public void metodo() {
		Datos datos = new Datos();

		datos.varSinModificador = 1;
		datos.varPublica = 2;
		datos.varProtegida = 3;
		
		datos.metSinModificador();
		datos.metPublico();
		datos.metProtegido();
	}
}

