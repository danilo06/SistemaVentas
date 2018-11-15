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
	 * @param nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return telefono del empleado
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @param telefono del empleado
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * 
	 * @return direccion del empleado
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * 
	 * @param direccion empleado
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
    
}
