package play;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.text.html.ImageView;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServiceGame sg = new ServiceGame();
		Key_Event key = new Key_Event();
	}

}

class ServiceGame extends JFrame{
	
	int width = 1280;
	int height = 960; 
	
	int x, y;
	
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	
	Thread th;
	
	
	Toolkit tool = Toolkit.getDefaultToolkit();
	
	Image image01 = tool.getImage("D:\\A_TeachingMaterial\\1.BasicJava\\workspace\\JavaBasic\\src\\play\\pig.png");
	
	
	ServiceGame(){
		
		init();
		start();
		setTitle("Test game");
		setSize(width, height);
		
	
		Dimension screen = tool.getScreenSize();
		
		int screen_x = (int)(screen.getWidth()/2 - width/2);
		int screen_y = (int)(screen.getHeight()/2 - height/2);
		
		setLocation(screen_x, screen_y);
		setResizable(false);
		setVisible(true);
	}
	
	
	
	public void init(){
		x= 100;
		y= 100;
	}

	
	public void start(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void run(){ 
		try{ 
		while(true){
		repaint(); 
		Thread.sleep(20); 
		}
		}catch (Exception e){}
	}
	

	public void paint(Graphics g){

		g.clearRect(0, 0, width, height);
		g.drawImage(image01 ,x, y, this);
	}
	
	
		
	
}



