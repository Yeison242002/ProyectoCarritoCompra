
package modelo;


public class Usuario extends Tarjeta{
    
    private String contrasena;
    private String conContrasena;
    private String nombre;
    private String telefono;
    private String Gmail;
    private String direccion;
    private String ciudad;
    private Tarjeta lista[];
    private int tam;
    private Usuario siguiente;
    private Tarjeta tarjeta;

    public Usuario() {
        siguiente = null;
      
    }
    public Usuario(String nombre, String Gmail, String telefono, String direccion, String ciudad, String contrasena, String conContrasena) {
        this.nombre = nombre;
        this.Gmail = Gmail;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.contrasena = contrasena;
        this.conContrasena = conContrasena;
    }

   
    
    public void listaAcudientes() {
        lista = new Tarjeta[tam];
    }
    public String getContrasena() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getConContrasena() {
        return conContrasena;
    }

    public void setConContraseña(String conContrasena) {
        this.conContrasena = conContrasena;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String  getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setEdad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Tarjeta[] getLista() {
        return lista;
    }

    public void setLista(int pos, Tarjeta tarjeta) {
        this.lista[pos] = tarjeta;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
     public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
