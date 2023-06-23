/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class PerfilVisual4Controller implements Initializable {

    private Vista1Controller  controllerVista1;
    private Vista1Controller Vista1Controller ;
    private Stage stage;
    
    @FXML
    private Button editP;
    @FXML
    private TextField nomP;
    @FXML
    private TextField psP;
    @FXML
    private TextField telP;
    @FXML
    private TextField drccP;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
      public void initj(Stage stage, Vista1Controller aThis) {
        
        this.controllerVista1 = Vista1Controller;
        this.stage = stage;
        
    }

    @FXML
    private void editarP(ActionEvent event) {
    }

    @FXML
    private void nombreP(ActionEvent event) {
    }

    @FXML
    private void paisP(ActionEvent event) {
    }

    @FXML
    private void telefonoP(ActionEvent event) {
    }

    @FXML
    private void direccionP(ActionEvent event) {
    }
    
}
