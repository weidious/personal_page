package Applet;
import java.awt.*;
import 	javax.swing.*;
public class Applet extends JApplet{

	private static final long serialVersionUID = 2180845387958254526L;
	private double sum;
	public void init(){
		String fn = JOptionPane.showInputDialog("enter first number");
		String sn = JOptionPane.showInputDialog("enter second number");
		double n1= Double.parseDouble(fn);
		double n2= Double.parseDouble(sn);
		sum = n1+n2;
	}
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("The sum is "+sum,20,30);
	}
}
