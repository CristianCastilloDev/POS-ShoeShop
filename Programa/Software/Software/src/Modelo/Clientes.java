
package Modelo;

public class Clientes {
    //Atributos
    private int ID;
    private String Nombre;
    private String Telefono;
    private String Correo;
    private String Direccion;
   
    //Constructores
    
    public Clientes(){
        this.ID = 0;
        this.Nombre = "";
        this.Telefono = "";
        this.Correo = "";
        this.Direccion = "";
    }
    public Clientes(int ID, String Nombre, String Telefono){
        this.ID = ID;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
    }
    public Clientes(Clientes Cli){
        this.ID = Cli.ID;
        this.Nombre = Cli.Nombre;
        this.Telefono = Cli.Telefono;
        this.Correo = Cli.Correo;
        this.Direccion = Cli.Direccion;
    }
    
    //Set y gets

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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}

