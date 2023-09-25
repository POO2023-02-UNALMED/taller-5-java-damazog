package gestion;

import java.util.ArrayList;

import java.util.List;

import gestion.Zoologico;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
		animales = new ArrayList<Animal>();
	}
	
	public Zona() {
		animales = new ArrayList<Animal>();
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		animal.setZona(this);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
}