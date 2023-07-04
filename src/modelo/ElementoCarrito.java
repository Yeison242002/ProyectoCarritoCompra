
package modelo;
import modelo.Productos;
public class ElementoCarrito {
    private String nombreProducto;
    private String colorProducto;
    private String generoProducto;
    private String tipoProducto;
    private int idProducto;
    
    private Productos productos;
    
    public ElementoCarrito(Productos productos,int idProducto, String nombreProducto, String colorProducto,String generoProducto,String tipoProducto) {
        this.nombreProducto = nombreProducto;
        this.colorProducto = colorProducto;
        this.generoProducto = generoProducto;
        this.tipoProducto = tipoProducto;
        this.idProducto = idProducto;
       
        this.productos = productos;
    }
    
    public String getNombreP() {
        return nombreProducto;
    }

    public void setNombreP(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
     public String getColorP() {
        return colorProducto;
    }

    public void setColorP(String colorProducto) {
        this.colorProducto = colorProducto;
    }
     public String getGeneroP() {
        return generoProducto;
    }

    public void setGeneroP(String generoProducto) {
        this.generoProducto = generoProducto;
    }
     public String getTipoP() {
        return tipoProducto;
    }

    public void setTipoP(String tipoProducto) {
        this.nombreProducto = tipoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }
}
