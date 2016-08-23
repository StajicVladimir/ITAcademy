/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Sale;
import internetpaketi.HibernateUtil;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.Session;

/**
 *
 * @author Vladimir
 */
public class UnosUgovoraController {
    
    
    @FXML
    private URL location;

    @FXML
    private ResourceBundle resources;
    
    @FXML
    private ChoiceBox<Integer> brzinaChoice;
    
    @FXML
    private ChoiceBox<String> protokChoice;
    
    @FXML
    private ChoiceBox<Integer> periodChoice;
    
    @FXML
    private TextField adresaTF;
    
    @FXML
    private TextField imePrezimeTF;
    
    @FXML
    private Button odustaniBtn;
    
    @FXML
    private Button unesiBtn;
    
    public UnosUgovoraController(){
        System.out.println("Zdravo iz UnosUgovoraController-a");
    }
    @FXML
    private void initialize() {
        System.out.println("Initializing UnosUgovoraController...");
        System.out.println("Location = " + location);
        System.out.println("Resources = " + resources);
        
        brzinaChoice.getItems().addAll(2,5,10,20,100);
        System.out.println("Added values to brzina!");
        
        protokChoice.getItems().addAll("1","5","10","100","Flat");
        
        periodChoice.getItems().addAll(1,2);
        
        
    }
    
    @FXML
    private void unesi(){
        System.out.println("Pozvan je metod UNESI iz kontrolera");
        System.out.println("Uneti Podaci:");
        System.out.println("Ime i Prezime: "+ imePrezimeTF.getText() + ", adresa: "+
                adresaTF.getText()+", brzina: " +brzinaChoice.getValue()+", protok: "+protokChoice.getValue()+", period: "+ periodChoice.getValue());
        Sale sale = new Sale();
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        sale.setBrzina(brzinaChoice.getValue());
        sale.setProtok(protokChoice.getValue());
        sale.setTrajanjeUgovora(periodChoice.getValue());
        sale.setImePrezime(imePrezimeTF.getText());
        sale.setAdresa(adresaTF.getText());
        s.save(sale);
        s.getTransaction().commit();
        try {
        
        Stage stage;
        Parent root;
        
        stage =(Stage)unesiBtn.getScene().getWindow();
        
            root = FXMLLoader.load(getClass().getResource("/fxml/glavni.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UnosUgovoraController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @FXML
    private void odustani(){
        System.out.println("Pozvan je metod ODUSTANI iz kontrolera");
        try {
        
        Stage stage;
        Parent root;
        
        stage =(Stage)odustaniBtn.getScene().getWindow();
        
            root = FXMLLoader.load(getClass().getResource("/fxml/glavni.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UnosUgovoraController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
