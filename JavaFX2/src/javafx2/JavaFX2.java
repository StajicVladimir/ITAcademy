/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx2;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Vladimir
 */
public class JavaFX2 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
    private void print(Rectangle2D bounds)
    {
            System.out.println("Upper-left X: " + bounds.getMinX());
            System.out.println("Upper-left Y: " + bounds.getMinY());
             
            System.out.println("Lower-right X: " + bounds.getMaxX());
            System.out.println("Lower-right Y: " + bounds.getMaxY());
             
            System.out.println("Width: " + bounds.getWidth());
            System.out.println("Height: " + bounds.getHeight());
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Screen screen = Screen.getPrimary();
        
        double dpi = screen.getDpi();
        
        
        Rectangle2D bounds = screen.getBounds();
        
        Rectangle2D visualBounds = screen.getVisualBounds();
        
        System.out.println("************ Display info **************");
        System.out.println("dpi: "+dpi);
        System.out.println("************ Screen bounds **********");
        print(bounds);
        System.out.println("************ Visual Screen bounds **********");
        print(visualBounds);
        
        primaryStage.setWidth(400);
        primaryStage.setHeight(100);
        
        primaryStage.show();
    }
    
}
