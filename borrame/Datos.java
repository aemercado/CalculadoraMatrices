import java.io.Serializable;
public class Datos implements Serializable {
	private String cadena;
	private int entero;
	private Integer objetoEntero;

	/*********** U T I L E R I A ****************/
		public String toString() {
			return "\nCadena: " + cadena
					+"\nEntero: " + entero
					+"\nObjeto entero: " + objetoEntero;
		}
	/*********** U T I L E R I A ****************/
 
	/*********** A C C E S O ****************/
	public void setCadena(String cad) {
		cadena = cad;
	}
	public String getCadena() {
		return cadena;
	}
	public void setEntero(int e) {
		entero = e;
	}
	public int getEntero() {
		return entero;
	}
	public void setOtroEntero(Integer oe) {
		objetoEntero = oe;
	}
	public Integer getOtroEntero() {
		return objetoEntero;
	}
	/*********** A C C E S O ****************/
}