/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */package controlador;

import java.io.BufferedReader;
import java.io.File;
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

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

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    @FXML
    private void usuario(ActionEvent event) {
    }

    @FXML
    private void contrasena(ActionEvent event) {
    }

    public class MyController {
    @FXML
   

    public void initialize() {
        Bolvidar.getStyleClass().add("hovered-button");
        Bolvidar.setOnMouseEntered(event -> Bolvidar.getStyleClass().add("hovered-button"));
        Bolvidar.setOnMouseExited(event -> Bolvidar.getStyleClass().remove("hovered-button"));
    }
}
    
    @FXML
    private void click1(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/RegistroVisual2.fxml"));
            Parent root = loader.load();
            RegistroVisual2Controller controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            controller.init(stage, this);
            stage.show();
            this.stage.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private void clickR(ActionEvent event) {
        String telefonoRecuperar = JOptionPane.showInputDialog(null, "Por favor, ingrese su número de teléfono:");

        // Validar el número de teléfono
        if (validarTelefonoRecuperar(telefonoRecuperar)) {
            mostrarMensajeInformacion("Recuperación de contraseña", "Un asesor se comunicará lo antes posible.");
        } else {
            mostrarMensajeError("Error", "El número de teléfono no coincide con nuestros registros.");
        }
    }

    private void mostrarMensajeInformacion(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private boolean validarTelefonoRecuperar(String telefonoRecuperar) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("usuarios.txt"));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Verificar si la línea contiene el número de teléfono
                if (line.contains("Teléfono: " + telefonoRecuperar)) {
                    bufferedReader.close();
                    return true; // Número de teléfono válido
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // Número de teléfono inválido
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
        String cCorreo = usuariollenar.getText().trim();
        String cContraseña = contrasenallenar.getText().trim();

        System.out.println("Correo: " + cCorreo);
        System.out.println("Contraseña: " + cContraseña);

        File file = new File("usuarios.txt");
        System.out.println(file.getAbsolutePath());

        // Validar que los campos no estén vacíos
        if (cCorreo.isEmpty() || cContraseña.isEmpty()) {
            mostrarMensajeError("Error", "Por favor, ingrese el teléfono o correo y la contraseña.");
            return;
        }

        // Verificar si los datos de inicio de sesión son válidos
        if (verificarCredenciales(cCorreo, cContraseña)) {
            mostrarMensajeError("Error", "Los datos de inicio de sesión son incorrectos.");
            return;
        }

        // Abrir la siguiente ventana
        abrirVentanaExistente("/vista/InicioVista1.fxml");

        // Cerrar la ventana actual
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    private boolean verificarCredenciales(String cCorreo, String cContraseña) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("usuarios.txt"));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Verificar si la línea comienza con el correo electrónico y la contraseña
                System.out.println("Comparando línea: " + line);
                if (line.contains("Correo: " + cCorreo) && line.contains("Contraseña: " + cContraseña)) {
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
