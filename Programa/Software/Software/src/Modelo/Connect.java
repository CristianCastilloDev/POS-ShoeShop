package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/bdventas";
            con = DriverManager.getConnection(myBD, "root", "");
            System.out.println("Conectado con exito");
            return con;
        } catch (SQLException e) {
            System.out.println("Conexion sin exito");
            System.out.println(e.toString());
            System.exit(0);
        }
        return null;
    }

}

