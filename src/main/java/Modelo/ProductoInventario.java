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
    
    private Double total;
    
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
	
	public void generarTotal() {
		this.total = precio*unidades;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
    
}