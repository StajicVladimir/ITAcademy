/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileFilter;
public class Main {
    static JTextArea ta;
    public static void main(String[] args) throws IOException
    {
    JFrame f = new JFrame();
    f.setLayout(new FlowLayout(FlowLayout.LEFT));
    f.setSize(300,300);
    ta = new JTextArea(10,30);
    JScrollPane jsp = new JScrollPane(ta);
    jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jsp.setPreferredSize(new Dimension(280,220));
    JButton save = new JButton("Save");
    JButton load = new JButton("Load");
    save.setActionCommand("saveFile");
    load.setActionCommand("loadFile");
    f.add(jsp);
    f.add(save);
    f.add(load);
    ActionListener saveLoadAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                 jfc.setFileFilter(new FileFilter() {
                    @Override
                    public boolean accept(File f) {
                            if (f.isDirectory())
                                return true;
                            String fn = f.getName();
                            String e="";
                            int i = fn.lastIndexOf('.');
                            if (i > 0 &&  i < fn.length() - 1) {
                                e = fn.substring(i+1).toLowerCase();
                            }
                            if(e.equals("txt"))
                                return true;
                            else
                                return false;
                    }
                    @Override
                    public String getDescription() {
                        return "txt files";
                    }
                });
                if(e.getActionCommand().equals("saveFile"))
                {
                    if(jfc.showSaveDialog(jfc)!=JFileChooser.CANCEL_OPTION)
                        if(jfc.getSelectedFile()!=null)
                            {
                        FileWriter fw = null;
                        try {
                            fw = new FileWriter(jfc.getSelectedFile());
                            fw.write(ta.getText());
                        } catch (IOException ex) { }
                        finally {  try {  fw.close();  } catch (IOException ex) {  }  }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "No file selected");
                }
                if(e.getActionCommand().equals("loadFile"))
                {
                    if(jfc.showOpenDialog(jfc)!=JFileChooser.CANCEL_OPTION)
                        if(jfc.getSelectedFile()!=null)
                            {
                        FileReader fr = null;
                        try {
                            fr = new FileReader(jfc.getSelectedFile());
                            int b;
                                while((b=fr.read())!=-1)
                                {
                                ta.append(Character.toString((char)b));
                                }
                             
                        } catch (IOException ex) { }
                            finally {  try {  fr.close();  } catch (IOException ex) { } }
                        }
                    else
                        JOptionPane.showMessageDialog(null, "No file selected");
                }
            }
        };
    save.addActionListener(saveLoadAction);
    load.addActionListener(saveLoadAction);
    f.setVisible(true);
    }
}