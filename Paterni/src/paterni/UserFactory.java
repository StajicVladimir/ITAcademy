/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paterni;

/**
 *
 * @author Vladimir
 */
public class UserFactory {
    
    public static User newUser(String uType){
        if (uType.equalsIgnoreCase("Administrator"))
            return new Administrator();
        else if (uType.equalsIgnoreCase("SuperAdministrator"))
            return new SuperAdministrator();
        else
            return new User();
    }
    
}
