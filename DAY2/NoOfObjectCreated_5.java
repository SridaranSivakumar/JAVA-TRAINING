package TaskDay2;
class ObjectCreated{
	static int count;
	public ObjectCreated() {
		count++;
	}
}
public class NoOfObjectCreated_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ObjectCreated a=new ObjectCreated();
    ObjectCreated b=new ObjectCreated();
    ObjectCreated c=new ObjectCreated();
    ObjectCreated d=new ObjectCreated();
    ObjectCreated e=new ObjectCreated();
    System.out.println("The total no of objects: "+ObjectCreated.count);
    
    }

}
