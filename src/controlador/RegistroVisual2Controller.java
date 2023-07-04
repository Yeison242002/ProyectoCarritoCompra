package controlador;

import java.io.BufferedWriter;
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

import modelo.Tarjeta;
import modelo.Usuario;

public class RegistroVisual2Controller implements Initializable {
    private Vista1Controller controllerVista1;
    private Stage stage;
    private Tarjeta tarjeta;

    @FXML
    private TextField nomR;
    @FXML
    private TextField corrR;
    @FXML
    private TextField ciuR;
    @FXML
    private TextField telR;
    @FXML
    private TextField diccR;
    @FXML
    private TextField contR;
    @FXML
    private TextField confR;
    @FXML
    private Button canclR;
    @FXML
    private Button regsR;
    @FXML
    private TextField NumN;
    @FXML
    private TextField NumT;
    @FXML
    private TextField Fecha;
    @FXML
    private TextField cvv;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void init(Stage stage) {
        this.stage = stage;
    }

    public void init(Stage stage, Vista1Controller controllerVista1) {
        this.controllerVista1 = controllerVista1;
        this.stage = stage;
    }

    @FXML
    private void cancelarR(ActionEvent event) {
        // Cerrar la ventana actual
        stage.close();
    }

    @FXML
    private void registrarseR(ActionEvent event) {
        String nombre = nomR.getText();
        String ciudad = ciuR.getText();
        String telefono = telR.getText();
        String correo = corrR.getText();
        String direccion = diccR.getText();
        String contrasena = contR.getText();
        String confirmacionContrasena = confR.getText();
        String nombrePropietario = NumN.getText();
        String numeroTarjeta = NumT.getText();
        String fechaExpedicion = Fecha.getText();
        String Cvv = cvv.getText();

        // Validar que los campos no estén vacíos y que la contraseña y confirmación coincidan
        if (nombre.isEmpty() || ciudad.isEmpty() || telefono.isEmpty() || correo.isEmpty() ||
                direccion.isEmpty() || contrasena.isEmpty() || confirmacionContrasena.isEmpty() ||
                nombrePropietario.isEmpty() || numeroTarjeta.isEmpty() || fechaExpedicion.isEmpty() ||
                Cvv.isEmpty()) {
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
            mostrarMensajeError("Error", "El correo electrónico debe tener el formato correcto.");
            return;
        }

        // Validar el número de tarjeta
        if (!validarNumeroTarjeta(numeroTarjeta)) {
            mostrarMensajeError("Error", "El número de tarjeta debe tener 16 dígitos.");
            return;
        }

        // Crear un objeto de tipo Usuario
        Usuario nuevoUsuario = new Usuario(nombre, correo, telefono, direccion, ciudad,
                contrasena, confirmacionContrasena);

        // Crear un objeto de tipo Tarjeta
        tarjeta = new Tarjeta(nombrePropietario, numeroTarjeta, fechaExpedicion, Cvv);
        nuevoUsuario.setTarjeta(tarjeta);

        // Guardar el usuario en un archivo
        guardarUsuarioEnArchivo(nuevoUsuario);

        // Mostrar un mensaje de éxito
        mostrarMensajeExito("Usuario registrado correctamente");

        // Restablecer los campos de texto
        limpiarCampos();

        // Cerrar la ventana actual
      
        
        abrirVentanaExistente("/vista/Vista1.fxml");
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.close();
    }

    private void guardarUsuarioEnArchivo(Usuario usuario) {
        String nombreArchivo = "usuarios.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
        writer.write("Correo: " + usuario.getGmail() + "\n");
        writer.write("Nombre: " + usuario.getNombre() + "\n");
        writer.write("Teléfono: " + usuario.getTelefono() + "\n");
        writer.write("Dirección: " + usuario.getDireccion() + "\n");
        writer.write("Ciudad: " + usuario.getCiudad() + "\n");
        writer.write("Contraseña: " + usuario.getContrasena() + "\n");
        writer.write("Confirmar Contraseña: " + usuario.getConContrasena() + "\n");
        writer.write("Nombre Propietario Tarjeta: " + usuario.getTarjeta().getNombreP() + "\n");
        writer.write("Número Tarjeta: " + usuario.getTarjeta().getNumTarjeta() + "\n");
        writer.write("Fecha Expedición: " + usuario.getTarjeta().getFechaExp() + "\n");
        writer.write("CVV: " + usuario.getTarjeta().getCVV() + "\n");

        writer.newLine(); // Agregar una nueva línea al final del archivo

    } catch (IOException e) {
        System.out.println("Error al guardar el usuario en el archivo: " + e.getMessage());
    }
}

    private boolean validarContrasena(String contrasena) {
        // Implementa aquí tu lógica de validación de la contraseña
        // Puedes utilizar expresiones regulares o algoritmos de validación

        // Ejemplo básico de validación: verificar que la contraseña tenga al menos 8 dígitos,
        // una mayúscula y un símbolo
        return contrasena.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$");
    }

    private boolean validarTelefono(String telefono) {
        // Implementa aquí tu lógica de validación del número de teléfono
        // Puedes utilizar algoritmos o librerías especializadas

        // Ejemplo básico de validación: verificar que el teléfono tenga 10 dígitos
        return telefono.matches("\\d{10}");
    }

    private boolean validarCorreo(String correo) {
        // Implementa aquí tu lógica de validación del correo electrónico
        // Puedes utilizar expresiones regulares o algoritmos de validación

        // Ejemplo básico de validación: verificar que el correo tenga el formato correcto
        return correo.matches("[\\w.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
    }

    private boolean validarNumeroTarjeta(String numeroTarjeta) {
        // Implementa aquí tu lógica de validación del número de tarjeta
        // Puedes utilizar algoritmos o librerías especializadas

        // Ejemplo básico de validación: verificar que el número de tarjeta tenga 16 dígitos
        return numeroTarjeta.matches("\\d{16}");
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

    private void mostrarMensajeExito(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Éxito");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void limpiarCampos() {
        nomR.clear();
        corrR.clear();
        ciuR.clear();
        telR.clear();
        diccR.clear();
        contR.clear();
        confR.clear();
        NumN.clear();
        NumT.clear();
        Fecha.clear();
        cvv.clear();
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

    @FXML
    private void clickN(ActionEvent event) {
    }

    @FXML
    private void clickT(ActionEvent event) {
    }

    @FXML
    private void clickF(ActionEvent event) {
    }

    @FXML
    private void clickC(ActionEvent event) {
    }
}
