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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class RegistroVisual2Controller implements Initializable {
    
    private Vista1Controller  controllerVista1;
    private Vista1Controller Vista1Controller ;
    private Stage stage;
    
    //private Vista1Controller Vista1Controller;
    @FXML
    private Button canclR;
    @FXML
    private Button regsR;
    @FXML
    private TextField nomR;
    @FXML
    private TextField telR;
    @FXML
    private TextField diccR;
    @FXML
    private TextField ciuR;
    @FXML
    private TextField contR;
    @FXML
    private TextField confR;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   

   public void init(Stage stage, Vista1Controller aThis) {
        
        this.controllerVista1 = Vista1Controller;
        this.stage = stage;
        
    }
   public static void cerrarVentana(ActionEvent e) {
                     
}
   
   

    @FXML
    private void cancelarR(ActionEvent event) {
     try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Vista1.fxml"));
        Parent root = loader.load();
        Vista1Controller controller = loader.getController();
        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        //controller.initj(stage,this);
        stage.show();
        this.stage.close();
    }catch (IOException e){System.out.println(e.getMessage());
     }
    }

    @FXML
    private void registrarseR(ActionEvent event) {
    }

    @FXML
    private void nombreR(ActionEvent event) {
    }

    @FXML
    private void telefonoR(ActionEvent event) {
    }

    @FXML
    private void direccionR(ActionEvent event) {
    }

    @FXML
    private void ciudadR(ActionEvent event) {
    }

    @FXML
    private void contrasenaR(ActionEvent event) {
    }

    @FXML
    private void confContraseñaR(ActionEvent event) {
    }

    
    
    
}
