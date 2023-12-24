
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AboutUs extends JFrame implements ActionListener{
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton b;
    JPanel contentpane;
    AboutUs()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650,475);
        setLocation(300,300);
        setLayout(new BorderLayout()) ;
        contentpane=new JPanel();
        contentpane.setBackground(Color.white);
        
                
        l=new JLabel("                 UNIVERSITY MANAGEMENT SYSTEM 2.0.1");
        l.setForeground(new Color(200,100,250));
        l.setFont(new Font("tahoma",Font.BOLD,20));
        add(l,"North");
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/logo.jpg"));
        Image I=i.getImage().getScaledInstance(480,170,Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(I);
        l1=new JLabel(i1);
        contentpane.add(l1);
        
        l2=new JLabel("This is the latest version our system now available for all students, faculty, staff, world");
        l2.setFont(new Font("Aerial",Font.PLAIN,15));
        contentpane.add(l2);
        
        l3=new JLabel("System is designed and developed by Akky Srivastava Akash and solely holds the rights of use");
        l3.setFont(new Font("Aerial",Font.PLAIN,15));
        contentpane.add(l3);
        
        l4=new JLabel("                                       Developer Contact                                     ");
        l4.setFont(new Font("Aerial",Font.BOLD,17));
        l4.setForeground(Color.RED);
        contentpane.add(l4);
        
        l5=new JLabel("     ");
        l5.setFont(new Font("Aerial",Font.PLAIN,15));
        l5.setForeground(Color.BLUE);
        contentpane.add(l5);
        
        l6=new JLabel("    E-mail:  sauravmagr4897@gmail.com  ");
        l6.setFont(new Font("Aerial",Font.PLAIN,15));
        l6.setForeground(Color.BLUE);
        contentpane.add(l6);
        
        l7=new JLabel("We are constantly work towards developing efficient and reliable system   ");
        l7.setFont(new Font("Aerial",Font.PLAIN,15));
        contentpane.add(l7);
        
        l9=new JLabel("UMS Ver 2.0.1 ~ All Rights Reserved by the Developer-2023");
        l9.setForeground(Color.DARK_GRAY);
        l9.setFont(new Font("monospaced",Font.BOLD |Font.ITALIC,12));
        add(l9,"South");
        
        b=new JButton("Exit");
        b.setForeground(new Color(00,250,100));
        b.setBackground(new Color(50,0,0));
        b.setFont(new Font("Helvetica",Font.BOLD,17));
        contentpane.add(b);
        
        JScrollPane js=new JScrollPane(contentpane);
        
        
        add(contentpane,"Center");
        add(js,"East");
        
        b.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b)
        {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Have a Nice Day");
        }
    }
    public static void main(String[] args){
        new AboutUs().setVisible(true);
    }
}
