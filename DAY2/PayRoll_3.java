package TaskDay2;


class Employee{
	String name;
	int empid;
	int  salary;
	String dateofjoining;
	String role;
	public Employee(String name,int empid,int salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	
	}
	public void details() {
		// TODO Auto-generated method stub
		 System.out.println("Payroll for Worker:");
	        System.out.println("Name: "+this.name);
	        System.out.println("Employee ID: "+this.empid);
	        System.out.println("Role: "+this.role);
	        System.out.println("Salary: "+this.salary);
	        System.out.println("DateOfJoining: "+this.dateofjoining);
	}
}
class SalesPerson extends Employee{
    SalesPerson(String name , int empid , int salary){
        super(name, empid ,salary);
        this.role = "Sales Person";
        this.dateofjoining="23-1-20";
        
    }
}
class Worker extends Employee{
    Worker(String name , int empid , int salary){
        super(name, empid ,salary);
        this.role = "Worker";
        this.dateofjoining="23-1-23";
        
    }
}
class SalesManager extends SalesPerson{
    SalesManager(String name , int empid , int salary){
        super(name, empid ,salary);
        this.role = "Sales Manager";
        this.dateofjoining="23-1-21";
        
    }
}
class SalesTerrirory extends SalesManager{
    SalesTerrirory(String name , int empid , int salary){
        super(name, empid ,salary);
        this.role = "Sales Terrirory";
        this.dateofjoining="23-1-22";
        
    }
}
public class PayRoll_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp=new Worker("Sekar", 10007, 10000);
        emp.details();
	}

}
