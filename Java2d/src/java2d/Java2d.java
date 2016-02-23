/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2d;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
/**
 *
 * @author Vladimir
 */
public class Java2d extends Frame {

    /**
     * @param args the command line arguments
     */
    @Override
        public void paint(Graphics g){
            Graphics2D g2 = (Graphics2D)g;
          /*  g2.drawRect(50, 50, 100, 50);
            g2.setColor(Color.red);
            g2.setStroke(new BasicStroke(3));
            g2.drawLine(0, 0, 100, 100);
            g2.setColor(Color.black);
            g2.setStroke(new BasicStroke(1));
            g2.drawOval(50, 50, 100, 100);*/
            //g2.drawString("Hello from graph", 100, 100);
            AffineTransform at = new AffineTransform();
        //    at.rotate(3.1415927, 100, 100);
            FontRenderContext frc = g2.getFontRenderContext();
            Font f = new Font ("Comic Sans MS", Font.BOLD,50);
            TextLayout tl = new TextLayout("Fender Precision: ", f, frc);
           // g2.transform(at);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            tl.draw(g2, 80, 80);
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image i = toolkit.getImage("D:\\ITAcademy\\0193602700_m1240_0000.jpg");
            at.scale(0.4, 0.4);
            g2.setTransform(at);
            g2.drawImage(i, 250 , 250, this);
            
            
            
            
            
            
        }
    public static void main(String[] args) {
        // TODO code application logic here
        Java2d main = new Java2d();
        main.setSize(640, 480);
        main.setVisible(true);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] allFonts = ge.getAllFonts();
        for(Font f : allFonts){
            System.out.println(f.getName());
        }
        
        
    }
    
}
