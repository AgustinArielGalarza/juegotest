package juego.sistemas;

public class Items {
    private int ID;
    private int idSiguiente;
    private String nombre;
    private String descripcion;
    private int aumento;

    
     public Items(String nombre, String descripcion, int aumento) {
        this.idSiguiente++;
        this.ID= idSiguiente;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.aumento = aumento;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdSiguiente() {
        return idSiguiente;
    }

    public void setIdSiguiente(int idSiguiente) {
        this.idSiguiente = idSiguiente;
    }
     
     
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAumento() {
        return aumento;
    }

    public void setAumento(int aumento) {
        this.aumento = aumento;
    }

    
    
    
}
