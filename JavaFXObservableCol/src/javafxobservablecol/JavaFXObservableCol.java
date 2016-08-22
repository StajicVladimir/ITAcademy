/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxobservablecol;


import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Vladimir
 */
public class JavaFXObservableCol extends Application {

    double dragOffsetX;
    double dragOffsetY;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       ObservableList<String> list = FXCollections.observableArrayList("one", "two");
        System.out.println("After creating list: " + list);
        list.add("three");
        System.out.println("Added new: "+list);
        list.add(2,"element added on index two");
        System.out.println("Added on 2: " + list);
        
        list.remove("element added on index two");
        System.out.println("removed: "+list);
        
        VBox root = new VBox();
        Button btnHello = new Button("Hello");
        root.getChildren().addAll(btnHello);
        primaryStage.setTitle("Styles");
        
        Scene scene = new Scene(root,300,100);
        scene.setFill(null);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        //primaryStage.setOpacity(0.5);
        
        scene.setOnMousePressed((MouseEvent event) -> {
            dragOffsetX = event.getScreenX() - primaryStage.getX();
            dragOffsetY = event.getScreenY() - primaryStage.getY();
        });
        scene.setOnMouseDragged((MouseEvent event) -> {
            primaryStage.setX(event.getScreenX() - dragOffsetX);
            primaryStage.setY(event.getScreenY() - dragOffsetY);
        });
       


        primaryStage.show();
        
    }
    
}
