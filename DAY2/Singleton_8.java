package TaskDay2;
class singleton{
	private static singleton si=null;
	private singleton() {
		
	}
	public static singleton getInstance() {
		if(si==null) {
			si=new singleton();
			
		}
		return si;
	}
}
public class Singleton_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       singleton x=singleton.getInstance();
       singleton y=singleton.getInstance();

       System.out.println(x.hashCode()+" "+y.hashCode());
	}

}
