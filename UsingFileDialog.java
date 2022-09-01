import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class UsingFileDialog implements ActionListener
{
    JFrame j1;
    JMenuBar mbar;
    JMenu file;
    JMenuItem open,save;
    JTextArea t1;
    UsingFileDialog(){
        j1=new JFrame();
        j1.setLayout(new BorderLayout());
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setSize(400,400);
        
        mbar= new JMenuBar();
        file=new JMenu("File");
        open=new JMenuItem("open");
        save=new JMenuItem("save");
        file.add(open);
        file.add(save);
        mbar.add(file);
        j1.setJMenuBar(mbar);
        t1=new JTextArea();
        JScrollPane jp=new JScrollPane(t1);
        j1.add(jp);
        j1.setVisible(true);
        open.addActionListener(this);
        save.addActionListener(this);
       

    }
    public static void main(String[] args) {
        new UsingFileDialog();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==open)
        {
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(j1);
            String FileName=jfc.getSelectedFile().toString();
            String s="";
            try{
                FileInputStream fin=new FileInputStream(FileName);
                int ch;
                while((ch=fin.read())!=-1)
                {
                    s+=(char)ch;
                }
                fin.close();
                t1.setText(s);* 
            }catch(Exception ex){
                System.out.println(ex);
            }

    }else if(e.getSource()==save)
    {
        JFileChooser jfc=new JFileChooser();
        jfc.showSaveDialog(j1);
        String FileName=jfc.getSelectedFile().toString();
        String content =t1.getText();
        try{
            FileOutputStream fout=new FileOutputStream(FileName);
            fout.write(content.getBytes());
            fout.close();
        }catch(Exception ex){
            System.out.println(ex);
        }

    }
}
}