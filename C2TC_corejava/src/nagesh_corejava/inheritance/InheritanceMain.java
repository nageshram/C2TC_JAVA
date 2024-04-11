package nagesh_corejava.inheritance;

public class InheritanceMain {
	public static void main(String args[])
	{
		/****SINGLE INHERITANCE********/
		
		 Citizen cOne = new Employee("Nagesha",456145689875l,"19/04/2003",150000d,"Fidelity");
		 System.out.println(cOne.toString());
		 /*prints all attributes of Citizen and Employee
		  *except aadhar number because it is a private member of Citizen -*/
		 
		 /***MULTI-LEVEL-INHERITENCE-*******/
		 
		 Citizen cTwo= new Manager(1,"M Sitha",456123567895l,"07/08/2005",1600000d,"Fidelity");
		 System.out.println(cTwo.toString());
		 System.out.println("Aadhar number is : "+cTwo.getAadhar_no());
	
		 
		 /**HEIRARCHIAL INHERITENCE 
		  * if we create another child class to either citizen class or Employee class it will become Heirarchial inheritence */
		 
		  
	}
}
