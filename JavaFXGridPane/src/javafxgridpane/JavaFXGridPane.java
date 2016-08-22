/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgridpane;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author Vladimir
 */
public class JavaFXGridPane extends Application{

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       GridPane gPane = new GridPane();
      
       Label lblName = new Label("Name: ");
       TextField tfName = new TextField();
       TextArea ta = new TextArea();
       gPane.addRow(0, lblName, tfName);
       gPane.add(ta,0,1,2,1);
       Button okBtn = new Button("OK");

       Scene scene = new Scene(gPane);
       primaryStage.setScene(scene);
       primaryStage.show();
    }
    
}
