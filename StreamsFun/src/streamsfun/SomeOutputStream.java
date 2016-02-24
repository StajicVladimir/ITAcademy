/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamsfun;

import java.io.OutputStream;

/**
 *
 * @author Vladimir
 */
public class SomeOutputStream extends OutputStream{
    public void write(int bajt){
        System.out.println("Bravo upisao si : " + bajt);
    }
}
