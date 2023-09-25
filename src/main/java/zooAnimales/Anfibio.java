package zooAnimales;

import java.util.ArrayList;

import java.util.List;

import gestion.Zona;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new ArrayList<>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		super();
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero, Zona zona) {
		Anfibio Rana = new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
	    ranas++;
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		Anfibio Rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	    ranas++;
	}

	public void crearSalamandra(String nombre, int edad, String genero, Zona zona) {
	    Anfibio Salamandra = new Anfibio(nombre, edad, "selva", genero, zona,"negro y amarillo", false);
	    salamandras++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
	    Anfibio Salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	    salamandras++;
	}
}