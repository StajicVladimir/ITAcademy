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
public class MojaKlasa {
    static MojaKlasa instance;
    
    private MojaKlasa(){}
    public int x;
    
    public static MojaKlasa getInstance(){
        if (MojaKlasa.instance == null)
            instance = new MojaKlasa();
        
        return instance;
    }
}
