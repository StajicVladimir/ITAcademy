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
import model.Buyer;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vladimir
 */
@Controller
@RequestMapping("/")
public class SiteController {
    
    @Autowired
    DataSource dataSource;
    
    @RequestMapping(value = {"/home", "/"})
    public String homepage(){
        return "home";
    }
    
     @RequestMapping(value = "/products")
    public String products(ModelMap model) throws SQLException{
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM product");
        List<Product> products = new ArrayList<Product>();
        
        while (rs.next()){
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            p.setPrice(rs.getDouble("price"));
            p.setImage(rs.getString("image"));
            p.setQuantity(rs.getInt("quantity"));
            products.add(p);
        }
        model.addAttribute("products", products);
        return "products";
    }
    
    @RequestMapping("/product/{id}")
    public String product(@PathVariable Integer id, ModelMap model) throws SQLException{
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM product WHERE id='"+id+"'");
        rs.next();
        Product p = new Product();
         p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            p.setPrice(rs.getDouble("price"));
            p.setImage(rs.getString("image"));
            p.setQuantity(rs.getInt("quantity"));
            model.addAttribute("product", p);
        return "product";
    }
    
    @RequestMapping("/newproduct")
    public String newproduct(){
        return "newproduct";
    }
    @RequestMapping("/addnewproduct")
    public String addnewproduct(@ModelAttribute Product product, ModelMap model) throws SQLException{
        
        dataSource.getConnection().createStatement().execute("INSERT INTO product VALUES (null,'"
                +product.getName()+"','"+product.getPrice()+"','"+product.getDescription()+"','"+product.getImage()+"','"+product.getQuantity()+"')");
        
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM product");
        List<Product> products = new ArrayList<Product>();
        
        while (rs.next()){
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            p.setPrice(rs.getDouble("price"));
            p.setImage(rs.getString("image"));
            p.setQuantity(rs.getInt("quantity"));
            products.add(p);
        }
        model.addAttribute("products", products);
        return "products";
    }
    
    @RequestMapping("/removeproduct/{id}")
    public String removeproduct(@PathVariable Integer id, ModelMap model) throws SQLException{
        
        dataSource.getConnection().createStatement().executeUpdate("DELETE FROM product WHERE id='"+id+"'");
        
         ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM product");
        List<Product> products = new ArrayList<Product>();
        
        while (rs.next()){
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            p.setPrice(rs.getDouble("price"));
            p.setImage(rs.getString("image"));
            p.setQuantity(rs.getInt("quantity"));
            products.add(p);
        }
        model.addAttribute("products", products);
        return "products";
        
    }
    
    @RequestMapping("/editproduct/{id}")
    public String editproduct(@PathVariable Integer id, ModelMap model) throws SQLException{
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM product WHERE id='"+id+"'");
        rs.next();
        Product p = new Product();
         p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            p.setPrice(rs.getDouble("price"));
            p.setImage(rs.getString("image"));
            p.setQuantity(rs.getInt("quantity"));
            
            model.addAttribute("product", p);
        
        return "editproduct";
    }
    @RequestMapping("/editproductapply")
    public String editproduct(@ModelAttribute Product product, ModelMap model) throws SQLException{
       /* 
        dataSource.getConnection().createStatement().execute("INSERT INTO product VALUES (null,'"
                +product.getName()+"','"+product.getPrice()+"','"+product.getDescription()+"','"+product.getImage()+"','"+product.getQuantity()+"')");
        
        */
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM product");
        List<Product> products = new ArrayList<Product>();
        
        while (rs.next()){
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setDescription(rs.getString("description"));
            p.setPrice(rs.getDouble("price"));
            p.setImage(rs.getString("image"));
            p.setQuantity(rs.getInt("quantity"));
            products.add(p);
        }
        model.addAttribute("products", products);
        return "products";
    }
    
    @RequestMapping("/buyers")
    public String buyers(ModelMap model) throws SQLException{
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM buyer");
        
        List<Buyer> buyers = new ArrayList<Buyer>();
        
        while(rs.next()){
            Buyer b = new Buyer();
            b.setId(rs.getInt("id"));
            b.setUsername(rs.getString("username"));
            b.setPassword(rs.getString("password"));
            b.setFirstname(rs.getString("firstname"));
            b.setLastname(rs.getString("lastname"));
            b.setAdress(rs.getString("adress"));
            buyers.add(b);
        }
        model.addAttribute("buyers", buyers);
        
        return "buyers";
    }
    
    @RequestMapping("/newbuyer")
    public String newbuyer(){
        return "newbuyer";
    }
    
    @RequestMapping("/addnewbuyer")
    public String addnewbuyer(@ModelAttribute Buyer buyer, ModelMap model) throws SQLException{
        
        dataSource.getConnection().createStatement().executeUpdate("INSERT INTO buyer VALUES (null, '"+buyer.getUsername()+"',"
                + "'"+buyer.getPassword()+"','"+buyer.getFirstname()+"','"+buyer.getLastname()+"','"+buyer.getAdress()+"')");
        
        
         ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM buyer");
        
        List<Buyer> buyers = new ArrayList<Buyer>();
        
        while(rs.next()){
            Buyer b = new Buyer();
            b.setId(rs.getInt("id"));
            b.setUsername(rs.getString("username"));
            b.setPassword(rs.getString("password"));
            b.setFirstname(rs.getString("firstname"));
            b.setLastname(rs.getString("lastname"));
            b.setAdress(rs.getString("adress"));
            buyers.add(b);
        }
        model.addAttribute("buyers", buyers);
        return "buyers";
    }
    
    @RequestMapping("/editbuyer/{id}")
    public String editbuyer(@PathVariable Integer id, ModelMap model) throws SQLException{
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM buyer WHERE id='"+id+"'");
        if(rs.next()){
            Buyer buyer = new Buyer();
            buyer.setId(id);
            buyer.setUsername(rs.getString("username"));
            buyer.setPassword(rs.getString("password"));
            buyer.setFirstname(rs.getString("firstname"));
            buyer.setLastname(rs.getString("lastname"));
            buyer.setAdress(rs.getString("adress"));
            model.addAttribute("buyer", buyer);
            System.out.println(buyer.getId());
        }
        return "editbuyer";
    }
    
    @RequestMapping("/editbuyerapply")
    public String editbuyerapply(@ModelAttribute Buyer buyer, ModelMap model) throws SQLException{
        
        System.out.println(buyer.getFirstname()+" , "+buyer.getId());
        dataSource.getConnection().createStatement().execute("UPDATE buyer SET username='"+buyer.getUsername()+"', password ='"+buyer.getPassword()+"'"
                + ", firstname = '"+buyer.getFirstname()+"', lastname='"+buyer.getLastname()+"', adress ='"+buyer.getAdress()+"' WHERE id='"+buyer.getId()+"'");
       
         ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM buyer");
        
        List<Buyer> buyers = new ArrayList<Buyer>();
        
        while(rs.next()){
            Buyer b = new Buyer();
            b.setId(rs.getInt("id"));
            b.setUsername(rs.getString("username"));
            b.setPassword(rs.getString("password"));
            b.setFirstname(rs.getString("firstname"));
            b.setLastname(rs.getString("lastname"));
            b.setAdress(rs.getString("adress"));
            buyers.add(b);
        }
        model.addAttribute("buyers", buyers);
        return "buyers";
    }
    
    @RequestMapping("/removebuyer/{id}")
    public String removebuyer(@PathVariable Integer id, ModelMap model) throws SQLException{
        
        dataSource.getConnection().createStatement().executeUpdate("DELETE FROM buyer WHERE id='"+id+"'");
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM buyer");
        
        List<Buyer> buyers = new ArrayList<Buyer>();
        
        while(rs.next()){
            Buyer b = new Buyer();
            b.setId(rs.getInt("id"));
            b.setUsername(rs.getString("username"));
            b.setPassword(rs.getString("password"));
            b.setFirstname(rs.getString("firstname"));
            b.setLastname(rs.getString("lastname"));
            b.setAdress(rs.getString("adress"));
            buyers.add(b);
        }
        model.addAttribute("buyers", buyers);
        return "buyers";
    }
}
