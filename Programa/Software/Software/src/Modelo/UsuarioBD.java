
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioBD {

    PreparedStatement ps;
    ResultSet rs;
    Connect cn = new Connect();
    Connection con = cn.getConnection();

    public login log(String login, String password){
        int resultado = 0;
        login l = new login();
        String sql = "SELECT * FROM usuario WHERE login = '"+login+"' and PASSWORD = '"+password+"';";
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            

            if(rs.next()){                
                resultado = 1;
                if(resultado == 1){
                    JOptionPane.showMessageDialog(null, "Bienvenido ");
                    new Vista.Inicio().setVisible(true);
                        
                    
                }                 
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña no validos");
                new Vista.Login().setVisible(true);
            }
        }catch (SQLException e){
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error, El usuario no existe en la base de datos");
        }
        return l;
    }
    
    
    public Producto BuscarProducto(){
        Producto conf = new Producto();
        String sql = "SELECT * FROM producto";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                conf.setCodigo(rs.getInt("Codigo"));
                conf.setDescripcion(rs.getString("Descripcion"));
                conf.setPrecio(rs.getFloat("Precio"));
                conf.setStock(rs.getInt("Stock"));
                conf.setPrecioCompra(rs.getFloat("PrecioCompra"));
                conf.setUbicacion(rs.getString("Ubicacion"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return conf;
    }   
    
    public boolean EliminarProductos(int id){
       String sql = "DELETE FROM producto WHERE cod_pro = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }   
    public boolean EliminarClientes(int id){
        String sql = "DELETE FROM cliente WHERE cod_cli = ?";
        try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
    }
    public boolean EliminarEmpleados(int id){
        String sql = "DELETE FROM usuario WHERE cod_usuario = ?";
        try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
    }    
    

    

public boolean EliminarProveedor(int id){
        String sql = "DELETE FROM proveedor WHERE cod_proveedor = ?";
        try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
    }
}
