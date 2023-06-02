/*
Descripcion: java Productos, atributos y metodos, encapsulamiento.
Fecha:13-Agosto-2022
Nombre:Braulio Ricardo Lopez Chavez
 */
package Modelo;

public class Empleados {
    //atributos
    private int cod_usuario;
    private String nombre;
    private String Telefono;
    private String Direccion;
    private String Correo;
    private String Login;
    private String Password;
    
    
    public Empleados(){
        
    }
    
    public Empleados(int cod_usuario,String nombre,String Telefono,String Direccion, String Correo, String Login, String Password){
        this.cod_usuario = cod_usuario;
        this.nombre = nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Login = Login;
        this.Password = Password;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
