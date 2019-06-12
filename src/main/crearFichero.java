package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

import Enums.EnumPresentacion;
import Utiles.UtilesFicheros;
import clases.ProductoImpl;

public class crearFichero {

	public static void main(String[] args) {
		
		String rutaFichero = ".\\src\\archivos\\Almacen.txt";
		UtilesFicheros uf = new UtilesFicheros();
		
		ProductoImpl p1 = new ProductoImpl("123456", "LaboratorioManuel", new GregorianCalendar(), 20.0, EnumPresentacion.C, "etiniliestradiol");
		ProductoImpl p2 = new ProductoImpl("765432", "LaboratorioAsun", new GregorianCalendar(), 30.0, EnumPresentacion.G, "alcohol");
		ProductoImpl p3 = new ProductoImpl("475438", "AsunApruebame", new GregorianCalendar(), 12.77, EnumPresentacion.S, "acido sulfurico");
		ProductoImpl p4 = new ProductoImpl("123456", "ManuelRepetido", new GregorianCalendar(), 1.99, EnumPresentacion.C, "tolueno");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(rutaFichero);
			
			fw.write(p1.toString()+"\n");
			fw.write(p2.toString()+"\n");
			fw.write(p3.toString()+"\n");
			fw.write(p4.toString()+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("FICHERO SIN ORDENAR");
		
		System.out.println();
		
		uf.listarFichero(rutaFichero);
		
		uf.ordenarFicheroHibrida(rutaFichero);
		
		System.out.println();
		System.out.println();
		
		System.out.println("FICHERO ORDENADO");
		
		System.out.println();
		
		uf.listarFichero(rutaFichero);
	}

}
