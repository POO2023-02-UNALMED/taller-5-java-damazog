package zooAnimales;

import java.util.ArrayList;

import java.util.List;

import gestion.Zona;

public class Pez extends Animal {
	private static List<Pez> listado = new ArrayList<>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez() {
		super();
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon(String nombre, int edad, String genero, Zona zona) {
		Pez Salmon = new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
	    salmones++;
	}
	
	public void crearSalmon(String nombre, int edad, String genero) {
		Pez Salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	    salmones++;
	}

	public void crearBacalao(String nombre, int edad, String genero, Zona zona) {
	    Pez Bacalao = new Pez(nombre, edad, "oceano", genero, zona,"gris", 6);
	    bacalaos++;
	}
	
	public void crearBacalao(String nombre, int edad, String genero) {
	    Pez Bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
	    bacalaos++;
	}
	
}