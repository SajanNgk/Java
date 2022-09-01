
import javax.swing.*;
public class Withoutusinglayout {
    
    JFrame f1;
    JLabel L1,L2,L3;
    JButton b1,b2;
    JTextField t1,t2,t3;
    Withoutusinglayout(){
        f1=new JFrame();
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(300,200);
        
        L1=new JLabel("NAME");
        L2=new JLabel("AGE");
        L3=new JLabel("ADDRESS");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        b1=new JButton("SAVE");
        b2=new JButton("CANCEL");
        
        L1.setBounds(10, 10, 80, 25);
        f1.add(L1);
        L2.setBounds(10, 45, 80, 25);
        f1.add(L2);
        L3.setBounds(10, 80, 80, 25);
        f1.add(L3);
        t1.setBounds(100,10,160,25);
        f1.add(t1);
        t2.setBounds(100,45,80,25);
        f1.add(t2);
        t3.setBounds(100,80,80,25);
        f1.add(t3);
        b1.setBounds(100,115,80,25);
        b2.setBounds(190,115,80,25);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        Withoutusinglayout obj=new Withoutusinglayout();
    }
    
}