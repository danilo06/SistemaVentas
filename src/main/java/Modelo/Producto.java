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
	/**
     	* 
    	 * @return idProducto
    	 */
	public String getIdProducto() {
		return idProducto;
	}
	/**
	 * 
	 * @param idProducto, unico
	 */
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	/**
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre del producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * 
	 * @param marca del producto
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * 
	 * @return categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * 
	 * @param categoria del producto
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * 
	 * @return contenido
	 */
	public String getContenido() {
		return contenido;
	}
	/**
	 * 
	 * @param contenido neto del producto
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	/**
	 * 
	 * @return precio
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * 
	 * @param precio, del producto
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
    
    

}
