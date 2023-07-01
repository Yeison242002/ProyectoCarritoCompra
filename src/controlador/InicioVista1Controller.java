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



 


/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class InicioVista1Controller implements Initializable {
     @FXML
     private Pane PnlA,PnlB,PnlD,PnlE,PnlG,PnlH;
    private Vista1Controller  controllerVista1;
   private Vista1Controller Vista1Controller ;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   public void inito(Stage stage, Vista1Controller aThis) {
        
        this.controllerVista1 = Vista1Controller;
        this.stage = stage;
        
    }

    @FXML
    private void pantClick(ActionEvent event) {
         if (event.getSource() == BotonC){
            Pnlc.toFront();
        }
    }

    @FXML
    private void calzClick(ActionEvent event) {
         if (event.getSource() == BotonD){
            PnlD.toFront();
        }
    }

    @FXML
    private void vestidoClick(ActionEvent event) {
         if (event.getSource() == BotonE){
            PnlE.toFront();
        }
    }

    @FXML
    private void accClick(ActionEvent event) {
         if (event.getSource() == BotonF){
            PnlF.toFront();
        }
    }

    @FXML
    private void camisetasClick(ActionEvent event) {
         if (event.getSource() == BotonB){
            PnlB.toFront();
        }
    }

    @FXML
    private void descuentoClick(ActionEvent event) {
         if (event.getSource() == BotonG){
            PnlG.toFront();
        }
    }
    private void clickDescuento(ActionEvent event) {
         if (event.getSource() == descuento){
            PnlG.toFront();
        }
    }

    @FXML
    private void nuevoclick(ActionEvent event) {
         if (event.getSource() == BotonH){
            PnlH.toFront();
        }
    }
     @FXML
    private void clickNuevo(ActionEvent event) {
         if (event.getSource() == nuevo){
            PnlH.toFront();
        }
        else if (event.getSource() == nuevo1){
            PnlH.toFront();
        }
      else if (event.getSource() == nuevo2){
            PnlH.toFront();
        }
       
    }
     @FXML
    private void clickDescuento1(ActionEvent event) {
         if (event.getSource() == descuento){
            PnlG.toFront();
        }
        else if (event.getSource() == descuento1){
            PnlG.toFront();
        }
      else if (event.getSource() == descuento2){
            PnlG.toFront();
        }
       else if (event.getSource() == descuento3){
            PnlG.toFront();
        }
    }

    @FXML
    private void Carritoclick(ActionEvent event) {
        if (event.getSource() == BotonA){
            PnlA.toFront();
        }
    }

    @FXML
    private void clickOff(ActionEvent event) {
         
        Stage stage= (Stage)
      this.off.getScene().getWindow();
      stage.close();
        }
   

    @FXML
    private void clickUsu(ActionEvent event) {
         try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/PerfilVisual4.fxml"));
        Parent root = loader.load();
        PerfilVisual4Controller controller = loader.getController();
        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        //controller.initj(stage,this);
        stage.show();
        this.stage.close();
    }catch (IOException e){System.out.println(e.getMessage());
     }
    }
    
    
   private void clickpanel (ActionEvent event){
       
   }

    @FXML
    private void clickboton(ActionEvent event) {
    }
    

 
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 400, 400);

        String[] buttonIds = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
            "k", "l", "m", "n", "nn", "o", "p", "q", "r", "s", 
            "t", "u", "y", "x", "z", "ab", "ac", "ad"
        };

        int buttonsPerRow = 9;

        for (int i = 0; i < buttonIds.length; i++) {
            Button button = new Button("Botón " + buttonIds[i]);
            button.setId(buttonIds[i]);
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    // Obtener el ID del botón que fue clicado
                    String buttonId = ((Button) event.getSource()).getId();
                    
                    // Mostrar mensaje preguntando si desea añadir al carrito
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Añadir al carrito");
                    alert.setHeaderText(null);
                    alert.setContentText("¿Desea añadir el artículo " + buttonId + " al carrito?");
                    alert.showAndWait();
                }
            });

            int row = i / buttonsPerRow;
            int column = i % buttonsPerRow;
            gridPane.add(button, column, row);
        }

        primaryStage.setTitle("Botones");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //public static void main(String[] args) {
      //  launch(args);
    }
    
    


