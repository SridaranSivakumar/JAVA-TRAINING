package CreationalPattern;

import java.util.Scanner;

public class VisitorPattern {

	public static void main(String[] args) throws SpeedException {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed");
		String str = sc.nextLine();
		Speed speed = new Speed();
		bike.BikeSpeed(speed, str);
	}

}

class Bike {
	public void BikeSpeed(Speed speed, String str) {
		System.out.println("before exception...");
		try {
			speed.checkspeed(str);
		} catch (SpeedException e) {
			e.printStackTrace();
			e.visit();
		}
		System.out.println("after exception....");
	}

}

class Speed {
	public void checkspeed(String str) throws SpeedException {
		if (str.equalsIgnoreCase("HighSpeed")) {
			throw new HighSpeed("the speed is 80");
		} else if (str.equalsIgnoreCase("VeryHighSpeed")) {
			throw new VeryHighSpeed("the speed is 100");
		} else if (str.equalsIgnoreCase("OverSpeed")) {
			throw new OverSpeed("the speed is 120");
		}
	}
}

abstract class Handler {
	abstract void handle(HighSpeed hs);

	abstract void handle(VeryHighSpeed vhs);

	abstract void handle(OverSpeed os);
}

class SpeedHandler extends Handler {
	public void handle(HighSpeed hs) {
		System.out.println("Speed is over than 80 Km/hr");
	}

	public void handle(VeryHighSpeed hs) {
		System.out.println("Speed is over than 120 Km/hr");
	}

	public void handle(OverSpeed hs) {
		System.out.println("Speed is over than 150 Km/hr");
	}
}

abstract class SpeedException extends Exception {
	abstract void visit();
}

class HighSpeed extends SpeedException {
	String msg;

	public HighSpeed(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		SpeedHandler dbh = new SpeedHandler();
		dbh.handle(this);
	}
}

class VeryHighSpeed extends SpeedException {
	String msg;

	public VeryHighSpeed(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		SpeedHandler dbh = new SpeedHandler();
		dbh.handle(this);
	}
}

class OverSpeed extends SpeedException {
	String msg;

	public OverSpeed(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		SpeedHandler dbh = new SpeedHandler();
		dbh.handle(this);
	}
}