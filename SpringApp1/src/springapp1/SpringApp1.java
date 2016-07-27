/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Vladimir
 */
public class SpringApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       
       Bicikli b = (Bicikli) ctx.getBean("bicikli");
       
     b.getPedale().pedaliraj();
    }
    
}
