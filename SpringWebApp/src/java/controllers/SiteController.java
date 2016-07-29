/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Vladimir
 */
@Controller
@RequestMapping ("/")
public class SiteController {
    
    @Autowired
    DataSource dataSource;
    
    @RequestMapping(value = {"/home", "/"})
    public String homepage(){
        return "home";
    }
    
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    
    @RequestMapping("/products")
    public String products(ModelMap model) throws SQLException{
        //System.out.println(dataSource);
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM actor");
        List<model.Actor> actors = new ArrayList<model.Actor>();
        
        while(rs.next()){
            model.Actor a = new model.Actor();
            a.setId(rs.getInt("actor_id"));
            a.setFirstname(rs.getString("first_name"));
            a.setLastname(rs.getString ("last_name"));
            actors.add(a);
        }
        
        model.addAttribute("actors", actors);
        return "products";
    }
    
    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/product/{id}")
    public String product(@PathVariable Integer id, ModelMap model) throws SQLException{
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM actor WHERE actor_id="+id);
        Actor a = new Actor();
        rs.next();
         a.setId(rs.getInt("actor_id"));
            a.setFirstname(rs.getString("first_name"));
            a.setLastname(rs.getString ("last_name"));
        model.addAttribute("actor", a);
        return "product";
    }
    
    @RequestMapping ("/newactor")
    public String newactor(){
        return "newactor";
    }
    
    @RequestMapping ("/addnewactor")
    public String addnewactor(@ModelAttribute Actor actor, ModelMap model) throws SQLException{
        
        dataSource.getConnection().createStatement().execute("INSERT INTO actor values (null, '"+actor.getFirstname()
                +"','"+actor.getLastname()+"',now())");
        
        
         ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM actor");
        List<model.Actor> actors = new ArrayList<model.Actor>();
        
        while(rs.next()){
            model.Actor a = new model.Actor();
            a.setId(rs.getInt("actor_id"));
            a.setFirstname(rs.getString("first_name"));
            a.setLastname(rs.getString ("last_name"));
            actors.add(a);
        }
        
        model.addAttribute("actors", actors);
        return "products";
    }
}
