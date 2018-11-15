DROP TABLE IF EXISTS Producto;
DROP TABLE IF EXISTS Proveedor;
DROP TABLE IF EXISTS Empleado;
DROP TABLE IF EXISTS Inventario;

CREATE TABLE Proveedor(
 ID_proveedor varchar (30),
 nombre_empresa varchar(30),
 telefono varchar (30),
 Direccion varchar (30),
 Correo varchar (30),
 PRIMARY KEY (ID_proveedor));
 
 CREATE TABLE Producto(
 ID_Producto varchar (30), 
 Nombre varchar (30),
 Marca varchar (30),
 Categoria varchar (20),
 Contenido varchar (20),
 Precio float (20),
 ID_proveedor varchar (30),
 PRIMARY KEY (ID_Producto),
 FOREIGN KEY (ID_proveedor) REFERENCES Proveedor(ID_proveedor));
 
 CREATE TABLE Inventario(
 ID_Producto varchar (30),
 Nombre varchar (30),
 Marca varchar (30),
 Categoria varchar (30),
 Contenido_neto varchar (30),
 Unidades int (15),
 Fecha_vencimiento varchar (20),
 Precio float (15),
 PRIMARY KEY (ID_Producto));
 
 CREATE TABLE Empleado(
 Codigo varchar (30),
 Nombre varchar (70),
 Cedula varchar (30),
 Telefono varchar (30),
 Direccion varchar (27),
 Fecha_nacimiento varchar (10),
 Cargo varchar (30),
 Salario float (15),
 Usuario varchar (12),
 Contraseña varchar (30),
 PRIMARY KEY (Codigo));