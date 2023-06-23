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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class Vista1Controller implements Initializable {

    @FXML
    private Button ingresar;
    @FXML
    private TextField usuariollenar;
    @FXML
    private TextField contrasenallenar;
    @FXML
    private Button registrar;
    @FXML
    private Button Bolvidar;

    public void show() {
        stage.show();
    }

    
    private Stage stage;
    /**
     * Initializes the controller class.
     */
   /* @FXML
    private void click(ActionEvent event) {
        System.out.println("hola mundo");
        //System.exit(0);
    }
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    
     
    /*
    void registrar(ActionEvent event)  {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/RegistroVisual2.fxml"));
        Parent root = loader.load();
        RegistroVisual2Controller controller = loader.getController();
        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(stage,this );
        stage.show();
        this.stage.close();
    }*/
    public void setStage(Stage primaryStage) {
        stage = primaryStage;
       
    }

    @FXML
    private void click(ActionEvent event) {
         try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/InicioVista1.fxml"));
        Parent root = loader.load();
        InicioVista1Controller controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.inito(stage,this );
        stage.show();
        this.stage.close();
    }catch (IOException e){System.out.println(e.getMessage());
     }
       
    }


    @FXML
    private void click1(ActionEvent event) {
         try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/RegistroVisual2.fxml"));
        Parent root = loader.load();
        RegistroVisual2Controller controller = loader.getController();
        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(stage,this );
        stage.show();
        this.stage.close();
    }catch (IOException e){System.out.println(e.getMessage());
     }
    }

    @FXML
    private void usuario(ActionEvent event) {
    }

    @FXML
    private void contrasena(ActionEvent event) {
    }
    @FXML
    private void clickR(ActionEvent event) {
         try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Recuperar.fxml"));
        Parent root = loader.load();
        RecuperarController controller = loader.getController();
        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.initu(stage,this );
        stage.show();
       // this.stage.close();
    }catch (IOException e){System.out.println(e.getMessage());
     }
    }


    
    
}
