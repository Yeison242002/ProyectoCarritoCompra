/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

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
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    
     
   
    public void setStage(Stage primaryStage) {
        stage = primaryStage;
       
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
      
    }catch (IOException e){System.out.println(e.getMessage());
     }
    }
private void mostrarMensajeError(String titulo, String mensaje) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle(titulo);
    alert.setHeaderText(null);
    alert.setContentText(mensaje);
    alert.showAndWait();
}
    
     @FXML
     
        
    public void click(ActionEvent event) {
    
     String Correo = usuariollenar.getText().trim();
    String Contraseña = contrasenallenar.getText().trim();

    System.out.println("Correo: " + Correo);
    System.out.println("Contraseña: " + Contraseña);

    // Validar que los campos no estén vacíos
    if (Correo.isEmpty() || Contraseña.isEmpty()) {
        mostrarMensajeError("Error", "Por favor, ingrese el teléfono o correo y la contraseña.");
        return;
    }

    // Verificar si los datos de inicio de sesión son válidos
    if (verificarCredenciales(Correo, Contraseña)) {
        mostrarMensajeError("Error", "Los datos de inicio de sesión son incorrectos.");
        return;
    }

    // Abrir la siguiente ventana
    abrirVentanaExistente("/vista/InicioVista1.fxml");

    // Cerrar la ventana actual
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.close();
}

private boolean verificarCredenciales(String Correo, String Contraseña) {
    try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("usuarios.txt"));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            // Verificar si la línea comienza con el correo electrónico y la contraseña
            System.out.println("Comparando línea: " + line);
            if (line.startsWith("Correo: " + Correo) && line.startsWith("Contraseña: " + Contraseña)) {
                bufferedReader.close();
                return true; // Credenciales válidas
            }
        }

        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return false; // Credenciales inválidas
}


private void abrirVentanaExistente(String rutaFXML) {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(rutaFXML));
        Parent root = fxmlLoader.load();
        Stage nuevaVentana = new Stage();
        nuevaVentana.setScene(new Scene(root));
        nuevaVentana.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
        
    

