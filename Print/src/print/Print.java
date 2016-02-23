/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;
import java.awt.Color;
 
import java.awt.Graphics;
 
import java.awt.print.PageFormat;
 
import java.awt.print.Printable;
 
import java.awt.print.PrinterException;
 
import java.awt.print.PrinterJob;
/**
 *
 * @author Vladimir
 */
public class Print implements Printable{

    /**
     * @param args the command line arguments
     */
    public Print()
 
    {
 
    PrinterJob printJob = PrinterJob.getPrinterJob();
 
    printJob.setPrintable(this);
 
    boolean pdRes = printJob.printDialog();
 
    if(pdRes)
 
        try
 
            {
 
    printJob.print();
 
            }
 
    catch(PrinterException ex) { }
 
    }
    
    @Override
    public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
 
    g.setColor(Color.red);
 
    g.fillOval(0,0,50,50);
 
    g.setColor(Color.white);
 
    g.drawString("page " + pageIndex, 3, 28);
 
    return PAGE_EXISTS;
 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Print prnt = new Print();
    }
    
}
