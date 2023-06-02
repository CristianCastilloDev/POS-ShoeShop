
package Modelo;


public class Producto {
    //Atributos
    private int Codigo;
    private String Descripcion;
    private float Precio;
    private int Stock;
    private float PrecioCompra;
    private String Ubicacion;
    //Constructor
    
    public Producto(){
        this.Codigo = 0;
        this.Descripcion = "";
        this.Precio = 0.0f;
        this.Stock = 0;
        this.PrecioCompra = 0.0f;
        this.Ubicacion = "";
    }
    
    public Producto(int Codigo, String Descripcion, float Precio, int Stock, float PrecioCompra, String Ubicacion){
        
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Stock = Stock;
        this.PrecioCompra = PrecioCompra;
        this.Ubicacion = Ubicacion;       
    }
    
    public Producto (Producto Config){
                
        this.Codigo = Config.Codigo;
        this.Descripcion = Config.Descripcion;
        this.Precio = Config.Precio;
        this.Stock = Config.Stock;
        this.PrecioCompra = Config.PrecioCompra;
        this.Ubicacion = Config.Ubicacion; 
    }
    
    //Set y get

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(float PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
    
}
