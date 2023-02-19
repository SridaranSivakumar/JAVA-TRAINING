package Day1Task;

public class ImplicitExplicit {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Implicit Type casting");
		byte val1=127;
		short conbyte=val1;
		short val2=32767;
		int conshort=val2;
		int val3=2147483647;
		long conint=val3;
		float val5=12345.0f;
		double confloat=val5;
		char val7='a';
		int conchar=val7;
		System.out.println("Convert Byte "+conbyte);
		System.out.println("Convert Short "+conshort);
		System.out.println("Convert Int "+conint);
		System.out.println("Convert Float "+confloat);
		System.out.println("convert char "+conchar);
		System.out.println();
		System.out.println();
		System.out.println("Explicit Type casting");
		
        double value1=98765432112345d;
        float convertdouble=(float)value1;
        float value2=8765437652f;
        int convertfloat=(int)value2;
        int  value3=1234;
        short convertint=(short)value3;
        short value4=126;
        byte convertshort=(byte)value4;
        System.out.println("Convert Double "+convertdouble);
		System.out.println("Convert Float "+convertfloat);
		System.out.println("Convert Int "+convertint);
		System.out.println("Convert short "+convertshort);
		
	}

}
