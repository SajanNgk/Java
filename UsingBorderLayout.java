
import java.awt.BorderLayout;
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
public class UsingBorderLayout {
    JFrame f1;
    
    JButton b1, b2, b3, b4, b5;
    
    UsingBorderLayout(){
        f1 = new JFrame("Border Layout");
        
        f1.setSize(300, 400);
        
        BorderLayout layout = new BorderLayout(30, 50);
        
        f1.setLayout(layout);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");
        b5 = new JButton("Five");
        
        f1.add(b1, BorderLayout.NORTH);
        f1.add(b2, BorderLayout.SOUTH);
        f1.add(b3, BorderLayout.WEST);
        f1.add(b4, BorderLayout.EAST);
//        f1.add(b5, BorderLayout.CENTER);
        
        f1.setVisible(true);
    }
    
    public static void main(String[] args) {
        UsingBorderLayout a = new UsingBorderLayout();
    }
}
