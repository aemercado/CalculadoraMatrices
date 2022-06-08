public class Arreglo {
	private String[] a;


	/**
		Crea un arreglo de un tamaño dado.
		@param [int] El tamaño del arreglo a crear.
	*/
	public String[] crea(int tam) {
		if (tam <= 0) {
			System.out.println("El tamaño de un arreglo debe ser un número positivo");
			return null;
		}
		a = new String[tam];
		return a;
	}

	/**
		Almacena una cadena en la posición {@code i}
		@param cad - una cadena de caracteres que será almacenada.
		@param pos - un entero no negativo que marca la posición donde se almacenará {@code cad}.
	*/
	public void guarda(String cad, int pos) {
		if (pos >= 0 && pos < a.length) {
			a[pos] = cad;
		}
	}

	/**
		Recupera el elemento en la posición {@code pos}. La primera posición es 0.
		@param [int] La posición del elemento a recuperar.
		@return [String] El valor almacenado en la posición {@code pos}.

	*/
	public String extrae(int pos) {
		if (pos <= 0 || pos >= a.length) {
			System.out.println("Posición fuera de rango");
			return null;
		}

		return a[pos];
	}

	//TODO
	// Ordenar el arreglo
	// buscar una cadena en el arreglo y que diga en qué posición está.
	// copiar un arreglo en otro
	// juntar dos arreglos
	// dividir un arreglo

	public String toString() {
		String salida = "";
		for (int i = 0; i < a.length; i++) {
			salida += a[i];
			if (i < a.length - 1) {
				salida += ", ";
			}
		}

		return salida;
	}

	//*************METODOS CONSTRUCTORES**********************
	/**
		Asigna el parámetro a la variable a
	*/
	public Arreglo(int n) {
		super();
		a = new String[n];
	}

	/**
	 * Constructor por defecto
	 */ 
	public Arreglo() {
		super();
		// hacer algo
	}

	//*************METODOS CONSTRUCTORES**********************

	//*************METODOS DE ACCESO**********************
	public void setA(String[] arreglo) {
		a = arreglo;
	}

	public String[] getA() {
		return a;
	}

	//*************METODOS DE ACCESO**********************


}
