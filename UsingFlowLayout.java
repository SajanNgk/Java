
import java.awt.FlowLayout;
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
public class UsingFlowLayout {
    JFrame f1;
    
    JButton b1, b2, b3, b4, b5;

    UsingFlowLayout(){
        
        f1 = new JFrame();
        
        f1.setTitle("Flow Layout");
        
        f1.setSize(400, 300);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1 = new JButton("One");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");
        b5 = new JButton("Five");
        
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 30, 50);
        
        f1.setLayout(fl);

        f1.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        UsingFlowLayout obj = new UsingFlowLayout();
    }
}
