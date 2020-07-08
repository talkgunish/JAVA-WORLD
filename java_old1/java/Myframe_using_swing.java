import javax.swing.*;// when swing s being used u need to use "J" before the predefined classes like:-Frame,Button.. overhere...
class Myframe_using_swing
{ Myframe_using_swing()
{
JFrame f=new JFrame("REG");
f.setVisible(true);
f.setSize(40000,40000);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// this fn is used to close the frame when we click on the red cross...
JButton button=new JButton("wow");
button.setBounds(20,50,100,80);
f.add(button);
JButton button1=new JButton("java");
button1.setBounds(130,50,100,80);
f.add(button1);
}
public static void main(String arg [])
{
new Myframe_using_swing(); 
}
}