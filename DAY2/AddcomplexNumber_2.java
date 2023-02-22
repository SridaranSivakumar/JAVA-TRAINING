package TaskDay2;

import java.util.function.BiConsumer;

class ComplexNumber{
	int real,imaginary;
	public ComplexNumber() {}
	ComplexNumber(int r,int i){
		this.real=r;
		this .imaginary=i;
	}
	public  ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
		ComplexNumber Ans=new ComplexNumber(0, 0);
		Ans.real=c1.real+c2.real;
		Ans.imaginary=c1.imaginary+c2.imaginary;
		return Ans;
	}
}


public class AddcomplexNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ComplexNumber c1=new ComplexNumber(5, 10);
       ComplexNumber c2=new ComplexNumber(5, 20);
       ComplexNumber obj=new ComplexNumber();
       ComplexNumber Ans=obj.sum(c1, c2);
       System.out.println("The sum of complex number "+Ans.real+" +i "+Ans.imaginary);
	}

}
