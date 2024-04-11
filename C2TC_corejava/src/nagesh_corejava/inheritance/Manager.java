package nagesh_corejava.inheritance;

public class Manager extends Employee {
        public int MangerId;

		public Manager() {
			super();
		}

		public Manager(int Id,String name, long aadhar_no, String dob, double salary, String CName) {
			super(name, aadhar_no, dob, salary, CName);
			this.MangerId=Id;
		}
		public String toString() {
			return "Manager [MangerId=" + MangerId + ", CompanyName=" + CompanyName + ", name=" + name + ", dob=" + dob
					+ "]";
		}
}
