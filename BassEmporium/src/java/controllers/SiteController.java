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
            products.add(p);
        }
        model.addAttribute("products", products);
        return "products";
    }
}
