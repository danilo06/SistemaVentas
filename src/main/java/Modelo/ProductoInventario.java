package Modelo;


import java.util.*;

/**
 * 
 */
public class ProductoInventario extends Producto {

    /**
     * Default constructor
     */
    public ProductoInventario() {
    }

    /**
     * 
     */
    private Integer unidades;

    /**
     * 
     */
    private String fechaVencimiento;

	public Integer getUnidades() {
		return unidades;
	}

	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

    
}