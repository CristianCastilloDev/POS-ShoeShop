
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DatosTablas {
    Connect cn = new Connect();
    Connection con = cn.getConnection(); 
    PreparedStatement ps;
    ResultSet rs;
    
    
    public List ListarProductos(){
    List<Producto> Listapro = new ArrayList();
    String sql = "SELECT * FROM producto";
    
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery(); 
           while(rs.next()){
                Producto pro = new Producto();
                pro.setCodigo(rs.getInt("cod_pro"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setPrecio(rs.getFloat("precio"));
                pro.setStock(rs.getInt("Stock"));
                pro.setPrecioCompra(rs.getFloat("precio_compra"));
                pro.setUbicacion(rs.getString("ubicacion"));
                Listapro.add(pro);
                        
        }
      
        }catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Listapro;
   }
    
    public List ListarClientes(){
    List<Clientes> Listacli = new ArrayList();
    String sql = "SELECT * FROM cliente";
    
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery(); 
           while(rs.next()){
                Clientes cli = new Clientes();
                cli.setID(rs.getInt("cod_cli"));
                cli.setNombre(rs.getString("nom_cli"));
                cli.setTelefono(rs.getString("tel_cli"));
                cli.setCorreo(rs.getString("email_cli"));
                cli.setDireccion(rs.getString("dir_cli"));
                Listacli.add(cli);                    
        }
      
        }catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Listacli;
   }
    
    public List ListarEmpleado(){
        List<Empleados> Listapr = new ArrayList();
        String sql = "SELECT * FROM usuario";
        try {
             con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery(); 
            while (rs.next()) {                
                Empleados pr = new Empleados();
                pr.setCod_usuario(rs.getInt("cod_usuario"));
                pr.setNombre(rs.getString("nombre"));
                pr.setTelefono(rs.getString("telefono"));
                pr.setDireccion(rs.getString("direccion"));
                pr.setCorreo(rs.getString("email"));
                pr.setLogin(rs.getString("login"));
                pr.setPassword(rs.getString("password"));
                Listapr.add(pr);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapr;
    }
    
    public boolean RegistrarProductos(Producto pro){
        String sql = "INSERT INTO producto (cod_pro,descripcion, precio, stock, precio_compra,ubicacion) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, pro.getCodigo());
            ps.setString(2, pro.getDescripcion());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getStock());
            ps.setDouble(5, pro.getPrecioCompra());
            ps.setString(6, pro.getUbicacion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean RegistrarClientes(Clientes cli){
        String sql = "INSERT INTO cliente (cod_cli, nom_cli, tel_cli, email_cli, dir_cli) VALUES (?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setInt   (1, cli.getID());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getCorreo());
            ps.setString(5, cli.getDireccion());
            ps.execute();
            return true;
        } catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List ListarProveedores(){
        List<Proveedores> Listapr = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); 
            while (rs.next()) {                
                Proveedores prov = new Proveedores();
                prov.setID(rs.getInt("cod_proveedor"));
                prov.setNombre(rs.getString("nombre_proveedor"));
                prov.setTelefono(rs.getString("telefono_proveedor"));
                prov.setDireccion(rs.getString("direccion"));
                prov.setCorreo(rs.getString("email"));
                Listapr.add(prov);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapr;
    }
    
    public boolean RegistrarEmpleado(Empleados emp){
        
        String sql = "INSERT INTO usuario (cod_usuario,nombre, telefono, direccion, email,login, password) VALUES (?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, emp.getCod_usuario());
            ps.setString(2, emp.getNombre());
            ps.setString(3, emp.getTelefono());
            ps.setString(4, emp.getDireccion());
            ps.setString(5, emp.getCorreo());
            ps.setString(6, emp.getLogin());
            ps.setString(7, emp.getPassword());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }      
    }
    
    public boolean RegistrarProveedor(Proveedores emp){
        
        String sql = "INSERT INTO proveedor (cod_proveedor,nombre_proveedor, telefono_proveedor, direccion, email) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, emp.getID());
            ps.setString(2, emp.getNombre());
            ps.setString(3, emp.getTelefono());
            ps.setString(4, emp.getDireccion());
            ps.setString(5, emp.getCorreo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }      
    }


}
