import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class UsingListBox implements ListSelectionListener{
    JFrame j1;
    JList L1;
    JTextField t1;
    UsingListBox(){
        j1=new JFrame();
        j1.setLayout(new FlowLayout());
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setSize(400,400);
        t1=new JTextField(15);
        j1.add(t1);
        String items[]={"Sajan","Prashanna","Tea","Coffee","Icecream"};
        L1=new JList(items);
        j1.add(L1);
        JScrollPane jp=new JScrollPane(L1);
        j1.add(jp);
        L1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        L1.setVisibleRowCount(4);
        L1.addListSelectionListener(this);
        j1.setVisible(true);


        
    }
    public static void main(String[] args) {
        new UsingListBox();
    }
    public void valueChanged(ListSelectionEvent e)
    {
        String items=L1.getSelectedValuesList()+ "";
        t1.setText(items);

}
}