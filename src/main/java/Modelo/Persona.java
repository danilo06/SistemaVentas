package Modelo;


import java.util.*;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String telefono;

    /**
     * 
     */
    private String direccion;
	/**
     * 
     * @return nombre
     */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
    
}
