

public  class ConcreteCar  extends MotorCar implements Car {

	int size = 5;
	
	public void bodyShape() {
		
		System.out.println("It must have body shape in order to drive");
	}

	public int size() {
		
		return size;
	}

	public void engine() {
		
		System.out.println("must build engine to drive safely");
	}

	public void start() {
		System.out.println("must have start method to drive");
		
	}

	public void stop() {
		
		System.out.println("must have stop features which will stop the car at any point");
	}
	
	//ConcreteCar
	
	protected void stearingWheel(){
		System.out.println("It can control the car");
	}
	
	public void transmission(){
		System.out.println("Let's build transmission");
	}
	
	//MotorCar

	public void oilEngine() {
		System.out.println("Car will run on Oil");
	}

}
