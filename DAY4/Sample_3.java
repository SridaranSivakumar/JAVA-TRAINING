package TaskDay4;

 class Sample_3{

	public void mth1(){
		mth2();
		System.out.println("caller");
	}
	public void mth2(){
		
		try {
			int a[]=new int[3];
		   // a[10]=3;
			System.exit(0);
			//return;
		}catch(ArrayIndexOutOfBoundsException d){
			System.out.println(d);
		}catch(Exception e) {
		
			System.out.println("catch=mth2");
		}
		finally {
			System.out.println("finally mth2");
		}
	}
		public static void main(String p[] ) {
			Sample_3 s=new Sample_3();
			s.mth1();
		}
	}