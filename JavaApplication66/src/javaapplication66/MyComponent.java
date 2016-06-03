package javaapplication66;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
 
public class MyComponent extends JComponent {
 
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 165, 20);
        g.setColor(Color.darkGray);
 
        g.drawString("Hello from my component", 10, 15);
    }
    
    public MyComponent()
    {
        setPreferredSize(new Dimension(165, 20));
    }
 
}