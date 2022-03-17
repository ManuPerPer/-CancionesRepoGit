package paqueteCancion;
/**
 * 
 * @author manuel
 * 
 *
 *   titulo indica el nombre de una cancion
 *  grupo indica a que grupo corresponde la cancion
 *  duracion nos indica cuanto dura la cancion titulo
 *  sonando es una boolean que nos indica si esta sonando o n. si la booleana es false indica que NO esta sonando
 */

public class Cancion {

	
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	
	/** Constructor sin parámetros se usa cuando quieres 
	 * crear una cancion sin titulo duracion a 0 y no esta sonando*/
	Cancion() 
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	/**
	 * constructor de canciones con dos parametros
	 * @param titulo de cancion
	 * @param duracion de la cancion
	 */
	Cancion(String titulo, int duracion) 
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	/**
	 * 
	 * @param titulo pasamos titulo de la cancion
	 * @param grupo el grupo al que pertenece
	 * @param duracion duracion de la cancion
	 * @param sonando y si esta sonando o no.
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) /* constructor con 4 parámetros con el que pide titulo grupo duracion de la cancion y si esta sonando*/
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
/**
 * metodo que comprueba el estado de la booleana sonando
 * @return devuelve si el la cancion esta sonando
 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}

	/**
	 * metodo para parar una cancion si esta sonando cambia la boleana a false
	 * @return invierte el valor de la booleana sonando.
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	
	/**
	 * 
	 * @return devuelve el titulo de la cancion
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * 
	 * @param titulo se le da un valor al titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * 
	 * @return devuelve el nombre del grupo
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * 
	 * @param grupo es a quien pertenece una cancion
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	/**
	 * 
	 * @return devuelve la duracion de una cancion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * 
	 * @param duracion da valor a la duracion de una cancion
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * 
	 * @return booleana si es true la cancion esta sonando si es false la cancion no esta sonando
	 */
	public boolean isSonando() {
		return sonando;
	}

	/**
	 * 
	 * @param sonando devulve el booleano de si la cancion esta sonando o no
	 */
	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}

	/**
	 * 
	 * @param cancion compara dos canciones
	 * @return devulve si true si lo es o false si no lo es
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @param canciones compara la duracion de dos canciones
	 * @return devulve el nombre de la cancion mas larga
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}

	/**
	 * 
	 * @param canciones mira el titulo del array de canciones
	 * @param titulo mira en dicho array si el titulo existe
	 * @return titulo. comprueba la posicion de la cancion, comprueba que no sea la ultima, en caso de ser asi
	 * muestra la primera y si no es la ultima te muestra la que esta en la siguiente posicion
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}
/**
 * devuelve la cancion con todos sus atributos como objeto
 */
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}
