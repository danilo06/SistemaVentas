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
	private TableView<?> panel3TablaVenta;

	@FXML
	private TableColumn<?, ?> panel3columNombre;

	@FXML
	private TableColumn<?, ?> panel3columIdentificador;

	@FXML
	private TableColumn<?, ?> panel3columContenido;

	@FXML
	private TableColumn<?, ?> panel3columUnd;

	@FXML
	private TableColumn<?, ?> panel3columPrecioCU;

	@FXML
	private TableColumn<?, ?> panel3columTotal;

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
	private TableView<?> panel5tablaProveedores;

	@FXML
	private TableColumn<?, ?> panel5columCP;

	@FXML
	private TableColumn<?, ?> panel5columNombreEmpresa;

	@FXML
	private TableColumn<?, ?> panel5columTelefono;

	@FXML
	private TableColumn<?, ?> panel5columDireccion;

	@FXML
	private TableColumn<?, ?> panel5columCorreo;

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
	private TableView<?> panel6tablaRRHH;

	@FXML
	private TableColumn<?, ?> panel6columCodigoEmpleado;

	@FXML
	private TableColumn<?, ?> panel6columNombre;

	@FXML
	private TableColumn<?, ?> panel6columCargo;

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
	private ComboBox<?> panel6cboxCargo;

	@FXML
	private TextField panel6txtUsuario;

	@FXML
	private TextField panel6txtContrasena;
	
	Establecimiento establecimiento;
	
	ObservableList<ProductoInventario> productosInventario;
	
	@FXML
	void panel1btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void panel1btnInicioAction(ActionEvent event) {
		ConsultaVista consulta = new ConsultaVista();
		Empleado empleado = new Empleado();
		empleado = consulta.autenticar(panel1TxtUsuario.getText(), panel1txtContrasena.getText());
		panel2txtUsuario.setText(empleado.getUsuario());
		panel2txtCargo.setText(empleado.getCargo());
		panelMenu.setLayoutX(0);
	}

	@FXML
	void panel2btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
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
	void panel3btnAgregarAction(ActionEvent event) {

	}

	@FXML
	void panel3btnCerrarAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void panel3btnEliminarAction(ActionEvent event) {

	}

	@FXML
	void panel3btnGenerarFacturaAction(ActionEvent event) {

	}

	@FXML
	void panel3btnPagarAction(ActionEvent event) {

	}

	@FXML
	void panel3imgRegresarAction(MouseEvent event) {
		panelVenta.setLayoutX(2000);
	}

	@FXML
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
	void panel5btnAgregarProveedorAction(ActionEvent event) {

	}

	@FXML
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
	void panel6btnAgregarAction(ActionEvent event) {

	}

	@FXML
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
		this.inicializarTablaInventario();
		
		establecimiento = new Establecimiento();
		for (int i=0;i<establecimiento.getProductos().size();i++) {
			productosInventario.add(establecimiento.getProductos().get(i));
		}
		
	}
	
	private void inicializarTablaInventario() {
		panel4columID.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("idProducto"));
		panel4columNombre.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("nombre"));
		panel4columMarca.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("marca"));
		panel4columCategoria.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("categoria"));
		panel4columContenidoNeto.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("contenido"));
		panel4columCantidadUnd.setCellValueFactory(new PropertyValueFactory<ProductoInventario, Integer>("unidades"));
		panel4columFechaVencimiento.setCellValueFactory(new PropertyValueFactory<ProductoInventario, String>("fechaVencimiento"));
		panel4columPrecioCU.setCellValueFactory(new PropertyValueFactory<ProductoInventario, Double>("precio"));
		productosInventario = FXCollections.observableArrayList();
		panel4tablaInventario.setItems(productosInventario);
	}

}
