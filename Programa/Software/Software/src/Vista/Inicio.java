package Vista;

import Modelo.Clientes;
import Modelo.Producto;
import Modelo.DatosTablas;
import Modelo.Empleados;
import Modelo.Proveedores;
import Modelo.UsuarioBD;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import swing.Panel_Round_JWC;

public class Inicio extends javax.swing.JFrame {

int LayoutX;
int LayoutY;


Producto Pro = new Producto();
Clientes Cli = new Clientes();
UsuarioBD UserBD = new UsuarioBD();
Empleados Emp = new Empleados();
DatosTablas ProBD = new DatosTablas();
Proveedores Prove = new Proveedores();
DefaultTableModel modelo = new DefaultTableModel();



    public Inicio() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        OcultarTablas();
        
    }
    

    public void hide(Panel_Round_JWC... panel){
        
        for(int i=0; i<panel.length;i++){
            panel[i].setVisible(false);
        }
        
    }
    
    public void OcultarTablas(){
        
        ScrollClientes.setEnabled(false);
        ScrollClientes.setVisible(false);
        
        Tabla_Empleados.setEnabled(false);
        Tabla_Empleados.setVisible(false);
        
        ScrollProductos.setEnabled(false);
        ScrollProductos.setVisible(false);
        
        ScrollProveedores.setEnabled(false);
        ScrollProveedores.setVisible(false);
        
        ScrollVentas.setEnabled(false);
        ScrollVentas.setVisible(false);
        
    }
    
    
    public void ListarProductos() {
        List<Producto> ListarPro =  ProBD.ListarProductos();
        modelo = (DefaultTableModel) Tabla_Productos.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPro.size(); i++) {
            ob[0] = ListarPro.get(i).getCodigo();
            ob[1] = ListarPro.get(i).getDescripcion();
            ob[2] = ListarPro.get(i).getPrecio();
            ob[3] = ListarPro.get(i).getStock();
            ob[4] = ListarPro.get(i).getPrecioCompra();
            ob[5] = ListarPro.get(i).getUbicacion();

            
            modelo.addRow(ob);
        }
        Tabla_Productos.setModel(modelo);
    }
    
    public void ListarClientes(){
        List<Clientes> ListarCli =  ProBD.ListarClientes();
        modelo = (DefaultTableModel) Tabla_Clientes.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < ListarCli.size(); i++) {
            ob[0] = ListarCli.get(i).getID();
            ob[1] = ListarCli.get(i).getNombre();
            ob[2] = ListarCli.get(i).getTelefono();
            ob[3] = ListarCli.get(i).getCorreo();
            ob[4] = ListarCli.get(i).getDireccion();
            modelo.addRow(ob);
        }
        Tabla_Clientes.setModel(modelo);
        
    }
    
    public void ListarEmpleados(){
        List<Empleados> ListarEmp =  ProBD.ListarEmpleado();
        modelo = (DefaultTableModel) Tabla_Empleado_Con.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < ListarEmp.size(); i++) {
            ob[0] = ListarEmp.get(i).getCod_usuario();
            ob[1] = ListarEmp.get(i).getNombre();
            ob[2] = ListarEmp.get(i).getTelefono();
            ob[3] = ListarEmp.get(i).getDireccion();
            ob[4] = ListarEmp.get(i).getCorreo();
            ob[5] = ListarEmp.get(i).getLogin();
            ob[6] = ListarEmp.get(i).getPassword();
            
            modelo.addRow(ob);
        }
        Tabla_Empleado_Con.setModel(modelo);
        
    }
    
    public void ListarProveedores(){
        List<Proveedores> ListarProve =  ProBD.ListarProveedores();
        modelo = (DefaultTableModel) Tabla_Proveedores.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < ListarProve.size(); i++) {
            ob[0] = ListarProve.get(i).getID();
            ob[1] = ListarProve.get(i).getNombre();
            ob[2] = ListarProve.get(i).getTelefono();
            ob[3] = ListarProve.get(i).getDireccion();
            ob[4] = ListarProve.get(i).getCorreo();
            
            modelo.addRow(ob);
        }
        Tabla_Proveedores.setModel(modelo);
        
    }
    
    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
            
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Round_JWC1 = new swing.Panel_Round_JWC();
        Panel_Ventanas = new swing.Panel_Round_JWC();
        Boton_Almacen = new swing.Btn_Round_JWC();
        Boton_Ventas = new swing.Btn_Round_JWC();
        Boton_Acceso = new swing.Btn_Round_JWC();
        Boton_AcercaDe = new swing.Btn_Round_JWC();
        img_Round_JWC1 = new swing.Img_Round_JWC();
        jLabel3 = new javax.swing.JLabel();
        CerrarSesion = new swing.Btn_Round_JWC();
        Paneles_Categorias = new swing.Panel_Round_JWC();
        Panel_Principal = new swing.Panel_Round_JWC();
        img_Autosize_JWC1 = new swing.Img_Autosize_JWC();
        Panel_Almacen = new swing.Panel_Round_JWC();
        jLabel7 = new javax.swing.JLabel();
        Panel_Ventas = new swing.Panel_Round_JWC();
        jLabel67 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcionVenta = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        ScrollVentas = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        Boton_Acceder = new swing.Btn_Round_JWC();
        Panel_Configuracion = new swing.Panel_Round_JWC();
        Btn_AjustesGlobales = new swing.Btn_Round_JWC();
        Btn_Usuarios = new swing.Btn_Round_JWC();
        Btn_Productos = new swing.Btn_Round_JWC();
        Btn_Tickets = new swing.Btn_Round_JWC();
        Btn_Clientes = new swing.Btn_Round_JWC();
        Btn_Proveedores = new swing.Btn_Round_JWC();
        Panel_Acceso = new swing.Panel_Round_JWC();
        jLabel10 = new javax.swing.JLabel();
        Panel_Conf_Sistema = new swing.Panel_Round_JWC();
        panel_Round_JWC2 = new swing.Panel_Round_JWC();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Localidad_Sistema = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Telefono_Sistema = new javax.swing.JTextField();
        Empresa_Sistema = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        img_Round_JWC2 = new swing.Img_Round_JWC();
        Subir_Imagen = new swing.Btn_Round_JWC();
        Salir1 = new swing.Btn_Round_JWC();
        Subir_Imagen1 = new swing.Btn_Round_JWC();
        Panel_Con_Clientes = new swing.Panel_Round_JWC();
        panel_Round_JWC3 = new swing.Panel_Round_JWC();
        jLabel14 = new javax.swing.JLabel();
        Nuevo_Cliente = new swing.Btn_Round_JWC();
        ScrollClientes = new javax.swing.JScrollPane();
        Tabla_Clientes = new javax.swing.JTable();
        Eliminar_Cliente = new swing.Btn_Round_JWC();
        Agregar_Clientes = new swing.Panel_Round_JWC();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtNombre_Cliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtTelefono_Cliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCorreo_Cliente = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txtDireccion_Cliente = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_Round_JWC5 = new swing.Panel_Round_JWC();
        Boton_Guardar_Clientes = new swing.Btn_Round_JWC();
        jLabel23 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        txtCodigo_Clientes = new javax.swing.JTextField();
        Panel_Con_Productos = new swing.Panel_Round_JWC();
        panel_Round_JWC6 = new swing.Panel_Round_JWC();
        jLabel26 = new javax.swing.JLabel();
        Nuevo_Producto = new swing.Btn_Round_JWC();
        ScrollProductos = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        Eliminar_Productos = new swing.Btn_Round_JWC();
        Agregar_Productos = new swing.Panel_Round_JWC();
        jLabel32 = new javax.swing.JLabel();
        panel_Round_JWC8 = new swing.Panel_Round_JWC();
        txtGuardar_Productos = new swing.Btn_Round_JWC();
        jSeparator7 = new javax.swing.JSeparator();
        Pro_Stock = new javax.swing.JTextField();
        Pro_Precio = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Pro_PreCompra = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Descripcion_Pro = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        Pro_Cod = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        Ubicacion = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Delete_Producto = new swing.Panel_Round_JWC();
        panel_Round_JWC9 = new swing.Panel_Round_JWC();
        Eliminar_Cliente_Boton = new swing.Btn_Round_JWC();
        jLabel12 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        TxtCodigo_Producto = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Panel_Con_Empleados = new swing.Panel_Round_JWC();
        panel_Round_JWC10 = new swing.Panel_Round_JWC();
        jLabel22 = new javax.swing.JLabel();
        Nuevo_Empleado = new swing.Btn_Round_JWC();
        Tabla_Empleados = new javax.swing.JScrollPane();
        Tabla_Empleado_Con = new javax.swing.JTable();
        Eliminar_Empleado = new swing.Btn_Round_JWC();
        Delete_Clientes = new swing.Panel_Round_JWC();
        panel_Round_JWC11 = new swing.Panel_Round_JWC();
        Eliminar_Productos_Boton1 = new swing.Btn_Round_JWC();
        jLabel13 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        TxtCodigo_Cliente = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Panel_Con_Proveedores = new swing.Panel_Round_JWC();
        panel_Round_JWC12 = new swing.Panel_Round_JWC();
        jLabel36 = new javax.swing.JLabel();
        Nuevo_Proveedor = new swing.Btn_Round_JWC();
        ScrollProveedores = new javax.swing.JScrollPane();
        Tabla_Proveedores = new javax.swing.JTable();
        Eliminar_Proveedor = new swing.Btn_Round_JWC();
        Agregar_Empleado = new swing.Panel_Round_JWC();
        panel_Round_JWC13 = new swing.Panel_Round_JWC();
        btnGuardarEmpleado = new swing.Btn_Round_JWC();
        jSeparator12 = new javax.swing.JSeparator();
        txtDireccionEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        txtIDEmpleado = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        txtCorreoEmpleado = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtContraseñaEmpleado = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        txtLoginEmpleado = new javax.swing.JTextField();
        Delete_Empleado = new swing.Panel_Round_JWC();
        panel_Round_JWC14 = new swing.Panel_Round_JWC();
        Eliminar_Productos_Boton2 = new swing.Btn_Round_JWC();
        jLabel25 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        TxtCodigo_Empleado = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Delete_Proveedores = new swing.Panel_Round_JWC();
        panel_Round_JWC15 = new swing.Panel_Round_JWC();
        Btn_EliminarProveedor = new swing.Btn_Round_JWC();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        TxtCodigo_Proveedor = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        Agregar_Proveedor = new swing.Panel_Round_JWC();
        panel_Round_JWC16 = new swing.Panel_Round_JWC();
        btnGuardarProveedor = new swing.Btn_Round_JWC();
        jSeparator23 = new javax.swing.JSeparator();
        txtDireccionProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        txtIDProveedor = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        txtCorreoProveedor = new javax.swing.JTextField();
        Minimizar = new swing.Btn_Round_JWC();
        Salir = new swing.Btn_Round_JWC();
        Pestaña_Reportes = new btn_borde_01_jwc.Btn_Borde01_JWC();
        Pestaña_Ventas = new btn_borde_01_jwc.Btn_Borde01_JWC();
        Pestaña_Configuracion = new btn_borde_01_jwc.Btn_Borde01_JWC();
        panel_Round_JWC4 = new swing.Panel_Round_JWC();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC1.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC1.setEsqInferiorDerecha(40);
        panel_Round_JWC1.setEsqInferiorIzquierda(40);
        panel_Round_JWC1.setEsqSuperiorDerecha(40);
        panel_Round_JWC1.setEsqSuperiorIzquierda(40);
        panel_Round_JWC1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_Round_JWC1MouseDragged(evt);
            }
        });
        panel_Round_JWC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Ventanas.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Ventanas.setEsqInferiorDerecha(30);
        Panel_Ventanas.setEsqInferiorIzquierda(30);
        Panel_Ventanas.setEsqSuperiorDerecha(30);
        Panel_Ventanas.setEsqSuperiorIzquierda(30);
        Panel_Ventanas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Almacen.setBackground(new java.awt.Color(43, 43, 43));
        Boton_Almacen.setForeground(new java.awt.Color(153, 153, 153));
        Boton_Almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/box-solid-24 (1).png"))); // NOI18N
        Boton_Almacen.setText("     Almacen");
        Boton_Almacen.setArco_esquina(15);
        Boton_Almacen.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_Almacen.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_Almacen.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_Almacen.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AlmacenActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(Boton_Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 50));

        Boton_Ventas.setBackground(new java.awt.Color(43, 43, 43));
        Boton_Ventas.setForeground(new java.awt.Color(153, 153, 153));
        Boton_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/cart-solid-24 (1).png"))); // NOI18N
        Boton_Ventas.setText("       Ventas");
        Boton_Ventas.setArco_esquina(15);
        Boton_Ventas.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_Ventas.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_Ventas.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_Ventas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_VentasActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(Boton_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 170, 50));

        Boton_Acceso.setBackground(new java.awt.Color(43, 43, 43));
        Boton_Acceso.setForeground(new java.awt.Color(153, 153, 153));
        Boton_Acceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/folder-open-solid-24 (1).png"))); // NOI18N
        Boton_Acceso.setText("       Acceso");
        Boton_Acceso.setArco_esquina(15);
        Boton_Acceso.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_Acceso.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_Acceso.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_Acceso.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Acceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AccesoActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(Boton_Acceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 170, 50));

        Boton_AcercaDe.setBackground(new java.awt.Color(43, 43, 43));
        Boton_AcercaDe.setForeground(new java.awt.Color(153, 153, 153));
        Boton_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/comment-error-solid-24.png"))); // NOI18N
        Boton_AcercaDe.setText("    Acerca de");
        Boton_AcercaDe.setArco_esquina(15);
        Boton_AcercaDe.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_AcercaDe.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_AcercaDe.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_AcercaDe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Panel_Ventanas.add(Boton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 170, 50));

        img_Round_JWC1.setForeground(new java.awt.Color(255, 204, 153));
        img_Round_JWC1.setGrosor_Borde(3);
        img_Round_JWC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pexels-jerald-pacheco-famoleras-1837461.jpg"))); // NOI18N
        Panel_Ventanas.add(img_Round_JWC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 150));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Punto de venta");
        Panel_Ventanas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        CerrarSesion.setBackground(new java.awt.Color(102, 102, 102));
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cambiar de Cuenta");
        CerrarSesion.setArco_esquina(15);
        CerrarSesion.setColor_Hover(new java.awt.Color(153, 153, 153));
        CerrarSesion.setColor_Normal(new java.awt.Color(102, 102, 102));
        CerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 170, 40));

        panel_Round_JWC1.add(Panel_Ventanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 190, 750));

        Paneles_Categorias.setBackground(new java.awt.Color(43, 43, 43));
        Paneles_Categorias.setEsqInferiorDerecha(30);
        Paneles_Categorias.setEsqInferiorIzquierda(30);
        Paneles_Categorias.setEsqSuperiorDerecha(30);
        Paneles_Categorias.setEsqSuperiorIzquierda(30);
        Paneles_Categorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Principal.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Principal.setEsqInferiorDerecha(30);
        Panel_Principal.setEsqInferiorIzquierda(30);
        Panel_Principal.setEsqSuperiorDerecha(30);
        Panel_Principal.setEsqSuperiorIzquierda(30);
        Panel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_Autosize_JWC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pexels-mnz-1598505.jpg"))); // NOI18N
        Panel_Principal.add(img_Autosize_JWC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 940, 690));

        Paneles_Categorias.add(Panel_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Almacen.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Almacen.setEsqInferiorDerecha(30);
        Panel_Almacen.setEsqInferiorIzquierda(30);
        Panel_Almacen.setEsqSuperiorDerecha(30);
        Panel_Almacen.setEsqSuperiorIzquierda(30);
        Panel_Almacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Interfaz: Almacen");
        Panel_Almacen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        Paneles_Categorias.add(Panel_Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Ventas.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Ventas.setForeground(new java.awt.Color(153, 153, 153));
        Panel_Ventas.setEsqInferiorDerecha(30);
        Panel_Ventas.setEsqInferiorIzquierda(30);
        Panel_Ventas.setEsqSuperiorDerecha(30);
        Panel_Ventas.setEsqSuperiorIzquierda(30);
        Panel_Ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(153, 153, 153));
        jLabel67.setText("Ventas");
        Panel_Ventas.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 120, 40));

        txtCodigoVenta.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoVenta.setBorder(null);
        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyTyped(evt);
            }
        });
        Panel_Ventas.add(txtCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 102, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Código");
        Panel_Ventas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtDescripcionVenta.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcionVenta.setBorder(null);
        txtDescripcionVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionVentaKeyTyped(evt);
            }
        });
        Panel_Ventas.add(txtDescripcionVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 191, 30));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(153, 153, 153));
        jLabel68.setText("Descripción");
        Panel_Ventas.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        txtCantidadVenta.setBackground(new java.awt.Color(204, 204, 204));
        txtCantidadVenta.setBorder(null);
        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyTyped(evt);
            }
        });
        Panel_Ventas.add(txtCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 40, 30));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(153, 153, 153));
        jLabel69.setText("Cant");
        Panel_Ventas.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecioVenta.setBorder(null);
        Panel_Ventas.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 80, 30));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(153, 153, 153));
        jLabel70.setText("Precio");
        Panel_Ventas.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCIÓN", "CANTIDAD", "PRECIO U.", "PRECIO TOTAL"
            }
        ));
        ScrollVentas.setViewportView(TableVenta);

        Panel_Ventas.add(ScrollVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 910, 460));

        Boton_Acceder.setBackground(new java.awt.Color(104, 70, 235));
        Boton_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Acceder.setText("Cobrar");
        Boton_Acceder.setArco_esquina(15);
        Boton_Acceder.setColor_Hover(new java.awt.Color(90, 63, 255));
        Boton_Acceder.setColor_Normal(new java.awt.Color(104, 70, 235));
        Boton_Acceder.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AccederActionPerformed(evt);
            }
        });
        Panel_Ventas.add(Boton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 170, 40));

        Paneles_Categorias.add(Panel_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Configuracion.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Configuracion.setEsqInferiorDerecha(30);
        Panel_Configuracion.setEsqInferiorIzquierda(30);
        Panel_Configuracion.setEsqSuperiorDerecha(30);
        Panel_Configuracion.setEsqSuperiorIzquierda(30);
        Panel_Configuracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_AjustesGlobales.setBackground(new java.awt.Color(42, 42, 42));
        Btn_AjustesGlobales.setForeground(new java.awt.Color(153, 153, 153));
        Btn_AjustesGlobales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_automatic_200px.png"))); // NOI18N
        Btn_AjustesGlobales.setText("Ajustes del Sistema");
        Btn_AjustesGlobales.setToolTipText("");
        Btn_AjustesGlobales.setArco_esquina(15);
        Btn_AjustesGlobales.setColor_Hover(new java.awt.Color(113, 113, 113));
        Btn_AjustesGlobales.setColor_N_text(new java.awt.Color(153, 153, 153));
        Btn_AjustesGlobales.setColor_Normal(new java.awt.Color(43, 43, 43));
        Btn_AjustesGlobales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_AjustesGlobales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AjustesGlobalesActionPerformed(evt);
            }
        });
        Panel_Configuracion.add(Btn_AjustesGlobales, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 210, 240));

        Btn_Usuarios.setBackground(new java.awt.Color(42, 42, 42));
        Btn_Usuarios.setForeground(new java.awt.Color(153, 153, 153));
        Btn_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_staff_100px.png"))); // NOI18N
        Btn_Usuarios.setText("Empleado");
        Btn_Usuarios.setToolTipText("");
        Btn_Usuarios.setArco_esquina(15);
        Btn_Usuarios.setColor_Hover(new java.awt.Color(113, 113, 113));
        Btn_Usuarios.setColor_N_text(new java.awt.Color(153, 153, 153));
        Btn_Usuarios.setColor_Normal(new java.awt.Color(43, 43, 43));
        Btn_Usuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UsuariosActionPerformed(evt);
            }
        });
        Panel_Configuracion.add(Btn_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 110, 130));

        Btn_Productos.setBackground(new java.awt.Color(42, 42, 42));
        Btn_Productos.setForeground(new java.awt.Color(153, 153, 153));
        Btn_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Products_Pile_100px.png"))); // NOI18N
        Btn_Productos.setText("Productos");
        Btn_Productos.setToolTipText("");
        Btn_Productos.setArco_esquina(15);
        Btn_Productos.setColor_Hover(new java.awt.Color(113, 113, 113));
        Btn_Productos.setColor_N_text(new java.awt.Color(153, 153, 153));
        Btn_Productos.setColor_Normal(new java.awt.Color(43, 43, 43));
        Btn_Productos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ProductosActionPerformed(evt);
            }
        });
        Panel_Configuracion.add(Btn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, 130));

        Btn_Tickets.setBackground(new java.awt.Color(42, 42, 42));
        Btn_Tickets.setForeground(new java.awt.Color(153, 153, 153));
        Btn_Tickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_ticket_100px.png"))); // NOI18N
        Btn_Tickets.setText("Tickets (Proximamente)");
        Btn_Tickets.setToolTipText("");
        Btn_Tickets.setArco_esquina(15);
        Btn_Tickets.setColor_Hover(new java.awt.Color(113, 113, 113));
        Btn_Tickets.setColor_N_text(new java.awt.Color(153, 153, 153));
        Btn_Tickets.setColor_Normal(new java.awt.Color(43, 43, 43));
        Btn_Tickets.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Tickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TicketsActionPerformed(evt);
            }
        });
        Panel_Configuracion.add(Btn_Tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 150, 130));

        Btn_Clientes.setBackground(new java.awt.Color(42, 42, 42));
        Btn_Clientes.setForeground(new java.awt.Color(153, 153, 153));
        Btn_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_users_100px.png"))); // NOI18N
        Btn_Clientes.setText("Clientes");
        Btn_Clientes.setToolTipText("");
        Btn_Clientes.setArco_esquina(15);
        Btn_Clientes.setColor_Hover(new java.awt.Color(113, 113, 113));
        Btn_Clientes.setColor_N_text(new java.awt.Color(153, 153, 153));
        Btn_Clientes.setColor_Normal(new java.awt.Color(43, 43, 43));
        Btn_Clientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClientesActionPerformed(evt);
            }
        });
        Panel_Configuracion.add(Btn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 110, 130));

        Btn_Proveedores.setBackground(new java.awt.Color(42, 42, 42));
        Btn_Proveedores.setForeground(new java.awt.Color(153, 153, 153));
        Btn_Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_businessman_100px.png"))); // NOI18N
        Btn_Proveedores.setText("Proveedores");
        Btn_Proveedores.setToolTipText("");
        Btn_Proveedores.setArco_esquina(15);
        Btn_Proveedores.setColor_Hover(new java.awt.Color(113, 113, 113));
        Btn_Proveedores.setColor_N_text(new java.awt.Color(153, 153, 153));
        Btn_Proveedores.setColor_Normal(new java.awt.Color(43, 43, 43));
        Btn_Proveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ProveedoresActionPerformed(evt);
            }
        });
        Panel_Configuracion.add(Btn_Proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 110, 130));

        Paneles_Categorias.add(Panel_Configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Acceso.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Acceso.setEsqInferiorDerecha(30);
        Panel_Acceso.setEsqInferiorIzquierda(30);
        Panel_Acceso.setEsqSuperiorDerecha(30);
        Panel_Acceso.setEsqSuperiorIzquierda(30);
        Panel_Acceso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Interfaz: Acceso");
        Panel_Acceso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        Paneles_Categorias.add(Panel_Acceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Conf_Sistema.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Conf_Sistema.setEsqInferiorDerecha(30);
        Panel_Conf_Sistema.setEsqInferiorIzquierda(30);
        Panel_Conf_Sistema.setEsqSuperiorDerecha(30);
        Panel_Conf_Sistema.setEsqSuperiorIzquierda(30);
        Panel_Conf_Sistema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC2.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC2.setEsqInferiorDerecha(30);
        panel_Round_JWC2.setEsqInferiorIzquierda(30);
        panel_Round_JWC2.setEsqSuperiorDerecha(30);
        panel_Round_JWC2.setEsqSuperiorIzquierda(30);
        panel_Round_JWC2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Nombre de la empresa:");
        panel_Round_JWC2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 220, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Configuraciones del Sistema");
        panel_Round_JWC2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 310, -1));

        Localidad_Sistema.setBackground(new java.awt.Color(43, 43, 43));
        Localidad_Sistema.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Localidad_Sistema.setForeground(new java.awt.Color(204, 204, 204));
        Localidad_Sistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Localidad_Sistema.setText("Mazatlan");
        Localidad_Sistema.setBorder(null);
        panel_Round_JWC2.add(Localidad_Sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 250, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Localidad:");
        panel_Round_JWC2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 170, -1));

        Telefono_Sistema.setBackground(new java.awt.Color(43, 43, 43));
        Telefono_Sistema.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Telefono_Sistema.setForeground(new java.awt.Color(204, 204, 204));
        Telefono_Sistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Telefono_Sistema.setText("6699128172");
        Telefono_Sistema.setBorder(null);
        panel_Round_JWC2.add(Telefono_Sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 250, 40));

        Empresa_Sistema.setBackground(new java.awt.Color(43, 43, 43));
        Empresa_Sistema.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Empresa_Sistema.setForeground(new java.awt.Color(204, 204, 204));
        Empresa_Sistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Empresa_Sistema.setText("Zapateria");
        Empresa_Sistema.setBorder(null);
        panel_Round_JWC2.add(Empresa_Sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 250, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Telefono:");
        panel_Round_JWC2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 170, -1));

        img_Round_JWC2.setForeground(new java.awt.Color(255, 204, 153));
        img_Round_JWC2.setGrosor_Borde(3);
        img_Round_JWC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pexels-fauxels-3184418.jpg"))); // NOI18N
        panel_Round_JWC2.add(img_Round_JWC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 210, 190));

        Subir_Imagen.setBackground(new java.awt.Color(102, 102, 102));
        Subir_Imagen.setForeground(new java.awt.Color(255, 255, 255));
        Subir_Imagen.setText("Guardar Configuraciones");
        Subir_Imagen.setArco_esquina(15);
        Subir_Imagen.setColor_Hover(new java.awt.Color(153, 153, 153));
        Subir_Imagen.setColor_Normal(new java.awt.Color(102, 102, 102));
        Subir_Imagen.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Subir_Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subir_ImagenActionPerformed(evt);
            }
        });
        panel_Round_JWC2.add(Subir_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 210, 40));

        Salir1.setBackground(new java.awt.Color(204, 153, 0));
        Salir1.setForeground(new java.awt.Color(255, 255, 255));
        Salir1.setText("");
        Salir1.setArco_esquina(15);
        Salir1.setColor_Hover(new java.awt.Color(102, 0, 0));
        Salir1.setColor_Normal(new java.awt.Color(255, 51, 51));
        Salir1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir1ActionPerformed(evt);
            }
        });
        panel_Round_JWC2.add(Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 15, 15));

        Subir_Imagen1.setBackground(new java.awt.Color(102, 102, 102));
        Subir_Imagen1.setForeground(new java.awt.Color(255, 255, 255));
        Subir_Imagen1.setText("Subir Imagen");
        Subir_Imagen1.setArco_esquina(15);
        Subir_Imagen1.setColor_Hover(new java.awt.Color(153, 153, 153));
        Subir_Imagen1.setColor_Normal(new java.awt.Color(102, 102, 102));
        Subir_Imagen1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Subir_Imagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subir_Imagen1ActionPerformed(evt);
            }
        });
        panel_Round_JWC2.add(Subir_Imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 170, 40));

        Panel_Conf_Sistema.add(panel_Round_JWC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, 670));

        Paneles_Categorias.add(Panel_Conf_Sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Con_Clientes.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Con_Clientes.setEsqInferiorDerecha(30);
        Panel_Con_Clientes.setEsqInferiorIzquierda(30);
        Panel_Con_Clientes.setEsqSuperiorDerecha(30);
        Panel_Con_Clientes.setEsqSuperiorIzquierda(30);
        Panel_Con_Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC3.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC3.setEsqInferiorDerecha(30);
        panel_Round_JWC3.setEsqInferiorIzquierda(30);
        panel_Round_JWC3.setEsqSuperiorDerecha(30);
        panel_Round_JWC3.setEsqSuperiorIzquierda(30);
        panel_Round_JWC3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cliente");
        panel_Round_JWC3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, -1));

        Nuevo_Cliente.setBackground(new java.awt.Color(32, 136, 203));
        Nuevo_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Plus_35px_1.png"))); // NOI18N
        Nuevo_Cliente.setText("         Nuevo Empleado");
        Nuevo_Cliente.setArco_esquina(15);
        Nuevo_Cliente.setColor_Hover(new java.awt.Color(153, 153, 153));
        Nuevo_Cliente.setColor_Normal(new java.awt.Color(102, 102, 102));
        Nuevo_Cliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Nuevo_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_ClienteActionPerformed(evt);
            }
        });
        panel_Round_JWC3.add(Nuevo_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 200, 40));

        Tabla_Clientes.setBackground(new java.awt.Color(32, 136, 203));
        Tabla_Clientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Correo", "Direccion"
            }
        ));
        Tabla_Clientes.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Tabla_Clientes.setShowHorizontalLines(true);
        Tabla_Clientes.setShowVerticalLines(true);
        Tabla_Clientes.getTableHeader().setReorderingAllowed(false);
        ScrollClientes.setViewportView(Tabla_Clientes);

        panel_Round_JWC3.add(ScrollClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 890, 470));

        Eliminar_Cliente.setBackground(new java.awt.Color(32, 136, 203));
        Eliminar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Plus_35px_1.png"))); // NOI18N
        Eliminar_Cliente.setText("         Eliminar Cliente");
        Eliminar_Cliente.setArco_esquina(15);
        Eliminar_Cliente.setColor_Hover(new java.awt.Color(153, 153, 153));
        Eliminar_Cliente.setColor_Normal(new java.awt.Color(102, 102, 102));
        Eliminar_Cliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_ClienteActionPerformed(evt);
            }
        });
        panel_Round_JWC3.add(Eliminar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 40));

        Panel_Con_Clientes.add(panel_Round_JWC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, 670));

        Paneles_Categorias.add(Panel_Con_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Agregar_Clientes.setBackground(new java.awt.Color(43, 43, 43));
        Agregar_Clientes.setEsqInferiorDerecha(30);
        Agregar_Clientes.setEsqInferiorIzquierda(30);
        Agregar_Clientes.setEsqSuperiorDerecha(30);
        Agregar_Clientes.setEsqSuperiorIzquierda(30);
        Agregar_Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Nombre:");
        Agregar_Clientes.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(130, 130, 130));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Poder mostrar en la ventas realizadas.");
        Agregar_Clientes.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 290, 40));

        jSeparator1.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));
        Agregar_Clientes.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 180, 10));

        TxtNombre_Cliente.setBackground(new java.awt.Color(32, 32, 32));
        TxtNombre_Cliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        TxtNombre_Cliente.setForeground(new java.awt.Color(204, 204, 204));
        TxtNombre_Cliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtNombre_Cliente.setBorder(null);
        Agregar_Clientes.add(TxtNombre_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 180, 40));

        jSeparator2.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 20));
        Agregar_Clientes.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 140, 10));

        txtTelefono_Cliente.setBackground(new java.awt.Color(32, 32, 32));
        txtTelefono_Cliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtTelefono_Cliente.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefono_Cliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono_Cliente.setBorder(null);
        Agregar_Clientes.add(txtTelefono_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 140, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Telefono");
        Agregar_Clientes.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 60, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Correo:");
        Agregar_Clientes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 40));

        txtCorreo_Cliente.setBackground(new java.awt.Color(32, 32, 32));
        txtCorreo_Cliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtCorreo_Cliente.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo_Cliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreo_Cliente.setBorder(null);
        Agregar_Clientes.add(txtCorreo_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 190, 40));

        jSeparator3.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 20));
        Agregar_Clientes.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 190, 10));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Direccion:");
        Agregar_Clientes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 40));

        txtDireccion_Cliente.setBackground(new java.awt.Color(32, 32, 32));
        txtDireccion_Cliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtDireccion_Cliente.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccion_Cliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion_Cliente.setBorder(null);
        Agregar_Clientes.add(txtDireccion_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 190, 40));

        jSeparator4.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator4.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 20));
        Agregar_Clientes.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 190, 10));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Informacion");
        Agregar_Clientes.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(130, 130, 130));
        jLabel21.setText("Completa toda la informacion del cliente para");
        Agregar_Clientes.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_join_200px.png"))); // NOI18N
        Agregar_Clientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        panel_Round_JWC5.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC5.setEsqInferiorDerecha(30);
        panel_Round_JWC5.setEsqInferiorIzquierda(30);
        panel_Round_JWC5.setEsqSuperiorDerecha(30);
        panel_Round_JWC5.setEsqSuperiorIzquierda(30);
        panel_Round_JWC5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Guardar_Clientes.setBackground(new java.awt.Color(104, 70, 235));
        Boton_Guardar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Guardar_Clientes.setText("Guardar");
        Boton_Guardar_Clientes.setArco_esquina(15);
        Boton_Guardar_Clientes.setColor_Hover(new java.awt.Color(90, 63, 255));
        Boton_Guardar_Clientes.setColor_Normal(new java.awt.Color(104, 70, 235));
        Boton_Guardar_Clientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Guardar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Guardar_ClientesActionPerformed(evt);
            }
        });
        panel_Round_JWC5.add(Boton_Guardar_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 170, 40));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("ID:");
        panel_Round_JWC5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 40));

        jSeparator11.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator11.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 10));

        txtCodigo_Clientes.setBackground(new java.awt.Color(32, 32, 32));
        txtCodigo_Clientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtCodigo_Clientes.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigo_Clientes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo_Clientes.setBorder(null);
        panel_Round_JWC5.add(txtCodigo_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, 40));

        Agregar_Clientes.add(panel_Round_JWC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 710, 450));

        Paneles_Categorias.add(Agregar_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Con_Productos.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Con_Productos.setEsqInferiorDerecha(30);
        Panel_Con_Productos.setEsqInferiorIzquierda(30);
        Panel_Con_Productos.setEsqSuperiorDerecha(30);
        Panel_Con_Productos.setEsqSuperiorIzquierda(30);
        Panel_Con_Productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC6.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC6.setEsqInferiorDerecha(30);
        panel_Round_JWC6.setEsqInferiorIzquierda(30);
        panel_Round_JWC6.setEsqSuperiorDerecha(30);
        panel_Round_JWC6.setEsqSuperiorIzquierda(30);
        panel_Round_JWC6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Productos");
        panel_Round_JWC6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, -1));

        Nuevo_Producto.setBackground(new java.awt.Color(32, 136, 203));
        Nuevo_Producto.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Plus_35px_1.png"))); // NOI18N
        Nuevo_Producto.setText("         Nuevo Producto");
        Nuevo_Producto.setArco_esquina(15);
        Nuevo_Producto.setColor_Hover(new java.awt.Color(153, 153, 153));
        Nuevo_Producto.setColor_Normal(new java.awt.Color(102, 102, 102));
        Nuevo_Producto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Nuevo_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_ProductoActionPerformed(evt);
            }
        });
        panel_Round_JWC6.add(Nuevo_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 200, 40));

        Tabla_Productos.setBackground(new java.awt.Color(32, 136, 203));
        Tabla_Productos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Precio", "Stock", "Precio Compra", "Ubicacion"
            }
        ));
        Tabla_Productos.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Tabla_Productos.setShowHorizontalLines(true);
        Tabla_Productos.setShowVerticalLines(true);
        Tabla_Productos.getTableHeader().setReorderingAllowed(false);
        ScrollProductos.setViewportView(Tabla_Productos);
        if (Tabla_Productos.getColumnModel().getColumnCount() > 0) {
            Tabla_Productos.getColumnModel().getColumn(5).setHeaderValue("Ubicacion");
        }

        panel_Round_JWC6.add(ScrollProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 890, 470));

        Eliminar_Productos.setBackground(new java.awt.Color(32, 136, 203));
        Eliminar_Productos.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Plus_35px_1.png"))); // NOI18N
        Eliminar_Productos.setText("         Eliminar Producto");
        Eliminar_Productos.setArco_esquina(15);
        Eliminar_Productos.setColor_Hover(new java.awt.Color(153, 153, 153));
        Eliminar_Productos.setColor_Normal(new java.awt.Color(102, 102, 102));
        Eliminar_Productos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_ProductosActionPerformed(evt);
            }
        });
        panel_Round_JWC6.add(Eliminar_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 200, 40));

        Panel_Con_Productos.add(panel_Round_JWC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, 670));

        Paneles_Categorias.add(Panel_Con_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Agregar_Productos.setBackground(new java.awt.Color(43, 43, 43));
        Agregar_Productos.setEsqInferiorDerecha(30);
        Agregar_Productos.setEsqInferiorIzquierda(30);
        Agregar_Productos.setEsqSuperiorDerecha(30);
        Agregar_Productos.setEsqSuperiorIzquierda(30);
        Agregar_Productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Informacion");
        Agregar_Productos.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        panel_Round_JWC8.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC8.setEsqInferiorDerecha(30);
        panel_Round_JWC8.setEsqInferiorIzquierda(30);
        panel_Round_JWC8.setEsqSuperiorDerecha(30);
        panel_Round_JWC8.setEsqSuperiorIzquierda(30);
        panel_Round_JWC8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGuardar_Productos.setBackground(new java.awt.Color(104, 70, 235));
        txtGuardar_Productos.setForeground(new java.awt.Color(255, 255, 255));
        txtGuardar_Productos.setText("Guardar");
        txtGuardar_Productos.setArco_esquina(15);
        txtGuardar_Productos.setColor_Hover(new java.awt.Color(90, 63, 255));
        txtGuardar_Productos.setColor_Normal(new java.awt.Color(104, 70, 235));
        txtGuardar_Productos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtGuardar_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardar_ProductosActionPerformed(evt);
            }
        });
        panel_Round_JWC8.add(txtGuardar_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 170, 40));

        jSeparator7.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator7.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC8.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 40, 10));

        Pro_Stock.setBackground(new java.awt.Color(32, 32, 32));
        Pro_Stock.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Pro_Stock.setForeground(new java.awt.Color(204, 204, 204));
        Pro_Stock.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Pro_Stock.setBorder(null);
        panel_Round_JWC8.add(Pro_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 40, 40));

        Pro_Precio.setBackground(new java.awt.Color(32, 32, 32));
        Pro_Precio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Pro_Precio.setForeground(new java.awt.Color(204, 204, 204));
        Pro_Precio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Pro_Precio.setBorder(null);
        panel_Round_JWC8.add(Pro_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, 40));

        jSeparator8.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator8.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC8.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 40, 10));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 153, 153));
        jLabel31.setText("Precio:");
        panel_Round_JWC8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Add_Product_200px_1.png"))); // NOI18N
        panel_Round_JWC8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(130, 130, 130));
        jLabel33.setText("Completa toda la informacion del cliente para");
        panel_Round_JWC8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, 40));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("Stock:");
        panel_Round_JWC8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 40));

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 153, 153));
        jLabel29.setText("Precio Compra:");
        panel_Round_JWC8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, 40));

        Pro_PreCompra.setBackground(new java.awt.Color(32, 32, 32));
        Pro_PreCompra.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Pro_PreCompra.setForeground(new java.awt.Color(204, 204, 204));
        Pro_PreCompra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Pro_PreCompra.setBorder(null);
        Pro_PreCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pro_PreCompraActionPerformed(evt);
            }
        });
        panel_Round_JWC8.add(Pro_PreCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, 40));

        jSeparator6.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator6.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC8.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 100, 10));

        Descripcion_Pro.setBackground(new java.awt.Color(32, 32, 32));
        Descripcion_Pro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Descripcion_Pro.setForeground(new java.awt.Color(204, 204, 204));
        Descripcion_Pro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Descripcion_Pro.setBorder(null);
        panel_Round_JWC8.add(Descripcion_Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 40));

        jSeparator5.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator5.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC8.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, 10));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(130, 130, 130));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Poder mostrar en la ventas realizadas.");
        panel_Round_JWC8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 290, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("Descripcion:");
        panel_Round_JWC8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 40));

        jSeparator9.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator9.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC8.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 90, 10));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Codigo:");
        panel_Round_JWC8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 40));

        Pro_Cod.setBackground(new java.awt.Color(32, 32, 32));
        Pro_Cod.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Pro_Cod.setForeground(new java.awt.Color(204, 204, 204));
        Pro_Cod.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Pro_Cod.setBorder(null);
        panel_Round_JWC8.add(Pro_Cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 90, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("Ubicacion:");
        panel_Round_JWC8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 40));

        Ubicacion.setBackground(new java.awt.Color(32, 32, 32));
        Ubicacion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Ubicacion.setForeground(new java.awt.Color(204, 204, 204));
        Ubicacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Ubicacion.setBorder(null);
        panel_Round_JWC8.add(Ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 90, 40));

        jSeparator10.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator10.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC8.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, 10));

        Agregar_Productos.add(panel_Round_JWC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 710, 450));

        Paneles_Categorias.add(Agregar_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Delete_Producto.setBackground(new java.awt.Color(43, 43, 43));
        Delete_Producto.setEsqInferiorDerecha(30);
        Delete_Producto.setEsqInferiorIzquierda(30);
        Delete_Producto.setEsqSuperiorDerecha(30);
        Delete_Producto.setEsqSuperiorIzquierda(30);
        Delete_Producto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC9.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC9.setEsqInferiorDerecha(30);
        panel_Round_JWC9.setEsqInferiorIzquierda(30);
        panel_Round_JWC9.setEsqSuperiorDerecha(30);
        panel_Round_JWC9.setEsqSuperiorIzquierda(30);
        panel_Round_JWC9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar_Cliente_Boton.setBackground(new java.awt.Color(104, 70, 235));
        Eliminar_Cliente_Boton.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Cliente_Boton.setText("Eliminar");
        Eliminar_Cliente_Boton.setArco_esquina(15);
        Eliminar_Cliente_Boton.setColor_Hover(new java.awt.Color(90, 63, 255));
        Eliminar_Cliente_Boton.setColor_Normal(new java.awt.Color(104, 70, 235));
        Eliminar_Cliente_Boton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Cliente_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_Cliente_BotonActionPerformed(evt);
            }
        });
        panel_Round_JWC9.add(Eliminar_Cliente_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 170, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Defective_Product_200px.png"))); // NOI18N
        panel_Round_JWC9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 210, 190));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(130, 130, 130));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Ingresa el codigo de producto que desas");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Round_JWC9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 290, 40));

        TxtCodigo_Producto.setBackground(new java.awt.Color(32, 32, 32));
        TxtCodigo_Producto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        TxtCodigo_Producto.setForeground(new java.awt.Color(204, 204, 204));
        TxtCodigo_Producto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtCodigo_Producto.setBorder(null);
        panel_Round_JWC9.add(TxtCodigo_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, 40));

        jSeparator14.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator14.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator14.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC9.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, 10));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(130, 130, 130));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText(" eliminar para continuar");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Round_JWC9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 290, 40));

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(153, 153, 153));
        jLabel41.setText("Codigo del producto:");
        panel_Round_JWC9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 40));

        Delete_Producto.add(panel_Round_JWC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 710, 450));

        Paneles_Categorias.add(Delete_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Con_Empleados.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Con_Empleados.setEsqInferiorDerecha(30);
        Panel_Con_Empleados.setEsqInferiorIzquierda(30);
        Panel_Con_Empleados.setEsqSuperiorDerecha(30);
        Panel_Con_Empleados.setEsqSuperiorIzquierda(30);
        Panel_Con_Empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC10.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC10.setEsqInferiorDerecha(30);
        panel_Round_JWC10.setEsqInferiorIzquierda(30);
        panel_Round_JWC10.setEsqSuperiorDerecha(30);
        panel_Round_JWC10.setEsqSuperiorIzquierda(30);
        panel_Round_JWC10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Empleado");
        panel_Round_JWC10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, -1));

        Nuevo_Empleado.setBackground(new java.awt.Color(32, 136, 203));
        Nuevo_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Plus_35px_1.png"))); // NOI18N
        Nuevo_Empleado.setText("         Nuevo Empleado");
        Nuevo_Empleado.setArco_esquina(15);
        Nuevo_Empleado.setColor_Hover(new java.awt.Color(153, 153, 153));
        Nuevo_Empleado.setColor_Normal(new java.awt.Color(102, 102, 102));
        Nuevo_Empleado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Nuevo_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_EmpleadoActionPerformed(evt);
            }
        });
        panel_Round_JWC10.add(Nuevo_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 200, 40));

        Tabla_Empleado_Con.setBackground(new java.awt.Color(32, 136, 203));
        Tabla_Empleado_Con.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tabla_Empleado_Con.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Correo", "Direccion", "Login"
            }
        ));
        Tabla_Empleado_Con.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Tabla_Empleado_Con.setShowHorizontalLines(true);
        Tabla_Empleado_Con.setShowVerticalLines(true);
        Tabla_Empleado_Con.getTableHeader().setReorderingAllowed(false);
        Tabla_Empleados.setViewportView(Tabla_Empleado_Con);

        panel_Round_JWC10.add(Tabla_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 890, 470));

        Eliminar_Empleado.setBackground(new java.awt.Color(32, 136, 203));
        Eliminar_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Plus_35px_1.png"))); // NOI18N
        Eliminar_Empleado.setText("         Eliminar Empleado");
        Eliminar_Empleado.setArco_esquina(15);
        Eliminar_Empleado.setColor_Hover(new java.awt.Color(153, 153, 153));
        Eliminar_Empleado.setColor_Normal(new java.awt.Color(102, 102, 102));
        Eliminar_Empleado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_EmpleadoActionPerformed(evt);
            }
        });
        panel_Round_JWC10.add(Eliminar_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 40));

        Panel_Con_Empleados.add(panel_Round_JWC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, 670));

        Paneles_Categorias.add(Panel_Con_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Delete_Clientes.setBackground(new java.awt.Color(43, 43, 43));
        Delete_Clientes.setEsqInferiorDerecha(30);
        Delete_Clientes.setEsqInferiorIzquierda(30);
        Delete_Clientes.setEsqSuperiorDerecha(30);
        Delete_Clientes.setEsqSuperiorIzquierda(30);
        Delete_Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC11.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC11.setEsqInferiorDerecha(30);
        panel_Round_JWC11.setEsqInferiorIzquierda(30);
        panel_Round_JWC11.setEsqSuperiorDerecha(30);
        panel_Round_JWC11.setEsqSuperiorIzquierda(30);
        panel_Round_JWC11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar_Productos_Boton1.setBackground(new java.awt.Color(104, 70, 235));
        Eliminar_Productos_Boton1.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Productos_Boton1.setText("Eliminar");
        Eliminar_Productos_Boton1.setArco_esquina(15);
        Eliminar_Productos_Boton1.setColor_Hover(new java.awt.Color(90, 63, 255));
        Eliminar_Productos_Boton1.setColor_Normal(new java.awt.Color(104, 70, 235));
        Eliminar_Productos_Boton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Productos_Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_Productos_Boton1ActionPerformed(evt);
            }
        });
        panel_Round_JWC11.add(Eliminar_Productos_Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 170, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Remove_User_Female_200px.png"))); // NOI18N
        panel_Round_JWC11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 210, 190));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(130, 130, 130));
        jLabel38.setText("Ingresa el Cliente que desas eliminar para");
        panel_Round_JWC11.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, 40));

        TxtCodigo_Cliente.setBackground(new java.awt.Color(32, 32, 32));
        TxtCodigo_Cliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        TxtCodigo_Cliente.setForeground(new java.awt.Color(204, 204, 204));
        TxtCodigo_Cliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtCodigo_Cliente.setBorder(null);
        panel_Round_JWC11.add(TxtCodigo_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, 40));

        jSeparator15.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator15.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator15.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC11.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, 10));

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(130, 130, 130));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("continuar");
        panel_Round_JWC11.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 290, 40));

        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("Codigo del cliente:");
        panel_Round_JWC11.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 40));

        Delete_Clientes.add(panel_Round_JWC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 710, 450));

        Paneles_Categorias.add(Delete_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Con_Proveedores.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Con_Proveedores.setEsqInferiorDerecha(30);
        Panel_Con_Proveedores.setEsqInferiorIzquierda(30);
        Panel_Con_Proveedores.setEsqSuperiorDerecha(30);
        Panel_Con_Proveedores.setEsqSuperiorIzquierda(30);
        Panel_Con_Proveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC12.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC12.setEsqInferiorDerecha(30);
        panel_Round_JWC12.setEsqInferiorIzquierda(30);
        panel_Round_JWC12.setEsqSuperiorDerecha(30);
        panel_Round_JWC12.setEsqSuperiorIzquierda(30);
        panel_Round_JWC12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 153, 153));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Proveedores");
        panel_Round_JWC12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 960, -1));

        Nuevo_Proveedor.setBackground(new java.awt.Color(32, 136, 203));
        Nuevo_Proveedor.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo_Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Plus_35px_1.png"))); // NOI18N
        Nuevo_Proveedor.setText("         Nuevo Proveedor");
        Nuevo_Proveedor.setArco_esquina(15);
        Nuevo_Proveedor.setColor_Hover(new java.awt.Color(153, 153, 153));
        Nuevo_Proveedor.setColor_Normal(new java.awt.Color(102, 102, 102));
        Nuevo_Proveedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Nuevo_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_ProveedorActionPerformed(evt);
            }
        });
        panel_Round_JWC12.add(Nuevo_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 200, 40));

        Tabla_Proveedores.setBackground(new java.awt.Color(32, 136, 203));
        Tabla_Proveedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabla_Proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion", "Correo"
            }
        ));
        Tabla_Proveedores.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Tabla_Proveedores.setShowHorizontalLines(true);
        Tabla_Proveedores.setShowVerticalLines(true);
        Tabla_Proveedores.getTableHeader().setReorderingAllowed(false);
        ScrollProveedores.setViewportView(Tabla_Proveedores);

        panel_Round_JWC12.add(ScrollProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 890, 470));

        Eliminar_Proveedor.setBackground(new java.awt.Color(32, 136, 203));
        Eliminar_Proveedor.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Plus_35px_1.png"))); // NOI18N
        Eliminar_Proveedor.setText("         Eliminar Proveedor");
        Eliminar_Proveedor.setArco_esquina(15);
        Eliminar_Proveedor.setColor_Hover(new java.awt.Color(153, 153, 153));
        Eliminar_Proveedor.setColor_Normal(new java.awt.Color(102, 102, 102));
        Eliminar_Proveedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_ProveedorActionPerformed(evt);
            }
        });
        panel_Round_JWC12.add(Eliminar_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 200, 40));

        Panel_Con_Proveedores.add(panel_Round_JWC12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, 670));

        Paneles_Categorias.add(Panel_Con_Proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Agregar_Empleado.setBackground(new java.awt.Color(43, 43, 43));
        Agregar_Empleado.setEsqInferiorDerecha(30);
        Agregar_Empleado.setEsqInferiorIzquierda(30);
        Agregar_Empleado.setEsqSuperiorDerecha(30);
        Agregar_Empleado.setEsqSuperiorIzquierda(30);
        Agregar_Empleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC13.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC13.setEsqInferiorDerecha(30);
        panel_Round_JWC13.setEsqInferiorIzquierda(30);
        panel_Round_JWC13.setEsqSuperiorDerecha(30);
        panel_Round_JWC13.setEsqSuperiorIzquierda(30);
        panel_Round_JWC13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarEmpleado.setBackground(new java.awt.Color(104, 70, 235));
        btnGuardarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.setArco_esquina(15);
        btnGuardarEmpleado.setColor_Hover(new java.awt.Color(90, 63, 255));
        btnGuardarEmpleado.setColor_Normal(new java.awt.Color(104, 70, 235));
        btnGuardarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });
        panel_Round_JWC13.add(btnGuardarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 170, 40));

        jSeparator12.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator12.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator12.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC13.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, 10));

        txtDireccionEmpleado.setBackground(new java.awt.Color(32, 32, 32));
        txtDireccionEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtDireccionEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccionEmpleado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccionEmpleado.setBorder(null);
        panel_Round_JWC13.add(txtDireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, 40));

        txtTelefonoEmpleado.setBackground(new java.awt.Color(32, 32, 32));
        txtTelefonoEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtTelefonoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefonoEmpleado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefonoEmpleado.setBorder(null);
        panel_Round_JWC13.add(txtTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 40));

        jSeparator13.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator13.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC13.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, 10));

        jLabel44.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(153, 153, 153));
        jLabel44.setText("Telefono:");
        panel_Round_JWC13.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_join_200px.png"))); // NOI18N
        panel_Round_JWC13.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(130, 130, 130));
        jLabel45.setText("Completa toda la informacion del Empleado para");
        panel_Round_JWC13.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, 40));

        jLabel46.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(153, 153, 153));
        jLabel46.setText("Direccion:");
        panel_Round_JWC13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, 40));

        jLabel47.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(153, 153, 153));
        jLabel47.setText("Nombre:");
        panel_Round_JWC13.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 190, 40));

        txtNombreEmpleado.setBackground(new java.awt.Color(32, 32, 32));
        txtNombreEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtNombreEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreEmpleado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreEmpleado.setBorder(null);
        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });
        panel_Round_JWC13.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 190, 40));

        jSeparator16.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator16.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator16.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC13.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 190, 10));

        txtIDEmpleado.setBackground(new java.awt.Color(32, 32, 32));
        txtIDEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtIDEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        txtIDEmpleado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDEmpleado.setBorder(null);
        panel_Round_JWC13.add(txtIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 40, 40));

        jSeparator17.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator17.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC13.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 40, 10));

        jLabel48.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(130, 130, 130));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Poder mostrar en la ventas realizadas.");
        panel_Round_JWC13.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 310, 40));

        jLabel49.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(153, 153, 153));
        jLabel49.setText("ID:");
        panel_Round_JWC13.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 40));

        jSeparator18.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator18.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator18.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC13.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, 10));

        jLabel50.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 153, 153));
        jLabel50.setText("Correo:");
        panel_Round_JWC13.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 40));

        txtCorreoEmpleado.setBackground(new java.awt.Color(32, 32, 32));
        txtCorreoEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtCorreoEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreoEmpleado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreoEmpleado.setBorder(null);
        panel_Round_JWC13.add(txtCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 40));

        jLabel51.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(153, 153, 153));
        jLabel51.setText("Contraseña:");
        panel_Round_JWC13.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, 40));

        txtContraseñaEmpleado.setBackground(new java.awt.Color(32, 32, 32));
        txtContraseñaEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtContraseñaEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseñaEmpleado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtContraseñaEmpleado.setBorder(null);
        panel_Round_JWC13.add(txtContraseñaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 120, 40));

        jSeparator19.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator19.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator19.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC13.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 120, 10));

        jLabel52.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(153, 153, 153));
        jLabel52.setText("Login:");
        panel_Round_JWC13.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 40));

        jSeparator20.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator20.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator20.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC13.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, 10));

        txtLoginEmpleado.setBackground(new java.awt.Color(32, 32, 32));
        txtLoginEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtLoginEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        txtLoginEmpleado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLoginEmpleado.setBorder(null);
        panel_Round_JWC13.add(txtLoginEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 90, 40));

        Agregar_Empleado.add(panel_Round_JWC13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 710, 450));

        Paneles_Categorias.add(Agregar_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Delete_Empleado.setBackground(new java.awt.Color(43, 43, 43));
        Delete_Empleado.setEsqInferiorDerecha(30);
        Delete_Empleado.setEsqInferiorIzquierda(30);
        Delete_Empleado.setEsqSuperiorDerecha(30);
        Delete_Empleado.setEsqSuperiorIzquierda(30);
        Delete_Empleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC14.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC14.setEsqInferiorDerecha(30);
        panel_Round_JWC14.setEsqInferiorIzquierda(30);
        panel_Round_JWC14.setEsqSuperiorDerecha(30);
        panel_Round_JWC14.setEsqSuperiorIzquierda(30);
        panel_Round_JWC14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar_Productos_Boton2.setBackground(new java.awt.Color(104, 70, 235));
        Eliminar_Productos_Boton2.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_Productos_Boton2.setText("Eliminar");
        Eliminar_Productos_Boton2.setArco_esquina(15);
        Eliminar_Productos_Boton2.setColor_Hover(new java.awt.Color(90, 63, 255));
        Eliminar_Productos_Boton2.setColor_Normal(new java.awt.Color(104, 70, 235));
        Eliminar_Productos_Boton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Eliminar_Productos_Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_Productos_Boton2ActionPerformed(evt);
            }
        });
        panel_Round_JWC14.add(Eliminar_Productos_Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 170, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Remove_User_Female_200px.png"))); // NOI18N
        panel_Round_JWC14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 210, 190));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(130, 130, 130));
        jLabel39.setText("Ingresa el Empleado que desas eliminar para");
        panel_Round_JWC14.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, 40));

        TxtCodigo_Empleado.setBackground(new java.awt.Color(32, 32, 32));
        TxtCodigo_Empleado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        TxtCodigo_Empleado.setForeground(new java.awt.Color(204, 204, 204));
        TxtCodigo_Empleado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtCodigo_Empleado.setBorder(null);
        panel_Round_JWC14.add(TxtCodigo_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, 40));

        jSeparator21.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator21.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator21.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC14.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, 10));

        jLabel53.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(130, 130, 130));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("continuar");
        panel_Round_JWC14.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 290, 40));

        jLabel54.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(153, 153, 153));
        jLabel54.setText("Codigo del Empleado:");
        panel_Round_JWC14.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 40));

        Delete_Empleado.add(panel_Round_JWC14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 710, 450));

        Paneles_Categorias.add(Delete_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Delete_Proveedores.setBackground(new java.awt.Color(43, 43, 43));
        Delete_Proveedores.setEsqInferiorDerecha(30);
        Delete_Proveedores.setEsqInferiorIzquierda(30);
        Delete_Proveedores.setEsqSuperiorDerecha(30);
        Delete_Proveedores.setEsqSuperiorIzquierda(30);
        Delete_Proveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC15.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC15.setEsqInferiorDerecha(30);
        panel_Round_JWC15.setEsqInferiorIzquierda(30);
        panel_Round_JWC15.setEsqSuperiorDerecha(30);
        panel_Round_JWC15.setEsqSuperiorIzquierda(30);
        panel_Round_JWC15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_EliminarProveedor.setBackground(new java.awt.Color(104, 70, 235));
        Btn_EliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        Btn_EliminarProveedor.setText("Eliminar");
        Btn_EliminarProveedor.setArco_esquina(15);
        Btn_EliminarProveedor.setColor_Hover(new java.awt.Color(90, 63, 255));
        Btn_EliminarProveedor.setColor_Normal(new java.awt.Color(104, 70, 235));
        Btn_EliminarProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Btn_EliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarProveedorActionPerformed(evt);
            }
        });
        panel_Round_JWC15.add(Btn_EliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 170, 40));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_Remove_User_Female_200px.png"))); // NOI18N
        panel_Round_JWC15.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 210, 190));

        jLabel56.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(130, 130, 130));
        jLabel56.setText("Ingresa el codigo del proveedor que desas eliminar para");
        panel_Round_JWC15.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 40));

        TxtCodigo_Proveedor.setBackground(new java.awt.Color(32, 32, 32));
        TxtCodigo_Proveedor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        TxtCodigo_Proveedor.setForeground(new java.awt.Color(204, 204, 204));
        TxtCodigo_Proveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtCodigo_Proveedor.setBorder(null);
        panel_Round_JWC15.add(TxtCodigo_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, 40));

        jSeparator22.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator22.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator22.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC15.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, 10));

        jLabel57.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(130, 130, 130));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("continuar");
        panel_Round_JWC15.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 290, 40));

        jLabel58.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(153, 153, 153));
        jLabel58.setText("Codigo del proveedor:");
        panel_Round_JWC15.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 40));

        Delete_Proveedores.add(panel_Round_JWC15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 710, 450));

        Paneles_Categorias.add(Delete_Proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Agregar_Proveedor.setBackground(new java.awt.Color(43, 43, 43));
        Agregar_Proveedor.setEsqInferiorDerecha(30);
        Agregar_Proveedor.setEsqInferiorIzquierda(30);
        Agregar_Proveedor.setEsqSuperiorDerecha(30);
        Agregar_Proveedor.setEsqSuperiorIzquierda(30);
        Agregar_Proveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC16.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC16.setEsqInferiorDerecha(30);
        panel_Round_JWC16.setEsqInferiorIzquierda(30);
        panel_Round_JWC16.setEsqSuperiorDerecha(30);
        panel_Round_JWC16.setEsqSuperiorIzquierda(30);
        panel_Round_JWC16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarProveedor.setBackground(new java.awt.Color(104, 70, 235));
        btnGuardarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProveedor.setText("Guardar");
        btnGuardarProveedor.setArco_esquina(15);
        btnGuardarProveedor.setColor_Hover(new java.awt.Color(90, 63, 255));
        btnGuardarProveedor.setColor_Normal(new java.awt.Color(104, 70, 235));
        btnGuardarProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });
        panel_Round_JWC16.add(btnGuardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 170, 40));

        jSeparator23.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator23.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator23.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC16.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 110, 10));

        txtDireccionProveedor.setBackground(new java.awt.Color(32, 32, 32));
        txtDireccionProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtDireccionProveedor.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccionProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccionProveedor.setBorder(null);
        panel_Round_JWC16.add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 110, 40));

        txtTelefonoProveedor.setBackground(new java.awt.Color(32, 32, 32));
        txtTelefonoProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtTelefonoProveedor.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefonoProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefonoProveedor.setBorder(null);
        panel_Round_JWC16.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, 40));

        jSeparator24.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator24.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator24.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC16.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 10));

        jLabel59.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(153, 153, 153));
        jLabel59.setText("Telefono:");
        panel_Round_JWC16.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, 40));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Configuracion/icons8_join_200px.png"))); // NOI18N
        panel_Round_JWC16.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(130, 130, 130));
        jLabel61.setText("Completa toda la informacion del Proveedor para");
        panel_Round_JWC16.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, 40));

        jLabel62.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(153, 153, 153));
        jLabel62.setText("Direccion:");
        panel_Round_JWC16.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 110, 40));

        jLabel63.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(153, 153, 153));
        jLabel63.setText("Nombre:");
        panel_Round_JWC16.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 190, 40));

        txtNombreProveedor.setBackground(new java.awt.Color(32, 32, 32));
        txtNombreProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtNombreProveedor.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreProveedor.setBorder(null);
        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });
        panel_Round_JWC16.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, 40));

        jSeparator25.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator25.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator25.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC16.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 10));

        txtIDProveedor.setBackground(new java.awt.Color(32, 32, 32));
        txtIDProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtIDProveedor.setForeground(new java.awt.Color(204, 204, 204));
        txtIDProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDProveedor.setBorder(null);
        panel_Round_JWC16.add(txtIDProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 40, 40));

        jSeparator26.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator26.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator26.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC16.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 40, 10));

        jLabel64.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(130, 130, 130));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Poder mostrar en la ventas realizadas.");
        panel_Round_JWC16.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 310, 40));

        jLabel65.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(153, 153, 153));
        jLabel65.setText("ID:");
        panel_Round_JWC16.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 40));

        jSeparator27.setBackground(new java.awt.Color(153, 0, 255));
        jSeparator27.setForeground(new java.awt.Color(153, 0, 255));
        jSeparator27.setPreferredSize(new java.awt.Dimension(50, 20));
        panel_Round_JWC16.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 250, 10));

        jLabel66.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(153, 153, 153));
        jLabel66.setText("Correo:");
        panel_Round_JWC16.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 200, 40));

        txtCorreoProveedor.setBackground(new java.awt.Color(32, 32, 32));
        txtCorreoProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        txtCorreoProveedor.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreoProveedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreoProveedor.setBorder(null);
        panel_Round_JWC16.add(txtCorreoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 250, 40));

        Agregar_Proveedor.add(panel_Round_JWC16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 710, 450));

        Paneles_Categorias.add(Agregar_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        panel_Round_JWC1.add(Paneles_Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 50, 1000, 710));

        Minimizar.setBackground(new java.awt.Color(255, 102, 102));
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setText("");
        Minimizar.setArco_esquina(15);
        Minimizar.setColor_Hover(new java.awt.Color(255, 153, 153));
        Minimizar.setColor_Normal(new java.awt.Color(255, 102, 102));
        Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 15, 15));

        Salir.setBackground(new java.awt.Color(255, 51, 51));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("");
        Salir.setArco_esquina(15);
        Salir.setColor_Hover(new java.awt.Color(102, 0, 0));
        Salir.setColor_Normal(new java.awt.Color(255, 51, 51));
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 15, 15));

        Pestaña_Reportes.setBackground(new java.awt.Color(32, 32, 32));
        Pestaña_Reportes.setForeground(new java.awt.Color(153, 153, 153));
        Pestaña_Reportes.setText("Reportes");
        Pestaña_Reportes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Pestaña_Reportes.setJ_Color_Borde(new java.awt.Color(255, 204, 153));
        Pestaña_Reportes.setJ_Color_NoHover_text(new java.awt.Color(153, 153, 153));
        Pestaña_Reportes.setJ_Grosor_borde(new java.lang.Integer(3));
        Pestaña_Reportes.setJ_Ubicacion_borde(btn_borde_01_jwc.BordePosicion.Abajo);
        Pestaña_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pestaña_ReportesActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(Pestaña_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 110, 30));

        Pestaña_Ventas.setBackground(new java.awt.Color(32, 32, 32));
        Pestaña_Ventas.setForeground(new java.awt.Color(153, 153, 153));
        Pestaña_Ventas.setText("Ventas");
        Pestaña_Ventas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Pestaña_Ventas.setJ_Color_Borde(new java.awt.Color(255, 204, 153));
        Pestaña_Ventas.setJ_Color_NoHover_text(new java.awt.Color(153, 153, 153));
        Pestaña_Ventas.setJ_Grosor_borde(new java.lang.Integer(3));
        Pestaña_Ventas.setJ_Ubicacion_borde(btn_borde_01_jwc.BordePosicion.Abajo);
        Pestaña_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pestaña_VentasActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(Pestaña_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 110, 30));

        Pestaña_Configuracion.setBackground(new java.awt.Color(32, 32, 32));
        Pestaña_Configuracion.setForeground(new java.awt.Color(153, 153, 153));
        Pestaña_Configuracion.setText("Configuracion");
        Pestaña_Configuracion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Pestaña_Configuracion.setJ_Color_Borde(new java.awt.Color(255, 204, 153));
        Pestaña_Configuracion.setJ_Color_NoHover_text(new java.awt.Color(153, 153, 153));
        Pestaña_Configuracion.setJ_Grosor_borde(new java.lang.Integer(3));
        Pestaña_Configuracion.setJ_Ubicacion_borde(btn_borde_01_jwc.BordePosicion.Abajo);
        Pestaña_Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pestaña_ConfiguracionActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(Pestaña_Configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 110, 30));

        panel_Round_JWC4.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC4.setEsqInferiorDerecha(30);
        panel_Round_JWC4.setEsqInferiorIzquierda(30);
        panel_Round_JWC4.setEsqSuperiorDerecha(30);
        panel_Round_JWC4.setEsqSuperiorIzquierda(30);
        panel_Round_JWC4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_Round_JWC4MouseDragged(evt);
            }
        });
        panel_Round_JWC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_Round_JWC4MousePressed(evt);
            }
        });
        panel_Round_JWC1.add(panel_Round_JWC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 50));

        getContentPane().add(panel_Round_JWC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_Round_JWC1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Round_JWC1MouseDragged
        //this.setLocation(evt.getXOnScreen()-LayoutX, evt.getYOnScreen()-LayoutY); 
    }//GEN-LAST:event_panel_Round_JWC1MouseDragged

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setExtendedState(1);        
    }//GEN-LAST:event_MinimizarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(9);
    }//GEN-LAST:event_SalirActionPerformed

    private void panel_Round_JWC4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Round_JWC4MousePressed
       if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            LayoutX = evt.getX();
            LayoutY = evt.getY();          
        }
    }//GEN-LAST:event_panel_Round_JWC4MousePressed

    private void panel_Round_JWC4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Round_JWC4MouseDragged
        this.setLocation(evt.getXOnScreen()-LayoutX, evt.getYOnScreen()-LayoutY); 
    }//GEN-LAST:event_panel_Round_JWC4MouseDragged

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void Boton_AlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AlmacenActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Con_Productos.setVisible(true);
        
        ScrollProductos.setEnabled(true);
        ScrollProductos.setVisible(true);
        
        Tabla_Productos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Tabla_Productos.getTableHeader().setOpaque(false);
        Tabla_Productos.getTableHeader().setBackground(new Color(32, 136, 203));
        Tabla_Productos.getTableHeader().setForeground(new Color(0,0,0));
        Tabla_Productos.setRowHeight(25);
        
        Eliminar_Productos.setVisible(false);
        Nuevo_Producto.setVisible(false);
        
        
        
        //Metodo para que se impriman las tablas
        LimpiarTable();
        ListarProductos();
        
    
    }//GEN-LAST:event_Boton_AlmacenActionPerformed

    private void Boton_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_VentasActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Ventas.setVisible(true);
        
        OcultarTablas();
    }//GEN-LAST:event_Boton_VentasActionPerformed

    private void Boton_AccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AccesoActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Acceso.setVisible(true);
        
        OcultarTablas();
    }//GEN-LAST:event_Boton_AccesoActionPerformed

    private void Pestaña_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pestaña_VentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pestaña_VentasActionPerformed

    private void Pestaña_ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pestaña_ConfiguracionActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Configuracion.setVisible(true);
        
        OcultarTablas();
    }//GEN-LAST:event_Pestaña_ConfiguracionActionPerformed

    private void Btn_AjustesGlobalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AjustesGlobalesActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Conf_Sistema.setVisible(true);
        
        OcultarTablas();
        
        
    }//GEN-LAST:event_Btn_AjustesGlobalesActionPerformed

    private void Btn_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UsuariosActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Con_Empleados.setVisible(true);
        
        
        Tabla_Empleados.setEnabled(true);
        Tabla_Empleados.setVisible(true);
        
        Tabla_Empleado_Con.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Tabla_Empleado_Con.getTableHeader().setOpaque(false);
        Tabla_Empleado_Con.getTableHeader().setBackground(new Color(32, 136, 203));
        Tabla_Empleado_Con.getTableHeader().setForeground(new Color(0,0,0));
        Tabla_Empleado_Con.setRowHeight(25);
        
        //Metodo para que se impriman las tablas
        LimpiarTable();
        ListarEmpleados();
    }//GEN-LAST:event_Btn_UsuariosActionPerformed

    private void Btn_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ProductosActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Con_Productos.setVisible(true);
        
        ScrollProductos.setEnabled(true);
        ScrollProductos.setVisible(true);
        
        Tabla_Productos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Tabla_Productos.getTableHeader().setOpaque(false);
        Tabla_Productos.getTableHeader().setBackground(new Color(32, 136, 203));
        Tabla_Productos.getTableHeader().setForeground(new Color(0,0,0));
        Tabla_Productos.setRowHeight(25);
        
        //Metodo para que se impriman las tablas
        LimpiarTable();
        ListarProductos();
        
        
        
    }//GEN-LAST:event_Btn_ProductosActionPerformed

    private void Btn_TicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_TicketsActionPerformed

    private void Btn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClientesActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Con_Clientes.setVisible(true);
        
        ScrollClientes.setEnabled(true);
        ScrollClientes.setVisible(true);
        
        Tabla_Clientes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Tabla_Clientes.getTableHeader().setOpaque(false);
        Tabla_Clientes.getTableHeader().setBackground(new Color(32, 136, 203));
        Tabla_Clientes.getTableHeader().setForeground(new Color(0,0,0));
        Tabla_Clientes.setRowHeight(25);
        
        //Metodo para limbiar tablas y mostrarlas
        LimpiarTable();
        ListarClientes();
    }//GEN-LAST:event_Btn_ClientesActionPerformed

    private void Btn_ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ProveedoresActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Panel_Con_Proveedores.setVisible(true);
        
        
        ScrollProveedores.setEnabled(true);
        ScrollProveedores.setVisible(true);
        
        Tabla_Proveedores.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        Tabla_Proveedores.getTableHeader().setOpaque(false);
        Tabla_Proveedores.getTableHeader().setBackground(new Color(32, 136, 203));
        Tabla_Proveedores.getTableHeader().setForeground(new Color(0,0,0));
        Tabla_Proveedores.setRowHeight(25);
        
        //Metodo para que se impriman las tablas
        LimpiarTable();
        ListarProveedores();
    }//GEN-LAST:event_Btn_ProveedoresActionPerformed

    private void Subir_ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subir_ImagenActionPerformed
        //
    }//GEN-LAST:event_Subir_ImagenActionPerformed

    private void Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir1ActionPerformed

    }//GEN-LAST:event_Salir1ActionPerformed

    private void Subir_Imagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subir_Imagen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Subir_Imagen1ActionPerformed

    private void Nuevo_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_ClienteActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Agregar_Clientes.setVisible(true);
        
        OcultarTablas();
    }//GEN-LAST:event_Nuevo_ClienteActionPerformed

    private void Boton_Guardar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Guardar_ClientesActionPerformed
        if (!"".equals(TxtNombre_Cliente.getText()) || !"".equals(txtDireccion_Cliente.getText()) || !"".equals(txtTelefono_Cliente.getText()) || !"".equals(txtCorreo_Cliente.getText()) || !"".equals(txtCodigo_Clientes.getText())) {
            Cli.setID(Integer.parseInt(txtCodigo_Clientes.getText()));
            Cli.setNombre(TxtNombre_Cliente.getText());           
            Cli.setTelefono(txtTelefono_Cliente.getText());
            Cli.setCorreo(txtCorreo_Cliente.getText());
            Cli.setDireccion(txtDireccion_Cliente.getText());
            
            
            ProBD.RegistrarClientes(Cli);
            JOptionPane.showMessageDialog(null, "Cliente Registrado");
            LimpiarTable();
            ListarClientes();
            LimpiarClientes();
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_Boton_Guardar_ClientesActionPerformed

    private void Nuevo_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_ProductoActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Agregar_Productos.setVisible(true);
        
        OcultarTablas();
    }//GEN-LAST:event_Nuevo_ProductoActionPerformed

    private void txtGuardar_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardar_ProductosActionPerformed
        if (!"".equals(Pro_Cod.getText()) || !"".equals(Pro_Precio.getText()) || !"".equals(Pro_Stock.getText()) || !"".equals(Ubicacion.getText()) || !"".equals(Descripcion_Pro.getText()) || !"".equals(Pro_PreCompra.getText())) {
            Pro.setCodigo(Integer.parseInt(Pro_Cod.getText()));
            Pro.setDescripcion(Descripcion_Pro.getText());           
            Pro.setPrecio(Float.parseFloat(Pro_Precio.getText()));
            Pro.setStock(Integer.parseInt(Pro_Stock.getText()));
            Pro.setPrecioCompra(Integer.parseInt(Pro_PreCompra.getText()));
            Pro.setUbicacion(Ubicacion.getText());
            
            
            ProBD.RegistrarProductos(Pro);
            JOptionPane.showMessageDialog(null, "Productos Registrado");
            LimpiarTable();
            ListarProductos();
            LimpiarProductos();
            //cbxProveedorPro.removeAllItems();
            //llenarProveedor();
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_txtGuardar_ProductosActionPerformed

    private void Pestaña_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pestaña_ReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pestaña_ReportesActionPerformed

    private void Eliminar_Cliente_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_Cliente_BotonActionPerformed
        if (!"".equals(TxtCodigo_Producto.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(TxtCodigo_Producto.getText());
                UserBD.EliminarProductos(id);
                LimpiarTable();
                ListarProductos();
                TxtCodigo_Producto.setText("");
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                Panel_Configuracion.setVisible(true);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa el codigo de un producto");
        }
    }//GEN-LAST:event_Eliminar_Cliente_BotonActionPerformed

    private void Eliminar_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_ProductosActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Delete_Producto.setVisible(true);

        OcultarTablas();
    }//GEN-LAST:event_Eliminar_ProductosActionPerformed

    private void Pro_PreCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pro_PreCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pro_PreCompraActionPerformed

    private void Nuevo_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_EmpleadoActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Agregar_Empleado.setVisible(true);

        OcultarTablas();
    }//GEN-LAST:event_Nuevo_EmpleadoActionPerformed

    private void Eliminar_Productos_Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_Productos_Boton1ActionPerformed
        if (!"".equals(TxtCodigo_Cliente.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(TxtCodigo_Cliente.getText());
                UserBD.EliminarClientes(id);
                LimpiarTable();
                ListarClientes();
                TxtCodigo_Cliente.setText("");
                JOptionPane.showMessageDialog(null, "Clientes Eliminado");
                Panel_Configuracion.setVisible(true);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa el codigo de un producto");
        }
    }//GEN-LAST:event_Eliminar_Productos_Boton1ActionPerformed

    private void Eliminar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_ClienteActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado);
        Delete_Clientes.setVisible(true);
        
        OcultarTablas();

    }//GEN-LAST:event_Eliminar_ClienteActionPerformed

    private void Nuevo_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_ProveedorActionPerformed
        hide(Delete_Proveedores, Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado, Agregar_Empleado);
        Agregar_Proveedor.setVisible(true);
        
        OcultarTablas();
    }//GEN-LAST:event_Nuevo_ProveedorActionPerformed

    private void Eliminar_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_ProveedorActionPerformed
        hide(Delete_Proveedores, Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado, Agregar_Empleado);
        Delete_Proveedores.setVisible(true);
        
        OcultarTablas();

    }//GEN-LAST:event_Eliminar_ProveedorActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        if (!"".equals(txtIDEmpleado.getText()) || !"".equals(txtNombreEmpleado.getText()) || !"".equals(txtTelefonoEmpleado.getText()) || !"".equals(txtDireccionEmpleado.getText()) || !"".equals(txtCorreoEmpleado.getText()) || !"".equals(txtLoginEmpleado.getText()) | !"".equals(txtContraseñaEmpleado.getText())) {
            Emp.setCod_usuario(Integer.parseInt(txtIDEmpleado.getText()));
            Emp.setNombre(txtNombreEmpleado.getText()); 
            Emp.setTelefono(txtTelefonoEmpleado.getText());  
            Emp.setDireccion(txtDireccionEmpleado.getText());  
            Emp.setCorreo(txtCorreoEmpleado.getText());  
            Emp.setLogin(txtLoginEmpleado.getText());  
            Emp.setPassword(txtContraseñaEmpleado.getText());  

            ProBD.RegistrarEmpleado(Emp);
            JOptionPane.showMessageDialog(null, "Empleado Registrado");
            LimpiarTable();
            ListarEmpleados();
            LimpiarEmpleados();
            //cbxProveedorPro.removeAllItems();
            //llenarProveedor();
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void Eliminar_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_EmpleadoActionPerformed
        hide(Panel_Principal, Panel_Ventas, Panel_Acceso, Panel_Almacen, Agregar_Productos, Panel_Configuracion, Panel_Conf_Sistema, Panel_Con_Clientes, Agregar_Clientes, Panel_Con_Productos, Delete_Producto, Delete_Clientes, Panel_Con_Empleados, Panel_Con_Proveedores, Delete_Empleado, Agregar_Empleado);
        Delete_Empleado.setVisible(true);
        
        OcultarTablas();
    }//GEN-LAST:event_Eliminar_EmpleadoActionPerformed

    private void Eliminar_Productos_Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_Productos_Boton2ActionPerformed
        if (!"".equals(TxtCodigo_Empleado.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(TxtCodigo_Cliente.getText());
                UserBD.EliminarEmpleados(id);
                LimpiarTable();
                ListarEmpleados();
                TxtCodigo_Empleado.setText("");
                JOptionPane.showMessageDialog(null, "Empleado Eliminado");
                Panel_Configuracion.setVisible(true);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa el codigo de un producto");
        }
    }//GEN-LAST:event_Eliminar_Productos_Boton2ActionPerformed

    private void Btn_EliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarProveedorActionPerformed
            if (!"".equals(TxtCodigo_Proveedor.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                int id = Integer.parseInt(TxtCodigo_Proveedor.getText());
                UserBD.EliminarProveedor(id);
                LimpiarTable();
                ListarProveedores();
                TxtCodigo_Proveedor.setText("");
                JOptionPane.showMessageDialog(null, "Proveedor Eliminado");
                Panel_Configuracion.setVisible(true);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa el codigo de un producto");
        }
    }//GEN-LAST:event_Btn_EliminarProveedorActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        if (!"".equals(txtIDProveedor.getText()) || !"".equals(txtNombreProveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText()) || !"".equals(txtCorreoProveedor.getText())) {
            Prove.setID(Integer.parseInt(txtIDProveedor.getText()));
            Prove.setNombre(txtNombreProveedor.getText()); 
            Prove.setTelefono(txtTelefonoProveedor.getText());  
            Prove.setDireccion(txtDireccionProveedor.getText());  
            Prove.setCorreo(txtCorreoProveedor.getText());   

            ProBD.RegistrarProveedor(Prove);
            JOptionPane.showMessageDialog(null, "Proveedor Registrado");
            LimpiarTable();
            ListarProveedores();
            LimpiarProveedores();
            //cbxProveedorPro.removeAllItems();
            //llenarProveedor();
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        // TODO add your handling code here:&
    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void txtCodigoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyTyped

    }//GEN-LAST:event_txtCodigoVentaKeyTyped

    private void txtDescripcionVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionVentaKeyTyped

    }//GEN-LAST:event_txtDescripcionVentaKeyTyped

    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtCantidadVentaKeyPressed

    private void txtCantidadVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCantidadVentaKeyTyped

    private void Boton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AccederActionPerformed
        
    }//GEN-LAST:event_Boton_AccederActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Panel_Round_JWC Agregar_Clientes;
    private swing.Panel_Round_JWC Agregar_Empleado;
    private swing.Panel_Round_JWC Agregar_Productos;
    private swing.Panel_Round_JWC Agregar_Proveedor;
    private swing.Btn_Round_JWC Boton_Acceder;
    private swing.Btn_Round_JWC Boton_Acceso;
    private swing.Btn_Round_JWC Boton_AcercaDe;
    private swing.Btn_Round_JWC Boton_Almacen;
    private swing.Btn_Round_JWC Boton_Guardar_Clientes;
    private swing.Btn_Round_JWC Boton_Ventas;
    private swing.Btn_Round_JWC Btn_AjustesGlobales;
    private swing.Btn_Round_JWC Btn_Clientes;
    private swing.Btn_Round_JWC Btn_EliminarProveedor;
    private swing.Btn_Round_JWC Btn_Productos;
    private swing.Btn_Round_JWC Btn_Proveedores;
    private swing.Btn_Round_JWC Btn_Tickets;
    private swing.Btn_Round_JWC Btn_Usuarios;
    private swing.Btn_Round_JWC CerrarSesion;
    private swing.Panel_Round_JWC Delete_Clientes;
    private swing.Panel_Round_JWC Delete_Empleado;
    private swing.Panel_Round_JWC Delete_Producto;
    private swing.Panel_Round_JWC Delete_Proveedores;
    private javax.swing.JTextField Descripcion_Pro;
    private swing.Btn_Round_JWC Eliminar_Cliente;
    private swing.Btn_Round_JWC Eliminar_Cliente_Boton;
    private swing.Btn_Round_JWC Eliminar_Empleado;
    private swing.Btn_Round_JWC Eliminar_Productos;
    private swing.Btn_Round_JWC Eliminar_Productos_Boton1;
    private swing.Btn_Round_JWC Eliminar_Productos_Boton2;
    private swing.Btn_Round_JWC Eliminar_Proveedor;
    private javax.swing.JTextField Empresa_Sistema;
    private javax.swing.JTextField Localidad_Sistema;
    private swing.Btn_Round_JWC Minimizar;
    private swing.Btn_Round_JWC Nuevo_Cliente;
    private swing.Btn_Round_JWC Nuevo_Empleado;
    private swing.Btn_Round_JWC Nuevo_Producto;
    private swing.Btn_Round_JWC Nuevo_Proveedor;
    private swing.Panel_Round_JWC Panel_Acceso;
    private swing.Panel_Round_JWC Panel_Almacen;
    private swing.Panel_Round_JWC Panel_Con_Clientes;
    private swing.Panel_Round_JWC Panel_Con_Empleados;
    private swing.Panel_Round_JWC Panel_Con_Productos;
    private swing.Panel_Round_JWC Panel_Con_Proveedores;
    private swing.Panel_Round_JWC Panel_Conf_Sistema;
    private swing.Panel_Round_JWC Panel_Configuracion;
    private swing.Panel_Round_JWC Panel_Principal;
    private swing.Panel_Round_JWC Panel_Ventanas;
    private swing.Panel_Round_JWC Panel_Ventas;
    private swing.Panel_Round_JWC Paneles_Categorias;
    private btn_borde_01_jwc.Btn_Borde01_JWC Pestaña_Configuracion;
    private btn_borde_01_jwc.Btn_Borde01_JWC Pestaña_Reportes;
    private btn_borde_01_jwc.Btn_Borde01_JWC Pestaña_Ventas;
    private javax.swing.JTextField Pro_Cod;
    private javax.swing.JTextField Pro_PreCompra;
    private javax.swing.JTextField Pro_Precio;
    private javax.swing.JTextField Pro_Stock;
    private swing.Btn_Round_JWC Salir;
    private swing.Btn_Round_JWC Salir1;
    private javax.swing.JScrollPane ScrollClientes;
    private javax.swing.JScrollPane ScrollProductos;
    private javax.swing.JScrollPane ScrollProveedores;
    private javax.swing.JScrollPane ScrollVentas;
    private swing.Btn_Round_JWC Subir_Imagen;
    private swing.Btn_Round_JWC Subir_Imagen1;
    private javax.swing.JTable Tabla_Clientes;
    private javax.swing.JTable Tabla_Empleado_Con;
    private javax.swing.JScrollPane Tabla_Empleados;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JTable Tabla_Proveedores;
    private javax.swing.JTable TableVenta;
    private javax.swing.JTextField Telefono_Sistema;
    private javax.swing.JTextField TxtCodigo_Cliente;
    private javax.swing.JTextField TxtCodigo_Empleado;
    private javax.swing.JTextField TxtCodigo_Producto;
    private javax.swing.JTextField TxtCodigo_Proveedor;
    private javax.swing.JTextField TxtNombre_Cliente;
    private javax.swing.JTextField Ubicacion;
    private swing.Btn_Round_JWC btnGuardarEmpleado;
    private swing.Btn_Round_JWC btnGuardarProveedor;
    private swing.Img_Autosize_JWC img_Autosize_JWC1;
    private swing.Img_Round_JWC img_Round_JWC1;
    private swing.Img_Round_JWC img_Round_JWC2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private swing.Panel_Round_JWC panel_Round_JWC1;
    private swing.Panel_Round_JWC panel_Round_JWC10;
    private swing.Panel_Round_JWC panel_Round_JWC11;
    private swing.Panel_Round_JWC panel_Round_JWC12;
    private swing.Panel_Round_JWC panel_Round_JWC13;
    private swing.Panel_Round_JWC panel_Round_JWC14;
    private swing.Panel_Round_JWC panel_Round_JWC15;
    private swing.Panel_Round_JWC panel_Round_JWC16;
    private swing.Panel_Round_JWC panel_Round_JWC2;
    private swing.Panel_Round_JWC panel_Round_JWC3;
    private swing.Panel_Round_JWC panel_Round_JWC4;
    private swing.Panel_Round_JWC panel_Round_JWC5;
    private swing.Panel_Round_JWC panel_Round_JWC6;
    private swing.Panel_Round_JWC panel_Round_JWC8;
    private swing.Panel_Round_JWC panel_Round_JWC9;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtCodigo_Clientes;
    private javax.swing.JTextField txtContraseñaEmpleado;
    private javax.swing.JTextField txtCorreoEmpleado;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtCorreo_Cliente;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtDireccionEmpleado;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtDireccion_Cliente;
    private swing.Btn_Round_JWC txtGuardar_Productos;
    private javax.swing.JTextField txtIDEmpleado;
    private javax.swing.JTextField txtIDProveedor;
    private javax.swing.JTextField txtLoginEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtTelefonoEmpleado;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTelefono_Cliente;
    // End of variables declaration//GEN-END:variables

    public void LimpiarClientes(){
        txtCodigo_Clientes.setText("");
        TxtNombre_Cliente.setText("");
        txtTelefono_Cliente.setText("");
        txtCorreo_Cliente.setText("");
        txtDireccion_Cliente.setText("");    
    }
    
    public void LimpiarProductos(){
        Pro_Cod.setText("");
        Descripcion_Pro.setText("");
        Pro_Precio.setText("");
        Pro_Stock.setText("");
        Pro_PreCompra.setText("");
        Ubicacion.setText("");
    }
    
    public void LimpiarEmpleados(){
        txtIDEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtTelefonoEmpleado.setText("");
        txtDireccionEmpleado.setText("");
        txtCorreoEmpleado.setText("");
        txtLoginEmpleado.setText("");
        txtContraseñaEmpleado.setText("");
    }

        public void LimpiarProveedores(){
        txtIDProveedor.setText("");
        txtNombreProveedor.setText("");
        txtTelefonoProveedor.setText("");
        txtDireccionProveedor.setText("");
        txtCorreoProveedor.setText("");
    }
}

