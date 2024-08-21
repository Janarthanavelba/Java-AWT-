/* To create a calculator using AWT and Swing */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends Frame
{
    Calculator()
    {
        JFrame f = new JFrame("Calculator");
        f.setSize(400, 400);
        JLabel l = new JLabel("CALCULATOR");
        l.setBounds(150, 50, 100, 30);
        JLabel l1 = new JLabel("First number");
        l1.setBounds(50, 100, 100, 30);
        JTextField k = new JTextField();
        k.setBounds(200, 100, 100, 30);
        JLabel l2 = new JLabel("Second number");
        l2.setBounds(50, 150, 100, 30);
        JTextField t = new JTextField();
        t.setBounds(200, 150, 100, 30);
        JButton add = new JButton("+");
        add.setBounds(50, 200, 50, 30);
        JButton sub = new JButton("-");
        sub.setBounds(110, 200, 50, 30);
        JButton mul = new JButton("*");
        mul.setBounds(170, 200, 50, 30);
        JButton div = new JButton("/");
        div.setBounds(230, 200, 50, 30);
        JLabel result = new JLabel("Result: ");
        result.setBounds(50, 250, 250, 30);
        ActionListener s= new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String a=k.getText();
                String b=t.getText();
                int i=Integer.parseInt(a.trim());
                int j=Integer.parseInt(b.trim());
                int c=0;
                if(e.getSource()==add)
                {
                    c=i+j;
                }
                if(e.getSource()==sub)
                {
                    c=i-j;
                }
                if(e.getSource()==mul)
                {
                    c=i*j;
                }
                if(e.getSource()==div)
                {
                    c=i/j;
                }
                result.setText("Result: " + c);
            }
        };
        add.addActionListener(s);
        sub.addActionListener(s);
        mul.addActionListener(s);
        div.addActionListener(s);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(t);
        f.add(k);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(result);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,350);

    }
    public static void main(String[]args)
    {
        new Calculator();
    }
}
