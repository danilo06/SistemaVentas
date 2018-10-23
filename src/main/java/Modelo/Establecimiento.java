package Modelo;


import java.util.*;

import connection.*;

/**
 * 
 */
public class Establecimiento {

    /**
     * Default constructor
     */
    public Establecimiento() {
    	nombre = "El Bodegon";
    	direccion = "Calle 6 #12-45";
    	iva =0.19;
    	ConsultaVista baseDatos = new ConsultaVista();
    	productos = baseDatos.consultaInventario();
    	empleados = baseDatos.consultaEmpleados();
    	
    	InsertarTabla = new InsertTable();
    	
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String direccion;

    /**
     * 
     */
    private Double iva;

    /**
     * 
     */
    private ArrayList<ProductoInventario> productos;

    /**
     * 
     */
    private ArrayList<Proveedor> proveedores;

    /**
     * 
     */
    private ArrayList<Empleado> empleados;
    
    
    private InsertTable InsertarTabla;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the iva
	 */
	public Double getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(Double iva) {
		this.iva = iva;
	}

	/**
	 * @return the productos
	 */
	public ArrayList<ProductoInventario> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(ArrayList<ProductoInventario> productos) {
		this.productos = productos;
	}

	/**
	 * @return the proveedores
	 */
	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	/**
	 * @param proveedores the proveedores to set
	 */
	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	/**
	 * @return the empleados
	 */
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
    
	public void agregarProductoInventario(ProductoInventario producto) {
		InsertarTabla.addProductoInventario(producto.getIdProducto(), producto.getNombre(), producto.getMarca(), producto.getCategoria(), producto.getContenido(), producto.getUnidades(), producto.getFechaVencimiento(), producto.getPrecio());
		productos.add(producto);
	}
    
	public int buscarProducto(String idProducto) {
		for (int i=0;i<productos.size();i++) {
			if (productos.get(i).getIdProducto().equals(idProducto)) {
				return 1;
			}
		}
		return 0;
	}
	
	public ProductoInventario traerProducto(String id) {
		ProductoInventario producto = new ProductoInventario();
		for (int i=0;i<productos.size();i++) {
			if (productos.get(i).getIdProducto().equals(id)) {
				producto = productos.get(i);
			}
		}
		return producto;
	}
	
}