/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtogglecheckradio;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Vladimir
 */
public class JavaFXToggleCheckRadio extends Application{
    
    ToggleButton s_toggle;
    ToggleButton m_toggle;
    ToggleButton l_toggle;
    ToggleButton xl_toggle;
 
    Label info;
    Label header;
    ToggleButton onOff = null;
    
    Label infoCheck;
    CheckBox crazyCbx;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
    
    private void toggle(ActionEvent e){
        
        if(onOff.isSelected())
            onOff.setText("Power ON");
        else
            onOff.setText("Power OFF");
    }
    
    private void toggleGroup(ObservableValue<? extends Toggle> observable, 
            Toggle oldValue, Toggle newValue){
        if (oldValue != null && newValue == null) {
            info.setText("You didn't select anything!");
        }
 
        if (newValue != null) {
            ToggleButton toggleButton = (ToggleButton) newValue;
            info.setText("You selected " + toggleButton.getText() + " size!");
        }
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid);
        
        onOff = new ToggleButton("Power OFF");
        onOff.setOnAction(e->toggle(e));
        
        header = new Label("Choose your size: ");
        info = new Label();
 
        s_toggle = new ToggleButton("S");
        m_toggle = new ToggleButton("M");
        l_toggle = new ToggleButton("L");
        xl_toggle = new ToggleButton("XL");
         
        s_toggle.setPrefWidth(50);
        m_toggle.setPrefWidth(50);
        l_toggle.setPrefWidth(50);
        xl_toggle.setPrefWidth(50);
        
        ToggleGroup toggleGroup = new ToggleGroup();
        toggleGroup.getToggles().addAll(s_toggle, m_toggle, l_toggle,xl_toggle);
        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> toggleGroup(observable,oldValue,newValue));
        
        
        grid.addRow(0, onOff);
        grid.addRow(1, header);
        grid.addRow(2, s_toggle, m_toggle, l_toggle,xl_toggle);
        grid.add(info, 0, 3, 3, 1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
