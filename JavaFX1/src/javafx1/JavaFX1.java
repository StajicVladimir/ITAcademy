/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Vladimir
 */
public class JavaFX1 extends Application{
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
       
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
         VBox root = new VBox();
        
        Text msg = new Text("Hello world JavaFX");
        
       // root.getChildren().add(msg);
        Label nameLbl = new Label("Enter your name:");
        TextField nameFld = new TextField();
        Button helloBtn = new Button("Say Hello");
        
        helloBtn.setOnAction((ActionEvent)->{
            String msgString = "";
            String name = nameFld.getText();
            if(name.trim().length() > 0){
                msgString = "Hello "+name;
            }else{
                msgString="Hello guest";
            }
            
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Hello!!");
            alert.setHeaderText(null);
            alert.setContentText(msgString);
            alert.showAndWait();
        });
        
        root.getChildren().addAll(nameLbl,nameFld,helloBtn);
        Scene scene = new Scene(root,640,480);
        primaryStage.setScene(scene);
        
        primaryStage.setTitle("First JavaFX application");
        primaryStage.show();
    }
    
}
