package Modelo;


import java.util.*;

/**
 * 
 */
public class Producto {

    /**
     * Default constructor
     */
    public Producto() {
    }

    /**
     * 
     */
    private String idProducto;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String marca;

    /**
     * 
     */
    private String categoria;

    /**
     * 
     */
    private String contenido;

    /**
     * 
     */
    protected Double precio;

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
    
    

}