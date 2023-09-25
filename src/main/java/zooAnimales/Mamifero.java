package zooAnimales;

import java.util.ArrayList;

import java.util.List;

import gestion.Zona;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<>();
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public Mamifero() {
		super();
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
	    caballos++;
	    
	    return caballo;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo2 = new Mamifero(nombre, edad, "pradera", genero, true, 4);
	    caballos++;
	    
	    return caballo2;
	}

	public static Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
	    Mamifero leon = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
	    leones++;
	    
	    return leon;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
	    Mamifero leon2 = new Mamifero(nombre, edad, "selva", genero, true, 4);
	    leones++;
	    
	    return leon2;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

}
