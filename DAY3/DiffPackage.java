package taskDay3;

import Day3task.PackageInterface_5;

public class DiffPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UsingInterfaces c=new UsingInterfaces();
       c.inmethod1();
       c.inmethod2();
       c.inmethod3();
	}

}
class UsingInterfaces implements PackageInterface_5{

	@Override
	public void inmethod1() {
		// TODO Auto-generated method stub
		System.out.println("Method1");
	}

	@Override
	public void inmethod2() {
		// TODO Auto-generated method stub
		System.out.println("Method2");
	}

	@Override
	public void inmethod3() {
		// TODO Auto-generated method stub
		System.out.println("Method3");
	}
	
}