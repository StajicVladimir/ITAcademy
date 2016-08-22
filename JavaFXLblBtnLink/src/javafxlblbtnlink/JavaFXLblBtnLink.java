/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlblbtnlink;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Hyperlink;

/**
 *
 * @author Vladimir
 */
import javafx.scene.web.WebView;
public class JavaFXLblBtnLink extends Application{
    Label message = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid);
        
        TextField tfFirstName = new TextField();
        TextField tfLastName = new TextField();
        
        Label lblFirstName = new Label("_Firstname: ");
        Label lblLastName = new Label("_Lastname: ");
        
        lblFirstName.setLabelFor(tfFirstName);
        lblFirstName.setMnemonicParsing(true);
        lblLastName.setLabelFor(tfLastName);
        lblLastName.setMnemonicParsing(true);
        
        message = new Label("Nothing clicked....");
        Button btnNormal = new Button("_Normal");
        btnNormal.setId("normalButton");
        
        Button btnDefault = new Button("_Default");
        btnDefault.setDefaultButton(true);
        btnDefault.setId("defaultButton");
        
        Button btnCancel = new Button("_Cancel");
        btnCancel.setCancelButton(true);
        btnCancel.setId("cancelButton");
        
        btnNormal.setOnAction(e->btnClicked(e));
        btnDefault.setOnAction(e->btnClicked(e));
        btnCancel.setOnAction(e->btnClicked(e));
        
        grid.addRow(0, lblFirstName,tfFirstName);
        grid.addRow(1, lblLastName,tfLastName);
        
        grid.add(message,0, 3, 3, 2);
        grid.addRow(5, btnNormal,btnDefault,btnCancel);
        
        Hyperlink link = new Hyperlink("Web link");
        WebView webView = new WebView();
        link.setOnAction(e->webView.getEngine().load("http://www.google.com"));
        
        grid.addRow(6, link);
        grid.addRow(7,webView);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    private void btnClicked(ActionEvent e){
        Button btn = (Button)e.getSource();
        
        if(null != btn.getId()){
            switch(btn.getId()){
                case "normalButton":
                    message.setText("Normal Button Clicked!");
                    break;
                case "defaultButton":
                    message.setText("Default Button Clicked!");
                    break;
                case "cancelButton":
                    message.setText("Cancel Button Clicked!");
                    break;
            }
        }
    }
}
