
public class Main {
	
	public static void main(String[] main) {
		
		Car bmw = new Car();
		bmw.color = "Red";
		bmw.model = "BMW";
		
		
		bmw.increaseSpeed(20);
		bmw.increaseSpeed(30);
		bmw.increaseSpeed(50);
		bmw.increaseSpeed(70);
		bmw.increaseSpeed(80);
		bmw.increaseSpeed(20);
		
		bmw.print();
		
		Car audi = new Car();
		audi.color = "Blue";
		audi.model = "AUDI";
		audi.speed = 50;
		
		audi.increaseSpeed(30);
		audi.decreaseSpeed(10);
		audi.decreaseSpeed(60);
		audi.decreaseSpeed(20);
		
		audi.print();
		
		
		
	}

}
