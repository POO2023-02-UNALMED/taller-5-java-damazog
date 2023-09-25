package zooAnimales;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal() {
		totalAnimales++;
	}
	
	public static String totalPorTipo() {
		StringBuilder resultado = new StringBuilder();
		 resultado.append("Mamiferos: ").append(Mamifero.cantidadMamiferos()).append("\n");
	     resultado.append("Aves: ").append(Ave.cantidadAves()).append("\n");
	     resultado.append("Reptiles: ").append(Reptil.cantidadReptiles()).append("\n");
	     resultado.append("Peces: ").append(Pez.cantidadPeces()).append("\n");
	     resultado.append("Anfibios: ").append(Anfibio.cantidadAnfibios()).append("\n");
	     
	     return resultado.toString();
	}
	
	public String movimiento() {
        return "desplazarse";
    }
	
	@Override
	public String toString() {
	    StringBuilder resultado = new StringBuilder();
	    
	    resultado.append("Mi nombre es ").append(nombre).append(", tengo una edad de ").append(edad).append(", habito en ").append(habitat).append(", y mi genero es ").append(genero);

	    if (zona != null) {
	        resultado.append(", la zona en la que me ubico es ").append(zona.getNombre()); //idk if this necessary
	        if (zona.getZoo() != null) {
	            resultado.append(", en el ").append(zona.getZoo().getNombre());
	        }
	    }

	    return resultado.toString();
	}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}	
	
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
}