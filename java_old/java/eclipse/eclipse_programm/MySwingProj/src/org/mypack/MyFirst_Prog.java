package org.mypack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFirst_Prog extends JFrame{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   MyFirst_Prog p=new MyFirst_Prog();
		   JTextField t= new JTextField();
		   JButton b=new JButton("click");
		   t.setBounds(20, 50, 100, 40);
		   b.setBounds(150,50, 100, 40);
		   p.add(t);
		   p.add(b);
		   p.setLayout(null);
		   p.setVisible(true);
		   p.setSize(400,400);
		  
		System.out.print("hiii");

	}

}