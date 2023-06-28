/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.scene.Node;

public class RegistroVisual2Controller implements Initializable {
      private Vista1Controller  controllerVista1;
    private Vista1Controller Vista1Controller ;
    private Stage stage;
    @FXML
    private TextField nomR;
    @FXML
    private TextField corrR;
    @FXML
    private TextField ciuR;
    @FXML
    private TextField paiR;
    @FXML
    private TextField telR;
    @FXML
    private TextField diccR;
    @FXML
    private TextField contR;
    @FXML
    private TextField confR;
    private Stage stagee;
    @FXML
    private Button canclR;
    @FXML
    private Button regsR;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void init(Stage stage) {
        this.stagee = stage;
    }
      public void init(Stage stage, Vista1Controller aThis) {
        
        this.controllerVista1 = Vista1Controller;
        this.stagee = stage;
        
    }

    @FXML
    private void cancelarR(ActionEvent event) {
        // Cerrar la ventana actual
        stagee.close();
    }

    @FXML
    private void registrarseR(ActionEvent event) {
        String nombre = nomR.getText();
        String ciudad = ciuR.getText();
        String pais = paiR.getText();
        String telefono = telR.getText();
        String correo = corrR.getText();
        String direccion = diccR.getText();
        String contrasena = contR.getText();
        String confirmacionContrasena = confR.getText();

        // Validar que los campos no estén vacíos y que la contraseña y confirmación coincidan
        if (nombre.isEmpty() || ciudad.isEmpty() || pais.isEmpty() || telefono.isEmpty() ||
                correo.isEmpty() || direccion.isEmpty() || contrasena.isEmpty() || confirmacionContrasena.isEmpty()) {
            mostrarMensajeError("Error", "Por favor, complete todos los campos.");
            return;
        }

        if (!contrasena.equals(confirmacionContrasena)) {
            mostrarMensajeError("Error", "La contraseña y la confirmación no coinciden.");
            return;
        }

        // Validar la contraseña
        if (!validarContrasena(contrasena)) {
            mostrarMensajeError("Error", "La contraseña debe tener al menos 8 dígitos, una mayúscula y un símbolo.");
            return;
        }

        // Validar el teléfono
        if (!validarTelefono(telefono)) {
            mostrarMensajeError("Error", "El teléfono debe tener 10 dígitos.");
            return;
        }

        // Validar el correo electrónico
        if (!validarCorreo(correo)) {
            mostrarMensajeError("Error", "El correo electrónico debe tener la extensión @yxxs.com.");
            return;
        }
       if (!validarDatosRepetidos(correo, telefono)) {
        mostrarMensajeError("Error", "El correo o el teléfono ya están registrados.");
        return;
    }


        // Guardar los datos en un archivo
        guardarDatosUsuario(nombre, ciudad, pais, telefono, correo, direccion, contrasena);

        // Limpiar los campos de texto
        limpiarCampos();

        // Cerrar la ventana actual
       abrirVentanaExistente("/vista/Vista1.fxml");
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.close();
    }

    private void guardarDatosUsuario(String nombre, String ciudad, String pais, String telefono,
                                     String correo, String direccion, String contrasena) {
        try {
            FileWriter fileWriter = new FileWriter("usuarios.txt", true);
            fileWriter.write("Nombre: " + nombre + "\n");
            fileWriter.write("Ciudad: " + ciudad + "\n");
            fileWriter.write("País: " + pais + "\n");
            fileWriter.write("Teléfono: " + telefono + "\n");
            fileWriter.write("Correo: " + correo + "\n");
            fileWriter.write("Dirección: " + direccion + "\n");
            fileWriter.write("Contraseña: " + contrasena + "\n");
            fileWriter.write("--------------------\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void limpiarCampos() {
        nomR.clear();
        ciuR.clear();
        paiR.clear();
        telR.clear();
        corrR.clear();
        diccR.clear();
        contR.clear();
        confR.clear();
    }
     private void abrirVentanaExistente(String rutaFXML) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(rutaFXML));
            Parent root = fxmlLoader.load();
            Stage nuevaVentana = new Stage();
            nuevaVentana.setScene(new Scene(root));
            nuevaVentana.show();

            // Cerrar la ventana actual
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarMensajeError(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private boolean validarContrasena(String contrasena) {
        // Validar que la contraseña tenga al menos 8 dígitos, una mayúscula y un símbolo
        return contrasena.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$");
    }

    private boolean validarTelefono(String telefono) {
        // Validar que el teléfono tenga 10 dígitos
        return telefono.matches("\\d{10}");
    }

    private boolean validarCorreo(String correo) {
        // Validar que el correo tenga la extensión @yxxs.com
        return correo.endsWith("@yxxs.com");
    }
    private boolean validarDatosRepetidos(String correo, String telefono) {
    try {
        File file = new File("usuarios.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("Correo: " + correo) || line.contains("Teléfono: " + telefono)) {
                scanner.close();
                return false;
            }
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    return true;
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

    @FXML
    private void correoR(ActionEvent event) {
    }
  
}
