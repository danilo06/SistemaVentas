package Modelo;


import java.util.*;

/**
 * 
 */
public class Empleado extends Persona {

    /**
     * Default constructor
     */
    public Empleado() {
    }

    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private String cargo;

    /**
     * 
     */
    private Double salario;

    /**
     * 
     */
    private String contrasena;

    /**
     * 
     */
    private String cedula;

    /**
     * 
     */
    private String fechaNacimiento;

    /**
     * 
     */
    private String usuario;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
    
    
}