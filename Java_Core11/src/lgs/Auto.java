package lgs;

public class Auto {

	private int power;
	private int yearProduction;
	private Wheel wheel;
	private Engine engine;
	

	public Auto(int power, int yearProduction, Wheel wheel, Engine engine) {
		super();
		this.power = power;
		this.yearProduction = yearProduction;
		this.wheel = wheel;
		this.engine = engine;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getYearProduction() {
		return yearProduction;
	}

	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Auto [power=" + power + ", yearProduction=" + yearProduction + ", wheel=" + wheel + ", engine=" + engine
				+ "]";
	}

	
}
