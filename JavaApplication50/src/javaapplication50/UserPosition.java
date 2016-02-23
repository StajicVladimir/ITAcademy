/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public class UserPosition {
    public UserPoint point;
    public int id;
    
    public static List parsePoint(String tacke){
        List res = new ArrayList();
        tacke = tacke.replace("[{", "");
        tacke = tacke.replace("}]", "");
        
        System.out.println(tacke);
        
        String[] tackeArray = tacke.split("\\},\\{");
        
        for (String tacka : tackeArray) {
            res.add(UserPosition.parse(tacka));
            
        }
        return res;
    }
    public static UserPosition parse(String tacka){
        
        UserPosition res = new UserPosition();
        
        String [] tackaArr = tacka.split(",");
            System.out.println(Arrays.toString(tackaArr));
            float x = Float.parseFloat(tackaArr[1].split(":")[1]);
            float y = Float.parseFloat(tackaArr[2].split(":")[1]);
            int id = Integer.parseInt(tackaArr[0].split(":")[1]);
            
            res.id=id;
            res.point = new UserPoint();
            res.point.x = x;
            res.point.y=y;
            
            return res;
    }
}
