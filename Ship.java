 package asteroids;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Ship extends Polygon implements KeyListener  {  
	// implements interface for keyboard, extends is for another class. 
	boolean isKeyDOWN = false;
	boolean isKeyUP = false;
	boolean isKeyLEFT = false;
	boolean isKeyRIGHT = false; 
	
	
	
	public Ship(Point[] shape, Point position, double rotation) {  
		super(shape, position, rotation);//where ship starts in game.
		
		
		
	}
	//making a new map, every key on a keyboard as its own "key number" the computer knows. Integer
	///the boolean is the door 
	public void paint(Graphics brush){
		brush.setColor(Color.green);
		
		super.paint(brush);
	}
	public void Move() {

		int rotate = (isKeyRIGHT ? 1 : 0) - (isKeyLEFT ? 1 : 0);
		///it's moving a like the Y graph line. So shop starts at zero.
		//no key is 0-0. pressing any key is 1 - 0 = 1 or 0 - 1= -1
		//variable = (boolean) ? *(if) this if true* : *(else) this if false*
		//"?" means if and ":" means else. 
		int rotationspeed = 6;
		rotation = rotation + (rotate * rotationspeed);
		                              //rotationspeed is how many degrees it's rotating per frame. 
										//rotate is doing the math of 1-0 or whatever and then it times it by 3. 
										//turning the ship. 
		int forwardBack = (isKeyUP ? 1 : 0) - (isKeyDOWN ? 1 : 0);
		int speed = 4;
		forwardBack = forwardBack * speed;
		position.setX(position.getX() + (forwardBack * Math.cos(Math.toRadians(rotation))));
		position.setY(position.getY() + (forwardBack * Math.sin(Math.toRadians(rotation))));
		///position.setX = position.x < 0 ? Asteroids.currentSession.width : (position.x > Asteroids.currentSession.width ? 0 : position.x);
		///position.y = position.y < 0 ? Asteroids.currentSession.height : (position.x > Asteroids.currentSession.height ? 0 : position.y);
		//or
		
		//this is where the warp around the screen is happening. 

		if (position.getX() < 0) {

			position.setX(Asteroids.currentSession.width);

			} else if (position.getX() > Asteroids.currentSession.width) {

			position.setX( 0);

			}

			if (position.getY() < 0) {

			position.setY( Asteroids.currentSession.height);

			} else if (position.getY() > Asteroids.currentSession.height) {

			position.setY( 0);

			}
		
		


		
	}
	public void keyTyped(KeyEvent e) {             
		// TODO Auto-generated method stub
		
	}
	public void keyReleased(KeyEvent e) {  ///hold down 
		  int keyCode = e.getKeyCode();
			
			switch(keyCode) { //keyCode
			   case KeyEvent.VK_DOWN:
			   		isKeyDOWN = false;
			   		System.out.println("released down");
			   		///Move(toPosition);
			   		break;
			   case KeyEvent.VK_UP:
			       isKeyUP = false;
			       Move();
			       System.out.println("released up");
			       //Move(toPosition);
			       break;
			   case KeyEvent.VK_RIGHT:
			       isKeyRIGHT = false;
			       System.out.println("released right");
			       //Move(toPosition);
			       break;
			   case KeyEvent.VK_LEFT:
			       isKeyLEFT = false;
			       System.out.println("released left");
			       //Move(toPosition); // I can't do this because my method is void? 
			       break;
			      default:
			    	  break; }
			
		}

	
	
	public static void main(String[] args) { 
		

	}

	public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
		
		switch(keyCode) { //keyCode
		   case KeyEvent.VK_DOWN:
		   		isKeyDOWN = true;
		   		System.out.println("going down");
		   		///Move(toPosition);
		   		break;
		   case KeyEvent.VK_UP:
		       isKeyUP = true;
		       System.out.println("going up");
		       //Move(toPosition);
		       break;
		   case KeyEvent.VK_RIGHT:
		       isKeyRIGHT = true;
		       System.out.println("going right");
		       //Move(toPosition);
		       break;
		   case KeyEvent.VK_LEFT:
		       isKeyLEFT = true;
		       System.out.println("going left");
		       //Move(toPosition); // I can't do this because my method is void? 
		       break;
		      default:
		    	  break; }
		
	}


}                 