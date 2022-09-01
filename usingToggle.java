import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class usingToggle implements ActionListener{
    JFrame j1;
    JButton L1;
    
    usingToggle(){
        j1=new JFrame();
        j1.setLayout(new FlowLayout());
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setSize(400,400);
    L1=new JButton("On/Off");
        j1.add(L1);
        L1.addActionListener(this);
        j1.setVisible(true);


        
    }
    public static void main(String[] args) {
        new UsingListBox();
    }
    public void (ActionEvent e)
    {
        

}
}