

public class ApplyAbstraction {

	public static void main(String[] args) {
		
		System.out.println("This is from Car Interface");
		Car toyota  = new ConcreteCar();
        toyota.engine();
		
        System.out.println("This is from MotorCar Abstract class");
        MotorCar nissan = new ConcreteCar();
		nissan.oilEngine();
		nissan.wheel();
		
		System.out.println("This is from ConcreteCar conrete class");
		ConcreteCar bmw = new ConcreteCar();
		bmw.start();
		bmw.stop();
		
	}

}
