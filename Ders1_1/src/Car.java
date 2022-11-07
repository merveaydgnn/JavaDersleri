
public class Car {
	
	String type;
	String model;
	String color;
	int speed;;
	int speedLimit = 180;
	
	
	public void increaseSpeed(int increment) {
		
		if((speed + increment) < speedLimit) {		
			
			speed += increment;
		}
		
	}
	
	public void decreaseSpeed(int decrease) {
		
		if((speed - decrease) > 0) {
			
			speed -= decrease;
		}
		
	}
	
	public void print() {
		
		System.out.println(model + " hýzý : " + speed + " rengi" + color);
		
		
	}

}
