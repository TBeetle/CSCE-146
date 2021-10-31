/*
 * Written by Tyler Beetle
 */
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class makeaTriangle extends JPanel
{
public static void main(String[] args) 
{
JFrame frame = new JFrame("Sierpenski's Triangle");//Created a display window called Sierpenski's Triangle to display the output
frame.setBackground(Color.white);
frame.setSize(500,520);//Creates the dimensions for the display frame
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
makeaTriangle triangles = new makeaTriangle();
frame.add(triangles);
frame.setVisible(true);
}

public void paint(Graphics g)
{
int [] x = {250, 480, 20};
int [] y = {20, 480, 480};
g.fillPolygon(x,y,3);
g.setColor(new Color(255,255,255));
drawTriangle(x,y,g);
}

public void drawTriangle(int x[], int y[], Graphics g)//method to draw the triangle utilizing the midpoints and making the triangles smaller and smaller 
{
int dist = Math.abs(x[0]-x[1]);
if(dist <=4)//Creates a if statement that will run all the way to four pixels
{
return;
}
else
{

int midY[] = {(y[0]+y[1])/2, (y[1]+y[2])/2, (y[2]+y[0])/2};//Created 2 arrays in order to keep track of the midpoints of y and x
int midX[] = {(x[0]+x[1])/2, (x[1]+x[2])/2, (x[2]+x[0])/2};
g.fillPolygon(midX, midY, 3);

int x1[] = {x[0], midX[0], midX[2]};
int x2[] = {midX[0], x[1], midX[1]};
int x3[] = {midX[2], midX[1], x[2]};
int y1[] = {y[0], midY[0], midY[2]};
int y2[] = {midY[0], y[1], midY[1]};
int y3[] = {midY[2], midY[1], y[2]};

drawTriangle(x1,y1,g);
drawTriangle(x2,y2,g);
drawTriangle(x3,y3,g);
}
}
}