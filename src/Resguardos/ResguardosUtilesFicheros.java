package Resguardos;

public class ResguardosUtilesFicheros {
	/*
	 * M�todo que ordena un fichero seg�n ordenaci�n h�brida
	 * Signatura: public void ordenarFicheroHibrida(String rutaFichero)
	 * Entradas: 
	 * 		- String rutaFichero
	 * Precondiciones: No hay
	 * Salidas: No hay
	 * Postcondiciones: Si el fichero que referencia rutaFichero existe se ordenar�, en 
	 * 					caso contrario se lanzar� una excepci�n FileNotFoundException
	 */
	public void ordenarFicheroHibrida(String rutaFichero)
	{
		System.out.println("El metodo ordenacionFicheroHibrida se encuentra en resguardo");
	}
	
	/*
	 * M�todo que vuelca un fichero en un array
	 * Signatura: public String[] volcarFicheroArray(String rutaFichero)
	 * Entradas: 
	 * 		- String rutaFichero
	 * Precondiciones: No hay
	 * Salidas:
	 * 		- String[] fichero
	 * Postcondiciones: Si el fichero que referencia rutaFichero existe se devolver� 
	 * 					asociado al nombre un array de string con los registros, en 
	 * 					caso contrario se lanzar� una excepci�n FileNotFoundException
	 */
	public String[] volcarFicheroArray(String rutaFichero)
	{
		System.out.println("El metodo volcarFicheroArray se encuentra en resguardo");
		
		return null;
	}
	
	/*
	 * M�todo que ordena un array por burbuja
	 * Signatura: public void ordenacionBurbuja(String[] array)
	 * Entradas/Salidas: String[] array
	 * Precondiciones: No hay
	 * Postcondiciones: Se ordenar� el array, si el array est� vac�o se 
	 * 					quedar� igual 
	 */
	public void ordenacionBurbuja(String[] array)
	{
		System.out.println("El metodo ordenacionBurbuja se encuentra en resguardo");
	}
	
	/*
	 * M�todo que vuelca un array de string en un fichero
	 * Signatura: public void volcarArrayFichero(String rutaFichero)
	 * Entradas:
	 * 		- String[] array;
	 * 		- String rutaFichero;
	 * Precondiciones: No hay
	 * Salidas: No hay
	 * Postcondciones: Si el fichero que referencia rutaFichero existe se volcar� el 
	 * 				   array en el fichero, en caso contrario se lanzar� una 
	 * 				   excepci�n FileNotFoundException
	 */
	public void volcarArrayFichero(String rutaFichero, String[] array)
	{
		System.out.println("El metodo volcarArrayFichero se encuentra en resguardo");
	}
}
