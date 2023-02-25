package TaskDay4;

 class Sample_2 {

	public void mth1(){
		mth2();
		System.out.println("caller");
	}
	public void mth2(){
		try {
			int a[]=new int[3];
			a[3]=10;
			return;
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		catch(Exception e) {
			System.out.println("catch=mth2");
		}
		finally {
			System.out.println("finally mth2");
		}
	}
		public static void main(String p[] ) {
			Sample_2 s=new Sample_2();
			s.mth1();
		}
	}

//change exception to specific