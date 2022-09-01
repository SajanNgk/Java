
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdc
 */
public class WithoutUsingLayout_2 {
    
    JFrame f1;
    JButton b1, b2;
    JTextField fl1, fl2, fl3;
    JLabel l1, l2, l3;
            
    WithoutUsingLayout_2(){
        f1 = new JFrame();
        
        f1.setLayout(null);
        
//        label

        l1 = new JLabel("Name");
        l2 = new JLabel("Age");
        l3 = new JLabel("Address");
        
//        TextField
        
        fl1 = new JTextField();
        fl2 = new JTextField();
        fl3 = new JTextField();
        
//        Button

        b1 = new JButton("Save");
        b2 = new JButton("Cancel");
        
        f1.setSize(275 ,350);
        
        l1.setBounds(10, 10, 80, 25);
        f1.add(l1);
        
        l2.setBounds(10, 45, 80, 25);
        f1.add(l2);
        
        l3.setBounds(10, 80, 80, 25);
        f1.add(l3);
        
        fl1.setBounds(100, 10, 150, 25);
        f1.add(fl1);
        
        fl2.setBounds(100, 45, 75, 25);
        f1.add(fl2);
                
        fl3.setBounds(100, 80, 150, 25);
        f1.add(fl3);

//        b1.setBounds(0, 0, 80, 30);
        
        f1.add(b1);
        f1.add(b2);
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1.setVisible(true);
    }
    
    public static void main(String[] args){
        WithoutUsingLayout_2 a = new WithoutUsingLayout_2();
    }
}
