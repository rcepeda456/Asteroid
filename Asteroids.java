package asteroids;
//Extra Features 



//Background color change 

//Life Bar addition 









/*
CLASS: Asteroids

DESCRIPTION: Extending Game, Asteroids is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.
Original code by Dan Leyzberg and Art Simon
Modified by Megan Owen
 */
import java.awt.*;

import java.util.Random;



public class Asteroids extends Game {
	private int counter = 0;
	//Test myTest = new Test(); ///TEACHER
	public static Asteroids currentSession;
	Asteroid[] roids; //this is where all the asteroids appear and are put instantiated
	public static Random seeder = new Random(); //producing random asteriods.
	
	static Point[] Pew= {new Point(30,30), new Point(30,30), new Point(30,30)}; 
	static Point[] pShape = {new Point(0,0), new Point(0,100), new Point(100,60)}; 
	static Point[] Roids1 ={new Point(0,0), new Point(10,0), new Point(10,5),new Point(6,5), new Point(0,10)};
	static Point[] Roids2 ={new Point(0,0), new Point(20,0), new Point(20,10), new Point(56,70), new Point(0,20)};
	static Point[] Roids3 ={new Point(0,0), new Point(30,0), new Point(10,15), new Point(0,30)};
	static Point[] Roids4 ={new Point(0,0), new Point(10,0), new Point(10,10), new Point(20,40), new Point(10,15), new Point(0,10)};
	static Point[] Roids5 ={new Point(0,0), new Point(20,0), new Point(20,30), new Point(0,20)};

	public static Point[][] asteroidShapes = new Point[][] { Roids1, Roids2 , Roids3, Pew }; ///What does this do? 

	public Ship playerShip = new Ship(pShape, new Point(400,300), 0);
	public Asteroids() {
		super("Asteroids!",800,600);
		roids = new Asteroid[] { new Asteroid( new Point(200,200), 0), new Asteroid( new Point(900,900), 0), new Asteroid(new Point(600,400), 0), new Asteroid(new Point(200,300), 0),new Asteroid(new Point(100,200), 0) };
		                                                                                       ///what does this do?  
		this.setFocusable(true);
		this.requestFocus();
		///this.addKeyListener(myTest);              ///TEACHER 
		this.addKeyListener(playerShip);
		/* Point p1 = new Point(10,10);			<--TEACHER
		Point p2 = new Point(10,0);
		Point p3 = new Point(0,10);
		Point[] pShape = {p1,p2,p3. new Point(0,0)};
		Point start = new Point(50,50);
		Polygon p = new Polygon(pShape,start, 45); */
		
	}
	

	public void paint(Graphics brush) {  
		brush.setColor(Color.black);
		brush.fillRect(0,0,width,height);
		brush.setColor(Color.white);
		playerShip.paint(brush);
		
		
		

		// sample code for printing message for debugging
		// counter is incremented and this message printed
		// each time the canvas is repainted
		counter++;
		brush.drawString("Counter is " + counter,10,10);
	
		 playerShip.Move();
		 
		 for(int a = 0; a < roids.length; a++){

			 roids[a].paint(brush); ///painting the asteroids. 
			 roids[a].Move();   ///moving the asteroids 

			  //this is when the shit gets it, it'll take away 10
			 }  //health.health is the instance variable from "Ship and Healthbar" two different variables but looks confusing. 
			 
		 }
		

	public static void main (String[] args) {
		
		
		currentSession = new Asteroids();
		
		currentSession.repaint();
		
	}
}