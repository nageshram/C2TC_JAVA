package nagesh_corejava.inheritance;

public class Citizen {
   
	public String name;
    private long aadhar_no;
    protected String dob; 
    public Citizen()
    {
    	//System.out.println("From parent class : ");
    }
    
	public Citizen(String name, long aadhar_no, String dob) {
		this.name = name;
		this.aadhar_no = aadhar_no;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String toString() {
			return "Citizen [name=" + name + ", aadhar_no=" + aadhar_no + ", dob=" + dob + "]";
		} 

}
