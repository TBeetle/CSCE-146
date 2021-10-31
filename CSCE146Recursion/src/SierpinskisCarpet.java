/*
 * Tyler Beetle
 */
import java.awt.*;
import javax.swing.*;
import java.util.Scanner; 
public class SierpinskisCarpet extends Canvas {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Sierpinski Carpet");
		frame.setSize(900,900);
		
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("End");
	}
	public void paint(Graphics g)
	{
		//.out.println("paint");
		//g.setColor(Color.GREEN);
		//g.fillRect(0, 100, 250, 400);
		drawCarpet(0,0,this.getWidth(),g);
	}
	public void drawCarpet(int x, int y, int side, Graphics g)
	{
		//Draws the center square
		int sub = side / 3; 
		g.fillRect(x+sub, y+sub, sub, sub);
		if(sub >= 3)
		{
			//Top 
			drawCarpet(x,y,sub,g);//Left
			drawCarpet(x+sub,y,sub,g);//Middle
			drawCarpet(x+sub*2,y,sub,g);//Right
			//Middle
			drawCarpet(x+sub*2,y+sub,sub,g);//Left
			drawCarpet(x+sub*2,y+sub,sub,g);//Right
			//Bottom 
			drawCarpet(x,y+sub*2,sub,g);
			drawCarpet(x+sub,y+sub*2,sub,g);
			drawCarpet(x+sub*2,y+sub*2,sub,g);
			
		}
	}
}
