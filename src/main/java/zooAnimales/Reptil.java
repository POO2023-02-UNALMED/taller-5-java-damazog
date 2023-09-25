package zooAnimales;

import java.util.ArrayList;

import java.util.List;

import gestion.Zona;

public class Reptil extends Animal {
	private static List<Reptil> listado = new ArrayList<>();
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		super();
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
		Reptil Iguana = new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
	    iguanas++;
	    
	    return Iguana;
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil Iguana2 = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	    iguanas++;
	    
	    return Iguana2;
	}

	public static Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
	    Reptil Serpiente = new Reptil(nombre, edad, "jungla", genero, zona,"blanco", 1);
	    serpientes++;
	    
	    return Serpiente;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
	    Reptil Serpiente2 = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	    serpientes++;
	    
	    return Serpiente2;
	}
}