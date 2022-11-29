import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
    int n;
    String s1,s2;
    Frame f;
    Button b1,b2,b3,b4;
    TextField tf1,tf2,tf3;
    Calculator()
    {
        f=new Frame("My Calculator");
        f.setBackground(Color.RED);
        f.setForeground(Color.blue);
        b1=new Button("+");
        b1.addActionListener(this);
        b2=new Button("-");
        b2.addActionListener(this);
        b3=new Button("*");
        b3.addActionListener(this);
        b4=new Button("/");
        b4.addActionListener(this);
        tf1=new TextField();
        tf2=new TextField();
        tf3=new TextField();
        tf1.setBounds(50,100,100,30);
        tf2.setBounds(50,150,100,30);
        tf3.setBounds(50,200,100,30);
        b1.setBounds(50,250,50,30);
        b2.setBounds(100,250,50,30);
        b3.setBounds(150,250,50,30);
        b4.setBounds(200,250,50,30);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            s1=tf1.getText();
            s2=tf2.getText();
            n=Integer.parseInt(s1)+Integer.parseInt(s2);
            tf3.setText(String.valueOf(n));
        }
        else if(e.getSource()==b2)
        {
            s1=tf1.getText();
            s2=tf2.getText();
            n=Integer.parseInt(s1)-Integer.parseInt(s2);
            tf3.setText(String.valueOf(n));
        }
        else if(e.getSource()==b3)
        {
            s1=tf1.getText();
            s2=tf2.getText();
            n=Integer.parseInt(s1)*Integer.parseInt(s2);
            tf3.setText(String.valueOf(n));
        }
        else
        {
            s1=tf1.getText();
            s2=tf2.getText();
            n=Integer.parseInt(s1)/Integer.parseInt(s2);
            tf3.setText(String.valueOf(n));
        }
    }
}
class Project
{
    public static void main(String args[])
    {
        Calculator obj=new Calculator();
    }
}