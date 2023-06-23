
package modelo;

import controlador.Vista1Controller;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application {

    
    
    
    @Override
    
    public void start(Stage primaryStage) {
        try{
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Vista1.fxml"));
        
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        Vista1Controller controller = loader.getController();
        controller.setStage(primaryStage);
        primaryStage.show();
                
        }catch (IOException e){System.out.println(e.getMessage());
        }
        }
        /*try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/vista/Vista1.fxml"));
            Pane root = (Pane) loader.load();
            
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            
            primaryStage.show();
            
        }catch (IOException e){System.out.println(e.getMessage());*/
        
    


    
    public static void main(String[] args) {
        launch(args);
    }
}
        
