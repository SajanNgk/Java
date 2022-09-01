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

public class UsingPanel {
    JFrame f1;
    JButton b1, b2, b3, b4, b5;
    
    UsingPanel(){
        f1 = new JFrame("Panel");
        
        f1.setSize(300, 400);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1.setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel();
        
        p1.setLayout(new FlowLayout());
        
        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");
        b5 = new JButton("Five");
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        
        f1.add(b5, BorderLayout.CENTER);
        f1.add(p1, BorderLayout.SOUTH);
        
        f1.setVisible(true);
    }
    
    public static void main(String[] args) {
        UsingPanel a = new UsingPanel();
    }
}
