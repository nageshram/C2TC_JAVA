package nagesh_corejava.polymorphism;

import java.util.Scanner;
/*****v*/
public class Sbi extends Rbi{
     //private float intrest;
    private String Branch;
    private String Baddress;
	Scanner read= new Scanner(System.in);
    public void getDetails()
	{
       		System.out.println("Enter Branch Name : ");
       		this.Branch=read.nextLine();
       		System.out.println("Enter Branch Address : ");
       		this.Baddress=read.nextLine();
	}
    public void getDetails(String Branch,String Baddress)
    {
    	this.Branch=Branch;
    	this.Baddress=Baddress;
    }
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getBaddress() {
		return Baddress;
	}
	public void setBaddress(String baddress) {
		Baddress = baddress;
	}
	public float getIntrest() {
		return super.intrest;
	}

	public void setIntrest(float intrest) {
		super.intrest = intrest;
	} 

	public void sayHello()
	{
		//super.sayHello();
		System.out.println("Hi user :: From SBI.!");
	}
	public String toString() {
		return "Sbi [Branch=" + Branch + ", Baddress=" + Baddress + "]";
	}
     
}
