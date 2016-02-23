/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labelaclick;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Vladimir
 */
public class LabelaClick {

    /**
     * @param args the command line arguments
     */
    static Label l;
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame f = new Frame("Naziv frejma");
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        l = new Label("Klikni na mene!!!");
        l.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                l.setText("Jeeeeeeeeeeeeij");
            }
        });
        
        f.add(l);
        f.setSize(100,300);
        f.setVisible(true);
        
        
        
    }
    
}
