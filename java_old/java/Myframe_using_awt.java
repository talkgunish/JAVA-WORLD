import java.awt.*;
class Myframe_using_swing
{ Myframe_using_swing()
{
Frame f=new Frame("REG");
f.setVisible(true);
f.setSize(400,400);
f.setLayout(null);
Button button=new Button("wow");
button.setBounds(20,50,100,80);
f.add(button);
Button button1=new Button("java");
button1.setBounds(130,50,100,80);
f.add(button1);
}
public static void main(String arg [])
{
new Myframe_using_swing(); 
}
}