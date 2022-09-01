
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdc
 */

import java.awt.*;
import javax.swing.*;

public class UsingGridLayout {


    JFrame f1;
    JButton b1, b2, b3, b4, b5;
    
    UsingGridLayout(){
        f1 = new JFrame("Panel");
        
        f1.setSize(300, 400);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1.setLayout(new GridLayout(5, 7, 10, 10));
        
        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");
        b5 = new JButton("Five");
        
        for(int i=1;i<=32;i++){
            f1.add(new JButton(""+i));
        }
//        f1.add(b2);
//        f1.add(b3);
//        f1.add(b4);
//        f1.add(b5);
        
        
        f1.setVisible(true);
    }
    
    public static void main(String[] args) {
        UsingGridLayout a = new UsingGridLayout();
    }
}
