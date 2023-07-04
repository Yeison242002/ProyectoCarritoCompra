package controlador;
import modelo.Productos;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import modelo.ElementoCarrito;

public class CarritoComprasController {
    private TableView<Productos> tablaCarrito;

    public CarritoComprasController(TableView<Productos> tablaCarrito) {
        this.tablaCarrito = tablaCarrito;
    }

    CarritoComprasController() {
    }

    public void agregarProducto(Productos producto) {
        tablaCarrito.getItems().add(producto);
    }

    public void eliminarProducto(Productos producto) {
        tablaCarrito.getItems().remove(producto);
    }

    public void vaciarCarrito() {
        tablaCarrito.getItems().clear();
    }

    public ObservableList<Productos> getListaProductos() {
        return tablaCarrito.getItems();
    }

    void agregarProducto(ElementoCarrito elementoCarrito) {
    }

    

    
}
