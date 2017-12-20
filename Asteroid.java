package asteroids;

public class Asteroid extends Polygon {
	float speed;   //float is for decemials 
	float rotationspeed;
	float direction; //show asteriods where to go
	

	 public Asteroid( Point position, double rotation){
		 super(new Point[] {new Point(0,0)},position,rotation);
		 rotationspeed = Asteroids.seeder.nextFloat()* 5;
		 ///nextFloat() is a instance method in Random class. 
		 //It gets random decimal values between 0 and 1, and times 5 
		//changes it to get 0 and 5;
		 speed = Asteroids.seeder.nextFloat()* 4; 
		 this.shape = Asteroids.asteroidShapes[(int) Math.round((Asteroids.asteroidShapes.length - 1) * Asteroids.seeder.nextFloat())];
		 //What does this do? 
		 direction = Asteroids.seeder.nextFloat() * 360;
	 }
	 
	 public void Move() {
		 
			rotation = rotation + rotationspeed;// what makes asteriods them spin 
			                             
			
		
		
			position.setX(position.getX() + (speed*Math.cos(Math.toRadians(direction))));
			position.setY(position.getY() + ( speed*Math.sin(Math.toRadians(direction))));
			
			if (position.getX() < 0) {

				position.setX(Asteroids.currentSession.width);

				} else if (position.getX() > Asteroids.currentSession.width) {

				position.setX( 0);

				}

				if (position.getY() < 0) {

				position.setY( Asteroids.currentSession.height);

				} else if (position.getY() > Asteroids.currentSession.height) {

				position.setY(0);

				}
			
		 
	 }}