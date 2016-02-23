/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtkontrole;

/**
 *
 * @author Vladimir
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AWTKontrole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("AWTKontrole example");
        LayoutManager flowLayout = new FlowLayout();
        f.setLayout(flowLayout);
        //AWT Controls
        //*********Label*************
        Label l = new Label("Hello World from AWT");
        //l.setAlignment(Label.LEFT);// Ne radi ako je aktivan Flow Layout!!
        
        //l.setBackground(Color.red);
        ArrayList<String> myLabels = new ArrayList();
        myLabels.add("Ovo");
        myLabels.add("je");
        myLabels.add("array");
        myLabels.add("lista");
        for(String myLabel : myLabels){
           Label ml = new Label(myLabel);
           //Listener za mouse click on label
           ml.addMouseListener(new MouseAdapter(){
               @Override
               public void mouseClicked(MouseEvent me){
                   if(ml.getBackground() == Color.red){
                        ml.setBackground(Color.blue);
                        ml.setText("Not Clicked");
                   }
                   else{
                        ml.setBackground(Color.red);
                        ml.setText("Clicked!!");
                   }
               }
           });
           f.add(ml);
        }
        f.add(l);
        //********************
        //******Button
        Button b = new Button("Click me!!");
        //Action listener for Button
        b.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(((Button)e.getSource()).getLabel().equalsIgnoreCase("Clicked"))
                ((Button)e.getSource()).setLabel("Not Clicked");
                else
                  ((Button)e.getSource()).setLabel("Clicked");  
            }
        });
        f.add(b);
        //**********************
        //****** Check Box *********
        CheckboxGroup myRadioGroup = new CheckboxGroup();
        
        Checkbox cb = new Checkbox("My Radio 1: ", myRadioGroup, true);
        Checkbox cb1 = new Checkbox("Checkbox 1: ",myRadioGroup, false);
        Checkbox cb2 = new Checkbox("Checkbox 2: ",myRadioGroup, true);
        f.add(cb);
        f.add(cb1);
        f.add(cb2);
        
        Button myRadioGroupButton = new Button("OK");
        myRadioGroupButton.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(cb.getState())
                    myRadioGroupButton.setLabel("CB");
                else
                    if(cb1.getState())
                        myRadioGroupButton.setLabel("CB1");
                    else
                        if(cb2.getState())
                            myRadioGroupButton.setLabel("CB2");
                        
            }
        });
        f.add(myRadioGroupButton);
        //*****************************
        //******** CHOICE *********
        Choice myChoice = new Choice();

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1,"Mercedes"));
        cars.add(new Car(2,"Audi"));
        cars.add(new Car(3,"BMW"));
        cars.add(new Car(4,"Porsche"));
        
        for (Car c:cars){
            myChoice.add(c.name);
        }
        f.add(myChoice);
        Label chosenCar = new Label("Your car");
        f.add(chosenCar);
        Button myChoiceButton = new Button("Confirm Car Choice");
        myChoiceButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                chosenCar.setText(myChoice.getSelectedItem());
                ActionEvent ae = 
                 new ActionEvent((Object)b, ActionEvent.ACTION_PERFORMED, "");
                    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(ae);
            // b1.dispatchEvent(ae);  can be used too.
            }
        });
        f.add(myChoiceButton);
        Label chosenCar1 = new Label ("Your car auto: ");
        f.add(chosenCar1);
        myChoice.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                Choice c = (Choice)e.getSource();
                Car selectedCar = cars.get(c.getSelectedIndex());
                chosenCar1.setText(selectedCar.name);
            }
        });
        //***********************8
        //******** TextField
        
        TextField tfSource = new TextField(20);
        TextField tfDestination = new TextField(20);
        
        tfSource.setEchoChar('*');
        f.add(tfSource);
        f.add(tfDestination);
        
        Button tfCopyButton = new Button("Copy");
        
        /*tfCopyButton.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tfDestination.setText(tfSource.getText());
            }
        });*/
        tfSource.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tfDestination.setText(tfSource.getText());
            }
        });
        /*tfSource.addActionListener(null);
        tfSource.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyCode() == 13)
                    tfDestination.setText(tfSource.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 13)
                    tfDestination.setText(tfSource.getText()); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        })*/
        f.add(tfCopyButton);
        //Awt Controls end
        //***Listener za zatvaranje prozora
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        f.setSize(300,300);
        f.setVisible(true);
        
    }
    
}
