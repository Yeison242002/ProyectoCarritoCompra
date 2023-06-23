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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class RecuperarController implements Initializable {

    private Vista1Controller  controllerVista1;
    private Vista1Controller Vista1Controller ;
    private Stage stage;
    @FXML
    private Button Bok;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

     public void initu(Stage stage, Vista1Controller aThis) {
        
        this.controllerVista1 = Vista1Controller;
        this.stage = stage;
        
    }

    @FXML
    private void click(ActionEvent event) {
        Bok.setOnAction(e -> System.out.println("¡Hola, mundo!"));

    }

    
}
