/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxchoiccombolist;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class ChoiceBoxDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
 
        Label info = new Label("Choose your size:");
        Label selection_text = new Label("Your size: ");
        Label selection = new Label();
 
        ObservableList<String> sizeList = FXCollections.<String>observableArrayList("S", "M", "L", "XL");
        ChoiceBox sizes = new ChoiceBox(sizeList);
 
        selection.textProperty().bind(sizes.valueProperty());
 
        sizes.getSelectionModel().selectedItemProperty().addListener((ObservableValue observable, Object oldValue, Object newValue) -> {
            System.out.println("Itemchanged: old = " + oldValue + ", new = " + newValue);
        });
 
        GridPane root = new GridPane();
 
        root.addRow(0, info, sizes);
        root.addRow(1, selection_text, selection);
 
        Insets margin = new Insets(10);
        GridPane.setMargin(info, margin);
        GridPane.setMargin(sizes, margin);
        GridPane.setMargin(selection_text, margin);
        GridPane.setMargin(selection, margin);
 
        Scene scene = new Scene(root, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
 
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}


