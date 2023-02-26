package Day3task;
class Employee{
	String name;
	int empid;
	int  salary;
	String address;
	String role;
	public Employee(String name,int empid,int salary,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.empid=empid;
		this.salary=salary;
		this.address=address;
	}
	public void details() {
		// TODO Auto-generated method stub
		 System.out.println("Payroll for Worker:");
	        System.out.println("Name: "+this.name);
	        System.out.println("Employee ID: "+this.empid);
	        System.out.println("Role: "+this.role);
	        System.out.println("Salary: "+this.salary);
	        System.out.println("Address: "+this.address);
	}
}
class Sales extends Employee{
    Sales(String name , int empid , int salary,String address){
        super(name, empid ,salary,address);
        this.role = "Sales";
    }
}

class Prod extends Employee{
    Prod(String name , int empid , int salary,String address){
        super(name, empid ,salary,address);
        this.role = "Production";
    }
}


class SalesPerson extends Sales{
    SalesPerson(String name , int empid , int salary,String address){
        super(name, empid ,salary,address);
        this.role = "Sales Person";
       
        
    }
}
class SalesManager extends Sales{
    SalesManager(String name , int empid , int salary,String address){
        super(name, empid ,salary,address);
        this.role = "Sales Manager";
        
        
    }
}
class SalesTerrirory extends Sales{
    SalesTerrirory(String name , int empid , int salary,String address){
        super(name, empid ,salary,address);
        this.role = "Sales Terrirory";
        
        
    }
}
class Manager extends Sales{
    Manager(String name , int empid , int salary,String address){
        super(name, empid ,salary,address);
        this.role = "Manager";
        
        
    }
}


class Worker extends Prod{
    Worker(String name , int empid , int salary,String address){
        super(name, empid ,salary,address);
        this.role = "Worker";
        
        
    }
}
public class PayRollSystem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Employee E = new Worker("vibish", 10007 , 10000, "Chennai");
	         E.details();
	}

}
