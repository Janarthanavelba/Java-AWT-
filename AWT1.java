/* Simple AWT Login Form Example in Java */

import java.awt.*;
public class AWT1
{
  AWT1()
  {
    Frame f1=new Frame("Name");

    Button b1 =new Button("Sign In");
    b1.setBounds(170, 50, 50, 25);

    Label l1 = new Label("Email"); 
    l1.setBounds(170,100,75,12);

    TextField t1 = new TextField("enter Email:");
    t1.setBounds(250,100,100,25);

    Label l2 = new Label("Password"); 
    l2.setBounds(170,150,75,12);

    TextField t2 = new TextField("enter Password:");
    t2.setBounds(250,150,75,25);

    Button b2 =new Button("Log In");
    b2.setBounds(170,200,50,25);

    f1.add(b1);
    f1.add(l1);
    f1.add(l2);
    f1.add(b2);
    f1.add(t1);
    f1.add(t2);

    f1.setLayout(null);
    f1.setVisible(true);
    f1.setSize(500,500);

  }
  public static void main(String[] args)
  {
    new AWT1();
  }
}
