package vista;

import java.net.URL;
import Modelo.*;
import connection.*;

import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.StageStyle;
/**
 * 
 * @author Danilo Beleño, Sebastian Suarez, Jose Buitrago, Andres Barragan
 *
 */
public class Controlador implements Initializable {

	@FXML
	private AnchorPane panelLogin;

	@FXML
	private TextField panel1TxtUsuario;

	@FXML
	private PasswordField panel1txtContrasena;

	@FXML
	private Button panel1btnInicio;

	@FXML
	private Button panel1Cerrar;

	@FXML
	private AnchorPane panelMenu;

	@FXML
	private TextField panel2txtCargo;

	@FXML
	private TextField panel2txtUsuario;

	@FXML
	private ImageView panel2imgVentas;

	@FXML
	private ImageView panel2imgProveedores;

	@FXML
	private ImageView panel2imgInventario;

	@FXML
	private ImageView panel2imgRecursosHumanos;

	@FXML
	private Button panel2btnCerrarSesion;

	@FXML
	private Button panel2btnCerrar;

	@FXML
	private AnchorPane panelVenta;

	@FXML
	private TableView<ProductoInventario> panel3TablaVenta;

	@FXML
	private TableColumn<ProductoInventario, String> panel3columNombre;

	@FXML
	private TableColumn<ProductoInventario, String> panel3columIdentificador;

	@FXML
	private TableColumn<ProductoInventario, String> panel3columContenido;

	@FXML
	private TableColumn<ProductoInventario, Integer> panel3columUnd;

	@FXML
	private TableColumn<ProductoInventario, Double> panel3columPrecioCU;

	@FXML
	private TableColumn<ProductoInventario, Double> panel3columTotal;

	@FXML
	private Button panel3btnCerrar;

	@FXML
	private ImageView panel3imgRegresar;

	@FXML
	private TextField panel3txtTotalTabla;

	@FXML
	private TextField panel3txtAgregarProductoID;

	@FXML
	private TextField panel3txtEliminarProductoID;

	@FXML
	private Button panel3btnAgregar;

	@FXML
	private Button panel3btnEliminar;

	@FXML
	private TextField panel3txtTotalCompra;

	@FXML
	private TextField panel3txtSaldo;

	@FXML
	private TextField panel3txtDineroEntrante;

	@FXML
	private Button panel3btnPagar;

	@FXML
	private Button panel3btnGenerarFactura;

	@FXML
	private TextField panel3txtEstadoCompra;
	
	@FXML
    private Button panel3btnNuevaCompra;

	@FXML
	private AnchorPane panelInventario;

	@FXML
	private Button panel4btnCerrar;

	@FXML
	private ImageView panel4imgRegresar;

	@FXML
	private Button panel4btnAgregarProducto;

	@FXML
	private Button panel4btnEliminarProducto;

	@FXML
	private TableView<ProductoInventario> panel4tablaInventario;

	@FXML
	private TableColumn<ProductoInventario, String> panel4columID;

	@FXML
	private TableColumn<ProductoInventario, String> panel4columNombre;

	@FXML
	private TableColumn<ProductoInventario, String> panel4columMarca;

	@FXML
	private TableColumn<ProductoInventario, String> panel4columCategoria;

	@FXML
	private TableColumn<ProductoInventario, String> panel4columContenidoNeto;

	@FXML
	private TableColumn<ProductoInventario, Integer> panel4columCantidadUnd;

	@FXML
	private TableColumn<ProductoInventario, String> panel4columFechaVencimiento;

	@FXML
	private TableColumn<ProductoInventario, Double> panel4columPrecioCU;

	@FXML
	private TextField panel4txtNombre;

	@FXML
	private TextField panel4txtMarca;

	@FXML
	private TextField panel4txtIdentificador;

	@FXML
	private ComboBox<String> panel4cboxCategoria;

	@FXML
	private TextField panel4txtContenidoNeto;

	@FXML
	private TextField panel4txtCantidad;

	@FXML
	private DatePicker panel4DateFechaVencimiento;

	@FXML
	private TextField panel4txtPrecioUnd;

	@FXML
	private Button panel4btnModificarProducto;

	@FXML
	private TextField panel4txtEstado;

	@FXML
	private AnchorPane panelProveedor;

	@FXML
	private Button panel5btnCerrar;

	@FXML
	private ImageView panel5imgRegresar;

	@FXML
	private TableView<Proveedor> panel5tablaProveedores;

	@FXML
	private TableColumn<Proveedor, String> panel5columCP;

	@FXML
	private TableColumn<Proveedor, String> panel5columNombreEmpresa;

	@FXML
	private TableColumn<Proveedor, String> panel5columTelefono;

	@FXML
	private TableColumn<Proveedor, String> panel5columDireccion;

	@FXML
	private TableColumn<Proveedor, String> panel5columCorreo;

	@FXML
	private TextField panel5txtNombreEmpresa;

	@FXML
	private TextField panel5txtCodigoProveedor;

	@FXML
	private TextField panel5txtTelefono;

	@FXML
	private TextField panel5txtDireccion;

	@FXML
	private TextField panel5txtCorreo;

	@FXML
	private Button panel5btnAgregarProvedor;

	@FXML
	private TextField panel5txtNombreEmpresa2;

	@FXML
	private TextField panel5txtCodigoProveedor2;

	@FXML
	private TextField panel5txtTelefono2;

	@FXML
	private TextField panel5txtDireccion2;

	@FXML
	private TextField panel5txtCorreo2;

	@FXML
	private Button panel5btnModificarProveedor;

	@FXML
	private Button panel5btnEliminarProveedor;

	@FXML
	private TableView<?> panel5tablaProductosProveedor;

	@FXML
	private TableColumn<?, ?> panel5columID;

	@FXML
	private TableColumn<?, ?> panel5columNombre;

	@FXML
	private TableColumn<?, ?> panel5columMarca;

	@FXML
	private TableColumn<?, ?> panel5columCatergoria;

	@FXML
	private TableColumn<?, ?> panel5columContenidoNeto;

	@FXML
	private TableColumn<?, ?> panel5columPrecio;

	@FXML
	private TextField panel5txtNombre;

	@FXML
	private TextField panel5txtMarca;

	@FXML
	private ComboBox<?> panel5cboxProveedor;

	@FXML
	private TextField panel5txtIdentificador;

	@FXML
	private ComboBox<?> panel5cboxCategoria;

	@FXML
	private TextField panel5txtContenidoNeto;

	@FXML
	private TextField panel5txtPrecio;

	@FXML
	private Button panel5btnAgregaProductoProveedor;

	@FXML
	private TextField panel5txtNombre2;

	@FXML
	private TextField panel5txtMarca2;

	@FXML
	private ComboBox<?> panel5cboxProveedor2;

	@FXML
	private TextField panel5txtIdentificador2;

	@FXML
	private ComboBox<?> panel5cboxCategoria2;

	@FXML
	private TextField panel5txtContenidoNeto2;

	@FXML
	private TextField panel5txtPrecio2;

	@FXML
	private Button panel5btnModificarProductoProveedor;

	@FXML
	private TextField panel5txtCodigoProducto;

	@FXML
	private Button panel5btnEliminarProducto;

	@FXML
	private AnchorPane panelRecursosHumanos;

	@FXML
	private Button panel6btnCerrar;

	@FXML
	private ImageView panel6imgRegresar;

	@FXML
	private TableView<Empleado> panel6tablaRRHH;

	@FXML
	private TableColumn<Empleado, String> panel6columCodigoEmpleado;

	@FXML
	private TableColumn<Empleado, String> panel6columNombre;

	@FXML
	private TableColumn<Empleado, String> panel6columCargo;

	@FXML
	private DatePicker panel6DateFechaNacimiento;

	@FXML
	private TextField panel6txtDireccion;

	@FXML
	private TextField panel6txtCedula;

	@FXML
	private TextField panel6txtTelefono;

	@FXML
	private TextField panel6txtNombre;

	@FXML
	private TextField panel6txtCodigoEmpleado;

	@FXML
	private TextField panel6txtSalario;

	@FXML
	private Button panel6btnAgregar;

	@FXML
	private Button panel6btnModificar;

	@FXML
	private Button panel6btnEliminar;

	@FXML
	private ComboBox<String> panel6cboxCargo;
	
	

	@FXML
	private TextField panel6txtUsuario;

	@FXML
	private TextField panel6txtContrasena;

	Establecimiento establecimiento;

	ObservableList<ProductoInventario> productosInventario;
	ObservableList<Empleado> empleados;
	ObservableList<Proveedor> proveedores;
	ObservableList<ProductoInventario> productosVenta;

	@FXML
	void panel1btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	/**
	 * Creacion dek metodo panel1btnInicioAction
	 * @param event, para verificar los usuarion que ingresan al sistema, si se encuentran registrados o no.
	 */
	void panel1btnInicioAction(ActionEvent event) {
		if (ConsultaVista.autenticarEmpleado(panel1TxtUsuario.getText(), panel1txtContrasena.getText())) {
			Empleado empleado = new Empleado();
			empleado = ConsultaVista.consultarEmpleado(panel1TxtUsuario.getText(), panel1txtContrasena.getText());
			panel2txtUsuario.setText(empleado.getUsuario());
			panel2txtCargo.setText(empleado.getCargo());
			switch (empleado.getCargo()) {
			case "Administrador":
				panel2imgRecursosHumanos.setLayoutX(938);
				panel2imgProveedores.setLayoutX(950);
				panel2imgInventario.setLayoutX(505);
				break;
			case "Cajero":
				panel2imgRecursosHumanos.setLayoutX(2000);
				panel2imgProveedores.setLayoutX(2000);
				panel2imgInventario.setLayoutX(2000);
				break;
			default:
				System.exit(0);
				break;
			}
			panelMenu.setLayoutX(0);
		}else {
			System.out.println("Empleado no encontrado");
			Alert dialogoAlerta = new Alert(AlertType.ERROR);
			dialogoAlerta.setTitle("!ERROR!");
			dialogoAlerta.setHeaderText("¡ERROR! LogIn");
			dialogoAlerta.setContentText("ha ingresado el usuario y/o contraseña erroenos, intente nuevamente");
			dialogoAlerta.initStyle(StageStyle.UTILITY);
			java.awt.Toolkit.getDefaultToolkit().beep();
			dialogoAlerta.showAndWait();
			
		}
		
	}

	@FXML
	/**
	 * Creacion del metodo Cerrar
	 * @param event, permite cerrar la ventana, en donde actualmete se trabaja, este metodo sirve para cada 
	 * uno de los paneles hechos en la aplicacion
	 */
	void panel2btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	/**
	 * Creacion del metodo panel2btnCerrarSesionAction
	 * @param event, permite cerrar sesion en la aplicacion
	 */
	void panel2btnCerrarSesionAction(ActionEvent event) {
		panelMenu.setLayoutX(2000);
		panel1TxtUsuario.clear();
		panel1txtContrasena.clear();
	}

	@FXML
	void panel2imgInventarioAction(MouseEvent event) {
		panelInventario.setLayoutX(0);
	}

	@FXML
	void panel2imgProveedoresAction(MouseEvent event) {
		panelProveedor.setLayoutX(0);
	}

	@FXML
	void panel2imgRecursosHumanosAction(MouseEvent event) {
		panelRecursosHumanos.setLayoutX(0);
	}

	@FXML
	void panel2imgVentasAction(MouseEvent event) {
		panelVenta.setLayoutX(0);
	}

	@FXML
	/**
	 * Creacion del metodo panel3btnAgregarAction
	 * @param event, permite gestionar un producto al establecimiento en el cual esta operando la palicacion
	 */
	void panel3btnAgregarAction(ActionEvent event) {
		int valor = establecimiento.buscarProducto(panel3txtAgregarProductoID.getText());
		int total = 0;
		if (valor == 1) {
			ProductoInventario producto = establecimiento.traerProducto(panel3txtAgregarProductoID.getText());
			productosVenta.add(producto);
			producto.generarTotal();
			panel3btnPagar.setDisable(false);
			panel3btnEliminar.setDisable(false);
			panel3btnNuevaCompra.setDisable(false);
			System.out.println("Proucto encontrado");


		} else {
			System.out.println("Proucto no encontrado");
			panel3txtEstadoCompra.setText("Proucto no encontrado");
		}
		for (int i = 0; i < productosVenta.size(); i++) {
			total += productosVenta.get(i).getPrecio();
		}
		panel3txtTotalTabla.setText(String.valueOf(total));
		panel3txtTotalCompra.setText(String.valueOf(total));
		panel3txtEstadoCompra.setText("");
	}

	@FXML
	void panel3btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}
	
	@FXML
	/**
	 * Creacion del metodo panel3btnNuevaCompraAction
	 * @param event, permite limpiar la pantalla, y digitalizar una nueva compra
	 */
    void panel3btnNuevaCompraAction(ActionEvent event) {
		productosVenta.clear();
		panel3txtTotalTabla.setText("0");
		panel3txtTotalCompra.setText("0");
		panel3txtDineroEntrante.setText("");
		panel3txtSaldo.setText("0");
		panel3txtAgregarProductoID.setText("");
		panel3txtEliminarProductoID.setText("");
		panel3txtEstadoCompra.setText("");
		
		
	}

	@FXML
	void panel3btnEliminarAction(ActionEvent event) {

	}

	@FXML
	void panel3btnGenerarFacturaAction(ActionEvent event) {

	}

	@FXML
	/**
	 * Creacion del metodo panel3btnPagarAction
	 * @param event, muestra el estado final de la compra, para realizar el respectivo pago
	 */
	void panel3btnPagarAction(ActionEvent event) {
		Double Saldo = (Double.parseDouble(panel3txtDineroEntrante.getText()))
				- (Double.parseDouble(panel3txtTotalCompra.getText()));
		panel3txtSaldo.setText(String.valueOf(Saldo));
		if (Saldo < 0) {
			panel3txtEstadoCompra.setText("Saldo Insuficiente,compra no valida");
		} else {
			panel3txtEstadoCompra.setText("Compra Realizada");
		}
	}

	@FXML
	void panel3imgRegresarAction(MouseEvent event) {
		panelVenta.setLayoutX(2000);
	}

	@FXML
	/**
	 * Creacion del metodo panel4btnAgregarProductoAction
	 * @param event, permite agregar un producto al inventario del establecimiento
	 */
	void panel4btnAgregarProductoAction(ActionEvent event) {
		ProductoInventario producto = new ProductoInventario();
		producto.setNombre(panel4txtNombre.getText());
		producto.setMarca(panel4txtMarca.getText());
		producto.setIdProducto(panel4txtIdentificador.getText());
		producto.setCategoria(panel4cboxCategoria.getValue());
		producto.setContenido(panel4txtContenidoNeto.getText());
		producto.setUnidades(Integer.parseInt(panel4txtCantidad.getText()));
		producto.setFechaVencimiento(panel4DateFechaVencimiento.getValue().toString());
		producto.setPrecio(Double.valueOf(panel4txtPrecioUnd.getText()));
		productosInventario.add(producto);
		establecimiento.agregarProductoInventario(producto);
	}

	@FXML
	/**
	 * Creacion del metodo Cerrar
	 * @param event, permite cerrar la ventana, en donde actualmete se trabaja, este metodo sirve para cada 
	 * uno de los paneles hechos en la aplicacion
	 */
	void panel4btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void panel4btnEliminarProductoAction(ActionEvent event) {

	}

	@FXML
	void panel4btnModificarProductoAction(ActionEvent event) {

	}

	@FXML
	void panel4imgRegresarAction(MouseEvent event) {
		panelInventario.setLayoutX(2000);
	}

	@FXML
	void panel5btnAgregarProductoProveedorAction(ActionEvent event) {

	}

	@FXML
	/**
	 * Creacion del metodo panel5btnAgregarProveedorAction
	 * @param event, permite agregar un proveedor con el cual el establecimiento podra trabajar
	 */
	void panel5btnAgregarProveedorAction(ActionEvent event) {
		Proveedor proveedor = new Proveedor();
		proveedor.setIdProveedor(panel5txtCodigoProveedor.getText());
		proveedor.setTelefono(panel5txtTelefono.getText());
		proveedor.setDireccion(panel5txtDireccion.getText());
		proveedor.setCorreo(panel5txtCorreo.getText());
		proveedor.setNombre(panel5txtNombreEmpresa.getText());
		System.out.println("-----------------------");
		System.out.println(proveedor.getIdProveedor());
		System.out.println("-----------------------");
		System.out.println(panel5txtCodigoProveedor.getText());
		System.out.println("-----------------------");
		if(ConsultaVista.autenticarProveedor(panel5txtCodigoProveedor.getText())) {
		proveedores.add(proveedor);
		establecimiento.agregarProveedor(proveedor);
		}
		else
		{
			System.out.println("proveedor repetido!");
			Alert dialogoAlerta = new Alert(AlertType.ERROR);
			dialogoAlerta.setTitle("!ERROR!");
			dialogoAlerta.setHeaderText("¡ERROR! Aregar Proveedor");
			dialogoAlerta.setContentText("ha ingresado un proveedor existente, por favor revise e intente de nuevo");
			dialogoAlerta.initStyle(StageStyle.UTILITY);
			java.awt.Toolkit.getDefaultToolkit().beep();
			dialogoAlerta.showAndWait();
		}
		//Aun falta que se agregue el codigo del proveedor al elemento.
	}

	@FXML
	/**
	 * Creacion del metodo Cerrar
	 * @param event, permite cerrar la ventana, en donde actualmete se trabaja, este metodo sirve para cada 
	 * uno de los paneles hechos en la aplicacion
	 */
	void panel5btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void panel5btnEliminarProductoAction(ActionEvent event) {

	}

	@FXML
	void panel5btnEliminarProveedorAction(ActionEvent event) {

	}

	@FXML
	void panel5btnModificarProductoProveedorAction(ActionEvent event) {

	}

	@FXML
	void panel5btnModificarProveedorAction(ActionEvent event) {

	}

	@FXML
	void panel5imgRegresarAction(MouseEvent event) {
		panelProveedor.setLayoutX(2000);
	}

	@FXML
	/**
	 * Creacion del metodo panel6btnAgregarAction
	 * @param event, permite agregar un nuevo empleado al sistema, siendo un nuevo cajero o administrador
	 */
	void panel6btnAgregarAction(ActionEvent event) {
		Empleado persona = new Empleado();
		persona.setFechaNacimiento(panel6DateFechaNacimiento.getValue().toString());
		persona.setDireccion(panel6txtDireccion.getText());
		persona.setCedula(panel6txtCedula.getText());
		persona.setTelefono(panel6txtTelefono.getText());
		persona.setNombre(panel6txtNombre.getText());
		persona.setCodigo(panel6txtCodigoEmpleado.getText());
		persona.setSalario(Double.valueOf(panel6txtSalario.getText()));
		persona.setCargo(panel6cboxCargo.getValue().toString());
		persona.setUsuario(panel6txtUsuario.getText());
		persona.setContrasena(panel6txtContrasena.getText());
		empleados.add(persona);
		
		//Falta subir la informacion a la Base de datos.
	}

	@FXML
	/**
	 * Creacion del metodo Cerrar
	 * @param event, permite cerrar la ventana, en donde actualmete se trabaja, este metodo sirve para cada 
	 * uno de los paneles hechos en la aplicacion
	 */
	void panel6btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void panel6btnEliminarAction(ActionEvent event) {

	}

	@FXML
	void panel6btnModificarAction(ActionEvent event) {

	}

	@FXML
	void panel6imgRegresarAction(MouseEvent event) {
		panelRecursosHumanos.setLayoutX(2000);
	}
	/**
	 * En este metodo se inicializan todos los componentes que hacen parte de cada uno de los paneles
	 * para poder trabajar en ellos
	 */
	public void initialize(URL location, ResourceBundle resources) {
		panelMenu.setLayoutX(2000);
		panelVenta.setLayoutX(2000);
		panelProveedor.setLayoutX(2000);
		panelInventario.setLayoutX(2000);
		panelRecursosHumanos.setLayoutX(2000);
		panel4cboxCategoria.getItems().add("Grano");
		panel4cboxCategoria.getItems().add("Fritura");
		panel4cboxCategoria.getItems().add("Higiene");
		panel4cboxCategoria.getItems().add("Bebida");
		panel4cboxCategoria.getItems().add("Alimentos");
		panel4cboxCategoria.getItems().add("Cereal");
		panel4cboxCategoria.getItems().add("Salsas");
		panel4cboxCategoria.getItems().add("Lacteos");
		panel4cboxCategoria.getItems().add("Verdura");
		panel4cboxCategoria.getItems().add("Fruta");
		panel4cboxCategoria.getItems().add("Verdura");

		panel3txtTotalTabla.setText("0");
		panel3txtTotalCompra.setText("0");
		panel3txtSaldo.setText("0");
		panel3txtDineroEntrante.setText("0");

		panel3btnPagar.setDisable(true);
		panel3btnEliminar.setDisable(true);
		panel3btnGenerarFactura.setDisable(true);
		panel3btnNuevaCompra.setDisable(true);
		
		panel6cboxCargo.getItems().add("Administrador");
		panel6cboxCargo.getItems().add("Cajero");

		this.inicializarTablaInventario();
		this.inicializarTablaVenta();
		this.inicializarTablaRecursosHumanos();
		this.inicializarTablaProveedores();
		establecimiento = new Establecimiento();
		/*
		for (int i = 0; i < establecimiento.getProductos().size(); i++) {
			productosInventario.add(establecimiento.getProductos().get(i));
		}
		for (int i = 0; i < establecimiento.getEmpleados().size(); i++) {
			empleados.add(establecimiento.getEmpleados().get(i));
		}
		for (int i = 0; i < establecimiento.getProveedores().size(); i++) {
			proveedores.add(establecimiento.getProveedores().get(i));
		}
		*/
	}
	/**
	 * Creacion del metodo inicializarTablaVenta
	 * inicializa la tablaVenta para poder visualizar en ella los campos que se llenaron de las ventas anteriores
	 */
	private void inicializarTablaVenta() {
		panel3columNombre.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("nombre"));
		panel3columIdentificador
				.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("idProducto"));
		panel3columContenido.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("contenido"));
		panel3columUnd.setCellValueFactory(new PropertyValueFactory<ProductoInventario, Integer>("unidades"));
		panel3columPrecioCU.setCellValueFactory(new PropertyValueFactory<ProductoInventario, Double>("precio"));
		panel3columTotal.setCellValueFactory(new PropertyValueFactory<ProductoInventario, Double>("total"));
		productosVenta = FXCollections.observableArrayList();
		panel3TablaVenta.setItems(productosVenta);
	}
	/**
	 * Creacion del metodo inicializarTablaInventario
	 * inicializa la TablaInventario para poder visualizar en ella los productos 
	 * que actualmente contiene el establecimiento
	 */
	private void inicializarTablaInventario() {
		panel4columID.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("idProducto"));
		panel4columNombre.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("nombre"));
		panel4columMarca.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("marca"));
		panel4columCategoria.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("categoria"));
		panel4columContenidoNeto.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("contenido"));
		panel4columCantidadUnd.setCellValueFactory(new PropertyValueFactory<ProductoInventario, Integer>("unidades"));
		panel4columFechaVencimiento
				.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("fechaVencimiento"));
		panel4columPrecioCU.setCellValueFactory(new PropertyValueFactory<ProductoInventario, Double>("precio"));
		productosInventario = FXCollections.observableArrayList();
		panel4tablaInventario.setItems(productosInventario);
	}
	/**
	 * Creacion del metodo inicializarTablaRecursosHumanos
	 * inicializa la TablaRecursosHumanos para poder visualizar los empleados que posteriormente se registraron
	 * en el sistema para que futuramente puedan laborar en la aplicacion
	 */
	private void inicializarTablaRecursosHumanos() {
		panel6columCodigoEmpleado.setCellValueFactory(new PropertyValueFactory<Empleado, String>("codigo"));
		panel6columNombre.setCellValueFactory(new PropertyValueFactory<Empleado, String>("nombre"));
		panel6columCargo.setCellValueFactory(new PropertyValueFactory<Empleado, String>("cargo"));
		empleados = FXCollections.observableArrayList();
		panel6tablaRRHH.setItems(empleados);
	}
	/**
	 * Creacion del metodo inicializarTablaProveedores
	 * inicializa la TablaProveedores para poder evidenciar los proveedores con los cuales trabaja el establecimiento/sucursal
	 * 
	 */
	private void inicializarTablaProveedores() {
		panel5columCP.setCellValueFactory(new PropertyValueFactory<Proveedor, String>("idProveedor"));
		panel5columNombreEmpresa.setCellValueFactory(new PropertyValueFactory<Proveedor, String>("nombre"));
		panel5columTelefono.setCellValueFactory(new PropertyValueFactory<Proveedor, String>("telefono"));
		panel5columDireccion.setCellValueFactory(new PropertyValueFactory<Proveedor, String>("direccion"));
		panel5columCorreo.setCellValueFactory(new PropertyValueFactory<Proveedor, String>("correo"));
		proveedores = FXCollections.observableArrayList();
		panel5tablaProveedores.setItems(proveedores);
	}

}
