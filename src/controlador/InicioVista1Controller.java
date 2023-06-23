/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


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

    @FXML
    private void nuevoclick(ActionEvent event) {
         if (event.getSource() == BotonH){
            PnlH.toFront();
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
}
