package nagesh_corejava.inheritance;

public class Employee extends Citizen{
	
	private double salary;
	public String CompanyName;
	public Employee()
	{
		//super(); //Calling superclass constructor
		//System.out.println("From child class : ");
	}
	public Employee(String name, long aadhar_no, String dob,double salary,String CName) {
		super(name, aadhar_no, dob); 
		this.salary=salary;
		this.CompanyName=CName;
		// assigning parent class attributes from child class
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String toString() {
		return "Employee [salary=" + salary + ", CompanyName=" + CompanyName + ", name=" + name + ", dob=" + dob + "]";
	}
}
