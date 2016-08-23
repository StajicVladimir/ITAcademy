/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Sale;
import internetpaketi.HibernateUtil;
import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Vladimir
 */
public class GlavniEkranController {
    
    
    @FXML
    private TableView<Sale> sviUgovoriTable;
    
    @FXML
    private Button noviUgovorBtn;
    
    @FXML
    private Button obrisiUgovorBtn;
     
    public void GlavniEkran(){
        System.out.println("Hello");
    }
    
    public void popuniTabelu(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query = s.createQuery("from Sale");
        List<Sale> sales = query.list();
        
        
        
       
        ObservableList<Sale> salesO= FXCollections.observableArrayList();
        salesO.addAll(sales);
        
        TableColumn idCol = new TableColumn("id");
        idCol.setMinWidth(50);
        idCol.setCellValueFactory(
                new PropertyValueFactory<Sale, Integer>("id"));
        
        TableColumn brzinaCol = new TableColumn("brzina");
        brzinaCol.setMinWidth(50);
        brzinaCol.setCellValueFactory(
                new PropertyValueFactory<Sale, Integer>("brzina"));
        
        TableColumn protokCol = new TableColumn("protok");
        protokCol.setMinWidth(50);
        protokCol.setCellValueFactory(
                new PropertyValueFactory<Sale, String>("protok"));
        
        TableColumn trajanjeCol = new TableColumn("trajanje");
        trajanjeCol.setMinWidth(50);
        trajanjeCol.setCellValueFactory(
                new PropertyValueFactory<Sale, Integer>("trajanjeUgovora"));
        
        TableColumn imePrezimeCol = new TableColumn("imePrezime");
        imePrezimeCol.setMinWidth(50);
        imePrezimeCol.setCellValueFactory(
                new PropertyValueFactory<Sale, String>("imePrezime"));
        
        TableColumn adresaCol = new TableColumn("adresa");
        adresaCol.setMinWidth(50);
        
        adresaCol.setCellValueFactory(
                new PropertyValueFactory<Sale, String>("adresa"));
        
         sviUgovoriTable.setItems(salesO);
         sviUgovoriTable.getColumns().clear();
        sviUgovoriTable.getColumns().addAll(idCol,brzinaCol,protokCol,trajanjeCol,imePrezimeCol,adresaCol);
        sviUgovoriTable.refresh();
    }
    public void initialize(){
        popuniTabelu();
        System.out.println("Hello from initialize");
    }
    
    @FXML
    private void noviUgovor(){
        try {
        
        Stage stage;
        Parent root;
        
        stage =(Stage)noviUgovorBtn.getScene().getWindow();
        
            root = FXMLLoader.load(getClass().getResource("/fxml/unos_ugovora.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @FXML
    private void obrisiUgovor(){
        Sale sale = sviUgovoriTable.getSelectionModel().getSelectedItem();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(sale);
        
        session.getTransaction().commit();
        popuniTabelu();
    }
}
