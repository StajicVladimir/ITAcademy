/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcontainers;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.beans.binding.NumberBinding;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Vladimir
 */
public class JavaFXContainers extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //HBox root = new HBox();
       // Scene scene  = new Scene(root, 640,480);
        List<Node> controls = new ArrayList();
         
        Node node;
         
        for (int i = 0; i < 50; i++) {
            node = new Button("Button" + i);          
            controls.add(node);
        }
 
        FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
        flowPane.getChildren().addAll(controls);
 
        Scene scene = new Scene(flowPane);
 
        primaryStage.setScene(scene);
        primaryStage.show();



        primaryStage.setScene(scene);
        /*
        Button btnOK = new Button("OK");
        Button btnCancel = new Button("Cancel");
        
        List<Node> btnGroup = new ArrayList();
        btnGroup.add(btnOK);
        btnGroup.add(btnCancel);
        Parent group = new Group(btnGroup);
        
        btnOK.setLayoutX(50);
        btnOK.setLayoutY(50);
        btnCancel.layoutYProperty().bind(btnOK.layoutYProperty());
        NumberBinding layoutXBinding = btnOK.layoutXProperty().add(btnOK.widthProperty().add(10));
        btnCancel.layoutXProperty().bind(layoutXBinding);
        root.getChildren().addAll(group);
        root.setEffect(new DropShadow());*/
        primaryStage.show();
        
        
    }
    
}
