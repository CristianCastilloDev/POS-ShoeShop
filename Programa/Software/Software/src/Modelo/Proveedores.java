/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Proveedores {
    //Atributos
    private int ID;
    private String Nombre;
    private String Telefono;
    private String Direccion;
    private String Correo;
    
    //Constructores
    public Proveedores(){
        this.ID = 0;
        this.Nombre = "";
        this.Telefono = "";
        this.Direccion = "";
        this.Correo = "";
    }
    
    
    public Proveedores(int ID, String Nombre, String Telefono, String Direccion, String Correo){
        this.ID = ID;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Correo = Correo;
    }
    
    public Proveedores(Proveedores pros){
        this.ID = pros.ID;
        this.Nombre = pros.Nombre;
        this.Telefono = pros.Telefono;
        this.Direccion = pros.Direccion;
        this.Correo = pros.Correo;
    }



    //Sets y gets
    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
    
    
    
}
