package zooAnimales;

import java.util.ArrayList;

import java.util.List;

import gestion.Zona;

public class Ave extends Animal {
	private static List<Ave> listado = new ArrayList<>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero, Zona zona) {
		Ave Halcon = new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
	    halcones++;
	}

	public void crearAguila(String nombre, int edad, String genero, Zona zona) {
	    Ave Aguila = new Ave(nombre, edad, "montanas", genero, zona,"blanco y amarillo");
	    aguilas++;
	}
}