/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxfxml;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Vladimir
 */
public class JavaFXFXML extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlUrl = getClass().getClassLoader().getResource("fxml/proba.fxml");
        VBox root = FXMLLoader.<VBox>load(fxmlUrl);
        //AnchorPane root = FXMLLoader.<AnchorPane>load(fxmlUrl);
        
        
        //SayHelloController c = new SayHelloController();
       // VBox root = FXMLLoader.load(fxmlUrl);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        
        primaryStage.show();
    }
    
}
