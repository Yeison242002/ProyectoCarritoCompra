/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.awt.Insets;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.geometry.*;
import java.awt.Insets;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableView;
import modelo.ElementoCarrito;
import modelo.Productos;
import modelo.ElementoCarrito;

public class InicioVista1Controller implements Initializable {
    
    private CarritoComprasController carritoComprasController;
    private CarritoComprasController CarritoComprasController;

    @FXML
    private TableView<Productos> tablaCarrito;

    private Button botonAgregarAlCarrito;

    @FXML
    private Pane PnlA, PnlB, PnlD, PnlE, PnlG, PnlH;

    private Vista1Controller controllerVista1;
    private Vista1Controller Vista1Controller;
    private Stage stage;

    @FXML
    private Pane Pnlc;

    @FXML
    private Pane PnlF;

    @FXML
    private Button BotonC;

    @FXML
    private Button nuevo;

    @FXML
    private Button nuevo1;

    @FXML
    private Button nuevo2;

    @FXML
    private Button descuento;

    @FXML
    private Button descuento1;

    @FXML
    private Button descuento2;

    @FXML
    private Button descuento3;

    @FXML
    private Button BotonD;

    @FXML
    private Button BotonE;

    @FXML
    private Button BotonF;

    @FXML
    private Button BotonB;

    @FXML
    private Button BotonG;

    @FXML
    private Button BotonH;

    @FXML
    private Button BotonA;

    @FXML
    private ImageView off;

    @FXML
    private Button usu;

    @FXML
    private ImageView Busuario;

    @FXML
    private Pane PnlG1;

    @FXML
    private Button Bpm1;

    @FXML
    private Button Bgo1;

    @FXML
    private Button Bb1;

    @FXML
    private Button Bb2;

    @FXML
    private Button Bsh3;

    @FXML
    private Button Bsh4;

    @FXML
    private Button Bcm1;

    @FXML
    private Button g;

    @FXML
    private Button f;

    @FXML
    private Button e;

    @FXML
    private Button h;

    @FXML
    private Button k;

    @FXML
    private Button j;

    @FXML
    private Button i;

    @FXML
    private Button l;

    @FXML
    private Button nn;

    @FXML
    private Button m;

    @FXML
    private Button n;

    @FXML
    private Button o;

    @FXML
    private Button p;

    @FXML
    private Button t;

    @FXML
    private Button q;

    @FXML
    private Button r;

    @FXML
    private Button s;

    @FXML
    private Button u;

    @FXML
    private Button x;

    @FXML
    private Button w;

    @FXML
    private Button v;

    @FXML
    private Button ad;

    @FXML
    private Button ac;

    @FXML
    private Button y;

    @FXML
    private Button z;

    @FXML
    private Button ab;

    @FXML
    private Button a;

    @FXML
    private Button b;

    @FXML
    private Button c;

    @FXML
    private Button d;
    
    
 public void inito(Stage stage, Vista1Controller aThis) {
        
        this.controllerVista1 = Vista1Controller;
        this.stage = stage;
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carritoComprasController = new CarritoComprasController();

        // Configurar la tabla de productos y cargar los datos

        // Configurar el botón "Agregar al carrito" para agregar el producto seleccionado al carrito
        botonAgregarAlCarrito.setOnAction(e -> {
            Productos productoSeleccionado = tablaCarrito.getSelectionModel().getSelectedItem();
            if (productoSeleccionado != null) {
                agregarAlCarrito(productoSeleccionado);
                // Actualizar la interfaz de usuario según sea necesario
            }
        });
    }

    private void agregarAlCarrito(Productos producto) {
       
       // ElementoCarrito elementoCarrito = new ElementoCarrito(producto);
       // carritoComprasController.agregarProducto(elementoCarrito);
        System.out.println("Producto \"" + producto.getNombre() + "\" agregado al carrito.");
    }

    @FXML
    private void pantClick(ActionEvent event) {
        if (event.getSource() == BotonC) {
            Pnlc.toFront();
        }
    }

    @FXML
    private void calzClick(ActionEvent event) {
        if (event.getSource() == BotonD) {
            PnlD.toFront();
        }
    }

    @FXML
    private void vestidoClick(ActionEvent event) {
        if (event.getSource() == BotonE) {
            PnlE.toFront();
        }
    }

    @FXML
    private void accClick(ActionEvent event) {
        if (event.getSource() == BotonF) {
            PnlF.toFront();
        }
    }

    @FXML
    private void camisetasClick(ActionEvent event) {
        if (event.getSource() == BotonB) {
            PnlB.toFront();
        }
    }

    @FXML
    private void descuentoClick(ActionEvent event) {
        if (event.getSource() == BotonG) {
            PnlG.toFront();
        }
    }

    private void clickDescuento(ActionEvent event) {
        if (event.getSource() == descuento) {
            PnlG.toFront();
        }
    }

    @FXML
    private void nuevoclick(ActionEvent event) {
        if (event.getSource() == BotonH) {
            PnlH.toFront();
        }
    }

    @FXML
    private void clickNuevo(ActionEvent event) {
        if (event.getSource() == nuevo) {
            PnlH.toFront();
        } else if (event.getSource() == nuevo1) {
            PnlH.toFront();
        } else if (event.getSource() == nuevo2) {
            PnlH.toFront();
        }
    }

    @FXML
    private void clickDescuento1(ActionEvent event) {
        if (event.getSource() == descuento) {
            PnlG.toFront();
        } else if (event.getSource() == descuento1) {
            PnlG.toFront();
        } else if (event.getSource() == descuento2) {
            PnlG.toFront();
        } else if (event.getSource() == descuento3) {
            PnlG.toFront();
        }
    }

    @FXML
    private void Carritoclick(ActionEvent event) {
        if (event.getSource() == BotonA) {
            PnlA.toFront();
        }
    }

    @FXML
    private void clickOff(ActionEvent event) {
        Stage stage = (Stage) off.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void clickUsu(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/PerfilVisual4.fxml"));
            Parent root = loader.load();
            PerfilVisual4Controller controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            this.stage.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    @FXML
    private void clickboton(ActionEvent event) {
    }

   // @FXML
    //private void tabCarrito(SortEvent<C> event) {
    //}

    @FXML
    private void tabCarrito(SortEvent<ElementoCarrito> event) {
    }

    
}
