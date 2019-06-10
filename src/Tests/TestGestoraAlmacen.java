package Tests;

import Gestoras.GestoraAlmacen;

public class TestGestoraAlmacen {

	public static void main(String[] args) {
		GestoraAlmacen ga = new GestoraAlmacen();
		String rutaFichero = ".\\src\\archivos\\Almacen.txt";
		
		ga.listarProductosFabricante(rutaFichero, "AsunApruebame");

	}

}
