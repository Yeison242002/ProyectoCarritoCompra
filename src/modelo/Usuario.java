
package modelo;


public class Usuario {
    

    private String nombre;
    private long telefono;
    private String Gmail;
    private String direccion;
    private String ciudad;
    private Tarjeta lista[];
    private int tam;
    private Usuario siguiente;

    public Usuario() {
        siguiente = null;
      
    }

    public void listaAcudientes() {
        lista = new Tarjeta[tam];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long  getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
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
}
