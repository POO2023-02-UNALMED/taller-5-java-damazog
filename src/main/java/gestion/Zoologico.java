package gestion;

import java.util.ArrayList;

import java.util.List;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas;
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		zonas = new ArrayList<>();
	}
	
	public Zoologico() {
		zonas = new ArrayList<>();
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
		zona.setZoo(this);
	}
	
	 public int cantidadTotalAnimales() {
		 int cantidadTotal = 0;
	     for (Zona zona : zonas) {
	    	 cantidadTotal += zona.cantidadAnimales(); 
	     }
	        return cantidadTotal;
	}
	 
	 public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public String getUbicacion() {
		 return ubicacion;
	 }

	 public void setUbicacion(String ubicacion) {
		 this.ubicacion = ubicacion;
	 }

	public List<Zona> getZona() {
		return zonas;
	}

	public void setZona(List<Zona> zonas) {
		this.zonas = zonas;
	}
	 
}
