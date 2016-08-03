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
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import model.Buyer;
import model.Product;
import model.Sale;
import model.SaleShow;
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
@RequestMapping("/")
public class SiteController {
    
    @Autowired
    DataSource dataSource;
    
    @RequestMapping(value = {"/home", "/"})
    public String homepage(HttpSession session){
        if(session.getAttribute("username") == null){
            session.setAttribute("id", 0);
            session.setAttribute("username","guest");
        }
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
        String desc = product.getDescription();
        desc = desc.replace("'", "\\'");
        String query = "UPDATE product SET  name ='"
                +product.getName()+"', price = '"+product.getPrice()+"', description = '"+desc+"', image ='"+product.getImage()+"', quantity = '"+product.getQuantity()+"' WHERE id ='"+product.getId()+"'";
        System.out.println(query);
        dataSource.getConnection().createStatement().execute(query);
       
        
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
    
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    
    @RequestMapping("/logincheck")
    public String logincheck(@RequestParam String username, @RequestParam String password, HttpSession session) throws SQLException{
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM buyer WHERE username ='"+username+"' AND password ='"+password+"'");
        if (rs.next()){
            session.setAttribute("id", rs.getInt("id"));
            session.setAttribute("username", rs.getString("username"));
        }
        return "home";
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();

        return "home";
    }
    
    public String getBuyerName(int id) throws SQLException{
         ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM buyer WHERE id = '"+id+"'");
         String username ="";
         if(rs.next()){
             username = rs.getString("username");
         }
         System.out.println(username);
         return username;
    }
    int getBuyerId(String username) throws SQLException{
        ResultSet rs =dataSource.getConnection().createStatement().executeQuery("SELECT * FROM buyer WHERE username = '"+username+"'");
        int id = 5;
        if(rs.next()){
            id = rs.getInt("id");
        }
        return id;
    }
     public String getProductName(int id) throws SQLException{
         ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM product WHERE id = '"+id+"'");
         String name ="";
         if(rs.next()){
             name = rs.getString("name");
         }
         return name;
    }
     public int getProductQuantity(int id) throws SQLException{
          ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM product WHERE id = '"+id+"'");
          int quantity = 1;
          if(rs.next()){
              quantity = rs.getInt("quantity");
          }
          return quantity;
     }
    @RequestMapping("/sales")
    public String sales(ModelMap model) throws SQLException{
        
        ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM sale");
        List<Sale> sales = new ArrayList<Sale>();
        List<SaleShow> salesShow = new ArrayList<SaleShow>();
        while(rs.next()){
            Sale s = new Sale();
            SaleShow ss = new SaleShow();
            s.setId(rs.getInt("id"));
            s.setBuyer(rs.getInt("buyer"));
            System.out.println(s.getBuyer());
            ss.setBuyer(getBuyerName(rs.getInt("buyer")));
            System.out.println(ss.getBuyer());
            s.setProduct(rs.getInt("product"));
            ss.setProduct(getProductName(s.getProduct()));
            s.setDate(rs.getString("date"));
            ss.setDate(rs.getString("date"));
            sales.add(s);
            salesShow.add(ss);
        }
        model.addAttribute("sales", sales);
        model.addAttribute("salesShow", salesShow);
        
        return "sales";
    }
    
    @RequestMapping("/buyproduct/{productid}")
    public String buyproduct(@PathVariable Integer productid, ModelMap model, HttpSession session) throws SQLException{
        
        String buyerUsername = (String)session.getAttribute("username");
        int buyerId = getBuyerId(buyerUsername);
        System.out.println("productId: "+productid.toString()+", Username: " + session.getAttribute("username") + "user id: " +buyerId);
        
        dataSource.getConnection().createStatement().execute("INSERT INTO sale VALUES (null, '"+buyerId+"','"+productid+"',NOW())");
            int newQuantity = getProductQuantity(productid) - 1;
            System.out.println("trenutna kolicina: "+getProductQuantity(productid)+"Nova kolicina: "+ newQuantity);
            dataSource.getConnection().createStatement().execute("UPDATE product SET quantity = '"+newQuantity+"' WHERE id = '"+productid+"'");
            
        
            ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * FROM sale");
        List<Sale> sales = new ArrayList<Sale>();
        List<SaleShow> salesShow = new ArrayList<SaleShow>();
        while(rs.next()){
            Sale s = new Sale();
            SaleShow ss = new SaleShow();
            s.setId(rs.getInt("id"));
            s.setBuyer(rs.getInt("buyer"));
            System.out.println(s.getBuyer());
            ss.setBuyer(getBuyerName(rs.getInt("buyer")));
            System.out.println(ss.getBuyer());
            s.setProduct(rs.getInt("product"));
            ss.setProduct(getProductName(s.getProduct()));
            s.setDate(rs.getString("date"));
            ss.setDate(rs.getString("date"));
            sales.add(s);
            salesShow.add(ss);
        }
        model.addAttribute("sales", sales);
        model.addAttribute("salesShow", salesShow);
        return "sales";
    }
}
