
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdc
 */
public class UsingGridBagLayout {
    
    JFrame f1;
    JButton b1, b2, b3, b4, b5, b6, b7;
    
    UsingGridBagLayout(){
        f1 = new JFrame("Grid Bag Layout");
        
        f1.setSize(400, 400);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridBagLayout ly = new GridBagLayout();
        
        f1.setLayout(ly);
        
        GridBagConstraints hlp = new GridBagConstraints();
        
        b1 = new JButton("1");
        hlp.gridx = 0;
        hlp.gridy = 0;
        ly.setConstraints(b1, hlp);
        f1.add(b1);

        b2 = new JButton("2");
        hlp.gridx = 1;
        hlp.gridy = 0;
        ly.setConstraints(b2, hlp);
        f1.add(b2);
        
        b3 = new JButton("3");
        hlp.gridx = 2;
        hlp.gridy = 0;
        ly.setConstraints(b3, hlp);
        f1.add(b3);
        
        b5 = new JButton("5");
        hlp.gridx = 2;
        hlp.gridy = 1;
        ly.setConstraints(b5, hlp);
        f1.add(b5);
        
        b6 = new JButton("6");
        hlp.gridx = 2;
        hlp.gridy = 2;
        ly.setConstraints(b6, hlp);
        f1.add(b6);
        
        b7 = new JButton("7");
        hlp.gridx = 0;
        hlp.gridy = 3;
        hlp.gridwidth = 3;
        hlp.fill = GridBagConstraints.HORIZONTAL;
        ly.setConstraints(b7, hlp);
        f1.add(b7);
        
        b4 = new JButton("4");
        hlp.gridx = 0;
        hlp.gridy = 1;
        hlp.gridheight = 2;
        hlp.gridwidth = 2;
        hlp.fill = GridBagConstraints.BOTH;
        ly.setConstraints(b4, hlp);
        f1.add(b4);
        
        f1.setVisible(true);
    }
    
    public static void main(String[] args) {
        UsingGridBagLayout a = new UsingGridBagLayout();
    }
    
}
