/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import db.Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladimir
 */
public class EmployeDAO {
   
    public void insert(Employe e){
        try {
            Connection conn = Db.getConnection();
            PreparedStatement st = conn.prepareStatement("INSERT INTO employe values (null,?, ?, ?,?)");
            st.setString(1, e.getName());
            st.setInt(2, e.getAge());
            st.setString(3, e.getAddress());
            st.setDouble(4, e.getIncome());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Employe getEmploye(int id){
        Employe e = new Employe();
        try {
            Connection conn = Db.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM employe WHERE id ='"+id+"'");
            if(rs.next()){
                e.setId(id);
                e.setName(rs.getString("name"));
                e.setAge(rs.getInt("age"));
                e.setAddress(rs.getString("address"));
                e.setIncome(rs.getDouble("income"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    public List<Employe> getAll(){
        
        List<Employe> employes = new ArrayList();
        try {
            Connection conn = Db.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM employe");
            while(rs.next()){
                Employe emp = new Employe();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setAge(rs.getInt("age"));
                emp.setAddress(rs.getString("address"));
                emp.setIncome(rs.getDouble("income"));
                employes.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return employes;
    }
    public List<Employe> getAllFilter(String filter){
        
        List<Employe> employes = new ArrayList();
        try {
            Connection conn = Db.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM employe " + filter);
            while(rs.next()){
                Employe emp = new Employe();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setAge(rs.getInt("age"));
                emp.setAddress(rs.getString("address"));
                emp.setIncome(rs.getDouble("income"));
                employes.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return employes;
    }
    public void delete(int id){
        
        try {
            Connection conn = Db.getConnection();
            PreparedStatement st = conn.prepareStatement("DELETE FROM employe WHERE id = ?");
            st.setInt(1, id);
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Employe e){
        try {
            Connection conn = Db.getConnection();
            PreparedStatement st = conn.prepareStatement("UPDATE employe SET name=?, age =?, address = ?, income=? WHERE id =?");
            st.setString(1, e.getName());
            st.setInt(2, e.getAge());
            st.setString(3, e.getAddress());
            st.setDouble(4, e.getIncome());
            st.setInt(5,e.getId());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
