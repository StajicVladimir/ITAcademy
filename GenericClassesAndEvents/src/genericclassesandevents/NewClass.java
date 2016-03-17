/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclassesandevents;

/**
 *
 * @author Vladimir
 */
public class NewClass<TIP extends ISportista> {
    TIP data;
    
    public void f(){
        data.show();
    }
}
