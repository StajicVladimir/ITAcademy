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
}
