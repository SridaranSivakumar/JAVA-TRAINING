package TaskDay2;

class WiproTechnologies{
	
	public void wipro() {
		System.out.println("This is wipro Technology");
	}
}
class WiproInfotech extends WiproTechnologies{
	@Override
	public void wipro() {
		System.out.println("This is  WiproInfotech");
	}
}
class WiproBPO extends WiproTechnologies{
	@Override
	public void wipro() {
		System.out.println("This is wipro BPO");
	}
}

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WiproTechnologies[] w= {new WiproTechnologies(),new WiproInfotech(),new WiproBPO()};
     WiproTechnologies wi=(WiproTechnologies) w[0];
     wi.wipro();
     WiproTechnologies wiw=(WiproTechnologies) w[1];
     wiw.wipro();
     WiproTechnologies wipro=(WiproTechnologies) w[2];
    wipro.wipro();
	}

}
