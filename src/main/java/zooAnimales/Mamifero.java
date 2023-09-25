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
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static void crearCaballo(String nombre, int edad, String genero, Zona zona) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
	    caballos++;
	}
	
	public static void crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo2 = new Mamifero(nombre, edad, "pradera", genero, true, 4);
	    caballos++;
	}

	public static void crearLeon(String nombre, int edad, String genero, Zona zona) {
	    Mamifero leon = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
	    leones++;
	}
	
	public static void crearLeon(String nombre, int edad, String genero) {
	    Mamifero leon2 = new Mamifero(nombre, edad, "selva", genero, true, 4);
	    leones++;
	}

}
