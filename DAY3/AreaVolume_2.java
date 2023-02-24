package Day3task;
 interface Area{
	 final double pi=3.14;
	public  void calArea();
	public void claperimeter();
 }
 interface Volume{
	 public void surArea();
	 public void calvol();
 }
class circle implements Area{
	int r;
    circle(int r){
    	this.r=r;
    }
	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		double Ans=pi*r*r;
		System.out.println("circle Area: "+Ans);
	}

	@Override
	public void claperimeter() {
		// TODO Auto-generated method stub
		double Ans=2*pi*r;
		System.out.println("circle perimeter: "+Ans);
	}
	
}
class Sphere implements Area,Volume{
	int r;
    Sphere(int r){
    	this.r=r;
    }
	@Override
	public void surArea() {
		// TODO Auto-generated method stub
		double Ans=4*pi*r*r;
		System.out.println("sphere surface volume: ");
	}

	@Override
	public void calvol() {
		// TODO Auto-generated method stub
		double Ans=(4/3)*pi*r*r*r;
		System.out.println("sphere volume: "+Ans);

	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		double Ans=pi*r*r;
		System.out.println("sphere Area: "+Ans);
		
	}

	@Override
	public void claperimeter() {
		// TODO Auto-generated method stub
		double Ans=2*pi*r;
		System.out.println("sphere perimeter: "+Ans);
	}
	
}
class square implements Area{
	int a;
    square(int a){
    	this.a=a;
    }
	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		double Ans=a*a;
		System.out.println("square Area: "+Ans);
	}

	@Override
	public void claperimeter() {
		// TODO Auto-generated method stub
		double Ans=4*a;
		System.out.println("square perimeter: "+Ans);
	}
	
}
class Triangle implements Area{
    
	
	int a,b,c;
    Triangle(int a,int b,int c){
    	this.a=a;
    	this.b=b;
    	this.c=c;
    }
	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		double Ans=(a+b+c)/2;
		System.out.println("Triangle Area: "+Ans);
	}

	@Override
	public void claperimeter() {
		// TODO Auto-generated method stub
		double Ans=a+b+c;
		System.out.println("Triangle perimeter: "+Ans);
	}
	
}
class cuboid implements Area,Volume{
	int a;
    cuboid(int a){
    	this.a=a;
    }
	@Override
	public void surArea() {
		// TODO Auto-generated method stub
		double Ans=6*a*a;
		System.out.println("cuboid SurfaceArea: "+Ans);
	}

	@Override
	public void calvol() {
		// TODO Auto-generated method stub
		double Ans=a*a*a;
		System.out.println("cuboid volume: "+Ans);
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		double Ans=a*a;
		System.out.println("cuboid Area: "+Ans);
		
	}

	@Override
	public void claperimeter() {
		// TODO Auto-generated method stub
		double Ans=4*a;
		System.out.println("cuboid perimeter: "+Ans);
	}
	
}

public class AreaVolume_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      circle c=new circle(10);
      c.calArea();
      c.claperimeter();
      square s=new square(4);
      s.calArea();
      s.claperimeter();
      Triangle t=new Triangle(2, 3, 4);
      t.claperimeter();
      t.calArea();
      Sphere ss=new Sphere(5);
      ss.calArea();
      ss.calvol();
      ss.claperimeter();
      ss.surArea();
      cuboid cc=new cuboid(2);
      cc.calArea();
      cc.calvol();
      cc.claperimeter();
      cc.surArea();
      
	}

}
