/*compile this by "javac MyApplet.java" n then run by "appletviewer Myapplet.java"*/
import java.applet.*;
import java.awt.*;
/*<applet code="MyApplet" width="300",height="250">
</applet>*/
	public class MyApplet extends Applet{
		
			public void init(){
				
				Button b=new Button("click");
				TextField tf=new TextField(" ");
				setLayout(null);
				tf.setBounds(120,40,150,50);
				b.setBounds(5,40,100,30);
				add(b);
				add(tf);
				
				
			}
			
			/*public void paint(Graphics g){
				
					g.drawRect(10,20,150,80);
			}*/
	}