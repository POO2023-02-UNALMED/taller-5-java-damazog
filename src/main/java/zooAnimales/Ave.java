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
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave() {
		super();
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
		Ave Halcon = new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
	    halcones++;
	    
	    return Halcon;
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave Halcon2 = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	    halcones++;
	    
	    return Halcon2;
	}


	public static Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
	    Ave Aguila = new Ave(nombre, edad, "montanas", genero, zona,"blanco y amarillo");
	    aguilas++;
	    
	    return Aguila;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
	    Ave Aguila2 = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	    aguilas++;
	    
	    return Aguila2;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}