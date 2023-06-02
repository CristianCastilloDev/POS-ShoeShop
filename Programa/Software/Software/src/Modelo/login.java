
package Modelo;

public class login {

    //Declarar Variables
    private int ID;
    private String Nombre;
    private String Login;
    private String Password;
    
    //Constructores
    public login(){
        this.ID = 0;
        this.Nombre = "";
        this.Login = "";
        this.Password = "";
    }
    
    public login(int ID, String Nombre, String Login, String Password){
        this.ID = ID;
        this.Nombre = Nombre;
        this.Login = Login;
        this.Password = Password;
    }
    
    public login(login User){
        this.ID = User.ID;
        this.Nombre = User.Nombre;
        this.Login = User.Login;
        this.Password = User.Password;
    }
    
    //Set y get

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
