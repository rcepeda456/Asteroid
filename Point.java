package asteroids;

/*
CLASS: Point
DESCRIPTION: An instance of this class represents a 2-dimensional
			coordinate (x,y).  
Original code by Dan Leyzberg and Art Simon.
Modified by Megan Owen.
 */

public class Point implements Cloneable {
	private double x;
	private double y;

	public Point(double inX, double inY) {
		x = inX;
		y = inY;
	}

	// Getters and setters
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double newX) {
		x = newX;
	}
	
	public void setY(double newY) {
		y = newY;
	}
	
	// This method adds deltaX to x.  If deltaX is negative,
	// this is equivalent to subtracting it from x.
	public void addToX(double deltaX) {
		x += deltaX;
	}
	
	// This method adds deltaY to y.  If deltaY is negative,
	// this is equivalent to subtracting it from y.
	public void addToY(double deltaY) {
		y += deltaY;
	}
	
	// This method returns a new Point instance with the same
	// x and y values.
	public Point clone() {
		return new Point(x, y);
	}
}