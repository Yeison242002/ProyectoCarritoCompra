
package modelo;

public class Pantalones {

    private String nombre;
    private long telefono;
    private long id;

    public Pantalones(String nombre, long telefono, long id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
    }

    public Pantalones() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
