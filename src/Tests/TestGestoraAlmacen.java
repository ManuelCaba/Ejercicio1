package Tests;

import Enums.EnumPresentacion;
import Gestoras.GestoraAlmacen;
import Validaciones.Validaciones;
import clases.ProductoImpl;

public class TestGestoraAlmacen {

	public static void main(String[] args) {
		GestoraAlmacen ga = new GestoraAlmacen();
		String fichero = ".\\src\\archivos\\Almacen.txt";
		String ficheroAux = ".\\src\\archivos\\AlmacenAux.txt";
		
		ProductoImpl producto = new ProductoImpl();
		
		//ga.listarProductosFabricante(fichero, "AsunApruebame");
		//ga.listarProductosFabricante(fichero, "Noexiste");
		
		//ga.listarProductosCaducidad(fichero, "14/6/2019");
		//ga.listarProductosCaducidad(fichero, "15/6/2019");
		//ga.listarProductosCaducidad(fichero, "16/6/2019");
		
		//ga.imprimirPrecioTotal(fichero);
		
		//ga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.C);
		//ga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.S);
		//ga.mostrarTotalProductosPresentacion(fichero, EnumPresentacion.G);
		
		//ga.anhadirProducto(producto, fichero);
		
		ga.eliminarProducto("123456", fichero, ficheroAux);
		
		Validaciones v = new Validaciones();
		
		v.leerYValidarProductoImpl();

	}

}
