/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetpaketi;

import entities.Sale;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Vladimir
 */
public class InternetPaketi extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session s = HibernateUtil.getSessionFactory().openSession();
        
        Query query =  s.createQuery("from Sale");
        List<Sale> sales = new ArrayList();
        
        sales = query.list();
        
        for(Sale sale:sales){
            System.out.println(sale.getImePrezime());
        }
        
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
//        GridPane grid = new GridPane();
//        
//        Label lblHello = new Label("Hello world");
//        grid.addRow(0,lblHello);
         URL fxmlUrl = getClass().getClassLoader().getResource("fxml/glavni.fxml");
        AnchorPane root = (AnchorPane) FXMLLoader.load(fxmlUrl);
      
       
        Scene unos = new Scene(root);
        primaryStage.setScene(unos);
        primaryStage.show();
    }
    
}
